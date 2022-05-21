create database quanlydoanvat
go
use quanlydoanvat
go
create table Menu
( maDoAn nvarchar(10) not null,
tenDoAn nvarchar(50) not null,
loạiDoAn nvarchar(50) not null,
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
create table baoCao
(id int not null IDENTITY(1,1),
baoCao nvarchar(50) not null,
phanhoi nvarchar(50) not null,
primary key(id)
)
go
create table thongKe
( maHoaDon nvarchar(20) not null,
 ngayNhapHoaDon nvarchar(20) not null,
 soTienHoaDon nvarchar(50) not null,
 primary key(maHoaDon)
 )
 

