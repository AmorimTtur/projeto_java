create database bancodedados;
use bancodedados;
create table usuarios(
login text not null, 
senha varchar (15)
);

ALTER TABLE usuarios
ADD COLUMN id int auto_increment primary key first;

SELECT*FROM usuarios;

drop database bancodedados;

