--drop table Producers if exists;
--drop table Categories if exists;
--drop table Products if exists;

create table Producers (
  ID    int          not null primary key,
  Alias varchar(30)  not null unique,
  Name  varchar(30),
  Image varchar(150) not null
);

create table Categories (
  ID       int          not null primary key,
  ParentID int,
  Depth    int          not null,
  Alias    varchar(50)  not null unique,
  Name     varchar(50)  not null,
  Image    varchar(150) not null
);

create table Products (
  ID          int           not null primary key,
  ProducerID  int           not null,
  CategoryID  int           not null,
  Alias       varchar(70)   not null unique,
  Name        varchar(70)   not null,
  Image       varchar(150)  not null,
  Price       decimal(15,2) not null,
  Description varchar(255)  not null,
  Exist       boolean       not null default true
);
