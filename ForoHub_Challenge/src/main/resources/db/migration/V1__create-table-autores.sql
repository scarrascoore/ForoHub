create table autores(
    id bigint auto_increment not null,
    nombre varchar(100) not null,
    correoElectronico varchar(100) not null,
    clave varchar(300) not null,
    primary key(id)
);

insert into autores(id, nombre, correoElectronico, clave)
values(1, "Miguel", "prueba01@gmail.com", "123456789@");