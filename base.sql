CREATE TABLE tareas(
   id_tarea int(10) unsigned not null auto_increment primary key,
   titulo varchar (50) not null,
   descripcion varchar(255) not null,
   nivel_de_prioridad tinyint(1) not null
);
