 # Guía de Cafés Locales
Una aplicación para descubrir y gestionar una guía de cafeterías de especialidad. Este proyecto sirve como un caso de estudio práctico para aprender y aplicar conceptos de bases de datos con PostgreSQL y persistencia de datos en Java, desde JDBC hasta JPA/Hibernate.

## Tabla de Contenidos
Descripción del Proyecto

Tecnologías Utilizadas

Fases del Proyecto

Cómo Empezar

## Descripción del Proyecto
El objetivo de "Guía de Cafés Locales" es centralizar la información sobre cafeterías de especialidad en una ciudad, permitiendo a los usuarios descubrir nuevos lugares y registrar sus menús. El proyecto está diseñado para ser desarrollado en fases, cubriendo un ciclo de vida de desarrollo completo desde el diseño de la base de datos hasta la implementación de un ORM profesional.

## Tecnologías Utilizadas
Lenguaje: Java 21

Base de Datos: PostgreSQL

Herramienta de BD: DBeaver

Frameworks y APIs:

JDBC (Java Database Connectivity)

JPA (Java Persistence API)

Hibernate (Implementación de JPA)

Gestor de Dependencias: Maven

## Fases del Proyecto
Este repositorio está estructurado para seguir un plan de desarrollo progresivo en tres fases.

Fase 1: Diseño y Creación de la Base de Datos
Objetivo: Definir y construir la estructura de datos fundamental en PostgreSQL. Es el cimiento sobre el cual se construirá toda la aplicación.

## Tareas Clave:

[ ] Diseño del Modelo Entidad-Relación (E-R).

[ ] Creación de tablas (cafeterias, cafes_especiales) con sentencias DDL.

[ ] Establecimiento de relaciones y restricciones (claves primarias y foráneas).

[ ] Población de la base de datos con datos de prueba usando sentencias DML (INSERT).

[ ] Validación de la estructura con consultas de unión (JOIN).

Fase 2: Conexión Fundamental con JDBC
Objetivo: Crear una aplicación de consola para validar la conexión a bajo nivel y manipular los datos, entendiendo los fundamentos de la persistencia en Java.

Tareas Clave:

[ ] Configuración de un proyecto Maven con la dependencia del driver de PostgreSQL.

[ ] Implementación de una clase para gestionar la conexión a la base de datos.

[ ] Creación de un DAO (Data Access Object) para encapsular la lógica de acceso a datos.

[ ] Desarrollo de las funciones CRUD (Listar y Agregar) usando PreparedStatement y ResultSet.

[ ] Implementación de manejo de recursos con try-with-resources.

Fase 3: Modernización con JPA/Hibernate
Objetivo: Refactorizar la capa de acceso a datos para utilizar un ORM (Object-Relational Mapping) moderno, simplificando el código, reduciendo errores y aplicando las mejores prácticas de la industria.

Tareas Clave:

[ ] Agregar las dependencias de Hibernate al proyecto.

[ ] Crear y configurar el archivo META-INF/persistence.xml.

[ ] Mapear las clases de modelo (Cafeteria, CafeEspecial) a las tablas de la base de datos con anotaciones JPA (@Entity, @Id, @ManyToOne, etc.).

[ ] Reemplazar el código JDBC del DAO con el EntityManager de JPA.

[ ] Implementar consultas utilizando JPQL (Java Persistence Query Language).

Cómo Empezar
Para ejecutar este proyecto en tu entorno local, sigue estos pasos:

## Clona el repositorio:



git clone [URL-DE-TU-REPOSITORIO]
Configura la Base de Datos:

Asegúrate de tener una instancia de PostgreSQL en ejecución.

Crea una nueva base de datos (ej: guia_cafes_db).

Actualiza los detalles de la conexión (URL, usuario, contraseña) en el archivo src/main/resources/META-INF/persistence.xml.

Ejecuta los Scripts Iniciales:

Usa DBeaver para ejecutar el script de creación de tablas de la Fase 1 en tu nueva base de datos.

Construye el Proyecto:

Navega a la raíz del proyecto y ejecuta el siguiente comando de Maven:

Bash

mvn clean install
Ejecuta la Aplicación:

Ejecuta la clase principal que contiene el método main desde tu IDE o desde la línea de comandos.