/*
 Navicat Premium Data Transfer

 Source Server         : 腾讯云
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Schema         : seata-order

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 20/08/2020 15:55:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for deposit
-- ----------------------------
DROP TABLE IF EXISTS `deposit`;
CREATE TABLE `deposit`  (
  `item_order` bigint(20) NOT NULL,
  `user_id` int(11) NOT NULL,
  `goods_id` int(11) NOT NULL,
  `price` double(10, 2) NULL DEFAULT NULL,
  `nick_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`item_order`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of deposit
-- ----------------------------
INSERT INTO `deposit` VALUES (613633388422889472, 3, 2, 1430.00, '周舟', '广东省深圳市福田区', '1', '2020-08-20 15:20:00');

-- ----------------------------
-- Table structure for undo_log
-- ----------------------------
DROP TABLE IF EXISTS `undo_log`;
CREATE TABLE `undo_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `context` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime(0) NOT NULL,
  `log_modified` datetime(0) NOT NULL,
  `ext` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `ux_undo_log`(`xid`, `branch_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
