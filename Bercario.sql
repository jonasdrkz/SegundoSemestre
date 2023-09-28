create database bercario;

create table bebe (
    mae varchar(25),
    medico varchar(25),
    altura float(3,2),
    data_de_nascimento date,
    peso_de_nascimento float(5,3),
    nome varchar(25)
);

create table mae (
    data_de_nascimento date,
    endereco text,
    telefone varchar(20),
    nome varchar(25)
);

create table medico (
    nome varchar(25),
    CRM int,
    telefone varchar(20),
    especialidade varchar(20)
);

insert into bebe (mae, medico, altura, data_de_nascimento, peso_de_nascimento, nome) values ("Cleide Melo", "Ronaldo da Cunha", 0.54, 2023-04-04, 4.3,"Roberto Melo");

insert into mae (data_de_nascimento, endereco, telefone, nome) values (1999-12-5, "Rua São Paulo, Itoupava Central", "47 1234-5678", "Cleide Melo");

insert into medico (nome, CRM, telefone, especialidade) values ("Ronaldo da Cunha", 4321, "47 4321-8765", "Obstetra");