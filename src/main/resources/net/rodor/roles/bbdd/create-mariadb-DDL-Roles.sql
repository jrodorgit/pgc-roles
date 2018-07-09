--Componente Roles. Funcionalidades habilitadas para un usuario.

-- CATALOGO DE FUNCIONALIDADES
CREATE TABLE RFunctions(
id int NOT NULL  COMMENT 'Identificador unico de la funcionalidad' ,
appcode char(20) NOT NULL COMMENT 'Codigo que identifica la aplicación a la que está asociada la funcionalidad' ,
modcode  char(20) NULL COMMENT 'Codigo del modulo al que esta asociada la funcionalidad' ,
sercode char(20) NULL COMMENT 'Codigo del servicio al que esta asociada la funcionalidad' ,
acccode char(20) NULL  COMMENT 'Codigo de la accion al que esta asociada la funcionalidad' ,
funcname char(20) NOT NULL  COMMENT 'nombre de la funcionalidad' ,
funcdesc char(80) NULL COMMENT 'Descripcion de la funcionalidad' 
);


--   RFunctions
Insert into RFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (1,'APP_1',NULL,NULL,NULL,'ACCESO','ACCESO AL APLICATIVO APP1');
Insert into RFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (2,'APP_2','MOD_21',NULL,NULL,'ACCESO','ACCESO AL MODULO MOD21 DE APP_1');
Insert into RFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (3,'APP_3','MOD_31','SER_311',NULL,'ACCESO','ACCESO AL SERVICIO SER_311 DEL MODULO MOD21 DE APP_1');
Insert into RFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (4,'APP_4','MOD_41','SER_411',NULL,'ACCESO SERV 411','ACCESO SERV 411...');
Insert into RFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (5,'APP_4','MOD_41','SER_411','ACC_4111','ACT_OBJETO','ACTUALIZACION DE OBJETOS DEL ...');


COMMIT;

-- CATALOGO DE ROLES
CREATE TABLE RRoles(
id int NOT NULL COMMENT 'ID unico del Rol' ,
appcode char(20)  NOT NULL COMMENT 'Codigo que identifica la aplicación a la que esta asociado el rol' ,
rolcode char(20)  NOT NULL COMMENT 'Codigo del rol' ,
rolname char(20)  NOT NULL COMMENT 'nombre del rol' ,
roldesc char(80) NULL  COMMENT 'Descripcion del rol'
);


--RRoles
Insert into ZZRoles (id,appcode,rolcode,rolname,roldesc) values (1,'APP_4','ROL_4','ROL ACCESO APP_4','ROL ACCESO APP_4...');
Insert into ZZRoles (id,appcode,rolcode,rolname,roldesc) values (2,'APP_4','ROL_41','ROL ACT OBJETOS','ROL ACT OBJETOS...');


COMMIT;

-- RELACION DE ROLES QUE TIENEN PERMISOS PARA EJECUTAR FUNCIONALIDADES 
CREATE TABLE RFunctions_Roles(
id int NOT NULL COMMENT 'Identificador unico del permiso',
idfunc int NOT NULL COMMENT 'Identificador de la funcionalidad',
idrol int NOT NULL COMMENT 'Identificador del rol'
);

-- INSERTING  ZZRoles
Insert into RFunctions_Roles (id, idfunc,idrol) values (1,4,1);
Insert into RFunctions_Roles (id, idfunc,idrol) values (2,5,2);


COMMIT;


-- CATALOGO DE GRUPOS
CREATE TABLE RGROUPS(
id int NOT NULL  COMMENT 'Identificador unico del grupo',
appcode char(20)  NOT NULL COMMENT 'Identificador unico del grupo',
groupcode char(20)  NOT NULL COMMENT 'Codigo del grupo',
groupname char(20)  NOT NULL COMMENT 'nombre del grupo',
groupdesc char(80)  NULL COMMENT 'Descripcion del grupo'
);


--   RGROUPS
Insert into RGROUPS (id,appcode,groupcode,groupname,groupdesc) values (1,'APP_4','GROUP_4','GRUPO APP_4','GRUPO ACCESO APP_4...');
Insert into RGROUPS (id,appcode,groupcode,groupname,groupdesc) values (2,'APP_4','GROUP_41','GRUPO ACT OBJETOS','GRUPO ACT OBJETOS...');


COMMIT;



-- GRUPOS DE ROLES
CREATE TABLE RRoles_Groups(
idgroup int NOT NULL COMMENT 'Identificador deL GRUPO',
idrol int NOT NULL COMMENT 'Identificador del rol',
startdate datetime NOT NULL COMMENT 'fecha de inicio de validez del rol en el grupo',
enddate datetime NOT NULL  COMMENT 'fecha de fin de validez del rol en el grupo'
);

-- RRoles_Groups
Insert into RRoles_Groups (idgroup,idrol,startdate,enddate) values (1,1,"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into RRoles_Groups (idgroup,idrol,startdate,enddate) values (2,2,"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");


COMMIT;


-- CATALOGO DE USUARIOS
CREATE TABLE RUSERS(
id int NOT NULL  COMMENT 'Identificador unico del usuario',
usercode char(20)  NOT NULL COMMENT 'codigo del usuario',
nombre char(80)  NOT NULL COMMENT 'nombre del usuario',
startdate datetime NOT NULL COMMENT 'fecha de inicio de validez del usuario',
enddate datetime NOT NULL  COMMENT 'fecha de fin de validez del usuario'
);

-- RUSERS
Insert into RUSERS (id,usercode,nombre,startdate,enddate) values (1,'USER_41','Nombre usuario 41',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into RUSERS (id,usercode,nombre,startdate,enddate) values (2,'USER_42','Nombre usuario 42',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");


COMMIT;


-- GRUPOS DE USUARIOS
CREATE TABLE RUsers_Groups(
idgroup int NOT NULL COMMENT 'Identificador deL GRUPO',
idusr int NOT NULL COMMENT 'Identificador del usuario',
startdate datetime NOT NULL COMMENT 'fecha de inicio de validez del usuario en el grupo',
enddate datetime NOT NULL  COMMENT 'fecha de fin de validez del usuario en el grupo'
);

--   RUsers_Groups
Insert into RUsers_Groups (idgroup,idusr,startdate,enddate) values (1,1,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into RUsers_Groups (idgroup,idusr,startdate,enddate) values (2,2,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");


COMMIT;
