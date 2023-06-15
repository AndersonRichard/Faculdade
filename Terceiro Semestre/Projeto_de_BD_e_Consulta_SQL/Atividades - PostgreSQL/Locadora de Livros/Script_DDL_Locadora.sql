CREATE TABLE Cartao (
  numero INTEGER NOT NULL,
  status VARCHAR(15) NOT NULL,
  creditos INTEGER NOT NULL,
  CONSTRAINT cartao_pk PRIMARY KEY (numero)
);

CREATE TABLE cliente(
    email VARCHAR(50) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    endereco VARCHAR(100) NOT NULL,
    numero_cartao INTEGER NULL,
    CONSTRAINT cliente_pk PRIMARY KEY (email)
);

CREATE TABLE autor(
    cpf NUMERIC NOT NULL,
    nome VARCHAR(50) NOT NULL,
    cidade VARCHAR(40) NOT NULL,
    data_nascimento DATE NOT NULL,
    qtd_livros INTEGER NOT NULL,
    CONSTRAINT autor_pk PRIMARY KEY (cpf)
);

CREATE TABLE livro(
    etiqueta INTEGER NOT NULL,
    titulo VARCHAR(50) NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    ano_lancamento INTEGER NOT NULL,
    qtd_copias INTEGER NOT NULL,
    CONSTRAINT livro_pk PRIMARY KEY (etiqueta)
);

CREATE TABLE aluga (
    email_cliente VARCHAR(50) NOT NULL,
    etiqueta_livro INTEGER NOT NULL,
    data_saida DATE NOT NULL,
    data_devolucao DATE NULL,
    CONSTRAINT aluga_pk PRIMARY KEY (email_cliente, etiqueta_livro, data_saida)
);

CREATE TABLE escreve(
    cpf_autor NUMERIC NOT NULL,
    etiqueta_livro INTEGER NOT NULL,
    CONSTRAINT escreve_pk PRIMARY KEY (cpf_autor, etiqueta_livro)
);

ALTER TABLE cliente ADD CONSTRAINT cartao_cliente_fk FOREIGN KEY (numero_cartao) REFERENCES cartao (numero);
ALTER TABLE aluga ADD CONSTRAINT cliente_aluga_fk FOREIGN KEY (email_cliente) REFERENCES cliente (email);
ALTER TABLE aluga ADD CONSTRAINT livro_aluga_fk FOREIGN KEY (etiqueta_livro) REFERENCES livro (etiqueta);
ALTER TABLE escreve ADD CONSTRAINT autor_escreve_fk FOREIGN KEY (cpf_autor) REFERENCES autor (cpf);
ALTER TABLE escreve ADD CONSTRAINT livro_escreve_fk FOREIGN KEY (etiqueta_livro) REFERENCES livro (etiqueta);