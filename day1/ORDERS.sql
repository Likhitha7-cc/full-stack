create database order_mangement;
use order_mangement;
create table orders (
order_id int auto_increment primary key,
customer_name varchar(100) NOT NULL,
product_name varchar(100) NOT NULL,
quantity int not null,
price decimal(10,2) not null,
order_date date not null,
status varchar(20) default 'pending'
);
desc orders;

insert into orders (order_id,customer_name,product_name,quantity,price,order_date,status)
values(1,'likhi','webcom',6,15000.00,'2025-08-09','shipping'),
(2,'liki','webcom',5,35000.00,'2025-07-09','shipping'),
(3,'indu','webcom',3,25000.00,'2025-09-09','pending'),
(4,'ram','webcom',7,75000.00,'2025-05-09','shipped'),
(5,'deepi','webcom',8,45000.00,'2025-03-09','shipping');
desc orders;
select * from orders;

select * from orders order by price desc;

select * from orders order by price desc limit 1 offset 1;
-- agreggate functions
select count(*) as "total_orders" from orders;
select max(price) from orders;
select min(price) from orders;
select avg(price) from orders;
 

