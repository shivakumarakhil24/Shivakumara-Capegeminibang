/*
SQLyog Trial v13.1.5  (64 bit)
MySQL - 5.5.27 : Database - store_management
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`store_management` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `store_management`;

/*Table structure for table `order_details` */

DROP TABLE IF EXISTS `order_details`;

CREATE TABLE `order_details` (
  `location` varchar(255) DEFAULT NULL,
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `productId` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `userId` varchar(255) DEFAULT NULL,
  `referenceId` int(11) NOT NULL,
  PRIMARY KEY (`referenceId`),
  KEY `orderId` (`orderId`),
  KEY `fk1` (`productId`),
  KEY `fk2` (`userId`),
  CONSTRAINT `fk1` FOREIGN KEY (`productId`) REFERENCES `product_details` (`productId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk2` FOREIGN KEY (`userId`) REFERENCES `users_info` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `order_details` */

insert  into `order_details`(`location`,`orderId`,`productId`,`quantity`,`userId`,`referenceId`) values 
('cghj',1,300,456,'akhil',1111);

/*Table structure for table `product_details` */

DROP TABLE IF EXISTS `product_details`;

CREATE TABLE `product_details` (
  `productId` int(11) NOT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `stocks` int(11) DEFAULT NULL,
  `warranty` varchar(255) DEFAULT NULL,
  `imageUrl` varbinary(255) DEFAULT NULL,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product_details` */

insert  into `product_details`(`productId`,`brand`,`price`,`stocks`,`warranty`,`imageUrl`) values 
(300,'Adidas',2000,356,'3yr','https://cdn.pixabay.com/photo/2016/03/27/19/31/fashion-1283863__340.jpg'),
(400,'Shibne',2818,78,'3yr','https://cdn.pixabay.com/photo/2015/09/02/12/28/fashion-918446__340.jpg'),
(455,'Pan America',3000,100,'2yr','https://cdn.pixabay.com/photo/2016/01/19/14/45/person-1148941__340.jpg');

/*Table structure for table `storeunit` */

DROP TABLE IF EXISTS `storeunit`;

CREATE TABLE `storeunit` (
  `storeId` int(11) NOT NULL,
  `no_of_items` int(11) DEFAULT NULL,
  `productId` int(11) DEFAULT NULL,
  `minimumStockMantain` int(11) DEFAULT NULL,
  PRIMARY KEY (`storeId`),
  KEY `productId` (`productId`),
  CONSTRAINT `storeunit_ibfk_1` FOREIGN KEY (`productId`) REFERENCES `product_details` (`productId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storeunit` */

insert  into `storeunit`(`storeId`,`no_of_items`,`productId`,`minimumStockMantain`) values 
(4,300,300,100),
(35,49,400,50);

/*Table structure for table `users_info` */

DROP TABLE IF EXISTS `users_info`;

CREATE TABLE `users_info` (
  `userId` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users_info` */

insert  into `users_info`(`userId`,`email`,`location`,`password`,`role`,`userName`) values 
('akhil','akhil@gmail.com','Mandya','asdf','admin','AkhilKumar'),
('Krishna123','iskon@gmail','Blore','121212','dealer','KrishnaMurari'),
('kumar','kumar@gmail','Mysore','qwerty','dealer','Kumaravarma'),
('praveen0987','prv@gmail.com','Mandya','qwerty','dealer','Praveen'),
('Ramesh123','gsgsgs','jayanagar','asdfggfd','Manufacture','ramesh'),
('ranga','ranga@gmail','qwertyu','asdfghjk','manufacture','Ranga'),
('viki','viji@gmail.com','ramnagar','1234','manufacture','viki'),
('yuy89','ambani@gmail.com','Mandya','qwertyu','manufacture','Shruthi');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
