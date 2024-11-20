Proyecto realizado con Java 17 y Spring 3 en el backend, también se usó Postman para las pruebas y 
React 18 en el frontend para consumir la api.

Si la base de datos no existe, se crea automaticamente al igual que las tablas y columnas
(cambiar el usuario y contraseña de MySql en el archivo "ApplicationProperties" para poder acceder)

Script para insertar datos en las tablas

-- Inserción de datos en la tabla `marca_bus`

INSERT INTO marca (nombre) 
VALUES 
    ('Volvo'), 
    ('Scania'), 
    ('Fiat'), 
    ('Mercedes-Benz');

-- Inserción de datos en la tabla `bus`

INSERT INTO bus (numero_bus, placa, fecha_creacion, caracteristicas, marca_id, estado) 
VALUES
    ('B001', 'ABC-123', NOW(), 'Asientos reclinables, Wi-Fi, Aire acondicionado', 1, 'Activo'),
    ('B002', 'DEF-456', NOW(), 'Asientos estándar, Sin Wi-Fi', 2, 'Activo'),
    ('B003', 'GHI-789', NOW(), 'Doble piso, Pantallas individuales, Baño', 3, 'Activo'),
    ('B004', 'JKL-012', NOW(), 'Autobús económico, Sin aire acondicionado', 4, 'Inactivo'),
    ('B005', 'MNO-345', NOW(), 'Autobús premium, Cafetera incluida', 1, 'Activo');
