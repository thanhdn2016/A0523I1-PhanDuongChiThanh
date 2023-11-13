create database quan_ly_ban_hang;
use quan_ly_ban_hang;
CREATE TABLE customer (
    cID INT PRIMARY KEY,
    cName VARCHAR(255),
    cAge INT
);

CREATE TABLE oder (
    oID INT PRIMARY KEY,
    cID INT,
    oDate DATETIME,
    oTotalPrice DOUBLE,
    FOREIGN KEY (cID)
        REFERENCES customer (cID)
);

CREATE TABLE product (
    pID INT PRIMARY KEY,
    pName VARCHAR(255),
    pPrice DOUBLE
);

CREATE TABLE oder_detail (
    oID INT,
    pID INT,
    odQTY VARCHAR(255),
    PRIMARY KEY (oID , pID),
    FOREIGN KEY (oID)
        REFERENCES oder (oID),
    FOREIGN KEY (pID)
        REFERENCES product (pID)
);