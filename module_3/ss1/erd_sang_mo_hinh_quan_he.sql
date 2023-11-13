CREATE SCHEMA `erd_sang_mhqh` ;
CREATE TABLE phieu_xuat (
    soPX INT PRIMARY KEY,
    ngayXuat DATETIME
);
CREATE TABLE vat_tu (
    maVT INT PRIMARY KEY,
    tenVT VARCHAR(255)
);
CREATE TABLE chi_tiet_phieu_xuat (
    soPX INT,
    maVT INT,
    PRIMARY KEY (soPX , maVT),
    FOREIGN KEY (soPX)
        REFERENCES phieu_xuat (soPX),
    FOREIGN KEY (maVT)
        REFERENCES vat_tu (maVT)
);
alter table chi_tiet_phieu_xuat
add donGiaXuat double,
add soLuongXuat int;

CREATE TABLE phieu_nhap (
    soPN INT PRIMARY KEY,
    ngayNhap DATETIME
);

CREATE TABLE chi_tiet_phieu_nhap (
    soPN INT,
    maVT INT,
    don_gia_nhap DOUBLE,
    so_luong_nhap INT,
    PRIMARY KEY (soPN , maVT),
    FOREIGN KEY (soPN)
        REFERENCES phieu_nhap (soPN),
    FOREIGN KEY (maVT)
        REFERENCES vat_tu (maVT)
);

CREATE TABLE don_dat_hang (
    soDH INT PRIMARY KEY,
    ngayDH DATETIME
);

CREATE TABLE chi_tiet_don_dat_hang (
    soDH INT,
    maVT INT,
    PRIMARY KEY (soDH , maVT),
    FOREIGN KEY (soDH)
        REFERENCES vat_tu (maVT),
    FOREIGN KEY (maVT)
        REFERENCES don_dat_hang (soDH)
);

CREATE TABLE nha_cung_cap (
    maNCC INT PRIMARY KEY,
    tenNCC VARCHAR(255),
    diaChi VARCHAR(255),
    sdt CHAR(10)
);

alter table don_dat_hang add maNCC int;
alter table don_dat_hang add constraint FK_NCC foreign key (maNCC) references nha_cung_cap(maNCC);