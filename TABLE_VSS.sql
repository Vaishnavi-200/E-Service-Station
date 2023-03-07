-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Sep 24, 2022 at 08:26 AM
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
-- Table structure for table `TABLE_VSS`
--

CREATE TABLE `TABLE_VSS` (
  `stationid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `stationname` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mno` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `portdetails` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `servicecharge` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `latitude` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `longitude` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `TABLE_VSS`
--

INSERT INTO `TABLE_VSS` (`stationid`, `stationname`, `city`, `address`, `mno`, `portdetails`, `servicecharge`, `latitude`, `longitude`) VALUES
('1111', 'RVS station', 'Mumbai', 'Jpnagar', '9988776655', '4', '12000', '15.67788667', '74.998766'),
('122', 'ABC', 'pune', 'RK nagar', '9632428553', '85', '60000', '15.25587', '75.1254'),
('111', 'RET service station', 'Gadag', 'Vidhynagar', '9988776655', '5', '12000', '15.98876', '74.946578');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
