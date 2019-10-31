# Host: localhost  (Version 5.7.9-log)
# Date: 2018-07-29 11:41:35
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "food"
#

DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `msg` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Data for table "food"
#

INSERT INTO `food` VALUES (1,'鱼香肉','15元','好吃','2018年07月29日 10:05:41'),(2,'宫保鸡丁','15元','食堂阿姨推荐','2018年06月11日 00:59:31'),(3,'地三鲜','10元','好吃不上火','2018年06月11日 01:02:37');
