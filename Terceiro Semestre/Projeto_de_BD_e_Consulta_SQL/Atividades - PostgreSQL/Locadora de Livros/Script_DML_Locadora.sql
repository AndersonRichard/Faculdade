INSERT INTO Cartao (numero, status, creditos) VALUES (1, 'A', 100);
INSERT INTO Cartao (numero, status, creditos) VALUES (2, 'B', 200);
INSERT INTO Cartao (numero, status, creditos) VALUES (3, 'A', 300);
INSERT INTO Cartao (numero, status, creditos) VALUES (4, 'A', 400);
INSERT INTO Cartao (numero, status, creditos) VALUES (5, 'B', 500);
INSERT INTO Cartao (numero, status, creditos) VALUES (6, 'A', 600);
INSERT INTO Cartao (numero, status, creditos) VALUES (7, 'A', 700);

INSERT INTO Cliente (email, nome, telefone, endereco, numero_cartao) VALUES ('c01@email.com', 'C01', '9999-1111', 'End01', 1);
INSERT INTO Cliente (email, nome, telefone, endereco, numero_cartao) VALUES ('c02@email.com', 'C02', '9999-2222', 'End02', 2);
INSERT INTO Cliente (email, nome, telefone, endereco, numero_cartao) VALUES ('c03@email.com', 'C03', '9999-3333', 'End03', 3);
INSERT INTO Cliente (email, nome, telefone, endereco, numero_cartao) VALUES ('c04@email.com', 'C04', '9999-4444', 'End04', 4);
INSERT INTO Cliente (email, nome, telefone, endereco, numero_cartao) VALUES ('c05@email.com', 'C05', '9999-5555', 'End05', 5);
INSERT INTO Cliente (email, nome, telefone, endereco, numero_cartao) VALUES ('c06@email.com', 'C06', '9999-6666', 'End06', 6);
INSERT INTO Cliente (email, nome, telefone, endereco, numero_cartao) VALUES ('c07@email.com', 'C07', '9999-7777', 'End07', 7);

INSERT INTO Livro (etiqueta, titulo, categoria, ano_lancamento, qtd_copias) VALUES (11, 'T1', 'Cat1', 2001, 1);
INSERT INTO Livro (etiqueta, titulo, categoria, ano_lancamento, qtd_copias) VALUES (22, 'T2', 'Cat2', 2002, 2);
INSERT INTO Livro (etiqueta, titulo, categoria, ano_lancamento, qtd_copias) VALUES (33, 'T3', 'Cat3', 2003, 3);
INSERT INTO Livro (etiqueta, titulo, categoria, ano_lancamento, qtd_copias) VALUES (44, 'T4', 'Cat4', 2004, 4);
INSERT INTO Livro (etiqueta, titulo, categoria, ano_lancamento, qtd_copias) VALUES (55, 'T5', 'Cat5', 2005, 5);

INSERT INTO Aluga (email_cliente, etiqueta_livro, data_saida, data_devolucao) VALUES ('c01@email.com', 11, '01-06-2023', NULL);
INSERT INTO Aluga (email_cliente, etiqueta_livro, data_saida, data_devolucao) VALUES ('c02@email.com', 22, '02-06-2023', '12-06-2023');
INSERT INTO Aluga (email_cliente, etiqueta_livro, data_saida, data_devolucao) VALUES ('c03@email.com', 22, '03-06-2023', NULL);
INSERT INTO Aluga (email_cliente, etiqueta_livro, data_saida, data_devolucao) VALUES ('c04@email.com', 33, '04-06-2023', NULL);
INSERT INTO Aluga (email_cliente, etiqueta_livro, data_saida, data_devolucao) VALUES ('c04@email.com', 44, '05-06-2023', '15-06-2023');

INSERT INTO Autor (cpf, nome, cidade, data_nascimento, qtd_livros) VALUES ('111', 'A1', 'Cid1', '01-01-1991', 1);
INSERT INTO Autor (cpf, nome, cidade, data_nascimento, qtd_livros) VALUES ('222', 'A2', 'Cid2', '01-01-1992', 2);
INSERT INTO Autor (cpf, nome, cidade, data_nascimento, qtd_livros) VALUES ('333', 'A3', 'Cid3', '01-01-1993', 3);

INSERT INTO Escreve (cpf_autor, etiqueta_livro) VALUES ('111', 11);
INSERT INTO Escreve (cpf_autor, etiqueta_livro) VALUES ('222', 22);
INSERT INTO Escreve (cpf_autor, etiqueta_livro) VALUES ('222', 33);
INSERT INTO Escreve (cpf_autor, etiqueta_livro) VALUES ('333', 44);
INSERT INTO Escreve (cpf_autor, etiqueta_livro) VALUES ('333', 55);
INSERT INTO Escreve (cpf_autor, etiqueta_livro) VALUES ('333', 11);
