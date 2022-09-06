create database agencia;

create table if not exists cliente (
	id int auto_increment primary key,
    nome varchar(255),
    email varchar(255),
    CPF int,
    telefone int,
    dataNasc date,
    sexo varchar (255)
);

create table if not exists contato (
	id int auto_increment primary key,
    nome varchar(255),
    email varchar(255),
    telefone int
);

create table if not exists pacote (
	id int auto_increment primary key,
	duracao int,
	dataSaida date,
	hospedagem text,
	comodidade text,
	roteiro text,
	refeicoes text,
	valor double,
	documentacao text,
	guia text,
	programaDiario text
);

create table if not exists compra_pacote (
	id int auto_increment primary key,
    id_cliente int,
    id_pacote int,
    formaPagamento text,
    valorPago double,
    desconto double,
    dataCompra date,
    constraint fk_cliente foreign key (id_cliente) references cliente (id),
    constraint fk_pacote foreign key (id_pacote) references pacote (id)
);

create table if not exists rotas(
	id int auto_increment primary key,
    programa text,
    duracao int,
    hospedagem text,
    roteiro text,
    valor double,
    destaqueRotas text,
    rotasComGuia text,
    rotasSelfDrive text
);

create table if not exists compra_rotas (
	id int auto_increment primary key,
    id_cliente int,
    id_rotas int,
    formaPagamento text,
    valorPago double,
    desconto double,
    dataCompra date,
    constraint fk_cliente_compra_rotas foreign key (id_cliente) references cliente (id),
    constraint fk_rotas_compra_rotas foreign key (id_rotas) references rotas (id)
);

create table if not exists lugares_pacote (
	id int auto_increment primary key,
    id_pacote int,
    cidade varchar (255),
    continente varchar (255),
    pais varchar (255),
    constraint fk_pacote_lugares_pacote foreign key (id_pacote) references pacote (id)
);

create table if not exists lugares_rotas (
	id int auto_increment primary key,
    id_rotas int,
    cidade varchar (255),
    continente varchar (255),
    pais varchar (255),
    constraint fk_rotas_lugares_rotas foreign key (id_rotas) references rotas (id)
);