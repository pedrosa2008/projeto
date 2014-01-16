
# --- !Ups

CREATE TABLE status (
  id 			INT NOT NULL,
  descricao 	VARCHAR(255) NOT NULL,
  constraint pk_status primary key (id)
);

CREATE TABLE usuario (
  id 			INT NOT NULL,
  usuario 		VARCHAR(255) NOT NULL,
  senha 		VARCHAR(255) NOT NULL,
  pessoa_id		INT NOT NULL,
  status_id 	INT NOT NULL,
  constraint pk_usuario primary key (id)
);

CREATE TABLE pessoa (
  id 			INT NOT NULL,
  nome 			VARCHAR(255) NOT NULL,
  constraint pk_pessoa primary key (id)
);
