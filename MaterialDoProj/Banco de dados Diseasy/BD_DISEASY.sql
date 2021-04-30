/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     30/04/2021 15:25:49                          */
/*==============================================================*/


/*==============================================================*/
/* Table: DETALHAMENTO_DOENCA                                   */
/*==============================================================*/
create table DETALHAMENTO_DOENCA
(
   COD_DESCRICAO_DOENCA int not null auto_increment,
   COD_DOENCA           int not null,
   DES_SINTOMAS         char(300),
   DES_PREVENCAO        char(300),
   DES_GRUPOS_DE_RISCO  char(300),
   DES_TRATAMENTOS      char(300)
);

alter table DETALHAMENTO_DOENCA
   add primary key (COD_DESCRICAO_DOENCA);

/*==============================================================*/
/* Table: DOENCA                                                */
/*==============================================================*/
create table DOENCA
(
   COD_DOENCA           int not null auto_increment,
   COD_TIPO_DOENCA      int not null,
   NOM_DOENCA           varchar(50) not null,
   DES_DOENCA           char(300)
);

alter table DOENCA
   add primary key (COD_DOENCA);

/*==============================================================*/
/* Table: DOENCA_INFORMACAO_HOSPITAL                            */
/*==============================================================*/
create table DOENCA_INFORMACAO_HOSPITAL
(
   COD_DOENCA_INFORMACAO_HOSPITAL int not null,
   COD_INFORMACAO_HOSPITAL int not null,
   COD_DOENCA           int not null
);

alter table DOENCA_INFORMACAO_HOSPITAL
   add primary key (COD_DOENCA_INFORMACAO_HOSPITAL);

/*==============================================================*/
/* Table: EMAIL_CONTATO                                         */
/*==============================================================*/
create table EMAIL_CONTATO
(
   COD_EMAIL_CONTATO    int not null auto_increment,
   COD_INFORMACAO_HOSPITAL int not null,
   TXT_EMAIL_CONTATO    varchar(200) not null
);

alter table EMAIL_CONTATO
   add primary key (COD_EMAIL_CONTATO);

/*==============================================================*/
/* Table: INFORMACAO_HOSPITAL                                   */
/*==============================================================*/
create table INFORMACAO_HOSPITAL
(
   COD_INFORMACAO_HOSPITAL int not null auto_increment,
   NOM_HOSPITAL         varchar(50) not null,
   ARQ_MAPA_HOSPITAL    blob not null
);

alter table INFORMACAO_HOSPITAL
   add primary key (COD_INFORMACAO_HOSPITAL);

/*==============================================================*/
/* Table: MENSAGENS_POR_USUARIO                                 */
/*==============================================================*/
create table MENSAGENS_POR_USUARIO
(
   COD_MENSAGENS_USUARIO int not null auto_increment,
   COD_USUARIO          int not null,
   TXT_MENSAGEM_USUARIO varchar(140)
);

alter table MENSAGENS_POR_USUARIO
   add primary key (COD_MENSAGENS_USUARIO);

/*==============================================================*/
/* Table: MENSAGENS_PREDEFINIDAS                                */
/*==============================================================*/
create table MENSAGENS_PREDEFINIDAS
(
   COD_MENSAGEM_PREDEFINIDA int not null,
   COD_USUARIO          int,
   TXT_MENSAGEM_PREDEFINIDA char(300) not null
);

alter table MENSAGENS_PREDEFINIDAS
   add primary key (COD_MENSAGEM_PREDEFINIDA);

/*==============================================================*/
/* Table: PROFESSOR                                             */
/*==============================================================*/
create table PROFESSOR
(
   COD_PROFESSOR        int not null auto_increment,
   COD_DOENCA           int not null,
   COD_USUARIO          int not null,
   NOM_PROFESSOR        varchar(50) not null
);

alter table PROFESSOR
   add primary key (COD_PROFESSOR);

/*==============================================================*/
/* Table: QUANTIDADE_DE_USO                                     */
/*==============================================================*/
create table QUANTIDADE_DE_USO
(
   COD_QUANTIDADE_VEZES int not null auto_increment,
   COD_USUARIO          int not null,
   NUM_QUANTIDADE_VEZES int,
   DTA_DIA_DE_USO       date
);

alter table QUANTIDADE_DE_USO
   add primary key (COD_QUANTIDADE_VEZES);

/*==============================================================*/
/* Table: REGISTRO_DE_ATIVIDADES                                */
/*==============================================================*/
create table REGISTRO_DE_ATIVIDADES
(
   COD_ATIVIDADES       int not null auto_increment,
   COD_USUARIO          int not null,
   DAT_ATIVIDADE        date not null
);

alter table REGISTRO_DE_ATIVIDADES
   add primary key (COD_ATIVIDADES);

/*==============================================================*/
/* Table: RELATAR_PROBLEMA                                      */
/*==============================================================*/
create table RELATAR_PROBLEMA
(
   COD_RELATAR_PROBLEMA int not null auto_increment,
   COD_USUARIO          int not null,
   ARQ_RELATAR_PROBLEMA blob not null
);

alter table RELATAR_PROBLEMA
   add primary key (COD_RELATAR_PROBLEMA);

/*==============================================================*/
/* Table: TELEFONE_CONTATO                                      */
/*==============================================================*/
create table TELEFONE_CONTATO
(
   COD_TELEFONE_CONTATO int not null auto_increment,
   COD_INFORMACAO_HOSPITAL int not null,
   NUM_TELEFONE_CONTATO varchar(50) not null
);

alter table TELEFONE_CONTATO
   add primary key (COD_TELEFONE_CONTATO);

/*==============================================================*/
/* Table: TIPO_DOENCA                                           */
/*==============================================================*/
create table TIPO_DOENCA
(
   COD_TIPO_DOENCA      int not null auto_increment,
   NOM_TIPO_DOENCA      varchar(50) not null,
   DES_TIPO_DOENCA      char(300)
);

alter table TIPO_DOENCA
   add primary key (COD_TIPO_DOENCA);

/*==============================================================*/
/* Table: TIPO_EMAIL_CONTATO                                    */
/*==============================================================*/
create table TIPO_EMAIL_CONTATO
(
   COD_TIPO_EMAIL_CONTATO int not null auto_increment,
   COD_EMAIL_CONTATO    int not null,
   DES_TIPO_EMAIL_CONTATO char(300) not null
);

alter table TIPO_EMAIL_CONTATO
   add primary key (COD_TIPO_EMAIL_CONTATO);

/*==============================================================*/
/* Table: TIPO_TELEFONE_CONTATO                                 */
/*==============================================================*/
create table TIPO_TELEFONE_CONTATO
(
   COD_TIPO_CONTATO     tinyint not null auto_increment,
   COD_TELEFONE_CONTATO int not null,
   DES_TIPO_CONTATO     char(300) not null
);

alter table TIPO_TELEFONE_CONTATO
   add primary key (COD_TIPO_CONTATO);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO
(
   COD_USUARIO          int not null auto_increment,
   NOM_USUARIO          varchar(50) not null,
   TXT_EMAIL_USUARIO    varchar(200) not null,
   DAT_USUARIO          date not null,
   SENHA_USUARIO        varchar(15) not null
);

alter table USUARIO
   add primary key (COD_USUARIO);

/*==============================================================*/
/* Table: USUARIO_INFORMACAO_HOSPITAL                           */
/*==============================================================*/
create table USUARIO_INFORMACAO_HOSPITAL
(
   COD_USUARIO_HOSPITAL int not null,
   COD_USUARIO          int not null,
   COD_HOSPITAL         int not null
);

alter table USUARIO_INFORMACAO_HOSPITAL
   add primary key (COD_USUARIO_HOSPITAL);

alter table DETALHAMENTO_DOENCA add constraint FK_DOENCA_DETALHAMENTO_DOENCA foreign key (COD_DOENCA)
      references DOENCA (COD_DOENCA);

alter table DOENCA add constraint FK_TIPO_DOENCA_DOENCA foreign key (COD_TIPO_DOENCA)
      references TIPO_DOENCA (COD_TIPO_DOENCA);

alter table DOENCA_INFORMACAO_HOSPITAL add constraint FK_DOENCA_DOENCA_INFORMACAO_HOSPITAL foreign key (COD_DOENCA)
      references DOENCA (COD_DOENCA);

alter table DOENCA_INFORMACAO_HOSPITAL add constraint FK_INFORMCAO_HOSPITAL_DOENCA_INFORMACAO_HOSPITAL foreign key (COD_INFORMACAO_HOSPITAL)
      references INFORMACAO_HOSPITAL (COD_INFORMACAO_HOSPITAL);

alter table EMAIL_CONTATO add constraint FK_HOSPITAL_EMAIL_CONTATO foreign key (COD_INFORMACAO_HOSPITAL)
      references INFORMACAO_HOSPITAL (COD_INFORMACAO_HOSPITAL);

alter table MENSAGENS_POR_USUARIO add constraint FK_MENSAGENS_DO_USUARIO foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO);

alter table MENSAGENS_PREDEFINIDAS add constraint FK_FK_USUARIO_MENSAGENS_PREDEFINIDAS foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO);

alter table PROFESSOR add constraint FK_DOENCA_PROFESSOR foreign key (COD_DOENCA)
      references DOENCA (COD_DOENCA);

alter table PROFESSOR add constraint FK_USUARIO_PROFESSOR foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO);

alter table QUANTIDADE_DE_USO add constraint FK_USUARIO_QUANTIDADE_DE_USO foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO);

alter table REGISTRO_DE_ATIVIDADES add constraint FK_USUARIO_REGISTRO_DE_ATIVIDADES foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO);

alter table RELATAR_PROBLEMA add constraint FK_USUARIO_RELATAR_PROBLEMA foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO);

alter table TELEFONE_CONTATO add constraint FK_HOSPITAL_TELEFONE_CONTATO foreign key (COD_INFORMACAO_HOSPITAL)
      references INFORMACAO_HOSPITAL (COD_INFORMACAO_HOSPITAL);

alter table TIPO_EMAIL_CONTATO add constraint FK_FK_EMAIL_CONTATO_TIPO_EMAIL_CONTATO foreign key (COD_EMAIL_CONTATO)
      references EMAIL_CONTATO (COD_EMAIL_CONTATO);

alter table TIPO_TELEFONE_CONTATO add constraint FK_TELEFONE_CONTATO_TIPO_TELEFONE_CONTATO foreign key (COD_TELEFONE_CONTATO)
      references TELEFONE_CONTATO (COD_TELEFONE_CONTATO);

alter table USUARIO_INFORMACAO_HOSPITAL add constraint FK_HOSPITAL_USUARIO_HOSPITAL foreign key (COD_HOSPITAL)
      references INFORMACAO_HOSPITAL (COD_INFORMACAO_HOSPITAL);

alter table USUARIO_INFORMACAO_HOSPITAL add constraint FK_USUARIO_USUARIO_HOSPITAL foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO);

