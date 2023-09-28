CREATE TABLE cliente (
    endereco TEXT,
    nome VARCHAR(20),
    telefone VARCHAR(20),
    RG INT(9)
);

CREATE TABLE produto (
    quantidade_em_estoque INT,
    tipo VARCHAR(15),
    preco FLOAT(10, 2),
    nome VARCHAR(25)
);

CREATE TABLE compra (
    cliente_que_comprou VARCHAR(25),
    data_da_compra DATE,
    valor_total FLOAT(10,2),
    quantidade_comprada INT
);

insert into cliente (endereco, nome, telefone, RG) values ("Rua Pedro Zimmerman, Itoupava Central", "Matias Eduardo Silva", "47 9876-6789", 987651234);

insert into produto (quantidade_em_estoque, tipo, preco, nome) values (10, "Flor", 34.99, "Rosa");

insert into compra () values ();