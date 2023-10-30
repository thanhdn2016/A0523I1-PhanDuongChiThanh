CREATE SCHEMA `student_management` ;
CREATE TABLE `student_management`.`student` (
  `id` INT primary key,
  `name` VARCHAR(45) ,
  `age` INT,
  `country` VARCHAR(45)  );

CREATE TABLE `student_management`.`class` (
   id INT primary key,
  `name` VARCHAR(45) );
  CREATE TABLE `student_management`.`teacher` (
   id INT primary key,
  `name` VARCHAR(45) ,
  age INT ,
  country varchar(50) );
  