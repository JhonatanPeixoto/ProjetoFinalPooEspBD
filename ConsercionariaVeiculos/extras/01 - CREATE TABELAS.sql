DROP TABLE funcionario cascade CONSTRAINTS;
DROP TABLE veiculo cascade CONSTRAINTS;
DROP TABLE compra cascade CONSTRAINTS;
DROP TABLE venda cascade CONSTRAINTS;
DROP TABLE fornecedor cascade CONSTRAINTS;
DROP TABLE cliente cascade CONSTRAINTS;
DROP TABLE p_fisica cascade CONSTRAINTS;
DROP TABLE p_juridica cascade CONSTRAINTS;
DROP TABLE departamento cascade CONSTRAINTS;
DROP TABLE dependente cascade CONSTRAINTS;
DROP TABLE manutencao cascade CONSTRAINTS;


/*CRIACAO DA TABELA FUNCIONARIO*/

CREATE TABLE funcionario(
    cpf_func char(11) not null primary key,
    nome varchar2(150),
    salario number(21,2),
    sexo char(1),
    datanasc date,
    num_depto int
);


/*CRIACAO DA TABELA DEPENDENTE*/


CREATE TABLE dependente(
    cpf_func char(11) not null,
    nome varchar2(150),
    datanasc date,
    sexo char(1),
    parentesco varchar2(30),
    primary key(cpf_func,nome)
);


/*CRIACAO DA TABELA VEICULO*/

CREATE TABLE veiculo( 
	id_veiculo int not null primary key,
    nome varchar2(150),
    marca varchar2(60),	
    modelo	varchar2(60)
);

/*CRIACAO DA TABELA VEICULO*/

CREATE TABLE veiculo_estoque(
    chassi char(17) not null primary key,
    cor	varchar2(30), 
    ano varchar2(9),	
    valor number(21,2),
	id_veiculo int not null
);



/*CRIACAO DA TABELA FORNECEDOR*/

CREATE TABLE fornecedor(
    cnpj char(14) not null primary key,	
    nome varchar2(150),	
    endereco varchar2(255),	
    telefone varchar2(20)
);


/*CRIACAO DA TABELA CLIENTE*/

CREATE TABLE cliente(
    id_cliente int not null primary key,	
    nome varchar2(150),
	cpf char(11),
	cnpj char(14), 	
    telefone varchar2(20),
    data_cadastro	date,
    bairro varchar2(60),	
    uf char(2),
    cidade	varchar2(80),	 
    cep char(8)    
);



/*CRIACAO DA TABELA DEPARTAMENTO*/

CREATE TABLE departamento(
    num_depto int not null primary key,	
    nome_depto varchar2(50),      	
    local_depto varchar2(80),
    cpf_gerente	char(11) not null    
);


/*CRIACAO DA TABELA P_FISICA

CREATE TABLE p_fisica(
     primary key,	
    id_cliente int 
);

CRIACAO DA TABELA P_JURIDICA

CREATE TABLE p_juridica(
    primary key,	
    id_cliente int 
);
*/

/*CRIACAO DA TABELA MANUTENCAO*/

CREATE TABLE manutencao(
    cpf_func char(11) not null,	
    chassi char(17) not null,
    cod_servico int not null,
    data_manutencao date not null,
    aberto char(1),
    em_andamento char(1),
    encerrado char(1),
    primary key (cpf_func, chassi, cod_servico,data_manutencao));   


/*CRIACAO DA TABELA VENDA - ANTIGA COMPRA*/

CREATE TABLE venda(
    id_cliente int not null,
    cpf_func char(11) not null,
    chassi char(17) not null,
    datacompra date,
    vlrunitario number(21,2),
    qtde int not null ,
    vlrprodutos number(21,2),
    desconto number(21,2),
    vlrtotal number(21,2),
    primary key (id_cliente, cpf_func, chassi));
    
    
    
    
/*CRIACAO DA TABELA COMPRA antiga venda*/

CREATE TABLE compra(
    cnpj_fornecedor char(14) not null,
    cpf_func char(11) not null,
    chassi char(17) not null,
    datavenda date,
    vlrunitario number(21,2),
    qtde int not null ,
    vlrprodutos number(21,2),
    desconto number(21,2),
    vlrtotal number(21,2),
    primary key (cnpj_fornecedor, cpf_func, chassi));

/*ADICACAO DE REFERENCIAS*/

alter table funcionario 
add (foreign key(num_depto) references departamento(num_depto));


alter table compra 
add (foreign key(id_cliente) references cliente(id_cliente),
     foreign key(cpf_func) references funcionario(cpf_p_fisica),
     foreign key(chassi) references veiculo_estoque(chassi));
     
alter table vende 
add (foreign key(cnpj_fornecedor) references fornecedor(cnpj),
     foreign key(cpf_func) references funcionario(cpf_p_fisica),
     foreign key(chassi) references veiculo_estoque(chassi));
     

alter table departamento 
add foreign key(cpf_gerente) references funcionario(cpf_p_fisica);


alter table dependente 
add foreign key(cpf_func) references funcionario(cpf_p_fisica);

alter table manutencao 
add (foreign key(cpf_func) references funcionario(cpf_p_fisica),
     foreign key(chassi) references veiculo_estoque(chassi));
	 
	 
alter table veiculo_estoque 
add (foreign key(id_veiculo) references veiculo(id_veiculo));
