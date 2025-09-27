show databases;
create database employee_management;
use employee;
create table employee(
std_id int primary key,
std_roll int,
std_email varchar(40)
);
desc employee;

alter table employee
add column salary decimal(10,2);
desc employee;
select * from employee;
alter table employee
add column salary decimal(10,2);

insert into employee(std_id,std_roll,std_email,std_salary
values (1,102,'liki@gmail.com',10000.00);
