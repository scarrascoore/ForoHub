create table topicos(
    ID bigint auto_increment not null,
    titulo varchar(100) not null unique,
    mensaje varchar(200) not null unique,
    fechaCreacion datetime not null,
    estado varchar(100) not null,
    nombreCurso varchar(100) not null,
    autorId bigint not null,
    constraint fk_topicos_autorId foreign key(autorId) references autores(ID),
    primary key(ID)
);