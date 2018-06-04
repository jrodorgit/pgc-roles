-- componente Roles. Funcionalidades habilitadas para un usuario.

-- CATALOGO DE FUNCIONALIDADES
CREATE TABLE ZZFunctions(
id NUMBER(10) NOT NULL,
appcode VARCHAR2(20) NOT NULL ,
modcode VARCHAR2(20) NULL ,
sercode VARCHAR2(20) NULL ,
acccode VARCHAR2(20) NULL ,
funcname VARCHAR2(20) NOT NULL ,
funcdesc VARCHAR2(80) NULL 
) 
LOGGING;
COMMENT ON TABLE ZZFunctions IS 'Funcionalides asociadas a una aplicacion';
COMMENT ON COLUMN ZZFunctions.id IS 'idnetificador unico de la funcionalidad';
COMMENT ON COLUMN ZZFunctions.appcode IS 'Codigo que identifica la aplicación a la que está asociada la funcionalidad';
COMMENT ON COLUMN ZZFunctions.modcode IS 'Codigo del modulo al que esta asociada la funcionalidad';
COMMENT ON COLUMN ZZFunctions.sercode IS 'Codigo del servicio al que esta asociada la funcionalidad';
COMMENT ON COLUMN ZZFunctions.acccode IS 'Codigo de la accion al que esta asociada la funcionalidad';
COMMENT ON COLUMN ZZFunctions.funcname IS 'nombre de la funcionalidad';
COMMENT ON COLUMN ZZFunctions.funcdesc IS 'Descripcion de la funcionalidad';


--REM INSERTING into ZZFunctions
Insert into ZZFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (1,'APP_1',NULL,NULL,NULL,'ACCESO','ACCESO AL APLICATIVO APP1');
Insert into ZZFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (2,'APP_2','MOD_21',NULL,NULL,'ACCESO','ACCESO AL MODULO MOD21 DE APP_1');
Insert into ZZFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (3,'APP_3','MOD_31','SER_311',NULL,'ACCESO','ACCESO AL SERVICIO SER_311 DEL MODULO MOD21 DE APP_1');
Insert into ZZFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (4,'APP_4','MOD_41','SER_411',NULL,'ACCESO SERV 411','ACCESO SERV 411...');
Insert into ZZFunctions (id,appcode,modcode,sercode,acccode,funcname,funcdesc) values (5,'APP_4','MOD_41','SER_411','ACC_4111','ACT_OBJETO','ACTUALIZACION DE OBJETOS DEL ...');


COMMIT;

-- CATALOGO DE ROLES
CREATE TABLE ZZRoles(
id NUMBER(5) NOT NULL,
appcode VARCHAR2(20) NOT NULL ,
rolcode VARCHAR2(20) NOT NULL ,
rolname VARCHAR2(20) NOT NULL ,
roldesc VARCHAR2(80) NULL 
) 
LOGGING;
COMMENT ON TABLE ZZRoles IS 'Roles asociadas a una aplicacion';
COMMENT ON COLUMN ZZRoles.id IS 'idnetificador unico del rol';
COMMENT ON COLUMN ZZRoles.appcode IS 'Codigo que identifica la aplicación a la que está asociada el rol';
COMMENT ON COLUMN ZZRoles.rolcode IS 'Codigo del rol';
COMMENT ON COLUMN ZZRoles.rolname IS 'nombre del rol';
COMMENT ON COLUMN ZZRoles.roldesc IS 'Descripcion del rol';


--REM INSERTING into ZZRoles
Insert into ZZRoles (id,appcode,rolcode,rolname,roldesc) values (1,'APP_4','ROL_4','ROL ACCESO APP_4','ROL ACCESO APP_4...');
Insert into ZZRoles (id,appcode,rolcode,rolname,roldesc) values (2,'APP_4','ROL_41','ROL ACT OBJETOS','ROL ACT OBJETOS...');


COMMIT;

-- RELACION DE ROLES QUE TIENEN PERMISOS PARA EJECUTAR FUNCIONALIDADES 
CREATE TABLE ZZFunctions_Roles(
id NUMBER(10) NOT NULL,
idfunc NUMBER(5) NOT NULL,
idrol NUMBER(5) NOT NULL 
) 
LOGGING;
COMMENT ON TABLE ZZFunctions_Roles IS 'RELACION DE ROLES QUE TIENEN PERMISOS PARA EJECUTAR FUNCIONALIDADES';
COMMENT ON COLUMN ZZFunctions_Roles.id IS 'Identificador unico del permiso';
COMMENT ON COLUMN ZZFunctions_Roles.idfunc IS 'Identificador de la funcionalidad';
COMMENT ON COLUMN ZZFunctions_Roles.idrol IS 'Identificador del rol';

--REM INSERTING into ZZRoles
Insert into ZZFunctions_Roles (id, idfunc,idrol) values (1,4,1);
Insert into ZZFunctions_Roles (id, idfunc,idrol) values (2,5,2);


COMMIT;


-- CATALOGO DE GRUPOS
CREATE TABLE ZZGROUPS(
id NUMBER(5) NOT NULL,
appcode VARCHAR2(20) NOT NULL ,
groupcode VARCHAR2(20) NOT NULL ,
groupname VARCHAR2(20) NOT NULL ,
groupdesc VARCHAR2(80) NULL 
) 
LOGGING;
COMMENT ON TABLE ZZGROUPS IS 'Grupos definidos en una aplicacion';
COMMENT ON COLUMN ZZGROUPS.id IS 'idnetificador unico del grupo';
COMMENT ON COLUMN ZZGROUPS.appcode IS 'Codigo que identifica la aplicación a la que está asociada el grupo';
COMMENT ON COLUMN ZZGROUPS.groupcode IS 'Codigo del grupo';
COMMENT ON COLUMN ZZGROUPS.groupname IS 'nombre del grupo';
COMMENT ON COLUMN ZZGROUPS.groupdesc IS 'Descripcion del grupo';


--REM INSERTING into ZZGROUPS
Insert into ZZGROUPS (id,appcode,groupcode,groupname,groupdesc) values (1,'APP_4','GROUP_4','GRUPO APP_4','GRUPO ACCESO APP_4...');
Insert into ZZGROUPS (id,appcode,groupcode,groupname,groupdesc) values (2,'APP_4','GROUP_41','GRUPO ACT OBJETOS','GRUPO ACT OBJETOS...');


COMMIT;



-- GRUPOS DE ROLES
CREATE TABLE ZZRoles_Groups(
idgroup NUMBER(5) NOT NULL,
idrol NUMBER(5) NOT NULL,
startdate TIMESTAMP NOT NULL ,
enddate TIMESTAMP NOT NULL  
) 
LOGGING;
COMMENT ON TABLE ZZRoles_Groups IS 'RELACION DE ROLES QUE PERTENECEN A UN GRUPO EN UN PERIODO DE TIEMPO';
COMMENT ON COLUMN ZZRoles_Groups.idgroup IS 'Identificador deL GRUPO';
COMMENT ON COLUMN ZZRoles_Groups.idrol IS 'Identificador del rol';
COMMENT ON COLUMN ZZRoles_Groups.startdate IS 'fecha de inicio de validez del rol en el grupo';
COMMENT ON COLUMN ZZRoles_Groups.enddate IS 'fecha de fin de validez del rol en el grupo';

--REM INSERTING into ZZRoles_Groups
Insert into ZZRoles_Groups (idgroup,idrol,startdate,enddate) values (1,1,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('31/12/2020 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'));
Insert into ZZRoles_Groups (idgroup,idrol,startdate,enddate) values (2,2,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('31/12/2028 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'));


COMMIT;


-- CATALOGO DE USUARIOS
CREATE TABLE ZZUSERS(
id NUMBER(5) NOT NULL,
appcode VARCHAR2(20) NOT NULL ,
usercode VARCHAR2(20) NOT NULL ,
nombre VARCHAR2(80) NOT NULL ,
startdate TIMESTAMP NOT NULL ,
enddate TIMESTAMP NOT NULL 
) 
LOGGING;
COMMENT ON TABLE ZZUSERS IS 'Usuarios definidos en una aplicacion';
COMMENT ON COLUMN ZZUSERS.id IS 'Identificador unico del registro';
COMMENT ON COLUMN ZZUSERS.appcode IS 'Identificador del aplicacion';
COMMENT ON COLUMN ZZUSERS.usercode IS 'Codigo del usuario en la aplicacion';
COMMENT ON COLUMN ZZUSERS.nombre IS 'Nombre del usuario';
COMMENT ON COLUMN ZZUSERS.startdate IS 'fecha de inicio de validez del usuario en la aplicacion';
COMMENT ON COLUMN ZZUSERS.enddate IS 'fecha de fin de validez del usuario en la aplicacion';

--REM INSERTING into ZZUSERS
Insert into ZZUSERS (id,appcode,usercode,nombre,startdate,enddate) values (1,'APP_4','USER_41','Nombre usuario 41',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('31/12/2020 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'));
Insert into ZZUSERS (id,appcode,usercode,nombre,startdate,enddate) values (2,'APP_4','USER_42','Nombre usuario 42',to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('31/12/2020 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'));


COMMIT;


-- GRUPOS DE USUARIOS
CREATE TABLE ZZUsers_Groups(
idgroup NUMBER(5) NOT NULL,
idusr NUMBER(5) NOT NULL,
startdate TIMESTAMP NOT NULL ,
enddate TIMESTAMP NOT NULL  
) 
LOGGING;
COMMENT ON TABLE ZZUsers_Groups IS 'RELACION DE usuarios QUE PERTENECEN A UN GRUPO EN UN PERIODO DE TIEMPO';
COMMENT ON COLUMN ZZUsers_Groups.idgroup IS 'Identificador deL GRUPO';
COMMENT ON COLUMN ZZUsers_Groups.idusr IS 'Identificador del usuario';
COMMENT ON COLUMN ZZUsers_Groups.startdate IS 'fecha de inicio de validez del usuario en el grupo';
COMMENT ON COLUMN ZZUsers_Groups.enddate IS 'fecha de fin de validez del usuario en el grupo';

--REM INSERTING into ZZRoles_Groups
Insert into ZZUsers_Groups (idgroup,idusr,startdate,enddate) values (1,1,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('31/12/2020 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'));
Insert into ZZUsers_Groups (idgroup,idusr,startdate,enddate) values (2,2,to_timestamp('01/01/2017 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('31/12/2028 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'));


COMMIT;