Si la base de datos no existe, se crea autmaticamente al igual que las tablas y columnas

Script para insertar datos en las tablas

-- Inserción de datos en la tabla `marca_bus`
INSERT INTO marca (nombre) 
VALUES 
    ('Volvo'), 
    ('Scania'), 
    ('Fiat'), 
    ('Mercedes-Benz');

SELECT * FROM marca_bus;

-- Inserción de datos en la tabla `bus`
INSERT INTO bus (numero_bus, placa, fecha_creacion, caracteristicas, marca_id, estado) 
VALUES
    ('B001', 'ABC-123', NOW(), 'Asientos reclinables, Wi-Fi, Aire acondicionado', 1, 'Activo'),
    ('B002', 'DEF-456', NOW(), 'Asientos estándar, Sin Wi-Fi', 2, 'Activo'),
    ('B003', 'GHI-789', NOW(), 'Doble piso, Pantallas individuales, Baño', 3, 'Activo'),
    ('B004', 'JKL-012', NOW(), 'Autobús económico, Sin aire acondicionado', 4, 'Inactivo'),
    ('B005', 'MNO-345', NOW(), 'Autobús premium, Cafetera incluida', 1, 'Activo');
