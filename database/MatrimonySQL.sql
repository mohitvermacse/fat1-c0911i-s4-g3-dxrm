
USE master
Go
IF exists(Select * From SYS.Databases where name='Matrimony')
Drop database Matrimony
Go
CREATE DATABASE Matrimony
GO
Use Matrimony
GO
CREATE TABLE admin(
	adminID INT PRIMARY KEY IDENTITY(1, 1),
	userName NVARCHAR(50),
	password NVARCHAR(50)
)
CREATE TABLE country(
	countryID INT IDENTITY(1,1) PRIMARY KEY,
	countryName NVARCHAR(100)
)
CREATE TABLE city(
	cityID INT IDENTITY(1,1) PRIMARY KEY,
	countryID INT FOREIGN KEY REFERENCES country(countryID)not null,
	cityName NVARCHAR(100)
)
GO
CREATE TABLE users(
	userID INT PRIMARY KEY IDENTITY(1, 1),
	userName NVARCHAR(50) not null,
	password NVARCHAR(50)not null,
	avatar int,
	fullName NVARCHAR(50),
	address NVARCHAR(100),
	gender NVARCHAR(10),
	birthDay DATETIME,
	email NVARCHAR(50),
	phoneNumber NVARCHAR(20),
	maritalStatus NVARCHAR(50),
	height INT,	
	countryID INT FOREIGN KEY REFERENCES country(countryID) not null,
	cityID INT FOREIGN KEY REFERENCES city(cityID) not null,
	languages NVARCHAR(100),
	caste NVARCHAR(10),
	familyDetails NTEXT,
	qualification NTEXT,
	workingAt NTEXT,	
	hobbies NTEXT,
	favoriteMusic NTEXT,
	movies NTEXT,
	cuisine NTEXT,
	books NTEXT,
	registerDate DATETIME DEFAULT GETDATE(),
	expireDate DATETIME,
	status NVARCHAR(10)
)
GO
CREATE TABLE sendRequest(
	sendID INT PRIMARY KEY IDENTITY(1, 1),
	userID INT FOREIGN KEY REFERENCES users(userID)not null,
	contents ntext,
	dates DATETIME DEFAULT GETDATE(),
	status NVARCHAR(50)
)
GO
CREATE TABLE receiveRequest(
	receiveID INT PRIMARY KEY IDENTITY(1, 1),
	userID INT FOREIGN KEY REFERENCES users(userID)not null,
	sendID INT FOREIGN KEY REFERENCES sendRequest(sendID)not null,
	requestType NVARCHAR(20),
	actions NVARCHAR(20),
	status NVARCHAR(50)
)
GO
CREATE TABLE images(
	imageID INT identity primary key not null,
	userID INT FOREIGN KEY REFERENCES users(userID) not null,
	images nvarchar(100),
)
GO 
CREATE TABLE premium(
	premiumID INT PRIMARY KEY IDENTITY(1, 1),
	premiumType NTEXT,
	amount INT
)
GO
CREATE TABLE transactions(
	transactionID INT PRIMARY KEY IDENTITY(1, 1),
	userID INT FOREIGN KEY REFERENCES users(userID)not null,
	premiumID INT FOREIGN KEY REFERENCES premium(premiumID)not null,
	dates DATETIME DEFAULT GETDATE()
)
GO
insert into admin values('admin1','e10adc3949ba59abbe56e057f20f883e')
insert into admin values('admin2','e10adc3949ba59abbe56e057f20f883e')

insert into country values('Viet Nam')
insert into country values('England')

insert into city values(1,'TP HCM')
insert into city values(1,'Ha Noi')
insert into city values(1,'Hue')
insert into city values(2,'Lodon')
insert into city values(2,'Birmingham')
insert into city values(2,'Manchester')

insert into premium values('month',50)
insert into premium values('year',500)

select * from users

insert into users(userName,password,fullName,address,gender,birthDay,email,phoneNumber,height,countryID,cityID,expireDate,status)
 values('chiennv','e10adc3949ba59abbe56e057f20f883e','Nguyen Van Chien','Bac Ninh','Male','10/20/1984','chiennv_a04470@fpt.aptech.ac.vn','0984632414','166',1,2,getDate(),'Expired')
insert into users(userName,password,fullName,address,gender,birthDay,email,phoneNumber,height,countryID,cityID,expireDate,status)
 values('tungpt','e10adc3949ba59abbe56e057f20f883e','Pham Thanh Tung','Ha Noi','Male','10/20/1984','tungpt_a04471@fpt.aptech.ac.vn','0984632414','166',1,2,getDate(),'Expired')
insert into users(userName,password,fullName,address,gender,birthDay,email,phoneNumber,height,countryID,cityID,expireDate,status)
 values('longnh','e10adc3949ba59abbe56e057f20f883e','Nguyen Hoang Long','Ha Noi','Male','10/20/1984','longnh_a04472@fpt.aptech.ac.vn','0984632414','166',1,2,getDate(),'Expired')
insert into users(userName,password,fullName,address,gender,birthDay,email,phoneNumber,height,countryID,cityID,expireDate,status)
 values('tienvv','e10adc3949ba59abbe56e057f20f883e','Vu Van Tien','Ha Noi','Male','10/20/1984','tienvv_a04473@fpt.aptech.ac.vn','0984632414','166',1,2,getDate(),'Expired')
insert into users(userName,password,fullName,address,gender,birthDay,email,phoneNumber,height,countryID,cityID,expireDate,status)
 values('hunglv','e10adc3949ba59abbe56e057f20f883e','Le Viet Hung','Ha Noi','Male','10/20/1984','hunglv_a04474@fpt.aptech.ac.vn','0984632414','166',1,2,getDate(),'Expired')


insert into transactions(userID,premiumID)values(1,1)
insert into transactions(userID,premiumID)values(2,1)
insert into transactions(userID,premiumID)values(3,1)
insert into transactions(userID,premiumID)values(4,2)
insert into transactions(userID,premiumID)values(5,1)

insert into sendRequest(userID,contents) VALUES(1,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')
insert into sendRequest(userID,contents) VALUES(2,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')
insert into sendRequest(userID,contents) VALUES(3,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')
insert into sendRequest(userID,contents) VALUES(4,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')
insert into sendRequest(userID,contents) VALUES(5,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')
insert into sendRequest(userID,contents) VALUES(1,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')
insert into sendRequest(userID,contents) VALUES(2,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')
insert into sendRequest(userID,contents) VALUES(3,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')
insert into sendRequest(userID,contents) VALUES(4,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')
insert into sendRequest(userID,contents) VALUES(5,'Chao Ban! Chung ta co the lam quen voi nhau duoc khong?')

insert into receiveRequest(userID,sendID,actions,status) VALUES(2,1,'Pending','Unread')
insert into receiveRequest(userID,sendID,actions,status) VALUES(3,2,'Pending','Unread')
insert into receiveRequest(userID,sendID,actions,status) VALUES(2,3,'Pending','Unread')
insert into receiveRequest(userID,sendID,actions,status) VALUES(2,4,'Pending','Unread')
insert into receiveRequest(userID,sendID,actions,status) VALUES(2,5,'Pending','Unread')
insert into receiveRequest(userID,sendID,actions,status) VALUES(3,6,'Pending','Unread')
insert into receiveRequest(userID,sendID,actions,status) VALUES(1,7,'Pending','Unread')
insert into receiveRequest(userID,sendID,actions,status) VALUES(1,8,'Pending','Unread')
insert into receiveRequest(userID,sendID,actions,status) VALUES(1,9,'Pending','Unread')
insert into receiveRequest(userID,sendID,actions,status) VALUES(1,10,'Pending','Unread')

Go
DELETE users
DELETE city
DELETE country
DELETE admin
DELETE premium
DELETE sendRequest
DELETE receiveRequest
