 -- drop  database BookStore_ProjectSE330
 -- create database BookStore_ProjectSE330;


use BookStore_ProjectSE330;
set dateformat dmy;



/*
DROP TABLE IF EXISTS "Manager";
DROP TABLE IF EXISTS "Customer";
DROP TABLE IF EXISTS "Author";
DROP TABLE IF EXISTS "Supplier";
DROP TABLE IF EXISTS "Publisher";
DROP TABLE IF EXISTS "Book";
DROP TABLE IF EXISTS "Discount";
DROP TABLE IF EXISTS "Book_Discount";
DROP TABLE IF EXISTS "Customer_Discount";
DROP TABLE IF EXISTS "Bill";
DROP TABLE IF EXISTS "Bill_Detail";
*/



Create table Manager
(

ManagerID int IDENTITY(1,1),
-- Manager ID int AUTO_INCREMENT,

Name nvarchar(30),
Phone varchar(10),
Email varchar(30),
Password varchar(30),
constraint PK_Manager primary key(ManagerID)
)

Create table Customer
(
CustomerID int IDENTITY(1,1),
-- CustomerID int AUTO_INCREMENT,

Name nvarchar(30),
Phone varchar(10),
RegisterDate smalldatetime,
Total money,
constraint PK_Customer primary key(CustomerID)
)



create table Book
(
BookID int IDENTITY(1,1),
-- BookID int AUTO_INCREMENT,

Supplier varchar(30),
Author varchar(30),
Publisher varchar(30),
Name nvarchar(30),
Description nvarchar(100),
Edition numeric(2,2),
Type nvarchar(20),
BookCover nvarchar(20),
ReleaseDate smalldatetime,
NumPages tinyint,
Price money,
constraint PK_Book primary key(BookID)
)

Create table Discount(
DiscountID int IDENTITY(1,1),
-- DiscountID int AUTO_INCREMENT,

Name nvarchar(30),
Value numeric(2,2),
constraint PK_Discount primary key(DiscountID)

)

Create table Book_Discount(
BookID int ,
DiscountID int,
constraint PK_BookDiscount primary key(BookID, DiscountID)
)

Create table Customer_Discount(
CustomerID int ,
DiscountID int ,
constraint PK_CustomerDiscount primary key(CustomerID, DiscountID)
)	

Create table Bill(
BillID int IDENTITY(1,1),
-- BillID int AUTO_INCREMENT,

CustomerID int,
DiscountID int,
Address nvarchar(40),
Status varchar(20),
Total money,
Date smalldatetime,
constraint PK_Bill primary key(BillID)
)

Create table Bill_Detail
(
BillID int,
BookID int,
Amount tinyint,
Price money,
constraint PK_Bill_Detail primary key(BillID, BookID)
)



/* foreign key */

alter table Bill_Detail
ADD constraint FK_BDBI
foreign key(BillID) references Bill(BillID);

alter table Bill_Detail
ADD constraint FK_BDBKI
foreign key(BookID) references Book(BookID);

alter table Bill
ADD constraint FK_BDI
foreign key(DiscountID) references Discount(DiscountID);

alter table Bill
ADD constraint FK_BCI
foreign key(CustomerID) references Customer(CustomerID);



alter table Book_Discount
ADD constraint FK_BKDBI
foreign key(BookID) references Book(BookID);

alter table Book_Discount
ADD constraint FK_BKDDI
foreign key(DiscountID) references Discount(DiscountID);

alter table Customer_Discount
ADD constraint FK_CDCI
foreign key(CustomerID) references Customer(CustomerID);

alter table Customer_Discount
ADD constraint FK_CDDI
foreign key(DiscountID) references Discount(DiscountID);

/*



INSERT INTO Manager
(Name,Phone,Email)
VALUES
('Dave','0902311212','Dave@gmail.com'),
('Evan','0901121211','Evan@gmail.com'),
('Vias','0911121212','Vias@gmail.com'),
('Dios','0909090909','Dios@gmail.com'),
('Merc','1111213123','Merc@gmail.com'),
('Blue','1981201291','Blue@gmail.com'),
('Nase','0910219112','Nase@gmail.com');

INSERT INTO Customer
(Name,Phone,RegisterDate)
VALUES
('Banana','1111111111','1/1/2001'),
('Apple','2222222222','1/1/2001'),
('Orange','3333333333','1/1/2001'),
('Grape','4444444444','1/1/2001'),
('Strawberry','5555555555','1/1/2001'),
('Potato','6666666666','1/1/2001'),
('Jackfruit','7777777777','1/1/2001'),
('StarApple','8888888888','1/1/2001'),
('Sweet','9999999999','1/1/2001');



INSERT INTO Book
(Name, Supplier,Author,Publisher,Description,Edition,Type,BookCover,ReleaseDate,NumPages)
VALUES
('Mắt Biếc',1,2,3,'asdnjsandkjad',1.0,'Tieu thuyet','Bìa mềm','23/08/2022',120),
();

INSERT INTO Discount
(Name,Value)
VALUES
('Customer_Bronze',1.2),
();

INSERT INTO Bill
(CustomerID,DiscountID,Address,Status,Date)
VALUES
(),
();

INSERT INTO Bill_Detail
(BillID,BookID,Amount)
VALUES
(),
();

INSERT INTO Book_Discount
(AuthorID,Name,Phone,Email,NumofProducts)
VALUES
(),
();

INSERT INTO Customer_Discount
(AuthorID,Name,Phone,Email,NumofProducts)
VALUES
(),
();

*/
