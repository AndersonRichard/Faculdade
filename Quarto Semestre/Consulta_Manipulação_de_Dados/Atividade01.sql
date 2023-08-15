-- Criar Database
create schema atividade01;

-- Verificar todos os schemas
show schemas;

-- Criar tabela
create table atendimento(
id int not null primary key,
data_atendimento date,
atendimento boolean,
resolvido boolean,
tempo_atendimento int,
indice_satisfacao int
)

-- Inserir os valores da tabela
insert into atendimento values
	(41, '2022-12-03', true, true, 221, 9),
	(42, '2022-12-05', false, false, 443, 8),
	(43, '2022-12-06', true, true, 213, 9),
	(44, '2022-01-13', true, true, 456, 7),
	(45, '2022-01-15', true, true, 4564, 6),
	(46, '2023-01-03', false, false, 3456, 5),
	(47, '2023-02-12', true, false, 356, 3),
	(48, '2023-02-22', true, true, 456, 5),
	(49, '2023-02-28', true, true, 567, 6),
	(50, '2023-03-01', true, true, 8987, 7),
	(51, '2023-03-02', false, false, 567, 8),
	(52, '2023-03-02', true, true, 345, 9),
	(53, '2023-02-02', true, true, 234, 10),
	(54, '2023-02-03', true, true, 2234, 1),
	(55, '2023-02-13', false, false, 345, 3),
	(56, '2023-02-09', true, false, 456, 2),
	(57, '2022-11-03', true, false, 7568, 5),
	(58, '2022-11-19', true, true, 5675, 7),
	(59, '2022-11-17', true, true, 4564, 8),
	(60, '2022-11-30', true, true, 3455, 9)
	
-- 1 Qual o índice médio de satisfação alcançado pela instituição?
	select avg(indice_satisfacao) as "Índice Médio de Satisfação"
	from atendimento
	
-- 2 Qual o tempo total de atendimentos realizados?
	select sum(tempo_atendimento) as "Tempo Total de Atendimento"
	from atendimento
	
-- 3 Considerando que cada tupla representa um atendimento, qual o total de atendimentos realizados?
	select count(*) as "Total de Atendimentos"
	from atendimento
	
	
-- 4 Qual o total de atendimentos realizados por ano? Para resolver essa questão, pesquise sobre a função extract.
	SELECT EXTRACT(YEAR FROM data_atendimento) as "Ano",
       COUNT(*) as "Total de Atendimentos"
	FROM atendimento
	GROUP BY Ano
	ORDER BY "Ano";

-- 5 Qual o índice médio de satisfação por ano?
	SELECT EXTRACT(YEAR FROM data_atendimento) as "Ano",
       AVG(indice_satisfacao) as "Índice Médio de Satisfação"
	FROM atendimento
	GROUP BY Ano
	ORDER BY "Ano";

-- 6 Qual o tempo médio de atendimento por ano?
	SELECT EXTRACT(YEAR FROM data_atendimento) as "Ano",
       AVG(tempo_atendimento) as "Tempo Médio de Atendimento"
	FROM atendimento
	GROUP BY Ano
	ORDER BY "Ano";

-- 7 A coluna atendido indica se o cliente foi atendido (T) ou não (F). Crie uma 
-- consulta que indique o total de atendimentos, o tempo médio de atendimento e 
-- o índice médio de satisfação por status de atendimento.
select atendimento,
    COUNT(*) as "Total de Atendimentos",
    AVG(tempo_atendimento) as "Tempo Médio de Atendimento",
    AVG(indice_satisfacao) as "Índice Médio de Satisfação"
FROM atendimento
GROUP BY atendimento;

-- 8  Repita a consulta anterior separando os dados também por ano.
SELECT
    EXTRACT(YEAR FROM data_atendimento) as "Ano",
    COUNT(*) as "Total de Atendimentos",
    AVG(tempo_atendimento) as "Tempo Médio de Atendimento",
    AVG(indice_satisfacao) as "Índice Médio de Satisfação"
FROM atendimento
GROUP BY EXTRACT(YEAR FROM data_atendimento), atendimento;

-- 9 Qual o maior e o menor índice de satisfação alcançados para os atendimentos em 2023?
	select MAX(indice_satisfacao) as "Maior Índice de Satisfação",
    	   MIN(indice_satisfacao) as "Menor Índice de Satisfação"
	FROM atendimento
	
-- 10 Qual a média de índice de satisfação para atendimentos em que os casos foram resolvidos (T) ou não (F)?
	