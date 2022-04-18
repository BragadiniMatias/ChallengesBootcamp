
-- -----------------------------------------------------
-- Schema empresaproductos
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `empresaproductos` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `empresaproductos` DEFAULT CHARACTER SET utf8 ;
USE `empresaproductos` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresaproductos`.`Cliente` ;

CREATE TABLE IF NOT EXISTS `empresaproductos`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NULL,
  `Apellido` VARCHAR(45) NULL,
  `DNI` VARCHAR(45) NULL,
  `Direccion` VARCHAR(45) NULL,
  `FechaNacimiento` DATETIME NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Vendedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresaproductos`.`Vendedor` ;

CREATE TABLE IF NOT EXISTS `empresaproductos`.`Vendedor` (
  `idVendedor` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NULL,
  `Apellido` VARCHAR(45) NULL,
  `DNI` VARCHAR(45) NULL,
  `Direccion` VARCHAR(45) NULL,
  `FechaNacimiento` DATE NULL,
  `Salario` DOUBLE NULL,
  PRIMARY KEY (`idVendedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Productos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresaproductos`.`Productos` ;

CREATE TABLE IF NOT EXISTS `empresaproductos`.`Productos` (
  `codigoProducto` INT NOT NULL AUTO_INCREMENT,
  `PrecioUnitario` DOUBLE NULL,
  `Stock` INT(10) NULL,
  `StockMin` INT(10) NULL,
  PRIMARY KEY (`codigoProducto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Facturacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresaproductos`.`Facturacion` ;

CREATE TABLE IF NOT EXISTS `empresaproductos`.`Facturacion` (
  `idFacturacion` INT NOT NULL AUTO_INCREMENT,
  `FechaCompra` DATETIME NULL,
  `idVendedor` INT NOT NULL,
  `idCliente` INT NOT NULL,
  PRIMARY KEY (`idFacturacion`, `idVendedor`, `idCliente`),
  INDEX `fk_Facturacion_Vendedor1_idx` (`idVendedor` ASC) VISIBLE,
  INDEX `fk_Facturacion_Cliente1_idx` (`idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_Facturacion_Vendedor1`
    FOREIGN KEY (`idVendedor`)
    REFERENCES `empresaproductos`.`Vendedor` (`idVendedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Facturacion_Cliente1`
    FOREIGN KEY (`idCliente`)
    REFERENCES `empresaproductos`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Facturacion_has_Productos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresaproductos`.`Facturacion_has_Productos` ;

CREATE TABLE IF NOT EXISTS `empresaproductos`.`Facturacion_has_Productos` (
  `idFacturacion` INT NOT NULL,
  `codigoProducto` INT NOT NULL,
  PRIMARY KEY (`idFacturacion`, `codigoProducto`),
  INDEX `fk_Facturacion_has_Productos_Productos1_idx` (`codigoProducto` ASC) VISIBLE,
  INDEX `fk_Facturacion_has_Productos_Facturacion_idx` (`idFacturacion` ASC) VISIBLE,
  CONSTRAINT `fk_Facturacion_has_Productos_Facturacion`
    FOREIGN KEY (`idFacturacion`)
    REFERENCES `empresaproductos`.`Facturacion` (`idFacturacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Facturacion_has_Productos_Productos1`
    FOREIGN KEY (`codigoProducto`)
    REFERENCES `empresaproductos`.`Productos` (`codigoProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

insert into productos (PrecioUnitario, Stock, StockMin) values (150, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (250, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (300, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (400, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (450, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (500, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (550, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (600, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (650, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (700, 100, 10);
insert into productos (PrecioUnitario, Stock, StockMin) values (750, 100, 10);

insert into vendedor(Nombre, Apellido, DNI, Direccion, FechaNacimiento, Salario) values ("Matias", "Bragadini", "40454980", "Tejedor 410", "1997-05-17 00:00:00", 40000);
insert into vendedor(Nombre, Apellido, DNI, Direccion, FechaNacimiento, Salario) values ("Jorge", "Ruiz", "2049540", "Constitucion 1200", "1997-02-13 00:00:00", 45000);
insert into vendedor(Nombre, Apellido, DNI, Direccion, FechaNacimiento, Salario) values ("Roberto", "Lopez", "3012344", "Colon 1410", "1997-03-12 00:00:00", 44000);
insert into vendedor(Nombre, Apellido, DNI, Direccion, FechaNacimiento, Salario) values ("Manuel", "Suarez", "19494444", "Rawson 2765", "1997-04-11 00:00:00", 44000);
insert into vendedor(Nombre, Apellido, DNI, Direccion, FechaNacimiento, Salario) values ("Maria", "Liam", "18123456", "Ingenieros 200", "1997-05-10 00:00:00", 43000);

insert into cliente(Nombre, Apellido, DNI, Direccion, FechaNacimiento) values ("Ricardo", "Darin", "10123444", "Castelli 1250", "1985-05-17 00:00:00");
insert into cliente(Nombre, Apellido, DNI, Direccion, FechaNacimiento) values ("Ricardo", "Fort", "35440231", "Guemes 200", "1986-02-13 00:00:00");
insert into cliente(Nombre, Apellido, DNI, Direccion, FechaNacimiento) values ("Ana", "Ramos", "40411000", "Alberti 132", "1987-03-12 00:00:00");
insert into cliente(Nombre, Apellido, DNI, Direccion, FechaNacimiento) values ("Yamila", "Reynoso", "30150350", "Aragon 6830", "1988-04-11 00:00:00");
insert into cliente(Nombre, Apellido, DNI, Direccion, FechaNacimiento) values ("Maria", "Altamirano", "12330444", "Gascon 3200", "1989-05-10 00:00:00");

insert into facturacion(idVendedor, idCliente) values (1,1);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (1, 3);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (1, 4);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (1, 5);

insert into facturacion(idVendedor, idCliente) values (2,2);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (2, 4);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (2, 5);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (2, 6);

insert into facturacion(idVendedor, idCliente) values (3,3);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (3, 5);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (3, 6);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (3, 2);

insert into facturacion(idVendedor, idCliente) values (4,4);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (4, 2);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (4, 5);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (4, 1);

insert into facturacion(idVendedor, idCliente) values (5,5);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (5,1);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (5, 3);
insert into facturacion_has_productos (idFacturacion, codigoProducto) values (5, 4);

SELECT * FROM facturacion INNER JOIN facturacion_has_productos USING (idFacturacion) INNER JOIN Productos using (codigoProducto);
SELECT * FROM Cliente INNER JOIN facturacion using (idCliente) INNER JOIN facturacion_has_productos USING (idFacturacion) INNER JOIN Productos using (codigoProducto);
