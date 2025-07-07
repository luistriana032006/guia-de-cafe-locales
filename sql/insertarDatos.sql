-- Tarea #2: Insertar datos de prueba

INSERT INTO cafeterias (id_cafeteria, nombre, direccion, calificacion) 
VALUES (1, 'El Gato Negro', 'Calle Falsa 123', 5);

INSERT INTO cafeterias (id_cafeteria, nombre, direccion, calificacion) 
VALUES (2, 'Café del Sol', 'Avenida Siempre Viva 742', 4);


-- Ahora insertamos los cafés, asegurándonos de que el 'cafeteria_id' coincida
INSERT INTO cafe (id_cafe, nombre, precio, cafeteria_id) 
VALUES (101, 'Latte Vainilla', 8500.00, 1); -- Café del Gato Negro

INSERT INTO cafe (id_cafe, nombre, precio, cafeteria_id) 
VALUES (102, 'Americano', 5000.00, 1);       -- Café del Gato Negro

INSERT INTO cafe (id_cafe, nombre, precio, cafeteria_id) 
VALUES (103, 'Capuccino', 7000.00, 2);       -- Café del Sol