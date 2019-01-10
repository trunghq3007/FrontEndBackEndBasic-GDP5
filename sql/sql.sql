create database udemy;

use udemy;

create table employee(
	id integer auto_increment,
    first_name varchar(45),
    last_name varchar(45),
    email varchar(45),
    primary key(id)
);

insert into employee(first_name, last_name, email) values ('viet', 'duc', 'duc@gmail.com');

create table User(
	id integer auto_increment,
    user_name varchar(45),
    password varchar(45),
    primary key(id)
);

create table Contact(
	id integer auto_increment,
    name varchar(45),
    phone varchar(20),
    major varchar(45),
    address varchar(45),
    email varchar(45),
    graduate varchar(45),
    primary key(id)
    );
