create table livros(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    autor varchar(100) not null unique,
    editora varchar(100) not null unique,
    categoria varchar(100) not null,
    paginas varchar(20),
    descricao varchar(300) not null,


    primary key(id)

);