CREATE SCHEMA `student_management` ;
CREATE TABLE `student_management`.`student` (
  `id` INT primary key,
  `name` VARCHAR(45) ,
  `age` INT,
  `country` VARCHAR(45)  
  );

CREATE TABLE `student_management`.`class` (
   id INT primary key,
  `name` VARCHAR(45) 
  );
  CREATE TABLE `student_management`.`teacher` (
   `id` INT primary key,
  `name` VARCHAR(45) ,
  age INT ,
  country varchar(50) 
  );

SELECT * FROM student_management.class;
INSERT INTO `student_management`.`class` (
`id`, `name`) 

VALUES (
'1', 'test'
);
INSERT INTO `student` (id,`name`,age,country)
VALUES 
		(1, 'test 1' , 10, 'test'),
		(2, 'test 2' , 20, 'test2'),
		(3, 'test 3' , 30, 'test3');
	SELECT  *  FROM `student`;
insert into teacher (id,`name`,age,country)
values
			(1,'test 1' , 10, 'test'),
			(2, 'test 2', 20, 'test 2');
		select * from teacher;
	set SQL_SAFE_UPDATES = 0;
    update student
    set `name` = 'Nguyen Van A' , age = 13
    where id = 1;
    delete from student 
    where id = 2;
    set SQL_SAFE_UPDATES = 1;
    select * from student;

    update teacher
    set `name` = 'Nguyen Thi B' , age = 30, country = 'Viet Nam'
    where id = 1;
select * from teacher;

