# Final

Proyecto final de la materia de Programacion 1 del Isntituto Tecnologico de Las Americas (ITLA)

## Integrantes

- Carlos Manuel

## Descripcion

El proyecto consiste en un sistema de gestion de una tienda, el cual permite realizar las siguientes acciones:

- Agregar productos
- Eliminar productos
- Modificar productos
- Buscar productos
- Listar productos
- Agregar Empleados
- Eliminar Empleados
- Modificar Empleados
- Buscar Empleados
- Listar Empleados

## Tecnologias

- Java
- MySQL
- Swing
- Git
- GitHub
- Maven

## Instalacion

Para poder ejecutar el proyecto se debe tener instalado:

    - Java 8
    - MySQL
    - Maven
    - Git

### Clonar el repositorio

Para clonar el repositorio se debe ejecutar el siguiente comando:

    git clone

### Crear la base de datos

Para crear la base de datos se debe ejecutar el siguiente comando:

```sql
CREATE
DATABASE `final`;
    
USE
`final`;

CREATE TABLE usuarios
(
    Id       INT AUTO_INCREMENT PRIMARY KEY,
    Nombre   varchar(50) NOT NULL,
    Apellido varchar(50) NOT NULL,
    Usuario  varchar(50) NOT NULL,
    Pass     varchar(20) NOT NULL,
    Telefono varchar(25) NOT NULL,
    Email    varchar(25) NOT NULL
);

CREATE TABLE productos
(
    Id        INT AUTO_INCREMENT PRIMARY KEY,
    Nombre    varchar(50) NOT NULL,
    Marca     varchar(50) NOT NULL,
    Categoria varchar(50) NOT NULL,
    Precio    INT         NOT NULL,
    Cantidad  INT         NOT NULL
);

```
