create database employee;
use employee; 
create table employee (
emp_id int primary key,
emp_name varchar(50),
emp_age int,
emp_salary decimal(10,2)
);
desc employee;
select * from employee;

insert into employee(emp_id,emp_name,emp_age,emp_salary)
values (1,"A",26,10000.00);
select * from employee;

insert into employee(emp_id,emp_name,emp_age,emp_salary)
values (2,"B",32,15000);
select * from employee;

alter table employee
add column commission decimal(10,2);
desc employee;

alter table employee
drop column commission;
desc employee;

alter table employee
add column commission decimal(10,2) default '2000';
desc employee;

select * from employee;