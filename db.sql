create database if not exists atm;

use atm;

drop table if exists customers;

CREATE TABLE `customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(64) DEFAULT NULL,
  `first_name` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `card_number` varchar(64) DEFAULT NULL,
  `pin` 		int(11) DEFAULT NULL,
  `account_type` varchar(64) DEFAULT NULL,
  `active`     int(11) DEFAULT NULL,
  `balance` DECIMAL(10,2) DEFAULT NULL,
  `data` DATETIME DEFAULT CURRENT_TIMESTAMP,


  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `customers` (`id`,`last_name`,`first_name`,`email`, `card_number`, `pin`,`account_type`,`active`,`balance`) VALUES (1,'Ajayi','Abdulsalam','aajayi2@student.gsu.edu', 1433908, 1234, 'Checking',1,1000.99);
INSERT INTO `customers` (`id`,`last_name`,`first_name`,`email`, `card_number`, `pin`,`account_type`,`active`,`balance`) VALUES (2,'Musk','elon','Elon@tesla.com', 0123908, 5678, 'Savings',1,700000.02);

