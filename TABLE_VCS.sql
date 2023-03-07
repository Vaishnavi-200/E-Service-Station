-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Sep 24, 2022 at 08:21 AM
-- Server version: 10.5.16-MariaDB
-- PHP Version: 7.3.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id19512314_library`
--

-- --------------------------------------------------------

--
-- Table structure for table `TABLE_VCS`
--

CREATE TABLE `TABLE_VCS` (
  `stationid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `stationname` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mno` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `portdetails` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chargingcharge` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `latitude` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `longitude` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `TABLE_VCS`
--

INSERT INTO `TABLE_VCS` (`stationid`, `stationname`, `city`, `address`, `mno`, `portdetails`, `chargingcharge`, `latitude`, `longitude`) VALUES
('123', 'SRY station', 'Delhi', 'Jay nagar', '6360775210', '7', '13000', '15.6675556', '73.08877766'),
('147', 'XYZ', 'bangalore', 'vidyanagar', '9632031834', '78', '96322', '15.2147', '74.1254'),
('342', 'VST charge station', 'De', '', '', '', '', '', ''),
('321', 'Rxt charge station', 'Delhi', 'Jp nagar', '9686057088', '3', '3000', '15.654343', '74.765445');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
