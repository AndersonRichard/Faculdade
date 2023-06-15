#Este arquivo contém comandos para gerenciamento de bancos e usuários

#Cria um banco de dados
CREATE DATABASE aluno_db;

#Cria um usuário
CREATE USER aluno WITH PASSWORD 'aluno123';

#Atribui permissão para o usuário aluno acessar o banco aluno_db
GRANT ALL PRIVILEGES ON DATABASE aluno_db TO aluno;

#Altera a senha do usuário
ALTER USER aluno WITH PASSWORD '12345';

#Renomeia o banco
ALTER DATABASE aluno_db RENAME TO U_BANK;

#Caminho do pqsl no Lab6: C:\Program Files\PostgreSQL\14\bin

#Conectando usando o prompt de commando

#conectando no banco com o usuário postgres
psql -U postgres -p 5433

#conectando no banco aluno_db com o usuário aluno
psql -U aluno -p 5433 -d aluno_db
psql -U aluno -p 5433 -d u_bank

SELECT * FROM PG_DATABASE;

Exercício: 
1)Criar um banco  com seu nome
2)Criar um usuário com seu nome
3)Definir a senha
4)Conectar no seu banco
5)Verificar os bancos e usuários existentes.

#Criando um outro banco
CREATE DATABASE U_SCHOOL;
CREATE USER school WITH PASSWORD '1234';
GRANT ALL PRIVILEGES ON DATABASE U_SCHOOL TO school;

#Teste para remover a permissão do usuário de acessar um banco
REVOKE ALL PRIVILEGES ON DATABASE U_SCHOOL FROM school;

#conectando no banco u_school com o usuário school
psql -U school -p 5433 -d u_school

#DDL - Data Definition Language

#Cuidado! Pois apaga todos os dados da tabela
DROP TABLE CORRENTISTA;

CREATE TABLE CORRENTISTA (
    CPF VARCHAR(11) NOT NULL,
    NOME VARCHAR(60) NOT NULL,
    EMAIL VARCHAR(70) NULL
);

#  \d    lista as tabelas

# \d CORRENTISTA    mostra os detalhes da tabela

#Modificar a estrutura da tabela

ALTER TABLE CORRENTISTA RENAME TO ACCOUNT_HOLDER;
ALTER TABLE ACCOUNT_HOLDER ADD COLUMN ENDERECO VARCHAR(200) NOT NULL;
ALTER TABLE ACCOUNT_HOLDER DROP COLUMN ENDERECO;
ALTER TABLE ACCOUNT_HOLDER RENAME COLUMN ENDERECO TO ADDRESS;

ALTER TABLE ACCOUNT_HOLDER ALTER COLUMN ADDRESS TYPE VARCHAR(150);

ALTER TABLE ACCOUNT_HOLDER ADD CONSTRAINT ACCOUNT_HOLDER_PK PRIMARY KEY (CPF);

#Voltando o nome da tabela e da coluna originais
ALTER TABLE ACCOUNT_HOLDER RENAME TO CORRENTISTA;
ALTER TABLE CORRENTISTA RENAME COLUMN ADDRESS TO ENDERECO;


CREATE TABLE CONTA (
    NUMERO INTEGER NOT NULL,
    SALDO NUMERIC(15,2) NOT NULL,
    CPF VARCHAR(11) NOT NULL
);
ALTER TABLE CONTA ADD CONSTRAINT CONTA_PK PRIMARY KEY (NUMERO);

CREATE TABLE CARTAO (
    NUMERO INTEGER NOT NULL,
    SENHA VARCHAR(15) NOT NULL,
    EMISSAO DATE NOT NULL,
    LIMITE FLOAT NULL,
    DATA_VALIDADE DATE NOT NULL,
    NUMERO_CONTA INTEGER NOT NULL,
    CPF VARCHAR(11) NOT NULL
);
ALTER TABLE CARTAO ADD CONSTRAINT CARTAO_PK PRIMARY KEY (NUMERO);


#Criando a chave estrangeira entre CONTA e CORRENTISTA

ALTER TABLE CONTA  ADD CONSTRAINT CORRENTISTA_FK FOREIGN KEY (CPF) REFERENCES CORRENTISTA(CPF);
ALTER TABLE CARTAO ADD CONSTRAINT CORRENTISTA_CARTAO_FK FOREIGN KEY (CPF) REFERENCES CORRENTISTA(CPF);
ALTER TABLE CARTAO DROP CONSTRAINT CORRENTISTA_CARTAO_FK;
ALTER TABLE CARTAO ADD CONSTRAINT CONTA_CARTAO_FK FOREIGN KEY (NUMERO_CONTA) REFERENCES CONTA(NUMERO);

#Observação: o cpf do cartão está diferente do cpf da conta. É necessario rever o modelo.

#Insere dados na tabela
INSERT INTO CORRENTISTA (CPF, NOME, EMAIL, ENDERECO) 
VALUES ('11111', 'João', 'joao@email.com', 'Endereço do João');

#Consulta os dados da tabela
SELECT * FROM CORRENTISTA;

INSERT INTO CORRENTISTA (CPF, NOME, EMAIL, ENDERECO) 
VALUES ('22222', 'Jonas', 'jonas@email.com', 'Endereço do Jonas');


#Restrições
#Testes com null
INSERT INTO CORRENTISTA (CPF, NOME, EMAIL, ENDERECO) VALUES ('33333', 'Julio', 'julio@email.com', NULL);
INSERT INTO CORRENTISTA (CPF, NOME, EMAIL, ENDERECO) VALUES ('33333', 'Julio', null, 'Endereço do Julio');
INSERT INTO CORRENTISTA (CPF, NOME, EMAIL, ENDERECO) VALUES (null, null, null, 'Endereço do Julio');

#Testes com a chave primária
INSERT INTO CORRENTISTA (CPF, NOME, EMAIL, ENDERECO) 
VALUES ('22222', 'Jonas', 'jonas@email.com', 'Endereço do Jonas');

#Remove um registro da tabela
DELETE FROM CORRENTISTA WHERE CPF = '22222';


#insert na tabela CONTA
INSERT INTO CONTA (NUMERO, SALDO, CPF) VALUES (1, 5.72, '11111');

#Consulta a tabela CONTA
SELECT * FROM CONTA;

INSERT INTO CONTA (NUMERO, SALDO, CPF) VALUES (2, 3.45, '11111');

#Teste da restrição da FK

INSERT INTO CONTA (NUMERO, SALDO, CPF) VALUES (3, 1.23, '33333');

INSERT INTO CORRENTISTA (CPF, NOME, EMAIL, ENDERECO) VALUES ('33333', 'Julio', 'julio@email.com', 'endereço do Júlio');

INSERT INTO CARTAO (NUMERO, SENHA, EMISSAO, LIMITE, DATA_VALIDADE, CPF, NUMERO_CONTA) 
VALUES (1, '12345', now(), NULL, DATE '2025-05-25', '55555', 777);

INSERT INTO CORRENTISTA (CPF, NOME, EMAIL, ENDERECO) VALUES ('55555', 'Jane', 'jane@email.com', 'endereço da jane');

INSERT INTO CONTA (NUMERO, SALDO, CPF) VALUES (777, 7.89, '22222');