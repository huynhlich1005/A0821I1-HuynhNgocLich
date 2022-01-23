create database QuanLyDiemThi;
use QuanLyDiemThi;
create table Hoc_Sinh(
	MaHS varbinary(20) primary key,
    TenHS varchar(50),
    NgaySinh datetime,
    lop varchar(20),
    GT varchar(20)
    );
create table mon_hoc(
	MaMH varchar(20) primary key,
    TenMH varchar(50) 
);
create table bang_diem(
	MaHS varchar(20),
    MaMH varchar(20),
    DiemThi int,
    NgayKT datetime,
    primary key (MaHS, MaMH),
	foreign key(MaHS) references hoc_sinh(MaHS),
    foreign key(MaMH) references mon_hoc(MaMH)
);
create table giao_vien(
	MaGV varchar(20),
    TenGV varchar(20),
    SDT varchar(10)
);