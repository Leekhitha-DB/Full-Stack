show databases;
create database student_management;
use student_management;
create table student (
std_id int primary key,
std_name varchar(50),
std_roll int,
std_email varchar(40)
);
desc student;
Select * from student;
insert into student(std_id,std_name,std_roll,std_email) 
values (1,"Mohan",101,'mohan@gmail.com');
SELECT * FROM student;

SELECT std_name,std_email FROM student;

-- add col with null value
alter table student
add column std_class_room varchar(20);
desc student;

-- deleting the col
alter table student 
drop column std_class_room;

-- add col without null value using default value
alter table student
add column std_class_room varchar(20) default 'CS103';
desc student;

select * from student;

delete from student;

insert into student(std_id,std_name,std_roll,std_email) 
values (2,"Kush",102,'kush@gmail.com'),
(3,"James",103,'james@gmail.com'),
(4,"Jack",104,'jack@gmail.com'),
(5,"Bob",105,'bob@gmail.com'),
(6,"Alice",106,'alice@gmail.com');
-- we use offset and limit in pagination
SELECT * FROM student limit 2;
select * from student limit 2 offset 1;

update student set std_class_room = 'CS120' where std_id=1;
select * from student;

delete from student where std_id = 1;
select * from student;
delete from student;  -- not executed as it is in safe update mode so use where clause

truncate student;
select * from student;

drop table student;
select * from student;

drop database student_management;
use student_management;

select database();