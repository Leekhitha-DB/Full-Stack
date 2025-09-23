create database order_nf;
use order_unf;
create table orders_unf (
order_id int primary key,
cust_name varchar(50),
items varchar(30),
cust_city varchar(50)
);
desc orders_unf;
insert into orders_unf (order_id,cust_name,items,cust_city) values
(