-- Tarea #3 de la Fase 1: Unir las tablas para el reporte final

CREATE VIEW reporte_cafes as -- crear la tabla para hacer la visualización (permanente )
select 
    ca.nombre AS nombre_cafeteria, -- a la columna nombre_cafeteria de la
    c.nombre AS nombre_cafe,
    c.precio
FROM
    cafeterias ca
JOIN
    cafe c ON ca.id_cafeteria = c.cafeteria_id;


/* SELECT -- creara una vista temporal de la tabla 

ca.nombre AS nombre_cafeteria,

c.nombre AS nombre_cafe,

c.precio

FROM -- es el punto de partida

cafeterias ca -- Le damos un alias 'ca' a la tabla cafeterias

JOIN -- pueden ser multiples cero o uno

cafes c ON ca.id_cafeteria = c.cafeteria_id; -- Unimos con la tabla cafes (alias 'c')*/


