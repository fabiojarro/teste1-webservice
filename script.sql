create schema vectorx;
use vectorx;

create table tbano(
	id integer auto_increment,
    ano integer(4) not null unique,
    descricao varchar(255),
    primary key (id)    
);

create table tbtipo(
	id integer auto_increment,
	descricao varchar(50) not null unique,
	primary key(id)
);

create table tbdata(
	id integer auto_increment,
	fkano integer,
	fktipo integer,
	datainicio smalldatetime  not null,
	datafim smalldatetime not null,
	descricao varchar(50),
	primary key (id),
	foreign key (fkano) REFERENCES tbano(id),
	foreign key (fktipo) REFERENCES tbtipo(id)
	
);
insert into tbano (ano) values (2015);
insert into tbano (ano) values (2016);
insert into tbano (ano) values (2013);
insert into tbano (ano) values (2014);

insert into tbtipo (descricao) values ('Feriado Nacional');
insert into tbtipo (descricao) values ('Ponto Facultativo');

insert into tbdata (fkano,fktipo,datainicio,datafim,descricao) values (1,1,'2015-01-01 00:00:00','2015-01-01 23:59:59','Confraternização universal');
insert into tbdata (fkano,fktipo,datainicio,datafim,descricao) values (1,2,'2015-02-20 00:00:00','2015-02-20 23:59:59','Carnaval');
insert into tbdata (fkano,fktipo,datainicio,datafim,descricao) values (1,2,'2015-02-21 00:00:00','2015-02-21 23:59:59','Carnaval');
insert into tbdata (fkano,fktipo,datainicio,datafim,descricao) values (1,2,'2015-02-22 00:00:00','2015-02-22 14:00:00','Quarta-feira de Cinzas');
insert into tbdata (fkano,fktipo,datainicio,datafim,descricao) values (1,1,'2015-11-02 00:00:00','2015-11-02 23:59:59','Finados');

/**

1� de janeiro � feriado nacional � Confraterniza��o universal
20 de fevereiro � ponto facultativo � Carnaval
21 de fevereiro � ponto facultativo � Carnaval
22 de fevereiro � ponto facultativo at� as 14 horas � Quarta-feira de Cinzas
6 de abril � ponto facultativo � Paix�o de Cristo
21 de abril � feriado nacional � Tiradentes
1� de maio � feriado nacional � Dia Mundial do Trabalho
7 de junho � ponto facultativo � Corpus Christi
7 de setembro � feriado nacional � Independ�ncia do Brasil
12 de outubro � feriado nacional � Nossa Senhora Aparecida
28 de outubro � ponto facultativo � Dia do Servidor P�blico
2 de novembro � feriado nacional � Finados
15 de novembro � feriado nacional � Proclama��o da Rep�blica
24 de dezembro � ponto facultativo � V�spera do Natal
25 de dezembro � feriado nacional � Natal
31 de dezembro � ponto facultativo � V�spera de Ano-Novo**/
