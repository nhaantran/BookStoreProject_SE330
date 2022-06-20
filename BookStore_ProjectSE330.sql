drop database BookStore_ProjectSE330

create database BookStore_ProjectSE330;

use BookStore_ProjectSE330;
set dateformat dmy;

/*
DROP TABLE IF EXISTS "Manager";
DROP TABLE IF EXISTS "Customer";
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

Supplier nvarchar(30),
Author nvarchar(30),
Publisher nvarchar(30),
Name nvarchar(30),
Description nvarchar(100),
Edition numeric(4,2),
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
Value numeric(4,2),
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
Status nvarchar(20),
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

/*constraints */

alter table Bill
Add constraint checkDate check (Date <= cast(getDate() as date));

alter table Bill_Detail
Add constraint checkAmount check (Amount > 0);

alter table Bill_Detail
Add constraint checkPrice check (Price >= 0);

alter table Book
Add constraint checkReleaseDate check (ReleaseDate <= cast(getDate() as date));

alter table Book
Add constraint checkNumPages check (NumPages > 0 and NumPages % 2 = 0);

alter table Book
Add constraint checkPrice check (Price > 0);

alter table Customer
Add constraint uniquePhone unique (Phone);

alter table Customer
Add constraint checkReleaseDate check (RegisterDate <= cast(getDate() as date));

alter table Manager
Add constraint uniquePhone unique (Phone);

alter table Manager
Add constraint uniqueEmail unique (Email);

/* Insert values */

INSERT INTO Manager
(Name,Phone,Email,Password)
VALUES
('Dave','0902311212','Dave@gmail.com','12345'),
('Evan','0901121211','Evan@gmail.com','12345'),
('Vias','0911121212','Vias@gmail.com','12345'),
('Dios','0909090909','Dios@gmail.com','12345'),
('Merc','1111213123','Merc@gmail.com','12345'),
('Blue','1981201291','Blue@gmail.com','12345'),
('Nase','0910219112','Nase@gmail.com','12345');

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
(Name, Supplier,Author,Publisher,Description,Edition,Type,BookCover,ReleaseDate,NumPages,Price)
VALUES
(N'Mắt Biếc',N'Nhã Nam',N'Nguyễn Nhật Ánh',N'NXB Trẻ',N'Tác phẩm của Nguyễn Nhật Ánh',1.5,N'Tiểu thuyết',N'Bìa mềm','23/08/2019',234,96000),
(N'Thị kiến',N'FAHASA',N'Stephen King',N'Nhã Nam',N'Tác phẩm của Stephen King',1.0,N'Tiểu thuyết',N'Bìa cứng','06/12/2022',592,269000),
(N'Lâu đài',N'Nhã Nam',N'Franz Kafka',N'NXB Văn Học',N'Tác phẩm của Franz Kafka',1.2,N'Tiểu thuyết',N'Bìa mềm','24/07/2020',332,115000),
(N'Truyện Kiều',N'FAHASA',N'Nguyễn Du',N'NXB Trẻ',N'Truyện thơ của Nguyễn Du',1.8,N'Truyện thơ',N'Bìa mềm','08/09/2015',232,70000),
(N'Giao thừa',N'FAHASA',N'Nguyễn Ngọc Thừa',N'NXB Trẻ',N'Truyện ngắn Giao thừa',1.3,N'Truyện ngắn',N'Bìa mềm','29/04/2017',68,45000),
(N'5 centimet trên giây',N'FAHASA',N'Shinkai Makoto',N'NXB Văn Học',N'Tiểu thuyết của Shinkai Makoto',1.0,N'Tiểu thuyết',N'Bìa mềm','12/01/2013',88,53000),
(N'Trò chơi sinh tử',N'Nhã Nam',N'Koushun Takami',N'NXB Hội Nhà Văn',N'Tiểu thuyết của Koushun Takami',1.2,N'Tiểu thuyết',N'Bìa mềm','29/01/2019',604,207000),
(N'Sapiens: Lược sử loài người',N'Alpha Books',N'Yuval Noah Harari',N'NXB Thế Giới',N'Sách mô tả về lược sử văn minh nhân loại',1.4,N'Sách Lịch sử',N'Bìa cứng','30/09/2021',560,614000),
(N'Chủ nghĩa khắc kỷ',N'Thái Hà',N'William B Irvine',N'NXB Công Thương',N'Sách mô tả về chủ nghĩa khắc kỷ',1.0,N'Sách Tâm lý',N'Bìa cứng','16/08/2020',370,292000);

INSERT INTO Discount
(Name,Value)
VALUES
('Normal_Customer',1.0),
('Customer_Bronze',0.95),
('Customer_Silver',0.9),
('Customer_Gold',0.85),
('Customer_Platinum',0.7);

INSERT INTO Bill
(CustomerID,DiscountID,Address,Status,Date)
VALUES
(3,1,N'TP HCM','Paid','15/06/2022'),
(4,2,N'TP HCM','Paid','13/06/2022'),
(3,1,N'TP HCM','Paid','17/06/2022'),
(1,1,N'TP HCM','Paid','15/06/2022'),
(2,2,N'TP HCM','Paid','12/06/2022'),
(6,4,N'TP HCM','Paid','15/06/2022');

INSERT INTO Bill_Detail
(BillID,BookID,Amount)
VALUES
(1,3,1),
(1,5,1),
(1,7,1),
(2,1,2),
(3,3,1),
(4,8,1),
(5,2,4),
(5,3,2),
(6,2,3),
(6,3,1);

INSERT INTO Book_Discount
(BookID,DiscountID)
VALUES
(1,1),
(2,1),
(3,2),
(4,2),
(5,1),
(6,1),
(7,3),
(8,1),
(9,4);

INSERT INTO Customer_Discount
(CustomerID,DiscountID)
VALUES
(1,2),
(2,1),
(3,1),
(4,3),
(5,1),
(6,4),
(7,1),
(8,1),
(9,1);
