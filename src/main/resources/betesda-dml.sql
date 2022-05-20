-- MariaDB dump 10.17  Distrib 10.5.4-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: betesda
-- ------------------------------------------------------
-- Server version	10.5.4-MariaDB-1:10.5.4+maria~focal

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `destinacao_hospedagem`
--
DROP TABLE IF EXISTS `destinacao_hospedagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `destinacao_hospedagem` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(64) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `destinacao_hospedagem_un01` (`descricao`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `encaminhador`
--

DROP TABLE IF EXISTS `encaminhador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `encaminhador` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cargo` varchar(64) NOT NULL,
  `email` varchar(64) DEFAULT NULL,
  `nome` varchar(64) NOT NULL,
  `telefone` varchar(16) DEFAULT NULL,
  `entidade_id` bigint(20) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `ativo` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=146 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bairro` varchar(32) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `cidade` varchar(64) NOT NULL,
  `complemento` varchar(32) DEFAULT NULL,
  `latitude` double NOT NULL,
  `logradouro` varchar(64) NOT NULL,
  `longitude` double NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `uf` varchar(2) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2889 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `entidade`
--

DROP TABLE IF EXISTS `entidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entidade` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(14) NOT NULL,
  `email` varchar(64) DEFAULT NULL,
  `nome` varchar(64) NOT NULL,
  `telefone` varchar(16) DEFAULT NULL,
  `endereco_id` bigint(20) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `observacoes` longtext DEFAULT NULL,
  `telefone2` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtkqsbybf0x0mygx1ps6cmc37w` (`endereco_id`),
  CONSTRAINT `FKtkqsbybf0x0mygx1ps6cmc37w` FOREIGN KEY (`endereco_id`) REFERENCES `endereco` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `estado_leito`
--

DROP TABLE IF EXISTS `estado_leito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado_leito` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32) NOT NULL,
  `disponivel` varchar(1) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hospedagem`
--

DROP TABLE IF EXISTS `hospedagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hospedagem` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_efetiva_saida` date DEFAULT NULL,
  `data_entrada` date NOT NULL,
  `data_prevista_saida` date NOT NULL,
  `observacoes` longtext DEFAULT NULL,
  `tipo_utilizacao` varchar(1) NOT NULL,
  `destinacao_hospedagem_id` bigint(20) NOT NULL,
  `encaminhador_id` bigint(20) DEFAULT NULL,
  `entidade_id` bigint(20) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hospedagem_fk02` (`destinacao_hospedagem_id`),
  KEY `hospedagem_fk01` (`encaminhador_id`),
  KEY `hospedagem_fk03` (`entidade_id`),
  KEY `hospedagem_idx01` (`data_entrada`) USING BTREE,
  KEY `hospedagem_idx02` (`data_prevista_saida`) USING BTREE,
  KEY `hospedagem_idx04` (`encaminhador_id`) USING BTREE,
  KEY `hospedagem_idx05` (`entidade_id`) USING BTREE,
  KEY `hospedagem_idx03` (`data_efetiva_saida`) USING BTREE,
  CONSTRAINT `hospedagem_fk01` FOREIGN KEY (`encaminhador_id`) REFERENCES `encaminhador` (`id`),
  CONSTRAINT `hospedagem_fk02` FOREIGN KEY (`destinacao_hospedagem_id`) REFERENCES `destinacao_hospedagem` (`id`),
  CONSTRAINT `hospedagem_fk03` FOREIGN KEY (`entidade_id`) REFERENCES `entidade` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3798 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hospedagem_mock`
--

DROP TABLE IF EXISTS `hospedagem_mock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hospedagem_mock` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_efetiva_saida` date DEFAULT NULL,
  `data_entrada` date NOT NULL,
  `data_prevista_saida` date DEFAULT NULL,
  `quarto` int(11) DEFAULT NULL,
  `situacao` varchar(1) NOT NULL,
  `dataEfetivaSaida` date DEFAULT NULL,
  `dataEntrada` date DEFAULT NULL,
  `dataPrevistaSaida` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hospedagem_tipo_servico`
--

DROP TABLE IF EXISTS `hospedagem_tipo_servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hospedagem_tipo_servico` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `hospedagem_id` bigint(20) NOT NULL,
  `tipo_servico_id` bigint(20) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hospedagem_tipo_servico_idx01` (`hospedagem_id`),
  KEY `hospedagem_tipo_servico_servico_fk02_idx` (`tipo_servico_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3874 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hospede`
--

DROP TABLE IF EXISTS `hospede`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hospede` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `hospedagem_id` bigint(20) NOT NULL,
  `pessoa_id` bigint(20) NOT NULL,
  `tipo_hospede_id` bigint(20) NOT NULL,
  `baixado` varchar(1) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hospede_idx01` (`hospedagem_id`),
  KEY `hospede_idx02` (`pessoa_id`),
  KEY `hospede_idx03` (`tipo_hospede_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5624 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hospede_leito`
--

DROP TABLE IF EXISTS `hospede_leito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hospede_leito` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_entrada` date NOT NULL,
  `hospede_id` bigint(20) NOT NULL,
  `leito_id` bigint(20) NOT NULL,
  `quarto_id` bigint(20) NOT NULL,
  `data_saida` date DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hospede_leito_hospede_FK` (`hospede_id`),
  KEY `FKmv2dxrydc0l7h5omhxvsy60gh` (`leito_id`),
  KEY `FK4squtfbkqo7avevyx8f98tkuy` (`quarto_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3598 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `leito`
--

DROP TABLE IF EXISTS `leito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leito` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `numero` int(11) NOT NULL,
  `quarto_id` bigint(20) NOT NULL,
  `situacao_leito_id` bigint(20) NOT NULL,
  `tipo_leito_id` bigint(20) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `leito_un01` (`quarto_id`,`numero`) USING BTREE,
  KEY `leito_fk03` (`quarto_id`),
  KEY `leito_fk02` (`situacao_leito_id`),
  KEY `leito_fk01` (`tipo_leito_id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(11) DEFAULT NULL,
  `data_nascimento` date NOT NULL,
  `email` varchar(64) DEFAULT NULL,
  `estado_civil` varchar(1) DEFAULT NULL,
  `nome` varchar(64) NOT NULL,
  `observacoes` longtext DEFAULT NULL,
  `rg` varchar(32) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `telefone` varchar(16) DEFAULT NULL,
  `endereco_id` bigint(20) NOT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `cartao_sus` varchar(16) DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `nacionalidade` varchar(64) DEFAULT NULL,
  `profissao` varchar(64) DEFAULT NULL,
  `telefone2` varchar(16) DEFAULT NULL,
  `naturalidade_cidade` varchar(64) DEFAULT NULL,
  `naturalidade_uf` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKei4abnsw085kx27j89rp796ny` (`endereco_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2659 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `planilha_estadia`
--

DROP TABLE IF EXISTS `planilha_estadia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `planilha_estadia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(16) DEFAULT NULL,
  `cpf` varchar(16) DEFAULT NULL,
  `dataEntrada` date DEFAULT NULL,
  `dataExpectativaSaida` date DEFAULT NULL,
  `dataSaida` date DEFAULT NULL,
  `observacoes` longtext DEFAULT NULL,
  `data_entrada` date DEFAULT NULL,
  `data_expectativa_saida` date DEFAULT NULL,
  `data_saida` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `planilha_paciente`
--

DROP TABLE IF EXISTS `planilha_paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `planilha_paciente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bairro` varchar(64) DEFAULT NULL,
  `cep` varchar(16) DEFAULT NULL,
  `cidade` varchar(64) DEFAULT NULL,
  `codigo` varchar(16) DEFAULT NULL,
  `cpf` varchar(16) DEFAULT NULL,
  `dataCadastro` date DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  `endereco` varchar(64) DEFAULT NULL,
  `estadoCivil` varchar(32) DEFAULT NULL,
  `nacionalidade` varchar(64) DEFAULT NULL,
  `naturalidade` varchar(64) DEFAULT NULL,
  `nome` varchar(64) DEFAULT NULL,
  `numero` varchar(16) DEFAULT NULL,
  `profissao` varchar(64) DEFAULT NULL,
  `rg` varchar(32) DEFAULT NULL,
  `sobrenome` varchar(64) DEFAULT NULL,
  `telefone` varchar(32) DEFAULT NULL,
  `telefone2` varchar(32) DEFAULT NULL,
  `uf` varchar(64) DEFAULT NULL,
  `data_cadastro` date DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `estado_civil` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `quarto`
--

DROP TABLE IF EXISTS `quarto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quarto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ativo` varchar(1) DEFAULT NULL,
  `descricao` varchar(255) NOT NULL,
  `numero` int(11) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `quarto_un01` (`numero`) USING BTREE,
  UNIQUE KEY `quarto_un02` (`descricao`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `quarto_destinacoes`
--

DROP TABLE IF EXISTS `quarto_destinacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quarto_destinacoes` (
  `quarto_id` bigint(20) NOT NULL,
  `destinacao_hospedagem_id` bigint(20) NOT NULL,
  PRIMARY KEY (`quarto_id`,`destinacao_hospedagem_id`),
  KEY `FKh8jup3n5f9kh454rdc9myd4r` (`destinacao_hospedagem_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_nb4h0p6txrmfc0xbrd1kglp9t` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tipo_hospede`
--

DROP TABLE IF EXISTS `tipo_hospede`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_hospede` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tipo_hospede_un01` (`descricao`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tipo_leito`
--

DROP TABLE IF EXISTS `tipo_leito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_leito` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32) NOT NULL,
  `quantidade_camas` int(11) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tipo_leito_un01` (`descricao`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tipo_servico`
--

DROP TABLE IF EXISTS `tipo_servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_servico` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ativo` varchar(1) NOT NULL,
  `descricao` varchar(32) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tipo_servico_un01` (`descricao`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKh8ciramu9cc9q3qcqiv4ue8a6` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user_token`
--

DROP TABLE IF EXISTS `user_token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ativo` varchar(1) DEFAULT NULL,
  `data_hora_criacao` datetime NOT NULL,
  `data_hora_validade` datetime NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `token` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `username` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-09 22:15:10
