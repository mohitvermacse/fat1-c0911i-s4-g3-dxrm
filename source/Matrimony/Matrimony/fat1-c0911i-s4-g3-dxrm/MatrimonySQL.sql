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
	countryID INT FOREIGN KEY REFERENCES country(countryID),
	cityName NVARCHAR(100)
)
GO
CREATE TABLE users(
	userID INT PRIMARY KEY IDENTITY(1, 1),
	userName NVARCHAR(50),
	password NVARCHAR(50),
	fullName NVARCHAR(50),
	address NVARCHAR(100),
	gender NVARCHAR(10),
	email NVARCHAR(50),
	phoneNumber NVARCHAR(20),
	maritalStatus NVARCHAR(50),
	height INT,	
	countryID INT FOREIGN KEY REFERENCES city(cityID),
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
	expireDate NVARCHAR(50) ,
	status NVARCHAR(10)
)
GO
CREATE TABLE sendRequest(
	sendID INT PRIMARY KEY IDENTITY(1, 1),
	userID INT FOREIGN KEY REFERENCES users(userID),
	contents ntext,
	dates DATETIME DEFAULT GETDATE(),
	status NVARCHAR(50)
)
GO
CREATE TABLE receiveRequest(
	receiveID INT PRIMARY KEY IDENTITY(1, 1),
	userID INT FOREIGN KEY REFERENCES users(userID),
	sendID INT FOREIGN KEY REFERENCES sendRequest(sendID),
	action NVARCHAR(20),
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
CREATE TABLE transactions(
	transactionID INT PRIMARY KEY IDENTITY(1, 1),
	userID INT FOREIGN KEY REFERENCES users(userID),
	premiumID INT FOREIGN KEY REFERENCES premium(premiumID),
	dates DATETIME DEFAULT GETDATE()
)
GO
