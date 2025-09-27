create database employe_management;
use employe_management;
create table employe (
emp_id int primary key auto_increment,
emp_name varchar(40) not null,
job_title varchar(60)not null,
phone_no bigint,
salary decimal(10,2) not null,
dept_id bigint,
proj_id bigint,
foreign key(dept_id) references departent(dept_id),
foreign key(proj_id) references project(proj_id)
);

create table department(
dept_id bigint primary key auto_increment,
dept_name varchar(40) not null
);

create table project(
proj_id bigint primary key auto_increment,
proj_name varchar(40) not null
);

insert into department (dept_name) values('IT'),('non IT');
select * from department;


insert into project (proj_name) values('erp'),('crm');
select * from project;

