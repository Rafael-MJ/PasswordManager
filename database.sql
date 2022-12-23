DROP DATABASE IF EXISTS securepass;
CREATE DATABASE securepass;
USE securepass;


CREATE TABLE acesso (
  id 		int 			NOT NULL 	AUTO_INCREMENT 	PRIMARY KEY,
  Data 		datetime 		DEFAULT now(),
  username 	varchar(15) 	REFERENCES login(Username)
);

CREATE TABLE cadastros_senhas (
  id 		int 			NOT NULL 	PRIMARY KEY		AUTO_INCREMENT,
  data 		datetime		DEFAULT now(),
  tipo 		varchar(15) 	NOT NULL,	
  titulo 	varchar(20) 	NOT NULL,
  password 	varchar(30) 	NOT NULL,
  mediaUser varchar(20),
  link 		varchar(60),
  user_id 	int 			NOT NULL 	REFERENCES USUARIOS(id)
);

CREATE TABLE login (
  username 	varchar(15) 	NOT NULL,
  Senha 	varchar(60) 	DEFAULT 	NULL
);

CREATE TABLE usuarios (
  id 		int 			NOT NULL 	AUTO_INCREMENT 	PRIMARY KEY,
  Nome_user varchar(45) 	NOT NULL,
  username 	varchar(15) 	REFERENCES login(username)
);

CREATE TABLE prestador_servico (
  id 		int		 		NOT NULL 	AUTO_INCREMENT	PRIMARY KEY,
  Nome 		varchar(45) 	NOT NULL,
  Telefone 	varchar(15) 	NOT NULL,
  Email 	varchar(30) 	NOT NULL,
  curriculo varchar(30) 	NOT NULL
);


delimiter $

create procedure Cadastro(nome varchar(45),  
username varchar(15), senha varchar(60))

begin

insert into usuarios (Nome_user, username) values(nome, username);
insert into login values(username, senha);

end$


create procedure CadastroPrestador(nome varchar(45),  
tel varchar(15), mail varchar(30), curric varchar(30))

begin

insert into prestador_servico (Nome, telefone, email, curriculo) values(nome, tel, mail, curric);

end$


create procedure Login(login varchar(15), senha varchar(60))

begin

set @getLogin = (SELECT login.username FROM login WHERE login.senha = senha and login.username = login);

SELECT usuarios.id,usuarios.username,usuarios.nome_user,login.senha FROM usuarios join login on usuarios.username = login.username WHERE login.username = login;

	if @getLogin is not null then
		insert into acesso (username) values(login);
	end if;
end$


create procedure CadastroSenha(type varchar(15), title varchar(20), pass varchar(30),
media varchar(20), link varchar(60), usr int)

begin

insert into cadastros_senhas (tipo,titulo,password,mediaUser,link,user_id) values(type,title,pass,media,link,usr);

end$

delimiter ;
