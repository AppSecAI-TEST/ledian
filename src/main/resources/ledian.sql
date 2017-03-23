/*
Navicat MySQL Data Transfer

Source Server         : ledian
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : ledian

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-03-23 23:01:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `food`
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '����',
  `optimistic` bigint(10) DEFAULT '0' COMMENT '�ֹ���',
  `status` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '��¼״̬',
  `food_no` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'ʳƷ���',
  `food_name` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'ʳƷ����',
  `food_status` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'ʳƷ״̬',
  `price` double(10,2) DEFAULT NULL COMMENT '�۸�',
  `type` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'ʳƷ����',
  `shop_no` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '���̱��',
  `create_time` datetime DEFAULT NULL COMMENT '����ʱ��',
  `remark` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '��ע',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES ('1', '0', null, null, '������˿', null, null, null, null, null, null);
INSERT INTO `food` VALUES ('2', '0', null, null, '��������', null, null, null, null, null, null);
INSERT INTO `food` VALUES ('3', '0', null, null, '���Ŷ���', null, null, null, null, null, null);
