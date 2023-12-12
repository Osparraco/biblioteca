# Prueba Biblioteca

## Ejecución de la aplicación

Para la ejecucion de la aplicación se requiere usar una version de Java 21 y ultima versiona de apache-maven
Utilizar MySQL 8 
Utiliza Docker hub y versionamiento en git
Dependencias ejecuar maven

Endpoints del CRUD utilizados,
GET
http://localhost:8080/api/V1/autor
DELETE
http://localhost:8080/api/V1/autor/2
POST
http://localhost:8080/api/V1/autor

Los Scripts ejecutados para la creación de la base de datos con sus diferentes tablas
CREATE TABLE autores (
  autor_id int NOT NULL AUTO_INCREMENT,
  nombre varchar(100) NOT NULL,
  fecha_nacimiento date DEFAULT NULL,
  nacionalidad varchar(50) DEFAULT NULL,
  PRIMARY KEY (autor_id)
);

CREATE TABLE libros (
  libro_id int NOT NULL AUTO_INCREMENT,
  titulo varchar(200) NOT NULL,
  publicacion_date date DEFAULT NULL,
  autor_id int DEFAULT NULL,
  PRIMARY KEY (libro_id),
  KEY autor_id (autor_id),
  CONSTRAINT libros_ibfk_1 FOREIGN KEY (autor_id) REFERENCES autores (autor_id)
);

Para creación y ejecucion del docker:
 docker-compose build / docker-compose up
Configuracion del archivo ducker compose.

services:
  # Servicio para la aplicación Java
  app:
    image: oeparraco/biblioteca-app:latest
    ports:
      - 8080:8080
    networks:
      - mi-red
    depends_on:
      - db

  # Servicio para la base de datos MySQL
  db:
    image: mysql:latest
    environment:
      MYSQL_ROOT_PASSWORD: Oscar1992#
      MYSQL_DATABASE: prueba
      ##MYSQL_USER: root
      ##MYSQL_PASSWORD: Oscar1992#
    ports:
      - 8002:3306
    networks:
      - mi-red




