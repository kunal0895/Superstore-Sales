CREATE SCHEMA `orderdetails` ;

USE `orderdetails`;

/*Table structure for table `orderdb` */

DROP TABLE IF EXISTS `orderdb`;

CREATE TABLE `orderdb` (
  `rowid` int(11) NOT NULL PRIMARY KEY,
  `orderid` int(11) NOT NULL,
  `orderdate` date,
  `orderpriority` varchar(30) NOT NULL,
  `orderquantity` int(10) NOT NULL,
  `sales` float,
  `discount` float,
  `shipmode` varchar(30),
  `profit` int(10),
  `unitprice` float NOT NULL,
  `shippingcost` float NOT NULL,
  `customername` varchar(30) NOT NULL,
  `province` varchar(30) NOT NULL,
  `region` varchar(30) NOT NULL,
  `customersegment` varchar(30) NOT NULL,
  `creditcardno` varchar(16) NOT NULL,
  `productcategory` varchar(30) NOT NULL,
  `productsubcategory` varchar(100) NOT NULL,
  `productname` varchar(300) NOT NULL,
  `productcontainer` varchar(30) NOT NULL,
  `productbasemargin` float NOT NULL default '0',
  `shipdate` date
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `returnedorders` */

DROP TABLE IF EXISTS `returnedorders`;

CREATE TABLE `returnedorders` (
`orderid` int(5),
`status` varchar(10)

) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `regionalmanagers` */

DROP TABLE IF EXISTS `regionalmanagers`;

CREATE TABLE `regionalmanagers` (
`region` varchar(10),
`manager` varchar(20)

) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci