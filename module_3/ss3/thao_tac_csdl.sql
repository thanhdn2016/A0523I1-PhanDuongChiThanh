SELECT 
    *
FROM
    quan_ly_ban_hang.customer;
INSERT INTO customer (cID, cName, cAge) VALUES ('1', 'Minh Quan', '10');
INSERT INTO customer (`cID`, `cName`, `cAge`) VALUES ('2', 'Ngoc Oanh', '20');
INSERT INTO customer (`cID`, `cName`, `cAge`) VALUES ('3', 'Hong Ha', '50');
SELECT 
    *
FROM
    oder;
INSERT INTO oder (`oID`, `cID`, `oDate`) VALUES ('1', '1', '2006/3/21');
INSERT INTO oder (`oID`, `cID`, `oDate`) VALUES ('2', '2', '2006/3/23');
INSERT INTO oder (`oID`, `cID`, `oDate`) VALUES ('3', '1', '2006/3/16');

SELECT 
    *
FROM
    product;
INSERT INTO product (`pID`, `pName`, `pPrice`) VALUES ('1', 'May Giat', '3');
INSERT INTO product (`pID`, `pName`, `pPrice`) VALUES ('2', 'Tu Lanh', '5');
INSERT INTO product (`pID`, `pName`, `pPrice`) VALUES ('3', 'Dieu Hoa', '7');
INSERT INTO product (`pID`, `pName`, `pPrice`) VALUES ('4', 'Quat', '1');
INSERT INTO product (`pID`, `pName`, `pPrice`) VALUES ('5', 'Bep Dien', '2');

insert into oder_detail(oID,pID,odQTY) values ('1','1','3');
insert into oder_detail(oID,pID,odQTY) values ('1','3','7');
insert into oder_detail(oID,pID,odQTY) values ('1','4','2');
insert into oder_detail(oID,pID,odQTY) values ('2','1','1');
insert into oder_detail(oID,pID,odQTY) values ('3','1','8');
insert into oder_detail(oID,pID,odQTY) values ('2','5','4');
insert into oder_detail(oID,pID,odQTY) values ('2','3','3');

select * from oder;
select co.cID, co.customer_name, co.oID, po.pID, po.pName, po.pPrice, po.odQTY from (select cID, c.cName as customer_name, oID from oder join customer c using(cID)) as co join (select * from oder_detail join product p using (pid)) as po using(oID);
select cID , cName from customer where cID not in (select cID from oder);
select oID, oDate, sum(op.odQTY * op.pPrice) as total_price from oder  join (select oID, pID , odQTY, p.pName, p.pPrice from oder_detail join product p using (pID)) op using (oID) group by oID;	

