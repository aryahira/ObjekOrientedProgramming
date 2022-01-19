-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 24, 2021 at 02:13 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ibik_applibrary`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(11) NOT NULL,
  `NIK` varchar(10) NOT NULL,
  `Fullname` varchar(50) NOT NULL,
  `PlaceBirth` varchar(20) NOT NULL,
  `Birthdate` date NOT NULL,
  `Gender` enum('m','f') NOT NULL,
  `Address` text NOT NULL,
  `Email` varchar(25) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `CreatedAt` timestamp NOT NULL DEFAULT current_timestamp(),
  `CreatedBy` varchar(20) NOT NULL,
  `UpdateAt` timestamp NOT NULL DEFAULT current_timestamp(),
  `UpdateBy` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `NIK`, `Fullname`, `PlaceBirth`, `Birthdate`, `Gender`, `Address`, `Email`, `Password`, `CreatedAt`, `CreatedBy`, `UpdateAt`, `UpdateBy`) VALUES
(1, '202310034', 'Raihan Dwi Pratama', 'Wonosobo', '2002-08-03', 'm', 'Jalan Kapten Yusuf Desa Kotabatu rt 03/ rw 11', 'raihanp0308@gmail.com', '030802', '2021-12-20 06:00:22', 'Raihan Dwi Pratama', '2021-12-20 06:00:22', 'Raihan Dwi Pratama');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `NIK` (`NIK`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
