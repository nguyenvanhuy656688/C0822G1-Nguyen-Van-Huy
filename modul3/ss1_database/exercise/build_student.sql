create database build_database_student;
use biuld_database_student;
create table class(id int,`name` varchar(45));
create table teacher(id int,`name` varchar(45),age int,country varchar(45));
insert into class(id,`name`) value (1,'C07'),(2,'C08');
select*from class ;
set sql_safe_updates = 0;
update class set id = 5 where id = 1;
set sql_safe_updates = 1;
insert into teacher(id,`name`,age,country) value (1,'Huy',18,'VN');
select age from teacher;
select * from teacher;