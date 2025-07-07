CREATE TABLE cafeterias (
    id_cafeteria INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL CHECK (TRIM(nombre) <> ''),
    direccion VARCHAR(255) UNIQUE NOT NULL CHECK (TRIM(direccion) <> ''),
    calificacion INT CHECK (calificacion >= 1 AND calificacion <= 5)
);

CREATE TABLE cafes (
    id_cafe INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL CHECK (TRIM(nombre) <> ''),
    precio NUMERIC(8, 2) NOT NULL CHECK (precio >= 0),
    cafeteria_id INT,

    -- Esta es la línea clave con la coma y la referencia correcta
    FOREIGN KEY (cafeteria_id) REFERENCES cafeterias(id_cafeteria)
);