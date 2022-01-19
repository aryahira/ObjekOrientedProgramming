-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 19, 2022 at 06:31 AM
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
-- Database: `berobat3`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc1` ()  BEGIN
	SELECT 
    	t.TransactionId, 
    	FORMAT(Multiply(m.MedicinePrice, t.Quantity),0) AS TotalSales
    FROM transactiondetail t, msmedicine m
    WHERE m.MedicineId = t.MedicineId;
END$$

--
-- Functions
--
CREATE DEFINER=`root`@`localhost` FUNCTION `Multiply` (`number1` INT, `number2` DOUBLE) RETURNS DOUBLE BEGIN
DECLARE perkalian DOUBLE;
SELECT (number1 * number2) INTO perkalian;
RETURN perkalian;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `logdoctor`
--

CREATE TABLE `logdoctor` (
  `id_log` int(11) NOT NULL,
  `DoctorID` varchar(5) NOT NULL,
  `nomorLama` varchar(16) NOT NULL,
  `nomorBaru` varchar(16) NOT NULL,
  `waktu` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `logdoctor`
--

INSERT INTO `logdoctor` (`id_log`, `DoctorID`, `nomorLama`, `nomorBaru`, `waktu`) VALUES
(1, 'D001', '01928369462', '081229382938', '2021-12-15 03:05:02'),
(2, 'D002', '012384646487', '12903120938103', '2021-12-15 03:07:35'),
(3, 'D002', '12903120938103', '12903120938103', '2022-01-05 01:17:34'),
(4, 'D001', '081229382938', '081229382938', '2022-01-05 01:18:10'),
(5, 'D003', '09857489349', '09857489349', '2022-01-05 01:18:22'),
(6, 'D004', '09485476484', '09485476484', '2022-01-05 01:18:29'),
(7, 'D005', '09284748922', '09284748922', '2022-01-05 01:28:42'),
(8, 'D005', '09284748922', '09284748922', '2022-01-05 01:28:47'),
(9, 'D005', '09284748922', '09284748922', '2022-01-05 01:28:57'),
(16, 'D002', '12903120938103', '12903120938103', '2022-01-05 01:38:42');

-- --------------------------------------------------------

--
-- Table structure for table `logpatient`
--

CREATE TABLE `logpatient` (
  `id_log` int(11) NOT NULL,
  `PatientID` varchar(4) NOT NULL,
  `alamatLama` text NOT NULL,
  `alamatBaru` text NOT NULL,
  `waktu` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `logpatient`
--

INSERT INTO `logpatient` (`id_log`, `PatientID`, `alamatLama`, `alamatBaru`, `waktu`) VALUES
(1, 'P001', 'Jl. Kenangan', 'Jl. Pattimura', '2021-12-15 02:51:13');

-- --------------------------------------------------------

--
-- Table structure for table `medicinetype`
--

CREATE TABLE `medicinetype` (
  `MedicineTypeID` tinyint(2) NOT NULL,
  `MedicineTypeName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicinetype`
--

INSERT INTO `medicinetype` (`MedicineTypeID`, `MedicineTypeName`) VALUES
(1, 'kaplet'),
(2, 'kapsul'),
(3, 'tablet'),
(4, 'oles'),
(5, 'suppositoria'),
(6, 'tetes'),
(7, 'inhaler'),
(8, 'suntik');

-- --------------------------------------------------------

--
-- Table structure for table `msdoctor`
--

CREATE TABLE `msdoctor` (
  `DoctorID` varchar(5) NOT NULL,
  `DoctorName` varchar(50) NOT NULL,
  `DoctorAddress` text NOT NULL,
  `DoctorPhone` varchar(16) NOT NULL,
  `DoctorBirthDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `msdoctor`
--

INSERT INTO `msdoctor` (`DoctorID`, `DoctorName`, `DoctorAddress`, `DoctorPhone`, `DoctorBirthDate`) VALUES
('D001', 'Dr. Andi Cahyono', 'Jalan simpang dua', '081229382938', '1992-09-08'),
('D002', 'Dr. Tri Oktavian', 'Jalan perempatan', '12903120938103', '1997-02-10'),
('D003', 'Dr. Trimufti', 'Jalan masa depan', '09857489349', '1994-10-13'),
('D004', 'Dr. Deva', 'Jalan masa lalu', '09485476484', '1993-03-01'),
('D005', 'Dr. Melisa Pratiwi', 'Jalan Taman Bunga', '09284748922', '1991-08-11');

-- --------------------------------------------------------

--
-- Table structure for table `msmedicine`
--

CREATE TABLE `msmedicine` (
  `MedicineID` varchar(5) NOT NULL,
  `MedicineTypeID` tinyint(2) NOT NULL,
  `MedicineName` varchar(30) NOT NULL,
  `MedicinePrice` double NOT NULL,
  `MedicineStock` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `msmedicine`
--

INSERT INTO `msmedicine` (`MedicineID`, `MedicineTypeID`, `MedicineName`, `MedicinePrice`, `MedicineStock`) VALUES
('APTX', 2, 'Silver Bullet', 4869000, 17),
('M001', 1, 'Abacavir', 3000000, 99),
('M002', 3, 'Acetylcysteine', 10000, 100),
('M003', 2, 'Acetylcysteine', 10000, 100),
('M004', 3, 'Imboost', 20000, 200),
('M005', 8, 'Peginterferon Alfa-2b', 1500000, 90);

-- --------------------------------------------------------

--
-- Table structure for table `mspatient`
--

CREATE TABLE `mspatient` (
  `PatientID` varchar(4) NOT NULL,
  `PatientName` varchar(50) NOT NULL,
  `PatientAddress` text NOT NULL,
  `PatientPhone` varchar(16) NOT NULL,
  `PatientBirthDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mspatient`
--

INSERT INTO `mspatient` (`PatientID`, `PatientName`, `PatientAddress`, `PatientPhone`, `PatientBirthDate`) VALUES
('P001', 'Udyn', 'Jl. Pattimura', '09123124489', '2000-08-10'),
('P002', 'Chris', 'Jl. Masa Lalu', '09876554567', '2001-02-16'),
('P003', 'Ananda Lintang', 'Jl. setapak', '09823476393', '1990-12-23'),
('P004', 'Ananda Waluyo', 'Jl. hidup', '09876091273', '1989-04-09');

-- --------------------------------------------------------

--
-- Table structure for table `transactiondetail`
--

CREATE TABLE `transactiondetail` (
  `TransactionID` int(11) NOT NULL,
  `MedicineId` varchar(5) NOT NULL,
  `Quantity` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transactiondetail`
--

INSERT INTO `transactiondetail` (`TransactionID`, `MedicineId`, `Quantity`) VALUES
(1, 'APTX', 2);

-- --------------------------------------------------------

--
-- Table structure for table `transactionheader`
--

CREATE TABLE `transactionheader` (
  `TransactionID` int(11) NOT NULL,
  `DoctorID` varchar(5) NOT NULL,
  `PatientID` varchar(4) NOT NULL,
  `TransactionDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transactionheader`
--

INSERT INTO `transactionheader` (`TransactionID`, `DoctorID`, `PatientID`, `TransactionDate`) VALUES
(1, 'D005', 'P001', '2021-11-10'),
(2, 'D002', 'P002', '2021-10-07'),
(3, 'D003', 'P004', '2021-11-23'),
(4, 'D004', 'P003', '2021-12-06');

-- --------------------------------------------------------

--
-- Stand-in structure for view `view1`
-- (See below for the actual view)
--
CREATE TABLE `view1` (
`MedicineID` varchar(5)
,`MedicineTypeID` tinyint(2)
,`MedicineName` varchar(30)
,`MedicinePrice` double
,`MedicineStock` int(4)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `view2`
-- (See below for the actual view)
--
CREATE TABLE `view2` (
`MedicineName` varchar(30)
,`MedicinePrice` double
,`MedicineStock` int(4)
,`Total` double
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `view3`
-- (See below for the actual view)
--
CREATE TABLE `view3` (
`TransactionDate` varchar(38)
,`DoctorName` varchar(50)
,`PatientName` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `view4`
-- (See below for the actual view)
--
CREATE TABLE `view4` (
`QueueCode` varchar(3)
,`PatientName` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `view5`
-- (See below for the actual view)
--
CREATE TABLE `view5` (
`DoctorName` varchar(50)
,`DoctorAddress` mediumtext
,`PatientName` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `view6`
-- (See below for the actual view)
--
CREATE TABLE `view6` (
`DoctorID` varchar(5)
,`DoctorName` varchar(50)
,`TransactionDate` date
);

-- --------------------------------------------------------

--
-- Structure for view `view1`
--
DROP TABLE IF EXISTS `view1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view1`  AS SELECT `msmedicine`.`MedicineID` AS `MedicineID`, `msmedicine`.`MedicineTypeID` AS `MedicineTypeID`, `msmedicine`.`MedicineName` AS `MedicineName`, `msmedicine`.`MedicinePrice` AS `MedicinePrice`, `msmedicine`.`MedicineStock` AS `MedicineStock` FROM `msmedicine` ;

-- --------------------------------------------------------

--
-- Structure for view `view2`
--
DROP TABLE IF EXISTS `view2`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view2`  AS SELECT `msmedicine`.`MedicineName` AS `MedicineName`, `msmedicine`.`MedicinePrice` AS `MedicinePrice`, `msmedicine`.`MedicineStock` AS `MedicineStock`, `msmedicine`.`MedicinePrice`* `msmedicine`.`MedicineStock` AS `Total` FROM `msmedicine` ;

-- --------------------------------------------------------

--
-- Structure for view `view3`
--
DROP TABLE IF EXISTS `view3`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view3`  AS SELECT date_format(`transactionheader`.`TransactionDate`,'%d %b %y') AS `TransactionDate`, `msdoctor`.`DoctorName` AS `DoctorName`, `mspatient`.`PatientName` AS `PatientName` FROM ((`transactionheader` join `msdoctor` on(`transactionheader`.`DoctorID` = `msdoctor`.`DoctorID`)) join `mspatient` on(`transactionheader`.`PatientID` = `mspatient`.`PatientID`)) WHERE `msdoctor`.`DoctorName` = 'Melisa Pratiwi' ;

-- --------------------------------------------------------

--
-- Structure for view `view4`
--
DROP TABLE IF EXISTS `view4`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view4`  AS SELECT right(`mspatient`.`PatientID`,3) AS `QueueCode`, `mspatient`.`PatientName` AS `PatientName` FROM `mspatient` WHERE right(`mspatient`.`PatientID`,1) MOD 2 = 0 ;

-- --------------------------------------------------------

--
-- Structure for view `view5`
--
DROP TABLE IF EXISTS `view5`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view5`  AS SELECT `msdoctor`.`DoctorName` AS `DoctorName`, replace(`msdoctor`.`DoctorAddress`,'Jalan ','Jl ') AS `DoctorAddress`, `mspatient`.`PatientName` AS `PatientName` FROM ((`transactionheader` join `msdoctor` on(`transactionheader`.`DoctorID` = `msdoctor`.`DoctorID`)) join `mspatient` on(`transactionheader`.`PatientID` = `mspatient`.`PatientID`)) WHERE `mspatient`.`PatientName` not like '% %' ;

-- --------------------------------------------------------

--
-- Structure for view `view6`
--
DROP TABLE IF EXISTS `view6`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view6`  AS SELECT DISTINCT `msdoctor`.`DoctorID` AS `DoctorID`, `msdoctor`.`DoctorName` AS `DoctorName`, max(`transactionheader`.`TransactionDate`) AS `TransactionDate` FROM (`transactionheader` join `msdoctor` on(`transactionheader`.`DoctorID` = `msdoctor`.`DoctorID`)) WHERE weekday(`transactionheader`.`TransactionDate`) = 3 ORDER BY max(`transactionheader`.`TransactionDate`) ASC ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logdoctor`
--
ALTER TABLE `logdoctor`
  ADD PRIMARY KEY (`id_log`);

--
-- Indexes for table `logpatient`
--
ALTER TABLE `logpatient`
  ADD PRIMARY KEY (`id_log`);

--
-- Indexes for table `medicinetype`
--
ALTER TABLE `medicinetype`
  ADD PRIMARY KEY (`MedicineTypeID`);

--
-- Indexes for table `msdoctor`
--
ALTER TABLE `msdoctor`
  ADD PRIMARY KEY (`DoctorID`);

--
-- Indexes for table `msmedicine`
--
ALTER TABLE `msmedicine`
  ADD PRIMARY KEY (`MedicineID`),
  ADD KEY `fk_med_type` (`MedicineTypeID`);

--
-- Indexes for table `mspatient`
--
ALTER TABLE `mspatient`
  ADD PRIMARY KEY (`PatientID`);

--
-- Indexes for table `transactiondetail`
--
ALTER TABLE `transactiondetail`
  ADD PRIMARY KEY (`TransactionID`,`MedicineId`),
  ADD KEY `fk_detail_med` (`MedicineId`);

--
-- Indexes for table `transactionheader`
--
ALTER TABLE `transactionheader`
  ADD PRIMARY KEY (`TransactionID`),
  ADD KEY `fk_trans_pat` (`PatientID`),
  ADD KEY `fk_trans_doc` (`DoctorID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logdoctor`
--
ALTER TABLE `logdoctor`
  MODIFY `id_log` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `logpatient`
--
ALTER TABLE `logpatient`
  MODIFY `id_log` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `transactionheader`
--
ALTER TABLE `transactionheader`
  MODIFY `TransactionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `msmedicine`
--
ALTER TABLE `msmedicine`
  ADD CONSTRAINT `fk_med_type` FOREIGN KEY (`MedicineTypeID`) REFERENCES `medicinetype` (`MedicineTypeID`);

--
-- Constraints for table `transactiondetail`
--
ALTER TABLE `transactiondetail`
  ADD CONSTRAINT `fk_detail_head` FOREIGN KEY (`TransactionID`) REFERENCES `transactionheader` (`TransactionID`),
  ADD CONSTRAINT `fk_detail_med` FOREIGN KEY (`MedicineId`) REFERENCES `msmedicine` (`MedicineID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
