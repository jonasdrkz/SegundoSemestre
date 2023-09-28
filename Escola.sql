create table alunos(
	nome varchar(25),
    sexo char(1), 
	idade int(11), 
	data_inscricao_curso date, 
	telefone varchar(20), 
	valor_pago_curso float(10,2), 
	ativo_sn int(11),
	endereco text
);

insert into alunos (nome, sexo, idade, data_inscricao_curso, telefone, valor_pago_curso, ativo_sn, endereco) values ("Jonas Cardoso do Rosario",'m', 17, 03-02-2023, 99093328, 400.99, 0, "Itoupava Central");
