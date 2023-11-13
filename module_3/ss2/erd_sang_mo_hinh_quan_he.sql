CREATE SCHEMA `erd_sang_mhqh` ;
create table phieu_xuat (
soPX int primary key,
ngayXuat dateTime
);
create table vat_tu (
maVT int primary key,
tenVT varchar(255)
);
create table chi_tiet_phieu_xuat (
soPX int ,
maVT int,
primary key (soPX,maVT),
foreign key (soPX) references phieu_xuat(soPX),
foreign key(maVT) references vat_tu(maVT)
);
alter table chi_tiet_phieu_xuat
add donGiaXuat double,
add soLuongXuat int;

create table phieu_nhap (
soPN int primary key,
ngayNhap datetime
);

create table chi_tiet_phieu_nhap (
	soPN int,
	maVT int,
	don_gia_nhap double,
	so_luong_nhap int,
	primary key(soPN,maVT),
	foreign key(soPN) references phieu_nhap(soPN),
	foreign key(maVT) references vat_tu(maVT)
);

create table don_dat_hang (
soDH int primary key,
ngayDH datetime
);

create table chi_tiet_don_dat_hang (
	soDH int,
	maVT int,
	primary key(soDH,maVT),
	foreign key(soDH) references vat_tu(maVT),
	foreign key(maVT) references don_dat_hang(soDH)
);

create table nha_cung_cap (
maNCC int primary key,
tenNCC varchar(255),
diaChi varchar(255),
sdt char(10)
);

alter table don_dat_hang add maNCC int;
alter table don_dat_hang add constraint FK_NCC foreign key (maNCC) references nha_cung_cap(maNCC);