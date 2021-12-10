# Spring-JDBC-Template-Individual-Awakelab
  Acceso a datos en Spring Framework
  
Desarrollo: Implementar su proyecto web en base a Spring MVC.
- Continúe la migración de su proyecto web a través del framework Spring MVC.
- Cree los paquetes respectivos a controladores, vistas, modelo, service, etc.
- Mueva las clases que corresponden a controladores al elemento creado en el paso anterior.
- Dentro del paquete principal de la plataforma, cree dos paquetes más: uno con nombre “dao” y otro con nombre “modelo”.
- Cree la clase que representen las entidades de su proyecto
- Configure las acciones de forma tal que los datos se leen desde una base de datos.
- Utilice JDBC Témplate para la conexión a los datos.

Script BD
CREATE DATABASE  IF NOT EXISTS `servlet_grupal` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `servlet_grupal`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: servlet_grupal
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `capacitacion`
--

DROP TABLE IF EXISTS `capacitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `capacitacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rut_cliente` varchar(45) DEFAULT NULL,
  `dia` varchar(45) DEFAULT NULL,
  `hora` varchar(45) DEFAULT NULL,
  `lugar` varchar(45) DEFAULT NULL,
  `duracion` varchar(45) DEFAULT NULL,
  `cantidad_asistentes` int DEFAULT NULL,
  `nombreCliente` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
