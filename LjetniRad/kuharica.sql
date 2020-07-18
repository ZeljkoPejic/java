drop database if exists kuharica;
create database kuharica CHARACTER SET utf8 COLLATE utf8_general_ci;
use kuharica;

create table osoba(
	sifra int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11) default null
);

create table alergen(
	sifra int not null primary key auto_increment,
	naziv varchar(50),
	opis text
);

create table alergican(
	osoba int not null,
	alergen int not null
);

create table sastojak(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null
);

create table sadrzi(
	sastojak int not null,
	alergen int not null
);

create table recept(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null,
	opis text
);

create table sastav(
	sastojak int not null,
	recept int not null
);



alter table alergican add foreign key (osoba) references osoba(sifra);
alter table alergican add foreign key (alergen) references alergen(sifra);

alter table sadrzi add foreign key (sastojak) references sastojak(sifra);
alter table sadrzi add foreign key (alergen) references alergen(sifra);

alter table sastav add foreign key (sastojak) references sastojak(sifra);
alter table sastav add foreign key (recept) references recept(sifra);











