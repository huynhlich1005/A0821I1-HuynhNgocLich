create database quanlybanhang;
use quanlybanhang;
create table Customer(
	cID INT primary key,
    cName varchar(40),
    cAge int 
);
create table `Order`(
	oID int not null primary key,
    cID int not null,
    oDate datetime,
    oTotalPrice int not null,
    foreign key (cID) references Customer(cID)
);
create table OrderDetail(
	oID int ,
    pID int ,
    odQTY varchar(20),
    primary key(oID , pID),
    foreign key(oID) references `Order`(oID),
    foreign key(pID) references Product(pID)
);
create table Product (
	pID int not null primary key,
    pName varchar(40),
    pPrice int 
);