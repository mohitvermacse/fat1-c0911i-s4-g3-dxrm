USE Matrimony
GO
/*        user login        */
CREATE PROCEDURE LoginUser/*'tungpt','e10adc3949ba59abbe56e057f20f883e'*/
	@userName nvarchar(50),
	@password nvarchar(50)
	AS
		SELECT * FROM users WHERE userName=@userName AND password=@password
	GO
/*        Admin login        */
CREATE PROCEDURE LoginAdmin
	@userName nvarchar(50),
	@password nvarchar(50)
	AS
		SELECT * FROM admin WHERE userName=@userName AND password=@password
	
GO
/*        Select all city        */
CREATE PROCEDURE GetAllCity
	AS 
		SELECT * FROM city
	
GO
/*        Select all country        */
CREATE PROCEDURE GetAllCountry
	AS
		SELECT * FROM Country
	
GO
/*        Select all premium        */
CREATE PROCEDURE GetAllPremium
	AS
		SELECT * FROM premium 
GO
/*        Inser a new request of user        */
CREATE PROCEDURE CreateNewRequest
	@userID int,
	@content ntext,	
	@status NVARCHAR(50)
	AS
	INSERT INTO sendRequest(userID,contents,status)
		VALUES(
				@userID,
				@content,
				@status
				)
GO
/*        Insert a new receive request of user        */
CREATE PROCEDURE CreateReceiveRequest
	@userID int,
	@sendID int,
	@actions nvarchar(20),
	@status nvarchar(50)
	AS
	INSERT INTO receiveRequest(userID,sendID,actions,status)
		VALUES(
				@userID,
				@sendID,
				@actions,
				@status
				)
GO
/*        Select Id of user by userName        */
CREATE PROCEDURE GetUserIdByUserName
	@userName nvarchar(50)
	AS
	SELECT userID FROM users WHERE userName=@userName
GO
/*        select Id of admin by userName        */
CREATE PROCEDURE GetAdminIdByUserName
	@userName nvarchar(50)
	AS
	SELECT adminID FROM admin WHERE userName=@userName
GO
/*        select all users want is friends of user   drop procedure GetInforRequestBySendUserID      */
CREATE PROCEDURE GetAllReceveRequestByStatus/*'2','Transfer'*/
	@userId int,
	@actions NVARCHAR(50)
	AS
	SELECT rr.receiveID,rr.userID,sr.userID,rr.actions,sr.sendID,sr.contents,rr.status FROM receiveRequest AS rr inner join sendRequest AS sr 
	ON rr.sendID=sr.sendID WHERE rr.actions=@actions AND rr.userID=@userId
	
GO
/*        select all users want is friends of user to transition management        */
CREATE PROCEDURE GetAllReceveRequestTransfer/*'Pending'*/	
	@actions NVARCHAR(50)
	AS
	SELECT rr.receiveID,rr.userID,sr.userID,rr.actions,sr.sendID,sr.contents,rr.status FROM receiveRequest AS rr inner join sendRequest AS sr 
	ON rr.sendID=sr.sendID WHERE rr.actions=@actions
	
GO
/*        Select information fo a user send request        */
CREATE PROCEDURE GetInforUserSendByUserID
	@sendUserID int
	AS
	SELECT u.fullName,u.gender,u.birthDay,u.email,u.languages,u.qualification,u.familyDetails,u.favoriteMusic,u.hobbies,u.workingAt,u.books,i.images
	FROM users AS u inner join images AS i ON u.userID=i.userID
	WHERE u.userID=@sendUserID
Go
/*        Select information of a user        */
CREATE PROCEDURE GetInforUserById /*'1'*/
	@userId int 
	AS
	SELECT u.userID,i.images,u.fullName,u.address,u.gender,u.email,u.phoneNumber,c.cityName,ct.countryName,u.maritalStatus,u.height,u.languages
		  ,u.caste,u.familyDetails,u.qualification,u.workingAt,u.hobbies,u.favoriteMusic,u.movies,u.cuisine,u.books
	FROM images AS i INNER JOIN users AS u  ON u.userID=i.userId INNER JOIN city AS c ON u.cityID=c.cityID INNER JOIN country
	AS ct ON c.countryID=ct.countryID
	WHERE u.userId=@userId
GO
/*        Update receive reuqest of user by Id        */
CREATE PROCEDURE UpdateReceiveRequestById/*'1','Accept','Read'*/
	@id int,
	@action NVARCHAR(20),
	@status NVARCHAR(50)
	AS
	UPDATE receiveRequest SET actions=@action,status=@status
	FROM receiveRequest
	WHERE receiveID=@id
GO
/*        Update send request of user by Id        */
CREATE PROCEDURE UpdateSendRequestById/*'1','8/13/2012','Accept'*/
	@id int,
	@date DATETIME ,
	@status NVARCHAR(50)
	AS
	UPDATE sendRequest SET dates=@date, status=@status
	FROM sendRequest
	WHERE sendID=@id
GO
/*        Select all riend of user        */
CREATE PROCEDURE GetAllFriend/*'2','Accept'*/
	@userId int,
	@action NVARCHAR(20)
	AS
	SELECT u.fullName,i.images,u.userID,sr.userID FROM receiveRequest AS rr inner join sendRequest AS sr 
	ON rr.sendID=sr.sendID INNER JOIN users AS u ON rr.userID=u.userID INNER JOIN images AS i ON u.userID=i.userID
	WHERE rr.userId=2 AND rr.actions=@action
GO
/*        All user have friend        */
CREATE PROCEDURE TotalUserHaveFriend
	AS
	SELECT count(distinct(userID)) AS Allfriend FROM receiveRequest WHERE actions='Accept'
GO/*        Total user of system        */
CREATE PROCEDURE TotalUser
	AS
	SELECT Count(*)FROM users WHERE status !='Expired'
GO
/*        Total new user by today        */
CREATE PROCEDURE TotalNewUserToday/*'7/13/2012 0:00:00','7/13/2012 23:59:59'*/
	@date NVARCHAR(50),
	@date1 NVARCHAR(50)	
	AS
	select COUNT(*) FROM users WHERE status!='Expired'AND registerDate BETWEEN @date AND @date1
GO
/*        Total new user by month        */
CREATE PROCEDURE TotalNewUserMonth/*'8','2012'*/
	@month NVARCHAR(50),
	@year NVARCHAR(50)
	AS
	select COUNT(*) FROM users WHERE registerDate >= ''+@month+''+'/1/'+''+@year+'' and registerDate <=''+@month+''+'/30/'+''+@year+'' AND status!='Expired'

GO

/*        Insert user        */
CREATE PROCEDURE InsertUser
	@userName NVARCHAR(50),
	@password NVARCHAR(50),
	@fullName NVARCHAR(50),
	@address NVARCHAR(100),
	@gender NVARCHAR(10),
	@birthDay NVARCHAR(50),
	@email NVARCHAR(50),
	@phoneNumber NVARCHAR(20),
	@maritalStatus NVARCHAR(50),
	@height INT,
	@cityID INT,
	@languages NVARCHAR(100),
	@caste NVARCHAR(10),
	@familyDetails NTEXT,
	@qualification NTEXT,
	@workingAt NTEXT,
	@hobbies NTEXT,
	@favoriteMusic NTEXT,
	@movies NTEXT,
	@cuisine NTEXT,
	@books NTEXT,
	@status NVARCHAR(10)
	AS
	INSERT INTO users(userName,password,fullName,address,gender,birthDay,email,phoneNumber,maritalStatus,height,cityID,languages,
				  caste,familyDetails,qualification,workingAt,hobbies,favoriteMusic,movies,cuisine,books,status
					)
	VALUES(@userName,@password,@fullName,@address,@gender,@birthDay,@email,@phoneNumber,@maritalStatus,@height,@cityID,@languages,
				@caste,@familyDetails,@qualification,@workingAt,@hobbies,@favoriteMusic,@movies,@cuisine,@books,@status
				)
GO
/*        Check UerName Of User        */
CREATE PROCEDURE CheckUserName
	@userName NVARCHAR(50)
	AS
	SELECT * FROM uses WHERE userName=@userName
GO
/*        Check Email Of User        */
CREATE PROCEDURE CheckEmail
@email NVARCHAR(50)
AS
SELECT * FROM users WHERE email=@email
GO
/*        Insert admin        */
CREATE PROCEDURE InsertAmin
	@userName NVARCHAR(50),
	@password NVARCHAR(50)
	AS
	INSERT INTO admin(userName,password) VALUES(@userName,@password)
GO
/*        Change password        */
CREATE PROCEDURE ChangePassword
	@userName NVARCHAR(50),
	@password NVARCHAR(50)
	AS UPDATE users SET password=@password WHERE userName=@userName
GO
/*        Valid Password        */
CREATE PROCEDURE CheckOldPassword
	@userName NVARCHAR(50),
	@password NVARCHAR(50)
	AS
	SELECT * FROM users WHERE userName=@userName AND password=@password
GO
/*        Update Profile Of User        */
CREATE PROCEDURE UpdateProfileOfUser

/*        */
GO
CREATE PROC GetCustomPayment/* '08/16/2012 0:00:00','08/17/2012 23:59:59'*/
	@date1 nvarchar(50),
	@date2 nvarchar(50)
AS
SELECT SUM(p.amount) AS TotalMoney, Convert(varchar, t.dates, 101) AS  date  FROM transactions as t inner join premium as p
on t.premiumID=p.premiumID WHERE t.dates BETWEEN @date1 AND @date2 GROUP BY Convert(varchar, t.dates, 101)
GO
CREATE PROC GetSum /*'08/17/2012 0:00:00','08/17/2012 23:59:59'*/
	@date1 nvarchar(50),
	@date2 nvarchar(50)
	AS
	SELECT sum(p.amount) AS TotalMoney FROM premium as p inner join transactions as t 
	on t.premiumID=p.premiumID WHERE t.dates BETWEEN @date1 AND @date2/*'08/17/2012 0:00:00' AND '08/17/2012 23:59:59'*/

GO
CREATE PROC GetSumMonth
	@month int
AS
SELECT sum(p.amount) AS TotalMoney FROM premium as p inner join transactions as t 
	on t.premiumID=p.premiumID WHERE MONTH(t.dates) = @month

GO

CREATE PROC InsertImage
	@id int,
	@image nvarchar(100)
AS
INSERT INTO images(userID,images) VALUES (@id,@image)
GO
CREATE PROC DisplayImage
	@id int	
AS
SELECT imageID, images FROM images WHERE userID = @id