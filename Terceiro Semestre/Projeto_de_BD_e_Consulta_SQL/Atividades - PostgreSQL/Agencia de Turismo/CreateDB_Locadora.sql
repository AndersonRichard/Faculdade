#Cria banco de dados
CREATE DATABASE locadora_db;

#Cria um usuario
CREATE USER locadora WITH PASSWORD '123456';

#Atribui permissão para o usuario acessar o banco 
ALTER DATABASE locadora_db OWNER TO locadora;

#Conectando ao banco 
psql -U lcoadora -p 5432 -d locadora_db


