create database eims;

create table tbuser(
	ID int auto_increment primary key not null,
    Username varchar(30),
    Password varchar(30)
);

create table tbemployee(
	id int auto_increment primary key not null,
    name varchar(100),
    dob date,
    salary decimal(10,2),
    contact varchar(20),
    gender char(1),
    position varchar(100),
    department varchar(100),
    dayoff varchar(20),
    timework int,
    address varchar(255)
);
