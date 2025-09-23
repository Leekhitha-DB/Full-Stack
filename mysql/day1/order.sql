create database order_management;
use order_management;
create table orders (
ord_id int auto_increment primary key,
cust_name varchar(100) not null,
prod_name varchar(100) not null,
quantity int not null,
price decimal(10,2) not null,
ord_date date not null,
status varchar(20) default 'Pending'
);

select * from orders;

insert into orders (ord_id,cust_name,prod_name,quantity,price,ord_date,status)
values (1,"A","Mobile",1,10000,'2026-09-22','Shipping'),
(2,"B","Computer",65,10000,'2026-09-22','Pending'),
(3,"C","Laptop",16,80000,'2026-09-22','Shipping'),
(4,"D","Fridge",75,40000,'2026-09-22','Pending'),
(5,"E","Mobile",10,31000,'2026-09-22','Shipping');
select * from orders;

update orders set status='Delivered' where ord_id = 5;
select * from orders;
update orders set price='80000' where ord_id = 2 ;
select * from orders;
select * from orders order by price ;
select * from orders order by price asc;
select * from orders order by price desc;

delete from orders where ord_id=1;
select * from orders;


select * from orders order by price desc limit 1 offset 1; 
select price,status from orders;
select ord_id,cust_name from orders order by price desc;

select * from orders where status in('Pending');
select * from orders where status in('Shipping');
select * from orders where status in('Pending','Shipping');

-- aggregate functions
select count(*) from orders;
select count(*) as "total orders" from orders;
select count(*) from orders group by price;
select count(*),status from orders group by status;
select max(price) from orders;
select avg(price) from orders;
