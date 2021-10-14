-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlysanpham
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `chitiethoadon`
--

DROP TABLE IF EXISTS `chitiethoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitiethoadon` (
  `MaCTHD` int NOT NULL AUTO_INCREMENT,
  `MaHoaDon` int NOT NULL,
  `MaSanPham` int NOT NULL,
  `SoLuong` int NOT NULL,
  `TongTien` decimal(15,4) NOT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `GiaTien` decimal(15,4) DEFAULT '100000.0000',
  PRIMARY KEY (`MaCTHD`),
  KEY `FK_ChiTietHoaDon_HoaDon` (`MaHoaDon`),
  KEY `FK_ChiTietHoaDon_SanPham` (`MaSanPham`),
  CONSTRAINT `FK_ChiTietHoaDon_HoaDon` FOREIGN KEY (`MaHoaDon`) REFERENCES `hoadon` (`MaHoaDon`),
  CONSTRAINT `FK_ChiTietHoaDon_SanPham` FOREIGN KEY (`MaSanPham`) REFERENCES `sanpham` (`MaSanPham`)
) ENGINE=InnoDB AUTO_INCREMENT=1209 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitiethoadon`
--

LOCK TABLES `chitiethoadon` WRITE;
/*!40000 ALTER TABLE `chitiethoadon` DISABLE KEYS */;
INSERT  IGNORE INTO `chitiethoadon` (`MaCTHD`, `MaHoaDon`, `MaSanPham`, `SoLuong`, `TongTien`, `GhiChu`, `GiaTien`) VALUES (15,13,3,1,1890000.0000,'',1890000.0000),(19,17,4,1,1300000.0000,'',1300000.0000),(20,13,30,1,1100000.0000,'',1100000.0000),(1020,1021,1,3,3900000.0000,'',7890000.0000),(1021,1021,1,5,39450000.0000,'sdfsfsf',7890000.0000),(1022,7,6,1,7490000.0000,'',7490000.0000),(1023,7,9,1,1200000.0000,'',1200000.0000),(1024,7,30,1,1100000.0000,'',1100000.0000),(1025,20,9,1,1200000.0000,'',1200000.0000),(1026,20,28,1,14000000.0000,'',14000000.0000),(1027,1021,28,4,56000000.0000,'',14000000.0000),(1029,1022,49,1,400000.0000,'',400000.0000),(1030,1022,49,1,400000.0000,'',400000.0000),(1031,1022,45,1,1960000.0000,'',1960000.0000),(1032,13,7,1,1800000.0000,'',1800000.0000),(1033,1023,1,1,7890000.0000,'',7890000.0000),(1034,1024,1,20,157800000.0000,'',7890000.0000),(1050,1023,1,1,7890000.0000,'',100000.0000),(1051,1023,1,1,7890000.0000,'',100000.0000),(1052,1023,1,1,7890000.0000,'',100000.0000),(1053,1023,1,1,7890000.0000,'',100000.0000),(1054,1023,1,2,7890000.0000,'',100000.0000),(1055,1023,1,2,7890000.0000,'',100000.0000),(1056,1023,1,2,7890000.0000,'',100000.0000),(1057,1023,1,2,7890000.0000,'',100000.0000),(1058,1023,1,1,7890000.0000,'',100000.0000),(1059,1023,1,2,7890000.0000,'',100000.0000),(1060,1023,1,5,7890000.0000,'',100000.0000),(1061,1023,1,5,7890000.0000,'',100000.0000),(1062,1023,1,1,7890000.0000,'',100000.0000),(1063,1023,1,1,7890000.0000,'',100000.0000),(1064,1023,1,10,7890000.0000,'',100000.0000),(1065,1023,1,2,7890000.0000,'',100000.0000),(1066,1023,1,1,7890000.0000,'',100000.0000),(1067,1023,3,1,7890000.0000,'',100000.0000),(1068,1023,3,2,7890000.0000,'',100000.0000),(1074,1024,1,1,7890000.0000,'',1000.0000),(1077,1024,1,1,7890000.0000,'',1000.0000),(1078,1024,1,20,157800000.0000,'',7890000.0000),(1079,1024,1,1,7890000.0000,'',1000.0000),(1080,1024,1,1,7890000.0000,'',1000.0000),(1081,1024,1,1,7890000.0000,'',1000.0000),(1086,17,3,1,0.0000,'ewwew',1890000.0000),(1087,17,22,10,0.0000,'',21000000.0000),(1088,17,1,1,0.0000,'',7890000.0000),(1091,1021,1,2,15780000.0000,'',7890000.0000),(1092,1021,5,1,21000000.0000,'',21000000.0000),(1098,1024,1,1,7890000.0000,'',1000.0000),(1103,1024,1,10,7890000.0000,'',1000.0000),(1104,1024,1,10,7890000.0000,'',1000.0000),(1112,1023,3,1,7890000.0000,'',100000.0000),(1113,1023,3,1,7890000.0000,'',100000.0000),(1115,1029,8,10,170000000.0000,'',17000000.0000),(1117,1027,6,10,74900000.0000,'',7490000.0000),(1120,1030,4,10,13000000.0000,'',1300000.0000),(1122,1031,3,10,18900000.0000,'',1890000.0000),(1123,1036,3,36,68040000.0000,'',1890000.0000),(1124,1036,3,91,171990000.0000,'',1890000.0000),(1125,1037,1,90,710100000.0000,'',7890000.0000),(1126,1037,4,5,6500000.0000,'',1300000.0000),(1127,1038,20,100,120000000.0000,'',1200000.0000),(1128,1040,3,7,13230000.0000,'',1890000.0000),(1129,1040,3,14,26460000.0000,'',1890000.0000),(1130,1043,5,9,189000000.0000,'',21000000.0000),(1131,1043,6,81,606690000.0000,'',7490000.0000),(1132,1044,19,10,210000000.0000,'',21000000.0000),(1133,1046,3,10,18900000.0000,'',1890000.0000),(1134,1047,3,10,18900000.0000,'',1890000.0000),(1135,1048,1,10,78900000.0000,'',7890000.0000),(1136,1049,3,10,18900000.0000,'',1890000.0000),(1137,1049,3,10,18900000.0000,'',1890000.0000),(1138,1050,1,1,7890000.0000,'',7890000.0000),(1139,1053,3,1,1890000.0000,'',1890000.0000),(1140,1054,3,2,3780000.0000,'',1890000.0000),(1141,1055,3,2,3780000.0000,'',1890000.0000),(1142,1056,3,1,1890000.0000,'',1890000.0000),(1143,1057,1,1,7890000.0000,'',7890000.0000),(1144,1058,1,10,78900000.0000,'',7890000.0000),(1145,1058,21,20,420000000.0000,'',21000000.0000),(1146,1058,21,10,210000000.0000,'',21000000.0000),(1147,1059,3,2,3780000.0000,'',1890000.0000),(1148,1060,41,10,1600000000.0000,'',160000000.0000),(1149,1060,1,20,157800000.0000,'',7890000.0000),(1150,1063,6,2,14980000.0000,'',7490000.0000),(1151,1064,1,10,78900000.0000,'',7890000.0000),(1152,1064,6,10,74900000.0000,'',7490000.0000),(1155,1067,3,10,18900000.0000,'',1890000.0000),(1156,1068,3,10,18900000.0000,'',1890000.0000),(1157,1069,1,10,78900000.0000,'',7890000.0000),(1161,1070,1,10,78900000.0000,'',7890000.0000),(1162,1070,6,2,14980000.0000,'',7490000.0000),(1163,1071,1,8,63120000.0000,'',7890000.0000),(1169,1073,1,10,78900000.0000,'',7890000.0000),(1170,1074,3,10,18900000.0000,'',1890000.0000),(1171,1075,1,20,157800000.0000,'',7890000.0000),(1172,1076,3,10,18900000.0000,'',1890000.0000),(1173,1077,1,2,15780000.0000,'',7890000.0000),(1174,1078,3,1,1890000.0000,'',1890000.0000),(1175,1080,1,100,789000000.0000,'',7890000.0000),(1176,1081,3,10,18900000.0000,'',1890000.0000),(1179,1084,3,5,9450000.0000,'',1890000.0000),(1180,1091,3,100,189000000.0000,'',1890000.0000),(1181,1092,3,10,18900000.0000,'',1890000.0000),(1182,1092,12,5,63000000.0000,'',12600000.0000),(1183,1093,1,11,86790000.0000,'',7890000.0000),(1184,1094,1,1095,8639550000.0000,'',7890000.0000),(1185,1094,3,46,86940000.0000,'',1890000.0000),(1186,1094,3,9,17010000.0000,'',1890000.0000),(1187,1095,9,50,60000000.0000,'',1200000.0000),(1188,1096,3,150,283500000.0000,'',1890000.0000),(1189,1096,9,456,547200000.0000,'',1200000.0000),(1190,1082,1,82,646980000.0000,'',7890000.0000),(1191,1098,1,15,75000.0000,'',5000.0000),(1192,1099,1,10,50000.0000,'',5000.0000),(1193,1030,3,10,18900000.0000,'',1890000.0000),(1194,1099,4,5,6500000.0000,'',1300000.0000),(1195,1099,63,20,400000.0000,'',20000.0000),(1196,1100,1,10,50000.0000,'',5000.0000),(1197,1100,48,2,22000000.0000,'',11000000.0000),(1198,1101,9,5,6000000.0000,'',1200000.0000),(1199,1101,34,2,38000.0000,'',19000.0000),(1200,1102,3,1,1890000.0000,'',1890000.0000),(1201,1103,3,2,3780000.0000,'',1890000.0000),(1202,1104,1,10,50000.0000,'',5000.0000),(1203,1105,65,100,3000000.0000,'',30000.0000),(1204,1106,4,36,111600000.0000,'',3100000.0000),(1205,1106,6,51,153000.0000,'',3000.0000),(1206,1107,4,9,27900000.0000,'',3100000.0000),(1207,1108,6,10,30000.0000,'',3000.0000),(1208,1108,3,20,37800000.0000,'',1890000.0000);
/*!40000 ALTER TABLE `chitiethoadon` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_MuaSanPham` AFTER INSERT ON `chitiethoadon` FOR EACH ROW BEGIN
  UPDATE sanpham
   INNER JOIN chitiethoadon ON sanpham.MaSanPham = chitiethoadon.MaSanPham
	SET sanpham.TonKho = sanpham.TonKho - NEW.soluong;
	 UPDATE hoadon
   INNER JOIN chitiethoadon ON hoadon.MaHoaDon = chitiethoadon.MaHoaDon
	SET hoadon.TongTien = hoadon.TongTien + NEW.TongTien
    WHERE hoadon.MaHoaDon = New.MaHoaDon;
    END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_CapNhatChiTietHoaDon` AFTER UPDATE ON `chitiethoadon` FOR EACH ROW BEGIN
    UPDATE sanpham INNER JOIN chitiethoadon ON sanpham.MaSanPham = chitiethoadon.MaSanPham
			SET sanpham.TonKho = sanpham.TonKho - NEW.soluong + OLD.soluong;
    UPDATE hoadon INNER JOIN chitiethoadon ON hoadon.MaHoaDon = chitiethoadon.MaHoaDon
			SET hoadon.TongTien = hoadon.TongTien + NEW.TongTien -OLD.TongTien
    WHERE hoadon.MaHoaDon = OLD.MaHoaDon;
   END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_XoaChiTietHoaDon` BEFORE DELETE ON `chitiethoadon` FOR EACH ROW BEGIN
    UPDATE sanpham
    INNER JOIN chitiethoadon ON sanpham.MaSanPham = chitiethoadon.MaSanPham
	SET sanpham.TonKho = sanpham.TonKho + OLD.soluong;
    UPDATE hoadon
   INNER JOIN chitiethoadon ON hoadon.MaHoaDon = chitiethoadon.MaHoaDon
	SET hoadon.TongTien = hoadon.TongTien - OLD.TongTien
    WHERE hoadon.MaHoaDon = OLD.MaHoaDon;
    END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `chitietphieunhap`
--

DROP TABLE IF EXISTS `chitietphieunhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietphieunhap` (
  `MaCTPN` int NOT NULL AUTO_INCREMENT,
  `MaPhieuNhap` int NOT NULL,
  `MaSanPham` int NOT NULL,
  `SoLuong` int NOT NULL,
  `TongTien` decimal(15,4) NOT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT (_utf8mb4''),
  `GiaTien` decimal(15,4) DEFAULT '90000.0000',
  PRIMARY KEY (`MaCTPN`),
  KEY `FK_ChiTietPhieuNhap_PhieuNhap` (`MaPhieuNhap`),
  KEY `FK_ChiTietPhieuNhap_SanPham` (`MaSanPham`),
  CONSTRAINT `FK_ChiTietPhieuNhap_PhieuNhap` FOREIGN KEY (`MaPhieuNhap`) REFERENCES `phieunhap` (`MaPhieuNhap`),
  CONSTRAINT `FK_ChiTietPhieuNhap_SanPham` FOREIGN KEY (`MaSanPham`) REFERENCES `sanpham` (`MaSanPham`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietphieunhap`
--

LOCK TABLES `chitietphieunhap` WRITE;
/*!40000 ALTER TABLE `chitietphieunhap` DISABLE KEYS */;
INSERT  IGNORE INTO `chitietphieunhap` (`MaCTPN`, `MaPhieuNhap`, `MaSanPham`, `SoLuong`, `TongTien`, `ChuThich`, `GiaTien`) VALUES (2,1,43,1,7890000.0000,'',90000.0000),(3,2,1,1,7890000.0000,'',90000.0000),(4,2,1,1,7890000.0000,'',90000.0000),(5,7,6,1,7890000.0000,'',90000.0000),(6,7,6,1,7490000.0000,'',90000.0000),(7,7,6,1,7890000.0000,'',90000.0000),(10,1,1,600,4734000000.0000,'',7890000.0000),(11,1,3,10000,18900000000.0000,'abcdsd',1890000.0000),(12,1,1,2,15780000.0000,'',7890000.0000),(14,1,1,20,157800000.0000,'',7890000.0000),(25,20,3,2,3780000.0000,'',1890000.0000),(30,21,3,1,1890000.0000,'',1890000.0000),(31,21,3,215,406350000.0000,'',1890000.0000),(35,23,64,100,15000000.0000,'',150000.0000),(36,24,1,22,173580000.0000,'',7890000.0000),(37,25,3,2,3780000.0000,'',1890000.0000),(38,2,7,10,18000000.0000,'',1800000.0000),(39,26,9,400,480000000.0000,'',1200000.0000),(40,28,1,10000,78900000000.0000,'',7890000.0000),(41,28,4,1000,1300000000.0000,'',1300000.0000),(43,29,5,600,12600000000.0000,'',21000000.0000),(44,30,8,1000,17000000000.0000,'',17000000.0000),(45,31,30,10,11000000.0000,'',1100000.0000),(46,33,3,10,18990000.0000,'',1899000.0000),(47,38,1,10,73910000.0000,'',7391000.0000),(48,39,20,80,80000000.0000,'',1000000.0000),(50,39,21,330,6600000000.0000,'',20000000.0000),(51,39,63,100,1500000.0000,'',15000.0000),(52,40,6,10,7000000.0000,'',700000.0000),(53,41,3,10,18000000.0000,'',1800000.0000),(54,41,3,10,18000000.0000,'',1800000.0000),(55,41,3,4,7200000.0000,'',1800000.0000),(56,43,3,10,18000000.0000,'',1800000.0000),(57,2,3,3,5670000.0000,'',1890000.0000),(58,2,6,6,44940000.0000,'',7490000.0000),(59,44,3,2,3780000.0000,'',1890000.0000),(60,44,5,70,1540000000.0000,'',22000000.0000),(61,45,44,20,160000000.0000,'',8000000.0000),(62,45,36,2,17000000.0000,'',8500000.0000),(63,46,34,200,2400000.0000,'',12000.0000),(64,47,5,1500,30000000000.0000,'',20000000.0000);
/*!40000 ALTER TABLE `chitietphieunhap` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_NhapSanPham` AFTER INSERT ON `chitietphieunhap` FOR EACH ROW BEGIN
  UPDATE sanpham
   INNER JOIN chitietphieunhap ON sanpham.MaSanPham = chitietphieunhap.MaSanPham
	SET sanpham.TonKho = sanpham.TonKho + NEW.soluong;
	 UPDATE phieunhap
   INNER JOIN chitietphieunhap ON phieunhap.MaPhieuNhap = chitietphieunhap.MaPhieuNhap
	SET phieunhap.TongTien = phieunhap.TongTien + NEW.TongTien
    WHERE phieunhap.MaPhieuNhap = New.MaPhieuNhap;
    END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_CapNhatChiTietPhieuNhap` AFTER UPDATE ON `chitietphieunhap` FOR EACH ROW UPDATE sanpham
    INNER JOIN chitietphieunhap ON sanpham.MaSanPham = chitietphieunhap.MaSanPham
	SET sanpham.TonKho = sanpham.TonKho + NEW.soluong - OLD.soluong */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_UpdatePriceCTHD` AFTER UPDATE ON `chitietphieunhap` FOR EACH ROW BEGIN
    UPDATE sanpham INNER JOIN chitietphieunhap ON sanpham.MaSanPham = chitietphieunhap.MaSanPham
			SET sanpham.TonKho = sanpham.TonKho + NEW.soluong - OLD.soluong;
    UPDATE phieunhap INNER JOIN chitietphieunhap ON phieunhap.MaPhieuNhap = chitietphieunhap.MaPhieuNhap
			SET phieunhap.TongTien = phieunhap.TongTien + NEW.TongTien -OLD.TongTien
    WHERE phieunhap.MaPhieuNhap = OLD.MaPhieuNhap;
   END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_XoaChiTietPhieuNhap` BEFORE DELETE ON `chitietphieunhap` FOR EACH ROW BEGIN
    UPDATE sanpham
    INNER JOIN chitietphieunhap ON sanpham.MaSanPham = chitietphieunhap.MaSanPham
	SET sanpham.TonKho = sanpham.TonKho - OLD.soluong;
    
   UPDATE phieunhap
   INNER JOIN chitietphieunhap ON phieunhap.MaPhieuNhap = chitietphieunhap.MaPhieuNhap
	SET phieunhap.TongTien = phieunhap.TongTien - OLD.TongTien
    WHERE phieunhap.MaPhieuNhap = OLD.MaPhieuNhap;
    END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `chucvu`
--

DROP TABLE IF EXISTS `chucvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chucvu` (
  `MaChucVu` int NOT NULL AUTO_INCREMENT,
  `TenChucVu` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT (_utf8mb4''),
  PRIMARY KEY (`MaChucVu`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chucvu`
--

LOCK TABLES `chucvu` WRITE;
/*!40000 ALTER TABLE `chucvu` DISABLE KEYS */;
INSERT  IGNORE INTO `chucvu` (`MaChucVu`, `TenChucVu`, `GhiChu`) VALUES (1,'Giám Đốc','Giám đốc công ty . đứng đầu'),(2,'Thu Ngân',''),(3,'Kế Toán',''),(4,'Bảo Vệ 2',''),(5,'Lễ Tân',''),(6,'Nhân viên 1',''),(7,'Quản Lý',''),(8,'Lao Công2',''),(9,'Kiểm Soát Viên',''),(10,'chưa 3',''),(11,'NV3','sdfdsf'),(20,'Giám Đốc','');
/*!40000 ALTER TABLE `chucvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hangsanxuat`
--

DROP TABLE IF EXISTS `hangsanxuat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hangsanxuat` (
  `MaHangSanXuat` int NOT NULL AUTO_INCREMENT,
  `TenHangSanXuat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`MaHangSanXuat`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hangsanxuat`
--

LOCK TABLES `hangsanxuat` WRITE;
/*!40000 ALTER TABLE `hangsanxuat` DISABLE KEYS */;
INSERT  IGNORE INTO `hangsanxuat` (`MaHangSanXuat`, `TenHangSanXuat`) VALUES (1,'SamSung'),(2,'LG'),(3,'HTC'),(4,'Sonny'),(5,'HuaWei'),(6,'Xiaomi'),(7,'Lenovo'),(8,'Bkav'),(9,'Gionne'),(10,'FPT'),(11,'NOKIA'),(12,'Blackberry'),(13,'Apple'),(14,'Trung Quốc'),(15,'Nhật'),(16,'Beataudio'),(17,'ZTE'),(18,'DELL'),(19,'ASUS');
/*!40000 ALTER TABLE `hangsanxuat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoadon` (
  `MaHoaDon` int NOT NULL AUTO_INCREMENT,
  `MaKhachHang` int NOT NULL,
  `MaNhanVien` int NOT NULL,
  `NgayLapHoaDon` datetime DEFAULT NULL,
  `TongTien` decimal(15,4) NOT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT (_utf8mb4''),
  `ngaylaphoadon_string` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`MaHoaDon`),
  KEY `FK_HoaDon_KhachHang` (`MaKhachHang`),
  KEY `FK_HoaDon_NhanVien` (`MaNhanVien`),
  CONSTRAINT `FK_HoaDon_KhachHang` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`),
  CONSTRAINT `FK_HoaDon_NhanVien` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`)
) ENGINE=InnoDB AUTO_INCREMENT=1109 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
INSERT  IGNORE INTO `hoadon` (`MaHoaDon`, `MaKhachHang`, `MaNhanVien`, `NgayLapHoaDon`, `TongTien`, `GhiChu`, `ngaylaphoadon_string`) VALUES (7,6,11,'2021-06-01 17:21:14',30790000.0000,'','2021-06-01 17:21:14'),(13,11,6,'2021-08-03 17:04:21',47900003.0000,'huy','2021-08-03 17:04:21'),(17,12,11,'2021-08-01 17:21:31',1300000.1254,'','2021-08-01 17:21:31'),(20,11,11,'2021-08-01 17:21:41',15300000.0000,'','2021-08-01 17:21:41'),(1021,6,11,'2021-08-01 17:00:14',46960000.0300,'','2021-08-01 17:00:14'),(1022,15,22,'2021-08-01 17:20:47',2760000.0000,'','2021-08-01 17:20:47'),(1023,15,11,'2021-08-01 17:00:20',23670000.0000,'','2021-08-01 17:00:20'),(1024,15,11,'2021-07-01 17:21:48',315600000.0677,'','2021-07-01 17:21:48'),(1025,6,1,'2021-08-01 17:56:40',5656565.0000,'xcvcx','2021-08-01 17:56:40'),(1026,14,1,'2021-05-03 17:04:37',328900000.0000,'cdscd','2021-05-03 17:04:37'),(1027,6,1,'2021-08-03 17:40:02',78680001.0000,'','2021-08-03 17:40:02'),(1028,6,1,'2021-08-04 00:31:51',37000120.0000,'','2021-08-04 00:31:51'),(1029,6,1,'2021-08-04 02:54:31',170000000.0000,'','2021-08-04 02:54:31'),(1030,26,1,'2021-08-14 15:58:09',48480000.0000,'','2021-08-14T15:58:09'),(1031,100,1,'2021-08-10 16:22:58',18900000.0000,'','2021-08-10 16:22:58'),(1033,100,1,'2021-08-14 16:26:24',1000000000.0000,'','2021-08-14T16:26:24'),(1034,100,1,'2021-02-12 23:06:54',10000.0000,'','2021-02-12 23:06:54'),(1036,100,1,'2021-07-14 15:58:18',240030000.0000,'','2021-07-14T15:58:18'),(1037,100,1,'2021-08-14 16:30:57',716600000.0000,'','2021-08-14T16:30:57'),(1038,6,1,'2021-08-14 17:38:31',120000000.0000,'','2021-08-14T17:38:31'),(1039,6,13,'2021-08-16 18:36:22',0.0000,'','2021-08-16T18:36:22'),(1040,6,13,'2021-08-16 18:37:37',39690000.0000,'','2021-08-16T18:37:37'),(1041,6,13,'2021-08-16 18:42:00',0.0000,'','2021-08-16T18:42:00'),(1042,6,13,'2021-08-16 18:42:53',0.0000,'','2021-08-16T18:42:53'),(1043,6,13,'2021-08-16 18:44:16',795690000.0000,'','2021-08-16T18:44:16'),(1044,100,13,'2021-08-17 17:34:08',210000000.0000,'','2021-08-17T17:34:08'),(1045,6,13,'2021-08-17 18:36:32',0.0000,'','2021-08-17T18:36:32'),(1046,6,13,'2021-08-17 18:37:48',18900000.0000,'','2021-08-17T18:37:48'),(1047,6,13,'2021-08-17 18:39:24',18900000.0000,'','2021-08-17T18:39:24'),(1048,6,13,'2021-08-17 18:42:43',78900000.0000,'','2021-08-17T18:42:43'),(1049,6,13,'2021-08-17 18:45:31',37800000.0000,'','2021-08-17T18:45:31'),(1050,6,13,'2021-08-17 18:48:13',7890000.0000,'','2021-08-17T18:48:13'),(1051,6,13,'2021-08-17 22:56:02',0.0000,'','2021-08-17T22:56:02'),(1052,6,13,'2021-08-17 23:01:43',0.0000,'','2021-08-17T23:01:43'),(1053,6,13,'2021-08-17 23:03:07',1890000.0000,'','2021-08-17T23:03:07'),(1054,6,13,'2021-08-17 23:05:19',3780000.0000,'','2021-08-17T23:05:19'),(1055,6,13,'2021-08-17 23:13:39',3780000.0000,'','2021-08-17T23:13:39'),(1056,6,13,'2021-08-17 23:20:55',1890000.0000,'','2021-08-17T23:20:55'),(1057,6,13,'2021-08-17 23:23:24',7890000.0000,'','2021-08-17T23:23:24'),(1058,6,13,'2021-08-17 23:45:44',708900000.0000,'','2021-08-17T23:45:44'),(1059,6,13,'2021-08-17 23:51:14',3780000.0000,'','2021-08-17T23:51:14'),(1060,26,13,'2021-08-17 23:51:58',1757800000.0000,'','2021-08-17T23:51:58'),(1061,100,13,'2021-08-17 23:53:00',0.0000,'','2021-08-17T23:53:00'),(1062,6,13,'2021-08-17 23:59:07',0.0000,'','2021-08-17T23:59:07'),(1063,6,13,'2021-08-18 00:00:40',14980000.0000,'','2021-08-18T00:00:40'),(1064,6,13,'2021-08-18 00:02:36',153800000.0000,'','2021-08-18T00:02:36'),(1065,6,13,'2021-08-18 00:05:10',0.0000,'','2021-08-18T00:05:10'),(1066,6,13,'2021-08-18 00:11:43',105000000.0000,'','2021-08-18T00:11:43'),(1067,6,13,'2021-08-18 00:30:43',18900000.0000,'','2021-08-18T00:30:43'),(1068,6,13,'2021-08-18 00:32:30',18900000.0000,'','2021-08-18T00:32:30'),(1069,6,13,'2021-08-18 00:33:35',78900000.0000,'','2021-08-18T00:33:35'),(1070,6,13,'2021-08-18 00:35:47',110890000.0000,'','2021-08-18T00:35:47'),(1071,6,13,'2021-08-18 00:40:11',63120000.0000,'','2021-08-18T00:40:11'),(1072,6,13,'2021-08-18 14:01:58',0.0000,'','2021-08-18T14:01:58'),(1073,6,13,'2021-08-18 15:22:03',78900000.0000,'','2021-08-18T15:22:03'),(1074,6,13,'2021-08-18 15:24:26',18900000.0000,'','2021-08-18T15:24:26'),(1075,6,13,'2021-08-18 15:25:50',157800000.0000,'','2021-08-18T15:25:50'),(1076,6,13,'2021-08-18 15:27:36',18900000.0000,'','2021-08-18T15:27:36'),(1077,6,13,'2021-08-18 15:29:34',15780000.0000,'','2021-08-18T15:29:34'),(1078,6,13,'2021-08-18 15:30:43',1890000.0000,'','2021-08-18T15:30:43'),(1079,6,13,'2021-08-18 17:04:26',0.0000,'','2021-08-18T17:04:26'),(1080,6,25,'2021-08-18 17:07:38',789000000.0000,'','2021-08-18T17:07:38'),(1081,6,13,'2021-08-18 17:18:11',18900000.0000,'','2021-08-18T17:18:11'),(1082,6,13,'2021-08-18 17:19:45',646980000.0000,'','2021-08-18T17:19:45'),(1083,15,25,'2021-08-18 17:21:13',0.0000,'','2021-08-18T17:21:13'),(1084,6,13,'2021-07-18 17:23:29',9450000.0000,'','2021-07-18T17:23:29'),(1091,6,13,'2021-07-18 17:27:20',189000000.0000,'','2021-07-18T17:27:20'),(1092,6,13,'2021-08-18 17:28:47',81900000.0000,'','2021-08-18T17:28:47'),(1093,11,13,'2021-07-18 17:31:31',86790000.0000,'','2021-07-18T17:31:31'),(1094,6,1,'2021-06-19 00:08:03',8743500000.0000,'','2021-06-19T00:08:03'),(1095,6,3,'2021-08-19 00:25:46',60000000.0000,'','2021-08-19T00:25:46'),(1096,6,3,'2021-08-19 00:25:46',830700000.0000,'','2021-08-19T00:25:46'),(1097,6,3,'2021-07-19 00:25:46',0.0000,'','2021-07-19T00:25:46'),(1098,6,1,'2021-08-20 19:03:36',75000.0000,'','2021-08-20T19:03:36'),(1099,6,23,'2021-09-07 14:53:03',6950000.0000,'','2021-09-07T14:53:03'),(1100,6,10,'2021-08-26 15:10:39',22050000.0000,'','2021-08-26T15:10:39'),(1101,6,10,'2021-10-12 15:21:59',6038000.0000,'','2021-10-12T15:21:59'),(1102,12,1,'2021-10-12 21:11:55',1890000.0000,'','2021-10-12T21:11:55'),(1103,6,3,'2021-10-12 21:14:14',3780000.0000,'','2021-10-12T21:14:14'),(1104,100,3,'2021-10-12 21:25:35',50000.0000,'','2021-10-12T21:25:35'),(1105,6,1,'2021-10-12 21:30:14',3000000.0000,'','2021-10-12T21:30:14'),(1106,6,1,'2021-10-13 18:58:46',111753000.0000,'','2021-10-13T18:58:46'),(1107,6,1,'2021-10-14 09:22:35',27900000.0000,'','2021-10-14T09:22:35'),(1108,100,10,'2021-10-14 09:28:38',37830000.0000,'','2021-10-14T09:28:38');
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `MaKhachHang` int NOT NULL AUTO_INCREMENT,
  `TenKhachHang` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Ngaysinh` date NOT NULL,
  `GioiTinh` tinyint NOT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `LoaiKhachHang` int NOT NULL,
  `GhiChu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`MaKhachHang`),
  KEY `FK_KhachHang_LoaiKhachHang` (`LoaiKhachHang`),
  CONSTRAINT `FK_KhachHang_LoaiKhachHang` FOREIGN KEY (`LoaiKhachHang`) REFERENCES `loaikhachhang` (`MaLoaiKhachHang`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT  IGNORE INTO `khachhang` (`MaKhachHang`, `TenKhachHang`, `Ngaysinh`, `GioiTinh`, `DiaChi`, `SDT`, `LoaiKhachHang`, `GhiChu`) VALUES (6,'Nguyễn Thanh Sơn','1996-03-01',0,'Hà Nội','0909898964',2,''),(11,'Phở','1986-09-02',1,'không cho xem','0745322222',3,''),(12,'đức Đồng 2','1993-04-19',0,'Hà Nộidsfds','0914232372',1,'mới thêm'),(14,'Phạm Hồng Hàudgf','1992-06-09',1,'102 nguyễn tất thành-TP buôn Ma Thuật','0166542753g',3,''),(15,'Hoàng Raperiiii','2000-06-09',1,' Hải Phòng','0166554322',1,''),(18,'Phạm Hồng Hàug','1992-06-12',0,'102 nguyễn tất thành-TP buôn Ma Thuật','0166542753',1,''),(19,'phạm hoàng huy1','2010-05-02',1,'5433rewrw','6445654',2,'sdsdfs'),(20,'phạm hoàng huy 32','2010-05-03',0,'5433','6445654',1,''),(26,'Triệu Thị Ánh','1998-01-11',0,'Hà Nội','0374858355',1,'SV ĐHXD'),(100,'Khách lẻ','2021-01-01',1,'df','123456789',1,NULL),(101,'Triệu Quang Sáng','1990-01-10',0,'sd','ádas',2,'');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaikhachhang`
--

DROP TABLE IF EXISTS `loaikhachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaikhachhang` (
  `MaLoaiKhachHang` int NOT NULL AUTO_INCREMENT,
  `TenLoaiKhachHang` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`MaLoaiKhachHang`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaikhachhang`
--

LOCK TABLES `loaikhachhang` WRITE;
/*!40000 ALTER TABLE `loaikhachhang` DISABLE KEYS */;
INSERT  IGNORE INTO `loaikhachhang` (`MaLoaiKhachHang`, `TenLoaiKhachHang`, `GhiChu`) VALUES (1,'vip','giảm 10%'),(2,'thường','giảm 0%'),(3,'sinh viên','giảm 5%');
/*!40000 ALTER TABLE `loaikhachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaisanpham`
--

DROP TABLE IF EXISTS `loaisanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaisanpham` (
  `MaLoaiSanPham` int NOT NULL AUTO_INCREMENT,
  `TenLoaiSanPham` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT (_utf8mb4''),
  PRIMARY KEY (`MaLoaiSanPham`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaisanpham`
--

LOCK TABLES `loaisanpham` WRITE;
/*!40000 ALTER TABLE `loaisanpham` DISABLE KEYS */;
INSERT  IGNORE INTO `loaisanpham` (`MaLoaiSanPham`, `TenLoaiSanPham`, `GhiChu`) VALUES (1,'Điện thoại ',''),(2,'Đồ điện tử','dgdgfd'),(3,'Đồ ăn','ưewerewr'),(4,'Thức uống','dscdswe'),(5,'Thau',''),(7,'Dụng cụ học tập',''),(8,'Sách vở','cdscd'),(9,'Đồ trang điểm','pok'),(10,'chưa 3d',''),(13,'LSP mới','');
/*!40000 ALTER TABLE `loaisanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `MaNhanVien` int NOT NULL AUTO_INCREMENT,
  `TenNhanVien` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `GioiTinh` tinyint NOT NULL,
  `NgayVaoLam` date NOT NULL,
  `ChucVu` int NOT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SoDT` varchar(11) NOT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`MaNhanVien`),
  KEY `FK_NhanVien_ChucVu` (`ChucVu`),
  CONSTRAINT `FK_NhanVien_ChucVu` FOREIGN KEY (`ChucVu`) REFERENCES `chucvu` (`MaChucVu`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT  IGNORE INTO `nhanvien` (`MaNhanVien`, `TenNhanVien`, `NgaySinh`, `GioiTinh`, `NgayVaoLam`, `ChucVu`, `DiaChi`, `SoDT`, `GhiChu`) VALUES (1,'Phạm Hoàng Huy','1996-12-25',0,'2021-07-20',1,'51- 102 Nguyễn Tất Thành 23','01293223225','chức cao nhất có thể'),(3,'Phạm Văn Toàn','1997-01-02',0,'2011-03-05',2,'chưa có','01293223225','chưa có'),(6,'Nguyễn Trúc Nhân','1990-06-10',1,'2014-12-03',5,'Hà Nội ','091425635',''),(8,'Phạm Băng Băng 3','1896-03-02',0,'2015-05-04',5,'việt nam','01652343643',''),(10,'Nguyễn Thanh Tùng','1994-07-05',1,'2015-09-07',2,'Thái Bình','09090909090',''),(11,'Lương Bích Hữu','1988-06-23',0,'2015-06-04',3,'Trung Quốc','46789976654',''),(13,'Khởi My','1984-06-03',1,'2015-06-03',6,'buôn Ma Thuật','12345698',''),(14,'Nguyễn thị Hồng','1997-08-07',1,'2021-07-20',2,'buôn ma thuột','01293223225','\n'),(15,'nguyễn Văn Hùng','1994-03-02',0,'2011-03-05',4,'easup','01653454267',''),(18,'Phạm Văn Nguyên','1997-01-02',1,'2014-03-05',4,'hà nội','0921457432',''),(22,'Khởi My','1984-06-03',0,'2015-06-03',6,'buôn Ma Thuật','01293223225',''),(23,'nguyễn Văn Hùng','1994-03-02',1,'2011-03-05',5,'easup','01653454267',''),(25,'Nguyễn Trúc Nhân','1990-06-10',1,'2014-12-20',5,'Hà Nội ','091425635',''),(27,'sdcds','2021-02-03',1,'2021-02-03',1,'csdcdsc','01652343643','sdcds'),(28,'ssx','2020-01-02',0,'2020-01-02',1,'scsc','091425635','cscsc'),(30,'Nguyễn Văn A','1998-01-01',0,'2020-01-01',11,'abc','0374858355','');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhaphanphoi`
--

DROP TABLE IF EXISTS `nhaphanphoi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhaphanphoi` (
  `MaNhaPhanPhoi` int NOT NULL AUTO_INCREMENT,
  `TenNhaPhanPhoi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `ChuThich` longtext,
  PRIMARY KEY (`MaNhaPhanPhoi`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhaphanphoi`
--

LOCK TABLES `nhaphanphoi` WRITE;
/*!40000 ALTER TABLE `nhaphanphoi` DISABLE KEYS */;
INSERT  IGNORE INTO `nhaphanphoi` (`MaNhaPhanPhoi`, `TenNhaPhanPhoi`, `DiaChi`, `SDT`, `Email`, `ChuThich`) VALUES (2,'Viettle','Trung Quốc ','34657865434','dcomo197@gmail.com',''),(17,'FPT','Hà Nội','0374858355','trieu.anh.a98@gmail.com',''),(18,'Cargill','Hưng Yên','0374858355','anh.trieu@abcd.com.vn',''),(19,'VNDirect','1 Nguyễn Thượng Hiền','0374858355','abcd@1234','');
/*!40000 ALTER TABLE `nhaphanphoi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieunhap`
--

DROP TABLE IF EXISTS `phieunhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieunhap` (
  `MaPhieuNhap` int NOT NULL AUTO_INCREMENT,
  `MaNhanVien` int NOT NULL,
  `MaNhaPhanPhoi` int NOT NULL,
  `TongTien` decimal(15,4) NOT NULL DEFAULT '0.0000',
  `NgayNhap` datetime DEFAULT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT (_utf8mb4''),
  `NgayNhap_string` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`MaPhieuNhap`),
  KEY `FK_PhieuNhap_NhanVien` (`MaNhanVien`),
  KEY `FK_PhieuNhap_NhaPhanPhoi` (`MaNhaPhanPhoi`),
  CONSTRAINT `FK_PhieuNhap_NhanVien` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`),
  CONSTRAINT `FK_PhieuNhap_NhaPhanPhoi` FOREIGN KEY (`MaNhaPhanPhoi`) REFERENCES `nhaphanphoi` (`MaNhaPhanPhoi`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieunhap`
--

LOCK TABLES `phieunhap` WRITE;
/*!40000 ALTER TABLE `phieunhap` DISABLE KEYS */;
INSERT  IGNORE INTO `phieunhap` (`MaPhieuNhap`, `MaNhanVien`, `MaNhaPhanPhoi`, `TongTien`, `NgayNhap`, `ChuThich`, `NgayNhap_string`) VALUES (1,11,2,23815470000.0000,'2021-08-07 15:36:21','','2021-08-07 15:36:21'),(2,14,17,84390000.0000,'2021-08-07 15:25:31','','2021-08-07 15:25:31'),(3,11,18,100000.0000,'2021-08-07 15:36:02','','2021-08-07 15:36:02'),(7,11,2,23270000.0000,'2021-08-07 15:36:55','','2021-08-07 15:36:55'),(11,3,2,0.0000,'2021-08-07 15:36:51','','2021-08-07 15:36:51'),(17,3,17,169140000.0000,'2021-08-07 01:40:44','','2021-08-07 01:40:44'),(20,1,2,3780000.0000,'2021-08-07 16:41:27','','2021-08-07 16:41:27'),(21,1,2,619920000.0000,'2021-08-07 16:58:51','','2021-08-07 16:58:51'),(23,1,18,15000000.0000,'2021-08-07 23:47:52','','2021-08-07 23:47:52'),(24,1,2,178580000.0000,'2021-08-12 23:07:06','','2021-08-12 23:07:06'),(25,1,2,3780000.0000,'2021-08-14 17:32:35','','2021-08-14T17:32:35'),(26,1,19,480000000.0000,'2021-08-14 17:41:38','','2021-08-14T17:41:38'),(27,1,17,0.0000,'2021-08-18 14:06:22','','2021-08-18T14:06:22'),(28,27,2,80200000000.0000,'2021-08-18 18:28:57','','2021-08-18T18:28:57'),(29,27,2,12600000000.0000,'2021-08-18 18:33:51','','2021-08-18T18:33:51'),(30,27,18,17000000000.0000,'2021-08-18 18:35:04','','2021-08-18T18:35:04'),(31,27,2,11000000.0000,'2021-08-18 23:18:36','','2021-08-18T23:18:36'),(32,27,2,0.0000,'2021-08-18 23:28:28','','2021-08-18T23:28:28'),(33,27,2,18990000.0000,'2021-08-18 23:34:36','','2021-08-18T23:34:36'),(34,27,2,0.0000,'2021-08-18 23:38:36','','2021-08-18T23:38:36'),(35,27,2,0.0000,'2021-08-18 23:42:22','','2021-08-18T23:42:22'),(36,27,2,0.0000,'2021-08-18 23:43:53','','2021-08-18T23:43:53'),(37,27,2,0.0000,'2021-08-18 23:45:23','','2021-08-18T23:45:23'),(38,27,2,73910000.0000,'2021-08-18 23:47:52','','2021-08-18T23:47:52'),(39,27,2,6681500000.0000,'2021-08-18 23:50:31','','2021-08-18T23:50:31'),(40,27,2,7000000.0000,'2021-08-19 00:04:46','','2021-08-19T00:04:46'),(41,27,2,43200000.0000,'2021-08-19 00:06:24','','2021-08-19T00:06:24'),(42,1,2,0.0000,'2021-08-19 00:12:41','','2021-08-19T00:12:41'),(43,27,2,18000000.0000,'2021-08-19 00:22:16','','2021-08-19T00:22:16'),(44,1,2,1543780000.0000,'2021-09-07 14:55:30','','2021-09-07T14:55:30'),(45,27,2,177000000.0000,'2021-08-26 15:17:07','','2021-08-26T15:17:07'),(46,30,2,2400000.0000,'2021-09-07 14:53:30','','2021-09-07T14:53:30'),(47,30,18,30000000000.0000,'2021-10-14 09:29:55','','2021-10-14T09:29:55');
/*!40000 ALTER TABLE `phieunhap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quyen`
--

DROP TABLE IF EXISTS `quyen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quyen` (
  `MaQuyen` int NOT NULL AUTO_INCREMENT,
  `TenQuyen` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT (_utf8mb4''),
  PRIMARY KEY (`MaQuyen`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quyen`
--

LOCK TABLES `quyen` WRITE;
/*!40000 ALTER TABLE `quyen` DISABLE KEYS */;
INSERT  IGNORE INTO `quyen` (`MaQuyen`, `TenQuyen`, `ChuThich`) VALUES (1,'Quản Trị Viên',''),(2,'Nhân viên bán hàng',''),(3,'Nhân viên nhập kho','');
/*!40000 ALTER TABLE `quyen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `MaSanPham` int NOT NULL AUTO_INCREMENT,
  `TenSanPham` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `LoaiSanPham` int NOT NULL,
  `GiaNhap` decimal(15,4) NOT NULL,
  `GiaBan` decimal(15,4) NOT NULL,
  `TonKho` int NOT NULL,
  `Image` varchar(150) DEFAULT (_utf8mb4''),
  `ChuThich` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT (_utf8mb4''),
  PRIMARY KEY (`MaSanPham`),
  KEY `FK_SanPham_LoaiSanPham` (`LoaiSanPham`),
  CONSTRAINT `FK_SanPham_LoaiSanPham` FOREIGN KEY (`LoaiSanPham`) REFERENCES `loaisanpham` (`MaLoaiSanPham`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT  IGNORE INTO `sanpham` (`MaSanPham`, `TenSanPham`, `LoaiSanPham`, `GiaNhap`, `GiaBan`, `TonKho`, `Image`, `ChuThich`) VALUES (1,'Bim bim Ostar',3,2500.0000,5000.0000,23361,'C:\\Users\\Anh\\Downloads\\unnamed.jpg','31'),(3,'Kem nền',9,1800000.0000,1890000.0000,22871,NULL,'99'),(4,'Samsung s7 edge',2,3000000.0000,3100000.0000,2210,'C:\\Users\\Anh\\Downloads\\anh-dai-dien-samsung-s7-edge-didonghathanh-dep-99.jpg','9'),(5,'iphone 6',1,20000000.0000,21000000.0000,1350,'C:\\Users\\Anh\\Downloads\\iphone-6-32gb-gold-hh-600x600-600x600-600x600.jpg',''),(6,'Thước kẻ 1',7,2000.0000,3000.0000,23361,'','99'),(7,'Samsung s7 edge',2,1500000.0000,1800000.0000,12338,NULL,'9'),(8,'Son MAC',9,430000.0000,455000.0000,1427,'',''),(9,'Samsung Galaxy A7',2,1000000.0000,1200000.0000,12327,NULL,'99'),(10,'bút chì',7,10000.0000,12000.0000,90,'',''),(12,'Giấy hải tiến',8,3000.0000,5000.0000,603,'',''),(13,'samsung galaxy s6 edge plus',2,10000000.0000,11000000.0000,100,NULL,''),(19,'Cánh gà loại 1',3,20000.0000,25000.0000,1818,'',''),(20,'Cocacola',4,20000.0000,30000.0000,1652,'',''),(21,'Kẹo orion',3,10000.0000,15000.0000,1472,'',''),(22,'bò húc',4,10000.0000,12000.0000,-148,'',''),(23,'htc one a9',2,20000000.0000,21000000.0000,95,NULL,''),(24,'Milo 350ml',4,5000.0000,7000.0000,100,'',''),(25,'htc one buttefly 2',2,20000000.0000,21000000.0000,65,NULL,''),(26,'htc one derise 826',2,20000000.0000,21000000.0000,100,'',''),(27,'loa rela bueltooth',5,10000000.0000,14000000.0000,100,NULL,''),(28,'Thau to loại 60cm',5,20000.0000,25000.0000,-3146,'','99'),(29,'loa beataudio bueltooth',5,10000000.0000,14000000.0000,100,NULL,''),(30,'Thau 12 cm',5,9000.0000,15000.0000,-690,'','16'),(32,'apple watch stainless steel case',4,100000000.0000,144900000.0000,13,NULL,''),(33,'samsung gear s1',4,140000000.0000,160000000.0000,100,NULL,''),(34,'Thau 15 cm',4,12000.0000,19000.0000,1564,'',''),(35,'samsung gear s2 classic',4,11000000.0000,119900000.0000,100,NULL,''),(36,'masstel tab 730',3,8500000.0000,8900000.0000,1802,NULL,''),(39,'lenovo tab 3 7',3,3490000.0000,3990000.0000,100,NULL,''),(40,'huawer mediapad',3,7000000.0000,8000000.0000,100,NULL,''),(41,'đũa loại 1',3,35000.0000,45000.0000,-148,'',''),(42,'nolia 1020',1,299000.0000,400000.0000,100,'',''),(43,'nolia 1280',1,3000.0000,5000.0000,26536,NULL,''),(44,'bát con',9,25000.0000,27000.0000,1642,'',''),(45,'ipad pro 12.9inch',3,1800000.0000,1960000.0000,-3146,NULL,'99'),(47,'samsung gplus',2,10000000.0000,11000000.0000,100,NULL,''),(48,'Thau bé',5,15000.0000,16000.0000,-150,'',''),(49,'nolia 1020',1,299000.0000,400000.0000,-3146,NULL,'99'),(50,'Samsung s7 edge',3,1300000.0000,1300000.0000,100,NULL,'9'),(51,'cxvcxv',1,123.0000,1300000.0000,100,'','Một hai ba bốn'),(53,'sony m4 aqua',5,7390000.0000,7890000.0000,91,'C:\\Users\\Anh\\Desktop\\Capture.PNG','31'),(54,'Vở hồng há 120 trang',8,12000.0000,15000.0000,100,'','31'),(63,'Vở hồng hà',8,15000.0000,20000.0000,1598,'C:\\Users\\Anh\\Downloads\\1094-a.jpg',''),(64,'Sản phẩm mới 1',4,100000.0000,150000.0000,15599,NULL,''),(65,'Hoa hồng',1,10000.0000,30000.0000,774,'','');
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `MaNhanVien` int NOT NULL,
  `TenDangNhap` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Quyen` int NOT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `MaNhanVien` (`MaNhanVien`),
  UNIQUE KEY `TenDangNhap` (`TenDangNhap`),
  KEY `FK_Users_Quyen` (`Quyen`),
  CONSTRAINT `FK_Users_NhanVien` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`),
  CONSTRAINT `FK_Users_Quyen` FOREIGN KEY (`Quyen`) REFERENCES `quyen` (`MaQuyen`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT  IGNORE INTO `users` (`ID`, `MaNhanVien`, `TenDangNhap`, `Password`, `Quyen`, `ChuThich`) VALUES (1,1,'admin','Admin1234!',1,'người có thẩm quyền cao ngất ngưởng'),(2,28,'bbbb','cuongnpQ!@2',1,''),(3,3,'nhan1212','Nhan1212@',2,''),(6,10,'khoimy12','Khoimy12',2,' '),(7,11,'huyhuy12','HUYhuy11!',1,' '),(10,13,'anhnv','anhnvAB!1',2,''),(11,14,'bvbbf','cbffbdfbQ12@',1,''),(13,27,'admin3','Nhan1212@',3,''),(14,23,'dsad','abcd!2Q!@',2,''),(15,25,'bgbg','fgbfgbfgA@!2',2,''),(16,6,'trucnhan','Trucnhan123!',1,''),(17,30,'nguyenvana','Nguyenvana1!',3,'');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'quanlysanpham'
--

--
-- Dumping routines for database 'quanlysanpham'
--
/*!50003 DROP PROCEDURE IF EXISTS `baocaohoadon` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `baocaohoadon`(IN mahoadon nvarchar(50), IN TenKhachhang nvarchar(50),IN TenNhanVien nvarchar(50), IN startDate datetime, IN endDate datetime)
BEGIN
select hoadon.MaHoaDon, hoadon.MaKhachHang,khachhang.TenKhachHang,hoadon.ngaylaphoadon,hoadon.tongtien, nhanvien.TenNhanVien, hoadon.ghichu 
from hoadon
inner join khachhang on khachhang.MaKhachHang  = hoadon.MaKhachHang
inner join nhanvien on nhanvien.MaNhanVien  = hoadon.MaNhanVien
where 
hoadon.MaHoaDon LIKE CONCAT('%', mahoadon , '%')
AND  khachhang.TenKhachHang LIKE CONCAT('%', TenKhachhang , '%')
AND  nhanvien.tennhanvien LIKE CONCAT('%', TenNhanVien , '%') 
AND (NgayLapHoaDon between startDate and endDate);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `baocaohoadonCount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `baocaohoadonCount`(IN mahoadon nvarchar(50), IN TenKhachhang nvarchar(50),IN TenNhanVien nvarchar(50), IN startDate datetime, IN endDate datetime)
BEGIN
select count(hoadon.MaHoaDon)
from hoadon
inner join khachhang on khachhang.MaKhachHang  = hoadon.MaKhachHang
inner join nhanvien on nhanvien.MaNhanVien  = hoadon.MaNhanVien
where 
hoadon.MaHoaDon LIKE CONCAT('%', mahoadon , '%')
AND  khachhang.TenKhachHang LIKE CONCAT('%', TenKhachhang , '%')
AND  nhanvien.tennhanvien LIKE CONCAT('%', TenNhanVien , '%') 
AND (NgayLapHoaDon between startDate and endDate);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `baocaohoadonSum` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `baocaohoadonSum`(IN mahoadon nvarchar(50), IN TenKhachhang nvarchar(50),IN TenNhanVien nvarchar(50), IN startDate datetime, IN endDate datetime)
BEGIN
select sum(hoadon.Tongtien)
from hoadon
inner join khachhang on khachhang.MaKhachHang  = hoadon.MaKhachHang
inner join nhanvien on nhanvien.MaNhanVien  = hoadon.MaNhanVien
where 
hoadon.MaHoaDon LIKE CONCAT('%', mahoadon , '%')
AND  khachhang.TenKhachHang LIKE CONCAT('%', TenKhachhang , '%')
AND  nhanvien.tennhanvien LIKE CONCAT('%', TenNhanVien , '%') 
AND (NgayLapHoaDon between startDate and endDate);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `baocaophieunhap` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `baocaophieunhap`(IN maphieunhap nvarchar(50), IN Tennhaphanphoi nvarchar(50),IN TenNhanVien nvarchar(50), IN startDate datetime, IN endDate datetime)
BEGIN
select phieunhap.Maphieunhap, phieunhap.MaNhaPhanPhoi,nhaphanphoi.Tennhaphanphoi,phieunhap.NgayNhap,phieunhap.tongtien, nhanvien.TenNhanVien, phieunhap.ChuThich 
from phieunhap
inner join nhaphanphoi on nhaphanphoi.Manhaphanphoi  = phieunhap.Manhaphanphoi
inner join nhanvien on nhanvien.MaNhanVien  = phieunhap.MaNhanVien
where 
phieunhap.Maphieunhap LIKE CONCAT('%', maphieunhap , '%')
AND  nhaphanphoi.Tennhaphanphoi LIKE CONCAT('%', Tennhaphanphoi , '%')
AND  nhanvien.tennhanvien LIKE CONCAT('%', TenNhanVien , '%') 
AND (phieunhap.NgayNhap between startDate and endDate);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `baocaophieunhapCount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `baocaophieunhapCount`(IN maphieunhap nvarchar(50), IN Tennhaphanphoi nvarchar(50),IN TenNhanVien nvarchar(50), IN startDate datetime, IN endDate datetime)
BEGIN
select Count(phieunhap.MaPhieuNhap)
from phieunhap
inner join nhaphanphoi on nhaphanphoi.Manhaphanphoi  = phieunhap.Manhaphanphoi
inner join nhanvien on nhanvien.MaNhanVien  = phieunhap.MaNhanVien
where 
phieunhap.Maphieunhap LIKE CONCAT('%', maphieunhap , '%')
AND  nhaphanphoi.Tennhaphanphoi LIKE CONCAT('%', Tennhaphanphoi , '%')
AND  nhanvien.tennhanvien LIKE CONCAT('%', TenNhanVien , '%') 
AND (phieunhap.NgayNhap between startDate and endDate);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `baocaophieunhapSum` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `baocaophieunhapSum`(IN maphieunhap nvarchar(50), IN Tennhaphanphoi nvarchar(50),IN TenNhanVien nvarchar(50), IN startDate datetime, IN endDate datetime)
BEGIN
select Sum(phieunhap.tongtien)
from phieunhap
inner join nhaphanphoi on nhaphanphoi.Manhaphanphoi  = phieunhap.Manhaphanphoi
inner join nhanvien on nhanvien.MaNhanVien  = phieunhap.MaNhanVien
where 
phieunhap.Maphieunhap LIKE CONCAT('%', maphieunhap , '%')
AND  nhaphanphoi.Tennhaphanphoi LIKE CONCAT('%', Tennhaphanphoi , '%')
AND  nhanvien.tennhanvien LIKE CONCAT('%', TenNhanVien , '%') 
AND (phieunhap.NgayNhap between startDate and endDate);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `doanhthutheothang` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `doanhthutheothang`(IN yearNumber INT)
BEGIN
SELECT month(hd.NgayLapHoaDon) Thang , sum(hd.TongTien) Tong
FROM hoadon hd 
WHERE year(hd.NgayLapHoaDon)=yearNumber
GROUP BY month(hd.NgayLapHoaDon) ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `doanhthutheothangNam` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `doanhthutheothangNam`()
BEGIN
SELECT month(hd.NgayLapHoaDon) Thang,year(hd.NgayLapHoaDon) as Nam , sum(hd.TongTien) Tong
FROM hoadon hd 
WHERE year(hd.NgayLapHoaDon)= year(now())
GROUP BY month(hd.NgayLapHoaDon) 
order by NgayLapHoaDon;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `doanhthutheothoigian` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `doanhthutheothoigian`(IN startDate datetime, IN endDate datetime)
BEGIN
SELECT *
FROM hoadon hd 
WHERE hd.NgayLapHoaDon between startDate and endDate
order by NgayLapHoaDon ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `tongsanphamdabantrongkhoangthoigian` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tongsanphamdabantrongkhoangthoigian`(IN startDate datetime, IN endDate datetime)
BEGIN
SELECT sp.MaSanPham, sp.TenSanPham, sum(cthd.Soluong) as Soluong, sum(cthd.TongTien) as TongTien
FROM chitiethoadon cthd
inner join sanpham sp on sp.MaSanPham = cthd.MaSanPham
inner join hoadon hd on hd.MaHoaDon = cthd.MaHoaDon
WHERE hd.NgayLapHoaDon between startDate and endDate
group by sp.MaSanPham
order by Soluong desc;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `tongsanphamkhongbantrongkhoangthoigian` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tongsanphamkhongbantrongkhoangthoigian`(IN startDate datetime, IN endDate datetime)
BEGIN
SELECT S.MaSanPham, s.TenSanPham, s.gianhap, s.tonkho,(s.gianhap * s.tonkho) as TongTien
FROM sanpham S
WHERE S.MaSanPham NOT IN(SELECT C.MaSanPham 
FROM chitiethoadon C INNER JOIN hoadon hd
ON C.MaHoaDon = hd.MaHoaDon
WHERE hd.NgayLapHoaDon between startDate and endDate)
group by S.MaSanPham
order by TongTien desc;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `tongsanphamtrongthang` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tongsanphamtrongthang`()
BEGIN
select SUM(cthd.SoLuong) as TongSoLuong from chitiethoadon cthd
inner join hoadon hd on hd.MaHoaDon =  cthd.MaHoaDon
where month(hd.NgayLapHoaDon) =month(now()) AND year(hd.NgayLapHoaDon) =year(now()) ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `tongsohoadontrongthang` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tongsohoadontrongthang`()
BEGIN
select count(hd.MaHoaDon) AS SoLuong from hoadon hd
where month(hd.NgayLapHoaDon) =month(now()) AND year(hd.NgayLapHoaDon) =year(now()) ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `tongsophieunhaptrongthang` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tongsophieunhaptrongthang`()
BEGIN
select count(hd.MaPhieuNhap) AS SoLuong from phieunhap hd
where month(hd.NgayNhap) =month(now()) AND year(hd.NgayNhap) =year(now()) ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `tongtiennhapkhotheothoigian` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tongtiennhapkhotheothoigian`(IN startDate datetime, IN endDate datetime)
BEGIN
SELECT sum(pn.TongTien) as TongTien
FROM phieunhap pn 
WHERE pn.NgayNhap between startDate and endDate;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `tongtientrongthang` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tongtientrongthang`()
BEGIN
select SUM(hd.TongTien) as TongTien from hoadon hd where month(hd.NgayLapHoaDon) =month(now()) AND year(hd.NgayLapHoaDon) =year(now()) ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-14 10:27:08
