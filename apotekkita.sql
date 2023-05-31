-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2019 at 05:36 AM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apotekkita`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `User_Info` ()  SELECT s.address, s.phone_number FROM tbl_user s WHERE s.username = 'millashrn' ORDER BY s.address$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `User_Info_Parameters` (IN `uid` VARCHAR(5), OUT `nama` VARCHAR(45), OUT `adds` VARCHAR(50))  SELECT username, address INTO nama, adds FROM tbl_user WHERE id_user = uid$$

DELIMITER ;

--
-- Table structure for table `tbl_obat`
--

CREATE TABLE `tbl_obat` (
  `kode_obat` varchar(5) NOT NULL,
  `nama_obat` varchar(25) DEFAULT NULL,
  `jenis` varchar(10) DEFAULT NULL,
  `kategori` varchar(15) DEFAULT NULL,
  `dosis` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id_user` varchar(5) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `phone_number` varchar(12) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `address` text,
  `role` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id_user`, `username`, `password`, `sex`, `dob`, `phone_number`, `email`, `address`, `role`) VALUES
('00001', 'millashrn', '12345678', 'F', '2000-01-03', '081398517934', 'milleniashrn@gmail.com', 'Bekasi', 'admin'),
('00002', 'rizkirmd', 'rizki111', 'M', '2000-02-01', '081394215678', 'rizkirmd@gmail.com', 'Depok', 'user'),
('00003', 'efnalplk', 'paliko222', 'M', '2000-03-04', '082156905431', 'efnalpaliko@gmail.com', 'Bogor', 'user'),
('00004', 'zidanealf', 'zidane444', 'M', '2000-01-08', '087836709542', 'zidanealf@gmail.com', 'Depok Baru', 'user'),
('00005', 'anandaadn', 'nanda555', 'F', '2000-02-03', '089612760894', 'anandaadnilia@gmail.com', 'Jakarta', 'user'),
('00006', 'hafizhsgr', 'sogar666', 'M', '1999-12-19', '081267809342', 'hafizhsogar@gmail.com', 'Bekasi', 'user'),
('00007', 'andhikaptr', 'andhika777', 'M', '2000-04-09', '081234567091', 'andhikaptr@gmail.com', 'Bogor', 'user'),
('00008', 'joshuatheo', 'joshu888', 'M', '1999-11-21', '087725670895', 'joshuatheo@gmail.com', 'Cibubur', 'user'),
('00009', 'laodesltn', 'laode999', 'M', '1998-10-25', '087890631238', 'laodesultan@gmail.com', 'Depok', 'user'),
('00010', 'addinadh', 'addin010', 'M', '2000-05-14', '081233325667', 'addinadhilani@gmail.com', 'Cijantung', 'user'),
('00011', 'thorikahmd', 'thorik011', 'M', '2000-06-08', '085697845708', 'ahmadthorik@gmail.com', 'Cipete', 'user'),
('00012', 'calvinhrb', 'calvin012', 'M', '1999-10-29', '087790996723', 'calvinharbelt@gmail.com', 'Jakarta', 'user'),
('00013', 'dimasarsy', 'dimas013', 'M', '2000-06-17', '081233456678', 'dimasarsyad@gmail.com', 'Bandung', 'user'),
('00014', 'farrellmrs', 'farrell014', 'M', '2000-07-24', '085699784432', 'farrellmarston@gmail.com', 'Serpong', 'user'),
('00015', 'izzaturmd', 'izza015', 'M', '1998-11-26', '081255678440', 'izzaturamadhan@gmail.com', 'Cimanggis', 'user'),
('00017', 'rifkiihza', 'rifki017', 'M', '2000-03-22', '081289723678', 'ihzaalrifki@gmail.com', 'Rawamangun', 'user');

--
-- Indexes for table `tbl_obat`
--
ALTER TABLE `tbl_obat`
  ADD PRIMARY KEY (`kode_obat`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
