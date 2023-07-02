CREATE DATABASE LABORATORIOS_DE_COMPUTO;

USE LABORATORIOS_DE_COMPUTO;

CREATE TABLE Salones(
Id varchar(10) PRIMARY KEY,
Estado varchar(15)
);

CREATE TABLE Materias(
Nombre varchar(80) PRIMARY KEY,
Color varchar(10)
);

CREATE TABLE Usuarios(
Id int(10) PRIMARY KEY,
TipoUsuario varchar(15),
Nombre varchar(50),
Contraseña varchar(20),
Estado varchar(15)
);

CREATE TABLE Software(
Id int PRIMARY KEY,
Nombre varchar(50),
VersionX varchar(10)
);

CREATE TABLE Horarios(
Id varchar(20) PRIMARY KEY,
Salon varchar(10),
Profesor int(11),
Materia varchar(80),
HoraInicio varchar(10),
HoraFin varchar(10),
Periodo varchar(30),
Año int,
Estado varchar(15),
FOREIGN KEY  (Salon) REFERENCES Salones(Id),
FOREIGN KEY  (Profesor) REFERENCES Usuarios(Id),
FOREIGN KEY  (Materia) REFERENCES Materias(Nombre)
);

CREATE TABLE Rondines(
Id int  PRIMARY KEY AUTO_INCREMENT,
Fecha datetime default CURRENT_TIMESTAMP(),
Administrador varchar(50),
Salon varchar(10),
Comentario varchar(350),
FOREIGN KEY  (Salon) REFERENCES Salones(Id)
);

CREATE TABLE Mensajes(
Administrador varchar(50),
Asunto varchar(50),
Cuerpo varchar(200),
TipoDeUsuarioAlQueSeDirige varchar(15),
Estado varchar(15)
);

CREATE TABLE Equipos(
Id varchar(8) PRIMARY KEY,
Salon varchar(10),
Estado varchar(15),
Teclado varchar(40),
Mouse varchar(40),
Monitor varchar(40),
Procesador varchar(40),
Almacenamiento varchar(40),
FOREIGN KEY  (Salon) REFERENCES Salones(Id)
);

CREATE TABLE Observaciones(
Id int PRIMARY KEY AUTO_INCREMENT,
Fecha varchar(15),
Usuario int(11),
Equipo varchar(8),
Comentario varchar(200),
inicio varchar(12),
fin varchar(12),
FOREIGN KEY  (Usuario) REFERENCES Usuarios(Id),
FOREIGN KEY  (Equipo) REFERENCES Equipos(Id)
);


/*De aqui en adelante insertamos los datos*/

INSERT INTO Salones (Id,Estado) 
values 
('LAS','Activo'),
('LDM','Activo'),
('LDS','Activo'),
('LPG','Activo'),
('LSO','Activo')
;

INSERT INTO Materias (Nombre, Color) values ('Progamacion', 'Negro');

INSERT INTO Usuarios (Id, TipoUsuario, Nombre, Contraseña, Estado) 
values
 ('2030178', 'Administrador', 'MICHEL', '12345', 'Activo'),
 ('2034230', 'Docente', 'adrian', '12345', 'Activo'),
 ('2034107', 'Estudiante', 'adrian', '12345', 'Activo')
 ;

INSERT INTO Software (Id, Nombre, VersionX) values ('374743', 'Mr Robot', 'Windows 10');

INSERT INTO Rondines (Id, Administrador, Salon, Comentario) values ('3747448', '2030178', 'LAS', 'Los dispositivos se encuentran funcionando');


INSERT INTO Equipos (Id, Salon, Estado, Teclado, Mouse, Monitor, Procesador, Almacenamiento) 
values 
('LAS-PC1', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC2', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC3', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC4', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC5', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC6', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC7', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC8', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC9', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC10', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC11', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC12', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC13', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC14', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC15', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC16', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC17', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC18', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC19', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC20', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC21', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC22', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC23', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC24', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC25', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC26', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC27', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC28', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC29', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC30', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC31', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LAS-PC32', 'LAS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro')
;
INSERT INTO Equipos (Id, Salon, Estado, Teclado, Mouse, Monitor, Procesador, Almacenamiento) 
values 
('LDM-PC1', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC2', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC3', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC4', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC5', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC6', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC7', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC8', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC9', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC10', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC11', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC12', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC13', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC14', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC15', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC16', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC17', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC18', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC19', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC20', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC21', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC22', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC23', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC24', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC25', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC26', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC27', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC28', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC29', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC30', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC31', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDM-PC32', 'LDM', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro')
;
INSERT INTO Equipos (Id, Salon, Estado, Teclado, Mouse, Monitor, Procesador, Almacenamiento) 
values 
('LDS-PC1', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC2', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC3', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC4', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC5', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC6', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC7', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC8', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC9', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC10', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC11', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC12', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC13', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC14', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC15', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC16', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC17', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC18', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC19', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC20', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC21', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC22', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC23', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC24', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC25', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC26', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC27', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC28', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC29', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC30', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC31', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LDS-PC32', 'LDS', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro')
;
INSERT INTO Equipos (Id, Salon, Estado, Teclado, Mouse, Monitor, Procesador, Almacenamiento) 
values 
('LPG-PC1', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC2', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC3', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC4', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC5', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC6', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC7', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC8', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC9', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC10', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC11', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC12', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC13', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC14', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC15', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC16', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC17', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC18', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC19', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC20', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC21', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC22', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC23', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC24', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC25', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC26', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC27', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC28', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC29', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC30', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC31', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LPG-PC32', 'LPG', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro')
;
INSERT INTO Equipos (Id, Salon, Estado, Teclado, Mouse, Monitor, Procesador, Almacenamiento) 
values 
('LSO-PC1', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC2', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC3', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC4', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC5', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC6', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC7', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC8', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC9', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC10', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC11', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC12', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC13', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC14', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC15', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC16', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC17', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC18', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC19', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC20', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC21', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC22', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC23', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC24', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC25', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC26', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC27', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC28', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC29', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC30', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC31', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro'),
('LSO-PC32', 'LSO', 'Activo', 'Razer BlackWidow V3', 'Razer', 'Alienware 17', 'i5 9300h', 'Samsung 980 Pro')
;
