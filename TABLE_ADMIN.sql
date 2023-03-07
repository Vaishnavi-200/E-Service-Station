-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Sep 24, 2022 at 08:27 AM
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
-- Table structure for table `TABLE_ADMIN`
--

CREATE TABLE `TABLE_ADMIN` (
  `StationId` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `StationName` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `City` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MobileNumber` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Address` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Password` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `TABLE_ADMIN`
--

INSERT INTO `TABLE_ADMIN` (`StationId`, `StationName`, `City`, `MobileNumber`, `Address`, `Password`) VALUES
('120', 'Volvo', 'Bangalore', '9741977759', 'Vidyanagar', 'volvo123'),
('121', 'Cabana', 'Pune', '9632428553', 'Raj nagar', 'cabana123'),
('122', 'Sahara', 'Gadag', '6360775210', 'Tej nagar', 'sahara123'),
('123', 'Gopher', 'Hubli', '9632031834', 'Vivekanand nagar', 'gopher123'),
('124', 'Gazmosa', 'Mumbai', '9740424566', 'Rk nagar', 'gazmosa123'),
('122', 'RVV', 'Gadag', '6360775210', 'Main road', '12345'),
('134', 'RVS station', 'Gadag', '6360775210', 'Main road Gadag', '12345'),
('122', 'yyy', 'pune', '9874566666', 'jk nagar', '123'),
('124', 'RMX', 'gadag', '9741977759', 'jay nagar', '123'),
('122', 'Ram service station', 'bangalore', '6360775210', 'jay nagar', '123'),
('112', 'Krish ', 'pune', '9741977759', 'vidyanagar', '123'),
('122', 'ABC', 'Delhi', '6360775210', 'Jay nagar', '123'),
('12243', 'SSS', 'Hubli', '6360775210', 'Main road', '1122');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
