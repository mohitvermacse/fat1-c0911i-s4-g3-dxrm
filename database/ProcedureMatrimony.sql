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
/* get city by country Id */
CREATE PROC GetCitiesByCountry
	@cid char(3)
AS
SELECT * FROM city WHERE countryID = @cid
GO
/*        Get password by email DROP GetPasswordByEmail'vchienbn@gmail.com'       */
CREATE PROCEDURE GetPasswordByEmail
	@email NVARCHAR(50)
	AS
		SELECT password FROM users WHERE email=@email
GO
/*        Select all country        */
CREATE PROC GetAllCountry 
	AS
	SELECT * FROM country
	
GO
/*        Display all user of system DROP PROCEDURE DisplayAllUser   */
CREATE PROCEDURE DisplayAllUser
	AS
		SELECT userID,userName,avatar,fullName,email
		FROM users
		WHERE status = 'Paid'
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
/*        Select Id of user by userName, drop procedure GetUserIdByUserName'chiennv'     */
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
CREATE PROCEDURE GetAllReceveRequestByStatus
	@userId int,
	@actions NVARCHAR(50)
	AS
		SELECT rr.receiveID,rr.userID,sr.userID,rr.actions,sr.sendID,sr.contents,rr.status FROM receiveRequest AS rr inner join sendRequest AS sr 
		ON rr.sendID=sr.sendID WHERE rr.actions=@actions AND rr.userID=@userId
	
GO 
/*        select all users want is friends of user to transition management  GetAllReceveRequestTransfer'Pending' */
CREATE PROCEDURE GetAllReceveRequestTransfer
	@actions NVARCHAR(50)
	AS
		SELECT rr.receiveID,rr.userID,sr.userID,rr.actions,sr.sendID,sr.contents,rr.status FROM receiveRequest AS rr inner join sendRequest AS sr 
		ON rr.sendID=sr.sendID WHERE rr.actions=@actions
GO
/*        Count all request of user receive */
CREATE PROCEDURE SumRequestReceive
	@actions NVARCHAR(50)
	AS
		SELECT Count(*) FROM receiveRequest WHERE actions=@actions

GO
/*        Select information fo a user send request */
CREATE PROCEDURE GetInforUserSendByUserID
	@sendUserID int
	AS
		SELECT u.fullName,u.gender,u.birthDay,u.email,u.languages,u.qualification,u.familyDetails,u.favoriteMusic,u.hobbies,u.workingAt,u.books,i.images
		FROM users AS u inner join images AS i ON u.userID=i.userID
		WHERE u.userID=@sendUserID
Go
/*        Get infor user DROP PROCEDURE GetInforById'2' */
CREATE PROCEDURE GetInforById
	@userId INT
	AS
		SELECT u.userName,i.images FROM users AS u INNER JOIN images AS i ON u.userID = i.userID WHERE u.userID=@userId
GO
/*        Select information of a user drop procedure GetInforUserById'2' */
CREATE PROCEDURE GetInforUserById
	@userId int 
	AS
		SELECT u.userID,i.images,u.userName,u.fullName,u.address,u.gender,u.email,u.phoneNumber,c.cityName,ct.countryName,u.maritalStatus,u.height,u.languages
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
/*        Select all riend of user drop procedure GetAllFriend'3','Approved' */
CREATE PROCEDURE GetAllFriend
	@userId int,
	@action NVARCHAR(20)
	AS
		SELECT u.fullName,u.userName,i.images,u.userID,sr.userID FROM receiveRequest AS rr inner join sendRequest AS sr 
		ON rr.sendID=sr.sendID INNER JOIN users AS u ON rr.userID=u.userID INNER JOIN images AS i ON u.userID=i.userID
		WHERE rr.userId=@userId AND rr.actions=@action
GO
/*        Select all riend of user drop procedure GetAllFriends'3','Approved' */
CREATE PROCEDURE GetAllFriends
	@userId int,
	@status NVARCHAR(50)
	AS
		SELECT u.fullName,u.userName,i.images,sr.userID,u.userID FROM receiveRequest AS rr inner join sendRequest AS sr 
		ON rr.sendID=sr.sendID INNER JOIN users AS u ON rr.userID=u.userID INNER JOIN images AS i ON u.userID=i.userID
		WHERE sr.userID = @userId AND sr.status=@status
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
/*        Total new user by today drop procedure  TotalNewUserToday'7/13/2012 0:00:00','7/13/2012 23:59:59' */
CREATE PROCEDURE TotalNewUserToday
	@date NVARCHAR(50),
	@date1 NVARCHAR(50)	
	AS
		select COUNT(*) FROM users WHERE status!='Free'AND registerDate BETWEEN @date AND @date1
GO
/*        Select Infor of new users a today  drop procedure  InforNewUserToday'08/28/2012 0:00:00','08/28/2012 23:59:59'       */
CREATE PROCEDURE InforNewUserToday
	@date NVARCHAR(50),
	@date1 NVARCHAR(50)	
	AS
		SELECT u.userID,u.userName,i.images, u.fullName,u.email FROM users AS u INNER JOIN images AS i	ON u.userID = i.userID 
		where u.status!='Free' AND i.imageID=avatar AND u.registerDate BETWEEN @date AND @date1
GO
/*        Total new user by month drop procedure TotalNewUserMonth'8','2012'       */
CREATE PROCEDURE TotalNewUserMonth/*'8','2012'*/
	@month NVARCHAR(50),
	@year NVARCHAR(50)
	AS
		select COUNT(*) FROM users WHERE registerDate >= ''+@month+''+'/1/'+''+@year+'' and registerDate <=''+@month+''+'/30/'+''+@year+'' AND status!='Free'
GO
/*        Select infor of new user a month   drop procedure InforNewUserAMonth'8','2012'      */
CREATE PROCEDURE InforNewUserAMonth
	@month NVARCHAR(50),
	@year NVARCHAR(50)
	AS
		select u.userID,u.userName,i.images, u.fullName,u.email  FROM users AS u INNER JOIN images AS i ON u.userID = i.userID
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
	AS 
		UPDATE users SET password=@password WHERE userName=@userName
GO
/*        Valid Password        */
CREATE PROCEDURE CheckOldPassword
	@userName NVARCHAR(50),
	@password NVARCHAR(50)
	AS
		SELECT * FROM users WHERE userName=@userName AND password=@password
GO

/*        Get total money of system GetCustomPayment'08/16/2012 0:00:00','09/4/2012 23:59:59'       */
CREATE PROC GetCustomPayment
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
/*        Delete image, drop procedure DeleteImage       */
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
		SELECT u.userID,i.images,u.fullName,u.address,u.email,u.phoneNumber,u.registerDate,u.expireDate,u.userName
		FROM users AS u INNER JOIN images AS i ON u.userID = i.userID
		WHERE i.imageID=u.avatar AND  DATEDIFF(dayofyear,getDate(), expireDate )<=5 AND DATEDIFF(dayofyear,getDate(), expireDate )>=0

GO
/*        Check user expired  drop procedure CheckUserExpired'chiennv'    */

CREATE PROCEDURE CheckUserExpired
	@userName NVARCHAR(50)
	AS
		SELECT * FROM users
		WHERE userName=@userName AND DATEDIFF(dayofyear,getDate(), expireDate )<0

Go
/*        Check two user is friend DROP PROCEDURE CheckTwoUserFriend'3','2'      */
CREATE PROCEDURE CheckTwoUserFriend
	@idFriend1 int,
	@idFriend2 int
	AS
		SELECT rr.userID,sr.userID,rr.actions FROM receiveRequest AS rr INNER JOIN sendRequest AS sr ON sr.sendID=rr.sendID
		WHERE  (rr.actions='Approved' AND rr.userID=@idFriend1 AND sr.userID=@idFriend2) OR(rr.actions='Approved' AND rr.userID=@idFriend2 AND sr.userID=@idFriend1) 
GO
/*        Search user by job DROP PROCEDURE SearchUserByWorkingAt'doctor'  select * from users        */
CREATE PROCEDURE SearchUserByWorkingAt
	@job NVARCHAR(50)
	AS
		SELECT userID,userName,avatar,fullName,address,gender,birthDay,height,maritalStatus,workingAt,hobbies,favoriteMusic,movies,cuisine,books,status
		FROM users
		WHERE (workingAt LIKE '%'+@job AND status ='Paid')
		OR(workingAt LIKE '%'+@job+'%'  AND status ='Paid')
		OR(workingAt LIKE @job+'%'  AND status ='Paid')
GO
/*        Search user by marite status DROP PROCEDURE SearchUserByMariteStatust'Single'      */
CREATE PROCEDURE SearchUserByMariteStatust
	@status NVARCHAR(50)
	AS
		SELECT userID,userName,avatar,fullName,address,gender,birthDay,height,maritalStatus,workingAt,hobbies,favoriteMusic,movies,cuisine,books,status
		FROM users
		WHERE (maritalStatus LIKE '%'+@status  AND status ='Paid')
		OR(maritalStatus LIKE '%'+@status+'%'  AND status ='Paid')
		OR(maritalStatus LIKE @status+'%'  AND status ='Paid')
GO
/*        Search user by age Drop PROCEDURE SearchUserByAge1825        */
CREATE PROCEDURE SearchUserByAge1825
	AS
		SELECT u.userID,u.userName,i.images,u.fullName,u.address,u.gender,u.birthDay,u.height,u.maritalStatus,u.workingAt,u.hobbies,u.favoriteMusic,u.movies,u.cuisine,u.books,u.status
		FROM users AS u INNER JOIN images AS i ON u.userID = i.userID
		WHERE DATEDIFF(yy,birthDay,getDate())>=18 AND DATEDIFF(yy,birthDay,getDate())<=25 AND status ='Paid' AND i.imageID = u.avatar
GO
/*        Search user by age Drop PROCEDURE SearchUserByAge2530        */
CREATE PROCEDURE SearchUserByAge2530
	AS
		SELECT u.userID,u.userName,i.images,u.fullName,u.address,u.gender,u.birthDay,u.height,u.maritalStatus,u.workingAt,u.hobbies,u.favoriteMusic,u.movies,u.cuisine,u.books,u.status
		FROM users AS u INNER JOIN images AS i ON u.userID = i.userID
		WHERE DATEDIFF(yy,birthDay,getDate())>25 AND DATEDIFF(yy,birthDay,getDate())<=30 AND status ='Paid' AND i.imageID = u.avatar
GO
/*        Search user by age Drop PROCEDURE SearchUserByAge3040        */
CREATE PROCEDURE SearchUserByAge3040
	AS
		SELECT u.userID,u.userName,i.images,u.fullName,u.address,u.gender,u.birthDay,u.height,u.maritalStatus,u.workingAt,u.hobbies,u.favoriteMusic,u.movies,u.cuisine,u.books,u.status
		FROM users AS u INNER JOIN images AS i ON u.userID = i.userID
		WHERE DATEDIFF(yy,birthDay,getDate())>30 AND DATEDIFF(yy,birthDay,getDate())<=40 AND status ='Paid' AND i.imageID = u.avatar
GO
/*        Get Image by avatar and userId DROP PROCEDURE GetImagesByAvatar'2','8'       */
CREATE PROCEDURE GetImagesByAvatar
	@avatar int,
	@userId int
	AS
		SELECT images from images where imageID=@avatar AND userID=@userID
GO
/*        Search user by City DROP PROCEDURE SearchUserByCity'TP HCM'        */
CREATE PROCEDURE SearchUserByCity
	@cityName NVARCHAR(50)
	AS
		SELECT u.userID,u.userName,i.images,u.fullName,u.address,u.gender,u.birthDay,u.height,u.maritalStatus,u.workingAt,u.hobbies,u.favoriteMusic,u.movies,u.cuisine,u.books,u.status
		FROM users AS u INNER JOIN city AS c ON u.cityID = c.cityID INNER JOIN images AS i ON u.userID = i.userID
		WHERE c.cityName=@cityName AND status ='Paid'
GO
/*        Update user expireDate DROP PROCEDURE UpdateUserExpired'chiennv'        */ 
GO
CREATE PROCEDURE UpdateUserExpired
	@userName NVARCHAR(50)
	AS
		UPDATE users SET status='Free'
		WHERE userName=@userName
GO

CREATE PROCEDURE CheckExistEmail
	@email NVARCHAR(50)
	AS
		SELECT email FROM users WHERE email = @email
GO
CREATE PROCEDURE GetEmail
	@userName NVARCHAR(50)
	AS
		SELECT email FROM users WHERE userName = @userName
GO
CREATE PROCEDURE GetRequestFriends
	@userId int,
	@action NVARCHAR(20)
	AS
	SELECT u.userID, u.userName, u.gender, u.avatar FROM receiveRequest AS rr inner join sendRequest AS sr 
	ON rr.sendID=sr.sendID INNER JOIN users AS u ON rr.userID=u.userID
	WHERE sr.userID =@userId AND rr.actions=@action

GO
CREATE PROCEDURE GetReceiveFriends 
	@userId int,
	@action NVARCHAR(20)
	AS
	SELECT sendRequest.userID, users.userName, users.gender, users.avatar
	FROM users INNER JOIN sendRequest
	ON sendRequest.userID = users.userID INNER JOIN receiveRequest
	ON receiveRequest.sendID = sendRequest.sendID
	WHERE receiveRequest.userID = @userId AND sendRequest.status=@action

/*
drop
select cityName from city
drop procedure CheckUserExpired
	select * from users as u inner join images as i on u.userId=i.userID Inner join receiveRequest as rr
	On u.userID = rr.userID inner join sendRequest as sr on u.userID = sr.userID Where rr.actions='Approved'
	AND sr.status='Approved' AND i.imageID=u.avatar

create procedure DisplayAllUserHaveFriend drop procedure DisplayAllUserHaveFriend
AS
select  distinct(userID) from receiveRequest where  actions= 'Approved' 
(select * from sendRequest where  status ='Approved')
sr.status='Approved' 
*/



