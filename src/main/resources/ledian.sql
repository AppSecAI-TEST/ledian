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
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `optimistic` bigint(10) DEFAULT '0' COMMENT '乐观锁',
  `status` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '记录状态',
  `food_no` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '食品编号',
  `food_name` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '食品名称',
  `food_status` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '食品状态',
  `price` double(10,2) DEFAULT NULL COMMENT '价格',
  `type` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '食品类型',
  `shop_no` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '店铺编号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

create table operator
(
   id                   bigint(20)  not null auto_increment comment '主键id',
   optimistic           bigint(10)  comment '乐观锁',
   status               varchar(50)  comment '状态',
   type                 varchar(50)  comment '操作员类型',
   create_time          datetime  comment '创建时间',
   shop_no              varchar(50)  comment '店铺号',
   phone_no             varchar(20)  comment '手机号',
   password             varchar(50)  comment '密码',
   public_password      varchar(50)  comment '密码',
   remark               varchar(200)  comment '备注',
   primary key (id)
)  ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


create table shop
(
   id                   bigint(20)  not null auto_increment comment '主键id',
   optimistic           bigint(10)  comment '乐观锁',
   status               varchar(50)  comment '状态',
   type                 varchar(50)  comment '操作员类型',
   create_time          datetime  comment '创建时间',
   shop_no              varchar(50)  comment '店铺号',
   phone_no             varchar(20)  comment '手机号',
   shop_name            varchar(100)  comment '店铺名称',
   size                 bigint(10)  comment '规模',
   province             varchar(100) comment '省份',
   city                 varchar(100) comment '城市',
   address              varchar(500) comment '地址',
   remark               varchar(200)  comment '备注',
   primary key (id)
)  ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


/*==============================================================*/
/* Table: "order"                                               */
/*==============================================================*/
create table order
(
   id                   bigint(20)  not null auto_increment comment '主键id',
   optimistic           bigint(10)  comment '乐观锁',
   status               varchar(50)  comment '状态',
   create_time          datetime  comment '创建时间',
   shop_no              varchar(50)  comment '店铺号',
   total_amount         double(10,2),
   order_no             varchar(50),
   remark               varchar(200)  comment '备注',
   primary key (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;



/*==============================================================*/
/* Table: order_detail                                          */
/*==============================================================*/
create table order_detail
(
   id                   bigint(20)  not null auto_increment comment '主键id',
   optimistic           bigint(10)  comment '乐观锁',
   status               varchar(50)  comment '状态',
   create_time          datetime  comment '创建时间',
   shop_no              varchar(50)  comment '店铺号',
   amount               double(10,2),
   order_no             varchar(50),
   remark               varchar(200)  comment '备注',
   food_no              varchar(30),
   food_name            varchar(200),
   food_type            varchar(200),
   primary key (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;



-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES ('1', '0', null, null, '鱼香肉丝', null, null, null, null, null, null);
INSERT INTO `food` VALUES ('2', '0', null, null, '宫保鸡丁', null, null, null, null, null, null);
INSERT INTO `food` VALUES ('3', '0', null, null, '麻婆豆腐', null, null, null, null, null, null);
