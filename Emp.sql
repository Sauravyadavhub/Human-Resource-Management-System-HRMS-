create database Empl;
show databases;
use Empl;
create table login(username varchar(20),password varchar(20));
insert into login values('saurav','12345');
select * from login;
drop table login;


create table loginone(username varchar(20),password varchar(20));
insert into loginone values('saurav','12345');
select * from loginone;

create table employee(
name varchar(20),
fname varchar(30),
dob varchar(20),
salary varchar(30),
address varchar(100),
 phone varchar(20),
 email varchar(40),
 education varchar(20),
 designation varchar (20), 
 aadhar varchar(30), 
 empId varchar(15));
select * from employee;
