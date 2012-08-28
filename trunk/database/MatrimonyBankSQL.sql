CREATE DATABASE MatrimonyBank
GO
USE MatrimonyBank
GO
CREATE TABLE Customers (
	customerID INT PRIMARY KEY IDENTITY(1, 1),
	identityNumber VARCHAR(20) NOT NULL,
	password VARCHAR(20) NOT NULL,
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

INSERT INTO Customers(identityNumber, password, fullName, address, email, phoneNumber) VALUES ('08282012001', '123456', 'Nguyen Hoang Long', 'Hoan Kiem', 'longnh@fpt.com', '0979371098')
INSERT INTO Customers(identityNumber, password, fullName, address, email, phoneNumber) VALUES ('08282012010', '123456', 'Nguyen Van A', 'Hai Ba Trung', 'anv@fpt.com', '8965604956')
INSERT INTO Customers(identityNumber, password, fullName, address, email, phoneNumber) VALUES ('08282012100', '123456', 'Nguyen Van B', 'Hoang Mai', 'bnv@fpt.com', '6456564566')

INSERT INTO Accounts(customerID, accountType, balance) VALUES (1, 'Credit Card', 15000)
INSERT INTO Accounts(customerID, accountType, balance) VALUES (2, 'Credit Card', 2300)
INSERT INTO Accounts(customerID, accountType, balance) VALUES (3, 'Credit Card', 9700)

