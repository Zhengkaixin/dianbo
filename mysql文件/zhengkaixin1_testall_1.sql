-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: zhengkaixin1
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `testall_1`
--

DROP TABLE IF EXISTS `testall_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `testall_1` (
  `province` varchar(40) DEFAULT NULL,
  `city` varchar(40) DEFAULT NULL,
  `adcode` varchar(40) DEFAULT NULL,
  `reporttime` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `testall_1`
--

LOCK TABLES `testall_1` WRITE;
/*!40000 ALTER TABLE `testall_1` DISABLE KEYS */;
INSERT INTO `testall_1` VALUES ('北京','北京市','110000','2020-01-09 00:36:05'),('天津','天津市','120000','2020-01-09 00:35:02'),('河北','河北省','130000','2020-01-09 00:31:24'),('山西','山西省','140000','2020-01-09 00:36:10'),('内蒙古','内蒙古自治区','150000','2020-01-09 00:24:03'),('辽宁','辽宁省','210000','2020-01-09 00:21:54'),('吉林','吉林省','220000','2020-01-09 00:34:41'),('黑龙江','黑龙江省','230000','2020-01-09 00:22:21'),('上海','上海市','310000','2020-01-09 00:27:19'),('江苏','江苏省','320000','2020-01-09 00:26:53'),('浙江','浙江省','330000','2020-01-09 00:29:49'),('安徽','安徽省','340000','2020-01-09 00:26:05'),('福建','福建省','350000','2020-01-09 00:27:24'),('江西','江西省','360000','2020-01-09 00:33:05'),('山东','山东省','370000','2020-01-09 00:27:46'),('河南','河南省','410000','2020-01-09 00:23:21'),('湖北','湖北省','420000','2020-01-09 00:22:53'),('湖南','湖南省','430000','2020-01-09 00:25:33'),('广东','广东省','440000','2020-01-09 00:24:30'),('广西','广西壮族自治区','450000','2020-01-09 00:30:24'),('海南','海南省','460000','2020-01-09 00:29:23'),('重庆','重庆市','500000','2020-01-09 00:29:13'),('四川','四川省','510000','2020-01-09 00:33:41'),('贵州','贵州省','520000','2020-01-09 00:28:50'),('云南','云南省','530000','2020-01-09 00:35:09'),('西藏','西藏自治区','540000','2020-01-09 00:26:34'),('陕西','陕西省','610000','2020-01-09 00:28:22'),('甘肃','甘肃省','620000','2020-01-09 00:32:31'),('青海','青海省','630000','2020-01-09 00:29:30'),('宁夏','宁夏回族自治区','640000','2020-01-09 00:29:43'),('新疆','新疆维吾尔自治区','650000','2020-01-09 00:25:04');
/*!40000 ALTER TABLE `testall_1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-09 21:03:09
