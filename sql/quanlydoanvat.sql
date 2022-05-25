create database quanlydoanvat
go
use quanlydoanvat
go
create table Menu
( maDoAn nvarchar(10) not null,
tenDoAn nvarchar(50) not null,
loaiDoAn nvarchar(50) not null,
giaThanh nvarchar(50) not null,
primary key (maDoAn)
)
go
create table taiKhoan
(
taiKhoan nvarchar(100) not null,
matKhau nvarchar(20) not null,
hoTen nvarchar(20) not null,
sdt nvarchar(11) not null,
chucVu nvarchar(50) not null,
diaChi nvarchar(30) not null,
primary key(taiKhoan)
)
go
create table thongKe
( maHoaDon nvarchar(20) not null,
 ngayNhapHoaDon datetime,
 soTienHoaDon int,
 primary key(maHoaDon)
 )
 
INSERT INTO taiKhoan(taiKhoan,matKhau,hoTen,sdt,chucVu,diaChi)
	VALUES('admin','admin','admin','admin','Admin','');
	
