CREATE DATABASE MatrimonyBank
GO
USE MatrimonyBank
GO
CREATE TABLE Customers (
	customerID INT PRIMARY KEY IDENTITY(1, 1),
	identityNumber NUMERIC,
	password NTEXT,
	fullName NTEXT,
	address NTEXT,
	email NTEXT,
	phoneNumber NTEXT,
	registedDate DATETIME DEFAULT GETDATE()
)
GO
CREATE TABLE Accounts (
	accountID INT PRIMARY KEY IDENTITY(1, 1),
	customerID INT FOREIGN KEY REFERENCES Customers(customerID),
	accountType NTEXT,
	balance NUMERIC
)
GO
CREATE TABLE Transactions (
	transactionID INT PRIMARY KEY IDENTITY(1, 1),
	customerID INT FOREIGN KEY REFERENCES Customers(customerID),
	income NUMERIC,
	outgo NUMERIC,
	description NTEXT,
	transactionDate DATETIME DEFAULT GETDATE()
)