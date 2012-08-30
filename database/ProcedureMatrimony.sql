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
/*        Select information of a user 
drop procedure GetInforUserById
        */
CREATE PROCEDURE GetInforUserById /*'4'*/
	@userId int 
	AS
	SELECT u.userID,i.images,u.fullName,u.address,u.gender,u.email,u.phoneNumber,c.cityName,ct.countryName,u.maritalStatus,u.height,u.languages
		  ,u.caste,u.familyDetails,u.qualification,u.workingAt,u.hobbies,u.favoriteMusic,u.movies,u.cuisine,u.books
	FROM images AS i INNER JOIN users AS u  ON u.userID=i.userId INNER JOIN city AS c ON u.cityID=c.cityID INNER JOIN country
	AS ct ON c.countryID=ct.countryID
	WHERE u.userId=@userId AND u.avatar=i.imageID
GO
/*        Update receive reuqest of user by Id        */
CREATE PROCEDURE UpdateReceiveRequestById/*'1','Approved','Read'*/
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
/*        All user have friend drop procedure TotalUserHaveFriend      */
CREATE PROCEDURE TotalUserHaveFriend
	AS
	SELECT count(distinct(userID)) AS Allfriend FROM receiveRequest WHERE actions='Approved'
GO
/*        Total user of system drop procedure  TotalUser       */
CREATE PROCEDURE TotalUser
	AS
	SELECT Count(*)FROM users WHERE status !='Free'
GO
/*        Total new user by today drop procedure  TotalNewUserToday        */
CREATE PROCEDURE TotalNewUserToday/*'7/13/2012 0:00:00','7/13/2012 23:59:59'*/
	@date NVARCHAR(50),
	@date1 NVARCHAR(50)	
	AS
	select COUNT(*) FROM users WHERE status!='Free'AND registerDate BETWEEN @date AND @date1
GO
/*        Select Infor of new users a today  drop procedure  InforNewUserToday       */
CREATE PROCEDURE InforNewUserToday/*'08/28/2012 0:00:00','08/28/2012 23:59:59'*/
	@date NVARCHAR(50),
	@date1 NVARCHAR(50)	
	AS
	SELECT u.userID,i.images, u.fullName,u.email FROM users AS u INNER JOIN images AS i	ON u.userID = i.userID 
	where u.status!='Free' AND i.imageID=avatar AND u.registerDate BETWEEN @date AND @date1
GO
/*        Total new user by month drop procedure TotalNewUserMonth       */
CREATE PROCEDURE TotalNewUserMonth/*'8','2012'*/
	@month NVARCHAR(50),
	@year NVARCHAR(50)
	AS
	select COUNT(*) FROM users WHERE registerDate >= ''+@month+''+'/1/'+''+@year+'' and registerDate <=''+@month+''+'/30/'+''+@year+'' AND status!='Free'
GO
/*        Select infor of new user a month   drop procedure InforNewUserAMonth      */
CREATE PROCEDURE InforNewUserAMonth/*'8','2012'*/
	@month NVARCHAR(50),
	@year NVARCHAR(50)
	AS
	select u.userID,i.images, u.fullName,u.email  FROM users AS u INNER JOIN images AS i ON u.userID = i.userID
	WHERE u.status!='Free' AND i.imageID=avatar AND registerDate >= ''+@month+''+'/1/'+''+@year+'' and registerDate <=''+@month+''+'/30/'+''+@year+''
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
/*        Check UserName Of User        */
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

/*        Get total money of system        */
CREATE PROC GetCustomPayment/* '08/16/2012 0:00:00','08/17/2012 23:59:59'*/
	@date1 nvarchar(50),
	@date2 nvarchar(50)
	AS
	SELECT SUM(p.amount) AS TotalMoney, Convert(varchar, t.dates, 101) AS  date  FROM transactions as t inner join premium as p
	on t.premiumID=p.premiumID WHERE t.dates BETWEEN @date1 AND @date2 GROUP BY Convert(varchar, t.dates, 101)
GO
/*        Get total money of a day        */
CREATE PROC GetSum /*'08/17/2012 0:00:00','08/17/2012 23:59:59'*/
	@date1 nvarchar(50),
	@date2 nvarchar(50)
	AS
	SELECT sum(p.amount) AS TotalMoney FROM premium as p inner join transactions as t 
	on t.premiumID=p.premiumID WHERE t.dates BETWEEN @date1 AND @date2/*'08/17/2012 0:00:00' AND '08/17/2012 23:59:59'*/
GO
/*        Get total money of a month        */
CREATE PROC GetSumMonth
	@month int
	AS
	SELECT sum(p.amount) AS TotalMoney FROM premium as p inner join transactions as t 
	on t.premiumID=p.premiumID WHERE MONTH(t.dates) = @month

GO
/*        insert new image        */
CREATE PROC InsertImage
	@id int,
	@image nvarchar(100)
	AS
	INSERT INTO images(userID,images) VALUES (@id,@image)
GO
/*        Display image        */
CREATE PROC DisplayImage
	@id int	
	AS
	SELECT imageID, images FROM images WHERE userID = @id
GO
/*        Delete image        */
CREATE PROC DeleteImage
	@id int
AS
DELETE FROM images WHERE imageID = @id
GO
/*        Make Profile image        */
CREATE PROC MakeProfileImage
	@id int,
	@userId int
AS
UPDATE users SET avatar = @id WHERE userID = @userId
GO
/*        Get all user expire drop procedure GetAllUserExpired       */
CREATE PROCEDURE GetAllUserExpired
	AS
	SELECT u.userID,i.images,u.fullName,u.address,u.email,u.phoneNumber,u.registerDate,u.expireDate,u.userName FROM users AS u INNER JOIN images AS i ON u.userID = i.userID
	WHERE i.imageID=u.avatar AND DATEDIFF(dayofyear,getDate(), expireDate )<=5 AND DATEDIFF(dayofyear,getDate(), expireDate )>0

GO
/*        Check user expired        */

CREATE PROCEDURE CheckUserExpired/*'chiennv'*/
	@userName NVARCHAR(50)
	AS
	SELECT * FROM users
	WHERE userName=@userName AND DATEDIFF(dayofyear,getDate(), expireDate )<=0

Go
/*
drop procedure CheckUserExpired
	Select * from users where userName='chiennv' AND expireDate between (getDate()-5) And expireDate

Select u.userID,i.images, u.fullName,u.email from users AS u INNER JOIN images AS i ON u.userID = i.userID where i.imageID=avatar AND expireDate between (getDate()-5) And expireDate

Select userID,fullName from users where userName='tungpt' AND registerDate between (getDate()-5) And registerDate
select registerDate from users
select CURDATE()
*/