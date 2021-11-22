-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2017 at 07:05 AM
-- Server version: 5.7.20-log
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `beautysalon`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `bookingID` char(4) NOT NULL,
  `bookingDate` date NOT NULL,
  `bookingTime` time NOT NULL,
  `duration` decimal(3,0) DEFAULT NULL,
  `staffID` char(5) DEFAULT NULL,
  `serviceID` char(5) DEFAULT NULL,
  `custID` char(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`bookingID`, `bookingDate`, `bookingTime`, `duration`, `staffID`, `serviceID`, `custID`) VALUES
('B001', '2017-12-08', '10:00:00', '30', 'ST002', 'SE001', 'C001'),
('B002', '2017-12-08', '10:00:00', '10', 'ST003', 'SE002', 'C002'),
('B003', '2017-12-08', '10:30:00', '10', 'ST003', 'SE002', 'C003'),
('B004', '2017-12-08', '11:00:00', '60', 'ST001', 'SE006', 'C004'),
('B005', '2017-12-08', '13:00:00', '30', 'ST001', 'SE005', 'C005'),
('B006', '2017-12-09', '10:00:00', '30', 'ST002', 'SE008', 'C007'),
('B007', '2017-12-09', '11:00:00', '10', 'ST003', 'SE002', 'C005'),
('B008', '2017-12-09', '11:10:00', '10', 'ST003', 'SE003', 'C005'),
('B009', '2017-12-09', '12:00:00', '60', 'ST001', 'SE006', 'C006'),
('B010', '2017-12-09', '14:00:00', '60', 'ST002', 'SE007', 'C001'),
('B011', '2017-12-09', '14:00:00', '30', 'ST003', 'SE004', 'C002');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `custID` char(4) NOT NULL,
  `fName` varchar(20) NOT NULL,
  `lName` varchar(20) NOT NULL,
  `custPhoneNb` decimal(8,0) DEFAULT NULL,
  `address` varchar(100) NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `staffId` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`custID`, `fName`, `lName`, `custPhoneNb`, `address`, `gender`, `staffId`) VALUES
('C000', 'Default', 'Staff', '0', 'Local,Address ', 'M', 'ST000'),
('C001', 'Rachelle', 'Rachid', '76794821', 'Amchit, Byblos', 'F', 'ST001'),
('C002', 'Gaelle', 'Abboud', '3207671', 'Mazraat yachouh', 'F', 'ST001'),
('C003', 'Maria', 'Hitti', '71321299', 'Dbayeh', 'F', 'ST002'),
('C004', 'Agapius', 'Bou ghosn', '76154529', 'Mtain, Mchikha', 'M', 'ST001'),
('C005', 'Marinelle', 'Attieh', '76441584', 'Nahr Ibrahim, Halat', 'F', 'ST001'),
('C006', 'Christelle', 'Saliba', '76063227', 'Dbayeh Beirut', 'F', 'ST002'),
('C007', 'Grace', 'Akiki', '71077482', 'Beat, Byblos', 'F', 'ST002');

-- --------------------------------------------------------

--
-- Table structure for table `order_data`
--

CREATE TABLE `order_data` (
  `orderID` char(4) NOT NULL,
  `orderDate` date NOT NULL,
  `orderTime` time NOT NULL,
  `custID` char(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `order_data`
--

INSERT INTO `order_data` (`orderID`, `orderDate`, `orderTime`, `custID`) VALUES
('O001', '2017-12-08', '10:40:00', 'C001'),
('O002', '2017-12-08', '10:50:00', 'C003'),
('O003', '2017-12-08', '13:50:00', 'C005'),
('O004', '2017-12-09', '11:00:00', 'C007'),
('O005', '2017-12-09', '13:51:00', 'C002');

-- --------------------------------------------------------

--
-- Table structure for table `order_details`
--

CREATE TABLE `order_details` (
  `orderID` char(4) NOT NULL,
  `prodID` char(4) NOT NULL,
  `qty` decimal(3,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `order_details`
--

INSERT INTO `order_details` (`orderID`, `prodID`, `qty`) VALUES
('O002', 'P002', '1'),
('O001', 'P003', '4'),
('O005', 'P007', '2'),
('O005', 'P008', '2'),
('O003', 'P011', '1'),
('O004', 'P014', '1');

-- --------------------------------------------------------

--
-- Table structure for table `product_list`
--

CREATE TABLE `product_list` (
  `prodID` char(4) NOT NULL,
  `prodName` varchar(100) DEFAULT NULL,
  `prodType` varchar(30) DEFAULT NULL,
  `prodPrice` decimal(5,2) DEFAULT NULL,
  `suppID` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product_list`
--

INSERT INTO `product_list` (`prodID`, `prodName`, `prodType`, `prodPrice`, `suppID`) VALUES
('P001', 'Beaute Sun Creme', 'Creme', '20.00', 'SP001'),
('P002', 'Acne Face Wash ', 'Cleanser', '30.00', 'SP001'),
('P003', 'China Glaze Blue', 'Nail Polish', '10.00', 'SP004'),
('P004', 'China Glaze Red', 'Nail Polish', '10.00', 'SP004'),
('P005', 'China Glaze Black', 'Nail Polish', '10.00', 'SP004'),
('P006', 'Samoa White', 'Nail Polish', '5.00', 'SP005'),
('P007', 'Samoa Pink', 'Nail Polish', '5.00', 'SP005'),
('P008', 'Maybeline Waterproof Mascara', 'Mascara', '25.00', 'SP002'),
('P009', 'Super Stay Full Coverage Foundation', 'Foundation', '30.00', 'SP002'),
('P010', 'Lasting Drama Light Eyeliner Pencil', 'Eye liner', '10.00', 'SP002'),
('P011', 'MAC Cremesheen Lipstick - Hot Gossip', 'Lipstick', '18.00', 'SP003'),
('P012', 'MAC Pro Longwear Long-Last Lips', 'Lipstick', '29.00', 'SP003'),
('P013', 'MAC Cremesheen Glass - Loud & Lovely', 'Lipstick', '19.00', 'SP003'),
('P014', 'Silk-épil epilators', 'Epilator', '120.00', 'SP006');

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE `service` (
  `serviceID` char(5) NOT NULL,
  `serviceType` varchar(30) NOT NULL,
  `servicePrice` decimal(6,0) NOT NULL,
  `staffID` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `service`
--

INSERT INTO `service` (`serviceID`, `serviceType`, `servicePrice`, `staffID`) VALUES
('SE000', 'Default', '0', 'ST000'),
('SE001', 'Make up', '40', 'ST002'),
('SE002', 'Manicure', '10', 'ST003'),
('SE003', 'Pedicure', '10', 'ST003'),
('SE004', 'Waxing', '20', 'ST003'),
('SE005', 'Facial Massage', '30', 'ST001'),
('SE006', 'Body Massage', '60', 'ST001'),
('SE007', 'Laser epilation', '100', 'ST002'),
('SE008', 'Electric epilation', '150', 'ST002');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staffID` char(5) NOT NULL,
  `fName` varchar(20) NOT NULL,
  `lName` varchar(20) NOT NULL,
  `staffPhoneNb` decimal(8,0) DEFAULT NULL,
  `address` varchar(100) NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `salary` decimal(7,2) NOT NULL DEFAULT '800.00',
  `position` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staffID`, `fName`, `lName`, `staffPhoneNb`, `address`, `gender`, `salary`, `position`, `password`) VALUES
('ST000', 'Mia', 'Antoun', '76164636', 'Beirut, Achrafieh, Sioufi', 'F', '2000.00', 'manager', 'Boss'),
('ST001', 'Joseph', 'Attieh', '76441582', 'Nahr Ibrahim, Halat', 'M', '1800.00', 'Staff', 'joseph123'),
('ST002', 'Clara', 'Akiki', '71840870', 'Blat, Byblos', 'F', '1800.00', 'Staff', 'clara123'),
('ST003', 'Lea', 'Sawaya', '3158827', 'Ghosta', 'F', '1200.00', 'Staff', 'lea123');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `suppID` char(5) NOT NULL,
  `companyName` varchar(20) NOT NULL,
  `companyPhoneNb` decimal(8,0) DEFAULT NULL,
  `companyAddress` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`suppID`, `companyName`, `companyPhoneNb`, `companyAddress`) VALUES
('SP000', 'Default Supplier', '0', 'Address'),
('SP001', 'La beaute', '9447789', 'Byblos'),
('SP002', 'Maybelline', '9230580', 'Kaslik'),
('SP003', 'MAC cosmetics', '4400400', 'Dbayeh'),
('SP004', 'China Glaze', '1405032', 'Achrafieh'),
('SP005', 'Samoa', '1550550', 'Verdun'),
('SP006', 'Braun Glaze', '1400600', 'Forn el chebbak');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`bookingID`),
  ADD KEY `staffID` (`staffID`),
  ADD KEY `serviceID` (`serviceID`),
  ADD KEY `custID` (`custID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`custID`),
  ADD KEY `staffId` (`staffId`);

--
-- Indexes for table `order_data`
--
ALTER TABLE `order_data`
  ADD PRIMARY KEY (`orderID`),
  ADD KEY `custID` (`custID`);

--
-- Indexes for table `order_details`
--
ALTER TABLE `order_details`
  ADD PRIMARY KEY (`prodID`,`orderID`),
  ADD KEY `orderID` (`orderID`);

--
-- Indexes for table `product_list`
--
ALTER TABLE `product_list`
  ADD PRIMARY KEY (`prodID`),
  ADD KEY `suppID` (`suppID`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`serviceID`),
  ADD KEY `staffID` (`staffID`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staffID`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`suppID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`staffID`) REFERENCES `staff` (`staffID`) ON DELETE SET NULL ON UPDATE SET NULL,
  ADD CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`serviceID`) REFERENCES `service` (`serviceID`) ON DELETE SET NULL ON UPDATE SET NULL,
  ADD CONSTRAINT `appointment_ibfk_3` FOREIGN KEY (`custID`) REFERENCES `customer` (`custID`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`staffId`) REFERENCES `staff` (`staffID`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Constraints for table `order_data`
--
ALTER TABLE `order_data`
  ADD CONSTRAINT `order_data_ibfk_1` FOREIGN KEY (`custID`) REFERENCES `customer` (`custID`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Constraints for table `order_details`
--
ALTER TABLE `order_details`
  ADD CONSTRAINT `order_details_ibfk_1` FOREIGN KEY (`prodID`) REFERENCES `product_list` (`prodID`),
  ADD CONSTRAINT `order_details_ibfk_2` FOREIGN KEY (`orderID`) REFERENCES `order_data` (`orderID`);

--
-- Constraints for table `product_list`
--
ALTER TABLE `product_list`
  ADD CONSTRAINT `product_list_ibfk_1` FOREIGN KEY (`suppID`) REFERENCES `supplier` (`suppID`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Constraints for table `service`
--
ALTER TABLE `service`
  ADD CONSTRAINT `service_ibfk_1` FOREIGN KEY (`staffID`) REFERENCES `staff` (`staffID`) ON DELETE SET NULL ON UPDATE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
