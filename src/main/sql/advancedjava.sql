/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 100131
Source Host           : localhost:3306
Source Database       : advancedjava

Target Server Type    : MYSQL
Target Server Version : 100131
File Encoding         : 65001

Date: 2018-07-21 00:41:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `price` decimal(10,1) NOT NULL,
  `quantity` int(11) NOT NULL,
  `description` text COLLATE utf8_unicode_ci NOT NULL,
  `featured` tinyint(1) NOT NULL,
  `dataCreated` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', 'laptop 1', '2.0', '5', 'description for laptom 1', '1', '2018-03-19');
INSERT INTO `product` VALUES ('2', 'laptop 2', '12.0', '7', 'description for laptop 2', '0', '2018-03-21');
INSERT INTO `product` VALUES ('4', 'computer 1', '4.0', '6', 'desk cp 1', '1', '2018-03-23');
INSERT INTO `product` VALUES ('5', 'computer 2', '4.4', '6', 'desk cp 2', '1', '2018-04-24');
INSERT INTO `product` VALUES ('6', 'computer 3', '6.1', '4', 'desk cp 3', '0', '2018-05-25');
INSERT INTO `product` VALUES ('7', 'tivi1', '3.1', '2', 'desk tv 1', '1', '2018-06-26');
INSERT INTO `product` VALUES ('8', 'tivi2', '32.0', '8', 'desk tv 2', '0', '2018-07-27');
SET FOREIGN_KEY_CHECKS=1;
