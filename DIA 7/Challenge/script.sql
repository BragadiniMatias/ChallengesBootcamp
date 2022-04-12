create table Student(
 id  int primary key auto_increment,
 course varchar(20) not null,
 infoId int not null,
 FOREIGN KEY (infoId) REFERENCES personInfo(id)
);

create table personInfo(
id int primary key auto_increment,
firstname varchar(20) not null,
lastname varchar(20) not null,
dni varchar(20) not null,
civilStatus varchar(20) not null
);

create table Teacher(
id int primary key auto_increment,
department varchar(20),
infoId int,
 FOREIGN KEY (infoId) REFERENCES personInfo(id)
);

create table ServiceStaff(
id int primary key auto_increment,
infoId int,
section varchar(20) not null,
 FOREIGN KEY (infoId) REFERENCES personInfo(id)
);