SELECT articulos.nombre,articulos.precio,fabricantes.nombre FROM articulos INNER JOIN fabricantes ON articulos.fabricante=fabricantes.codigofab;
INSERT INTO articulos VALUES (33,"Altavoces",70,2);
INSERT INTO articulos VALUES (54,"Play3",800,1);
INSERT INTO articulos VALUES (12,"Usb",45,5);
INSERT INTO articulos VALUES (13,"Pintura",180,9);