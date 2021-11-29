PLEASE FOLLOW THIS BEFORE RUNNING THE FILES


Install <a href="https://www.mysql.com/">MySQL</a>.

Install Netbeans <a href="https://www.netbeans.com/">Netbeans</a>.

Include the <a href="https://downloads.mysql.com/archives/c-j/">JDK</a> connector in the libraries folder.

Execute the following commands in the MySQL commandline:




CREATE DATABASE oop;

USE oop;

create table book(book_id varchar(10), name varchar(40), isbn varchar(20), publisher varchar(30), edition varchar(10), price varchar(10), pages varchar(10));

create table student(student_id varchar(10), name varchar(25), father varchar(25), course varchar(10), branch varchar(10), year varchar(10), semester varchar(10));

create table issueBook(book_id varchar(10), student_id varchar(10), bname varchar(40), sname varchar(40), course varchar(20), branch varchar(10), dateOfIssue DATE);

create table returnBook(book_id varchar(10), student_id varchar(10), bname varchar(40), sname varchar(40),course varchar(20), branch varchar(10), dateOfIssue varchar(30), dateOfReturn varchar(30));

create table account(username varchar(20), name varchar(25), password varchar(25), sec_q varchar(25), sec_ans varchar(25), admin varchar(20));

SHOW TABLES;




After executing the above commands,it will create the local database to work on.

Execute the following command to create admin credentials.



INSERT INTO account (username,name,password,sec_q,sec_ans,admin) VALUES (value1,value2,value3,value4,value5,value6);




For example:

INSERT INTO account (username,name,password,sec_q,sec_ans,admin) VALUES ('d','d','d','Your NickName?','a',1);

Now your username is d and password is d. 

Noe You can login as an admin and enjoy the experience :)
