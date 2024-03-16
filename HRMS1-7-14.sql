-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 01, 2014 at 02:59 PM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hrms`
--

-- --------------------------------------------------------

--
-- Table structure for table `compdetails`
--

CREATE TABLE IF NOT EXISTS `compdetails` (
  `emid` varchar(10) NOT NULL DEFAULT '',
  `salra` decimal(10,0) DEFAULT NULL,
  `anin` decimal(10,0) DEFAULT NULL,
  `tax` decimal(10,0) DEFAULT NULL,
  `loan` decimal(10,0) DEFAULT NULL,
  `fac` varchar(10) DEFAULT NULL,
  `insu` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`emid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `compdetails`
--


-- --------------------------------------------------------

--
-- Table structure for table `c_pass`
--

CREATE TABLE IF NOT EXISTS `c_pass` (
  `EMP_ID` varchar(10) NOT NULL DEFAULT '',
  `CURR_ PASSWORD` varchar(10) DEFAULT NULL,
  `NEW_PASSWORD` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`EMP_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `c_pass`
--


-- --------------------------------------------------------

--
-- Table structure for table `depdetails`
--

CREATE TABLE IF NOT EXISTS `depdetails` (
  `dcode` int(5) NOT NULL,
  `dname` varchar(10) NOT NULL DEFAULT 'null',
  PRIMARY KEY (`dcode`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 CHECKSUM=1;

--
-- Dumping data for table `depdetails`
--

INSERT INTO `depdetails` (`dcode`, `dname`) VALUES
(1, 'HRMS');

-- --------------------------------------------------------

--
-- Table structure for table `desdetails`
--

CREATE TABLE IF NOT EXISTS `desdetails` (
  `descode` decimal(5,0) NOT NULL DEFAULT '0',
  `desname` varchar(10) DEFAULT NULL,
  `pscale` varchar(10) DEFAULT NULL,
  `grade` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`descode`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `desdetails`
--

INSERT INTO `desdetails` (`descode`, `desname`, `pscale`, `grade`) VALUES
('1', 'dfxdh', '12000', 'B');

-- --------------------------------------------------------

--
-- Table structure for table `empdetails`
--

CREATE TABLE IF NOT EXISTS `empdetails` (
  `empid` decimal(10,0) NOT NULL DEFAULT '1200',
  `fname` varchar(10) DEFAULT NULL,
  `lname` varchar(20) DEFAULT NULL,
  `addr` varchar(25) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `age` decimal(10,0) DEFAULT NULL,
  `doj` date DEFAULT NULL,
  `dept` int(15) DEFAULT NULL,
  `section` varchar(2) NOT NULL,
  `qual` varchar(20) DEFAULT NULL,
  `phone` varchar(10) NOT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `empdetails`
--

INSERT INTO `empdetails` (`empid`, `fname`, `lname`, `addr`, `gender`, `dob`, `age`, `doj`, `dept`, `section`, `qual`, `phone`) VALUES
('1', 'fg', 'feh', 'dh', 'Male', '1980-12-16', '34', '2014-06-05', 1, 'S1', 'uiu6yo', '9875648456');

-- --------------------------------------------------------

--
-- Table structure for table `expdetails`
--

CREATE TABLE IF NOT EXISTS `expdetails` (
  `empid` varchar(10) NOT NULL DEFAULT '',
  `empnam` varchar(10) DEFAULT NULL,
  `com` varchar(10) DEFAULT NULL,
  `pla` varchar(10) DEFAULT NULL,
  `des` varchar(10) DEFAULT NULL,
  `pf` varchar(10) DEFAULT NULL,
  `pt` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expdetails`
--

INSERT INTO `expdetails` (`empid`, `empnam`, `com`, `pla`, `des`, `pf`, `pt`) VALUES
('1', 'fg', 'INFOSYS', 'fghfg', 'dfxdh', '1994-02', '1996-06');

-- --------------------------------------------------------

--
-- Table structure for table `famdetails`
--

CREATE TABLE IF NOT EXISTS `famdetails` (
  `empid` varchar(10) NOT NULL DEFAULT '',
  `empname` varchar(10) DEFAULT NULL,
  `relname` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `dob` varchar(10) DEFAULT NULL,
  `marstatus` varchar(10) DEFAULT NULL,
  `occu` varchar(10) DEFAULT NULL,
  `depen` varchar(10) DEFAULT NULL,
  `relation` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`empid`),
  KEY `empid` (`empid`),
  KEY `empid_2` (`empid`),
  KEY `empid_3` (`empid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `famdetails`
--


-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `uname` varchar(10) NOT NULL,
  `pass` varchar(10) NOT NULL,
  PRIMARY KEY (`uname`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`uname`, `pass`) VALUES
('admin', 'admin'),
('1', '');

-- --------------------------------------------------------

--
-- Table structure for table `placedetails`
--

CREATE TABLE IF NOT EXISTS `placedetails` (
  `placeid` int(11) NOT NULL,
  `empid` varchar(10) NOT NULL DEFAULT '',
  `status` varchar(10) DEFAULT NULL,
  `depcode` decimal(10,0) DEFAULT NULL,
  `loca` varchar(10) DEFAULT NULL,
  `sid` varchar(10) DEFAULT NULL,
  `com` varchar(10) DEFAULT NULL,
  `ctrlunit` varchar(10) DEFAULT NULL,
  `doj` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `placedetails`
--


-- --------------------------------------------------------

--
-- Table structure for table `qualdetails`
--

CREATE TABLE IF NOT EXISTS `qualdetails` (
  `empid` varchar(10) NOT NULL DEFAULT '',
  `qual` varchar(10) DEFAULT NULL,
  `boun` varchar(10) DEFAULT NULL,
  `inst` varchar(10) DEFAULT NULL,
  `perstudy` varchar(10) DEFAULT NULL,
  `specarea` varchar(10) DEFAULT NULL,
  `percent` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `qualdetails`
--


-- --------------------------------------------------------

--
-- Table structure for table `salarydetails`
--

CREATE TABLE IF NOT EXISTS `salarydetails` (
  `empid` varchar(10) NOT NULL DEFAULT '',
  `empnam` varchar(10) DEFAULT NULL,
  `descode` decimal(10,0) DEFAULT NULL,
  `desnam` varchar(10) DEFAULT NULL,
  `baspay` varchar(10) DEFAULT NULL,
  `da` varchar(10) DEFAULT NULL,
  `hra` varchar(10) DEFAULT NULL,
  `ta` varchar(10) DEFAULT NULL,
  `pf` varchar(10) DEFAULT NULL,
  `netsal` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salarydetails`
--


-- --------------------------------------------------------

--
-- Table structure for table `section`
--

CREATE TABLE IF NOT EXISTS `section` (
  `scode` varchar(5) NOT NULL,
  `depcode` int(5) NOT NULL,
  `sname` varchar(10) NOT NULL,
  PRIMARY KEY (`scode`,`depcode`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `section`
--

INSERT INTO `section` (`scode`, `depcode`, `sname`) VALUES
('S1', 1, 'EMPLOYEE');

-- --------------------------------------------------------

--
-- Table structure for table `skilldetails`
--

CREATE TABLE IF NOT EXISTS `skilldetails` (
  `emid` varchar(10) NOT NULL DEFAULT '',
  `dep` varchar(10) DEFAULT NULL,
  `ph` varchar(10) DEFAULT NULL,
  `ch` varchar(10) DEFAULT NULL,
  `ex` varchar(10) DEFAULT NULL,
  `sk` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`emid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `skilldetails`
--


-- --------------------------------------------------------

--
-- Table structure for table `traindetails`
--

CREATE TABLE IF NOT EXISTS `traindetails` (
  `empid` varchar(10) NOT NULL DEFAULT '',
  `trainp` varchar(10) DEFAULT NULL,
  `depar` varchar(10) DEFAULT NULL,
  `skill` varchar(10) DEFAULT NULL,
  `startdate` varchar(10) DEFAULT NULL,
  `edate` varchar(10) DEFAULT NULL,
  `result` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `traindetails`
--


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
