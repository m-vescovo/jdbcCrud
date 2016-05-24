
DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30)   NOT NULL,
  `last_name` varchar(50)   NOT NULL,
  `phone_number` varchar(15)   NOT NULL,
  `email_address` varchar(255)   NOT NULL,
  `city` varchar(80)   NOT NULL,
  `state` varchar(2)   NOT NULL,
  `date_registered` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 ;
INSERT INTO `customer` VALUES (1,'Casey','Scarborough','7706543210','caseyscarborough@gmail.com','Atlanta','GA','2013-05-01'),
(2,'Kristine','Paker','6417827169','kristine@paker.com','Union','IA','2013-05-14'),
(3,'George','Tukis','2299244251','asdf','asdf','TX','2012-02-20'),
(4,'Marcie','Shulz','2105246711','marcie@shulz.com','Washoe','NV','2013-01-12'),
(5,'Marshall','Hutch','7242257064','asdf','Washington','PA','2011-07-18'),
(6,'Don','asdf','qw','asdf','Mercer','NJ','2013-04-09'),
(7,'Beverly','Cambel','9072723953','beverly@cambel.com','Anchorage','AK','2012-12-17'),
(8,'Don','Barker','asdf','asdf','asdf','NE','2013-05-02'),
(9,'asdf','Seid','5033718219','roger@seid.com','','FL','2012-11-12'),
(10,'asdf','asdf','7324428514','allyson@gillispie.com','Trenton','NJ','2012-09-29');
