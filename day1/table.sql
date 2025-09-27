show databases;
create database student_management;
use student_management;
create table students(
std_id int primary key,
std_roll int,
std_email varchar(40)
);
DESC students;
select * from students;
insert into students(std_id, std_roll, std_email)
values(1,101,'liki@gmail.com');
select * from students;

select std_name,std_email FROM student;

-- to add new column with default some value
alter table students
add column std_class_room varchar(20) default 'cs103';

desc students;
 select * from students;

insert into students(std_id,std_roll,std_email) 
values (2,"Kush",102,'kush@gmail.com'),
(3,"James",103,'james@gmail.com'),
(4,"Jack",104,'jack@gmail.com'),
(5,"Bob",105,'bob@gmail.com'),
(6,"Alice",106,'alice@gmail.com');
SELECT * FROM student limit 2;
select * from student limit 2 offset 1;

update students
set std_class_room=  'cs405'
where std_id = 1;

delete from students where std_id =1;
select * from students;

truncate students;
select * from students;

drop table students;


drop database student_managemnt;

select database();
