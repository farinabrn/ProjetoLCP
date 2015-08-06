-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: projeto
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `banco`
--

DROP TABLE IF EXISTS `banco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banco` (
  `idBanco` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idBanco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banco`
--

LOCK TABLES `banco` WRITE;
/*!40000 ALTER TABLE `banco` DISABLE KEYS */;
/*!40000 ALTER TABLE `banco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conta`
--

DROP TABLE IF EXISTS `conta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conta` (
  `idConta` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `tipoConta` int(11) NOT NULL,
  `idUsuarioPagador` int(11) DEFAULT NULL,
  PRIMARY KEY (`idConta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conta`
--

LOCK TABLES `conta` WRITE;
/*!40000 ALTER TABLE `conta` DISABLE KEYS */;
/*!40000 ALTER TABLE `conta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contabancaria`
--

DROP TABLE IF EXISTS `contabancaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contabancaria` (
  `idContaBancaria` int(11) NOT NULL AUTO_INCREMENT,
  `agencia` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `conta` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idBanco` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idContaBancaria`),
  CONSTRAINT `fk_idBanco` FOREIGN KEY (`idContaBancaria`) REFERENCES `banco` (`idBanco`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contabancaria`
--

LOCK TABLES `contabancaria` WRITE;
/*!40000 ALTER TABLE `contabancaria` DISABLE KEYS */;
/*!40000 ALTER TABLE `contabancaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `divida`
--

DROP TABLE IF EXISTS `divida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `divida` (
  `idDivida` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuarioDevedor` int(11) DEFAULT NULL,
  `idUsuarioRecebedor` int(11) DEFAULT NULL,
  `descricao` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `preco` double DEFAULT NULL,
  PRIMARY KEY (`idDivida`),
  KEY `fk_idUsuarioDevedor_idx` (`idUsuarioDevedor`),
  KEY `fk_idUsuarioRecebedor_idx` (`idUsuarioRecebedor`),
  CONSTRAINT `fk_idUsuarioDevedor` FOREIGN KEY (`idUsuarioDevedor`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_idUsuarioRecebedor` FOREIGN KEY (`idUsuarioRecebedor`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `divida`
--

LOCK TABLES `divida` WRITE;
/*!40000 ALTER TABLE `divida` DISABLE KEYS */;
/*!40000 ALTER TABLE `divida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `apelido` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cpf` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dataInicio` timestamp NULL DEFAULT NULL,
  `dataTermino` timestamp NULL DEFAULT NULL,
  `situacaoUsuario` int(11) DEFAULT NULL,
  `telefoneResidencial` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefoneCelular` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idContaBancaria` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fk_idContaBancaria_idx` (`idContaBancaria`),
  CONSTRAINT `fk_idContaBancaria` FOREIGN KEY (`idContaBancaria`) REFERENCES `contabancaria` (`idContaBancaria`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'projeto'
--

--
-- Dumping routines for database 'projeto'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-05 21:07:55
