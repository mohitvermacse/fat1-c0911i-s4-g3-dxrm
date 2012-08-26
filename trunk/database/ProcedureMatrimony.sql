USE Matrimony
GO
/*        user login        */
CREATE PROCEDURE LoginUser'tungpt','e10adc3949ba59abbe56e057f20f883e'*/
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
/*        select all request unread        */
CREATE PROCEDURE GetAllReceveRequestByStatus'2','Unread' */
	@userId int,
	@status NVARCHAR(50)
	AS
	SELECT rr.receiveID,rr.userID,rr.actions,sr.sendID,sr.contents,rr.status FROM receiveRequest AS rr inner join sendRequest AS sr 
	ON rr.sendID=sr.sendID WHERE rr.status=@status AND rr.userID=@userId
Go
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
CREATE PROCEDURE GetAllFriend'2','Accept'/*'2','Accept'*/
	@userId int,
	@action NVARCHAR(20)
	AS
	SELECT rr.receiveID,rr.userID,rr.actions,sr.sendID FROM receiveRequest AS rr inner join sendRequest AS sr 
	ON rr.sendID=sr.sendID WHERE rr.userId=@userId AND rr.actions=@action


DROP procedure GetAllReceveRequestByStatus
Go
SELECT sum(p.amount) AS TotalMoney FROM premium as p inner join transactions as t 
	on p.premiumID=t.premiumID inner join users as u on t.userID = u.userID
	WHERE p.premiumID=1 and 
GO
SELECT sum(p.amount) AS TotalMoney FROM premium as p inner join transactions as t 
on p.premiumID=t.premiumID WHERE p.premiumID=2
GO
SELECT count(*) FROM users WHERE status='false'
SELECT count(*) FROM users WHERE status='true'
SELECT top(3) * FROM users order by userID asc
/* All user have friend */
SELECT count(distinct(userID)) AS Allfriend FROM receiveRequest WHERE actions='Accept'



CREATE PROC GetCustomPayment 
	@date1 nvarchar(50),
	@date2 nvarchar(50)
AS
SELECT SUM(p.amount) AS TotalMoney, Convert(varchar, t.dates, 101) AS  date  FROM transactions as t inner join premium as p
on t.premiumID=p.premiumID WHERE t.dates BETWEEN @date1 AND @date2 GROUP BY Convert(varchar, t.dates, 101)
GO
CREATE PROC GetSum 
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
