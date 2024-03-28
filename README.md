# Comandos Básico SQL

## DDL - Criando Entidades com SQL

### Exemplo

Vamos criar uma tabela utilizando o comando **create table** que automaticamente gera um código sequencial (1, 2, 3, 4,...) de usuário para nós. 

Além disso, vamos garantir que não é possível repetir o código.

```
create table usuario (
codigo serial,
cpf varchar(13),
idade int,
PRIMARY KEY(codigo)
);
```

Abaixo segue um de-para com os tipos de dados em Java com os tipos de dados aceitos pelo Postgres.

| Java  | Postgres |
| ------------- | ------------- |
| int  | int  |
| String  | varchar(N)  |
| double  | float  |

## DML - Inserindo Dados com SQL

### Exemplo

Podemos inserir dados utilizando o comando **insert**. No exemplo abaixo estamos cadastrando um usuário.

```
insert into usuario (cpf, idade) values ('123', 10);
```

## DML - Consultando Dados com SQL

### Exemplo

Podemos utilizar o comando **select** para consultar os dados de uma tabela. Por exemplo:

* selecionar todos os usuários

```
select * from usuario u;
```

* selecionar usuários com idade específica

```
select * from usuario u where u.idade = 90;
```

