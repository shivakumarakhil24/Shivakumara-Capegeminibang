/*
SQLyog Trial v13.1.5  (64 bit)
MySQL - 5.5.27 : Database - cg_uas_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cg_uas_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cg_uas_db`;

/*Table structure for table `application` */

DROP TABLE IF EXISTS `application`;

CREATE TABLE `application` (
  `application_id` int(20) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `hQualification` varchar(20) DEFAULT NULL,
  `marks_obtained` double DEFAULT NULL,
  `goals` varchar(20) DEFAULT NULL,
  `email_id` varchar(20) DEFAULT NULL,
  `scheduled_program_id` int(10) DEFAULT NULL,
  `status` varchar(20) DEFAULT 'applied',
  `date_of_interview` date DEFAULT '2019-12-20',
  PRIMARY KEY (`application_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `application` */

insert  into `application`(`application_id`,`full_name`,`dob`,`hQualification`,`marks_obtained`,`goals`,`email_id`,`scheduled_program_id`,`status`,`date_of_interview`) values 
(10,'saddam','2019-12-04','BE',99,'ZXCFVB','FYHGKJ@gmail.com',107,'accept','2019-12-11'),
(11,'amulya','2019-12-11','be',66,'dfgh','sdf@fgghj.xoj',106,'accept','2019-12-20'),
(12,'asdf','2019-12-28','btch',78,'fghj','dfgh@fgh.com',67,'reject','2019-12-20'),
(13,'df','2019-12-19','fgh',77,'ggh','dfgh@gj.com',77,'reject','2019-12-20');

/*Table structure for table `participant` */

DROP TABLE IF EXISTS `participant`;

CREATE TABLE `participant` (
  `roll_no` int(10) DEFAULT NULL,
  `email_id` varchar(20) DEFAULT NULL,
  `application_id` int(10) DEFAULT NULL,
  `scheduled_program_id` int(10) DEFAULT NULL,
  `sheduled_program_id` int(11) DEFAULT NULL,
  KEY `application_id` (`application_id`),
  CONSTRAINT `application_id` FOREIGN KEY (`application_id`) REFERENCES `application` (`application_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `participant` */

/*Table structure for table `programs_offered` */

DROP TABLE IF EXISTS `programs_offered`;

CREATE TABLE `programs_offered` (
  `programName` varchar(20) DEFAULT NULL,
  `description` varchar(20) DEFAULT NULL,
  `applicant_eligibility` double DEFAULT NULL,
  `duration` int(10) DEFAULT NULL,
  `degree_certificate_offered` varchar(20) DEFAULT NULL,
  `images` varbinary(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `programs_offered` */

insert  into `programs_offered`(`programName`,`description`,`applicant_eligibility`,`duration`,`degree_certificate_offered`,`images`) values 
('BE','CSE',75,4,'yes','https://cdn.pixabay.com/photo/2019/11/20/01/06/swimming-pool-4638912__340.jpg'),
('MTECH','CSE',65,2,'yes','https://cdn.pixabay.com/photo/2016/07/30/09/56/wheat-1556698__340.jpg'),
('BTECH','ECE',60,4,'YES','https://cdn.pixabay.com/photo/2019/11/15/05/23/dog-4627679__340.png');

/*Table structure for table `programs_scheduled` */

DROP TABLE IF EXISTS `programs_scheduled`;

CREATE TABLE `programs_scheduled` (
  `scheduled_program_id` int(20) NOT NULL,
  `programName` varchar(20) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `session_per_week` int(10) DEFAULT NULL,
  PRIMARY KEY (`scheduled_program_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `programs_scheduled` */

insert  into `programs_scheduled`(`scheduled_program_id`,`programName`,`location`,`start_date`,`end_date`,`session_per_week`) values 
(0,NULL,'bagfgs',NULL,NULL,0);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `login_id` int(10) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`login_id`,`password`,`role`) values 
(1,'mac','mac'),
(123,'abc','admin');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
