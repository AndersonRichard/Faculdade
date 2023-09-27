-- Criar schema
create schema atividade01;

-- Verificar schema criado;
show schemas;

-- Criar tabela 
create table if not exists atividade(
id int auto_increment primary key,
dt_atendimento date,
atendido char(1),
resolvido char(1),
tempo_atendimento int,
indice_satisfacao int
)

-- Inserir valores na tabela
insert into atividade (dt_atendimento, atendido, resolvido,
                       tempo_atendimento, indice_satisfacao)
  values ('2022-12-03','T','T',221,9),  
         ('2022-12-05','F','F',443,8), 
         ('2022-12-06','T','T',213,9),
         ('2022-01-13','T','T',456,7),
         ('2022-01-15','T','T',4564,6),
         ('2022-01-03','F','F',3456,5),
         ('2023-02-12','T','F',356,3),
         ('2023-02-22','T','T',456,5),
         ('2023-02-28','T','T',567,6),
         ('2023-03-01','T','T',8987,7),
         ('2023-03-02','F','F',567,8),
         ('2023-03-02','T','T',345,9),
         ('2023-02-02','T','T',234,10),
         ('2023-02-03','T','T',2234,1),
         ('2023-02-13','F','F',345,3),
         ('2023-02-09','T','F',456,2),
         ('2022-11-03','T','F',7568,5),
         ('2022-11-19','T','T',5675,7),
         ('2022-11-17','T','T',4564,8),
         ('2022-11-30','T','T',3455,9)
         
-- Verificar valores inseridos na tabela
select * from atividade

-- 1. Qual o índice médio de satisfação alcançado pela instituição?
select 
avg(indice_satisfacao) as 'Indice Médio de Satisfação'
from atividade

-- 2. Qual o tempo total de atendimentos realizados?
select 
sum(tempo_atendimento) as 'Tempo Total de Atendimento'
from atividade

-- 3. Considerando que cada tupla representa um atendimento, qual o total de 
-- atendimentos realizados?
select 
count(*	)
from atividade

-- 4. Qual o total de atendimentos realizados por ano? Para resolver essa questão, 
-- pesquise sobre a função extract
select extract(year from dt_atendimento) as 'Ano',
	count(*) as 'Quantidade por ano'
from atividade 
group by 1

-- 5. Qual o índice médio de satisfação por ano?
select extract(year from dt_atendimento) as 'Ano',
	avg(indice_satisfacao) as 'Indice Medio por Ano'
from atividade 
group by 1

-- 6. Qual o tempo médio de atendimento por ano?
select extract(year from dt_atendimento) as 'Ano',
	avg(tempo_atendimento) as 'Tempo médio de atendimento'
from atividade 
group by 1

-- 7. A coluna atendido indica se o cliente foi atendido (T) ou não (F). Crie uma 
-- consulta que indique o total de atendimentos, o tempo médio de atendimento e 
-- o índice médio de satisfação por status de atendimento.
select 
atendido as 'Status',
count(*) as 'Tempo de atendimento',
avg(tempo_atendimento) as 'Tempo Médio de atendimento',
avg(indice_satisfacao) as 'Indice Médio de Satisfacao'
from atividade
group by 1

-- 8. Repita a consulta anterior separando os dados também por ano.
select extract(year from dt_atendimento),
atendido as 'Status',
count(*) as 'Tempo de atendimento',
avg(tempo_atendimento) as 'Tempo Médio de atendimento',
avg(indice_satisfacao) as 'Indice Médio de Satisfacao'
from atividade
group by 1,2

-- 9. Qual o maior e o menor índice de satisfação alcançados para os atendimentos 
-- em 2023?
select 
max(indice_satisfacao) as 'Maior Indice de Satisfação',
min(indice_satisfacao) as 'Menor Indice de Satisfação'
from atividade
where extract(year from dt_atendimento) = 2023

-- 10.Qual a média de índice de satisfação para atendimentos em que os casos foram 
-- resolvidos (T) ou não (F)?
select atendido,
  avg(indice_satisfacao)
from atividade 
group by 1