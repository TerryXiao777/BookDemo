CREATE TABLE `t_category` (
  `category_id` int NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `category_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '分类名称',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10005 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='图书分类表';

CREATE TABLE `t_book` (
  `book_id` int NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `book_name` varchar(100) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '图书名称',
  `author_name` varchar(62) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '图书作者',
  `price` double(12,2) DEFAULT '0.00' COMMENT '图书价格',
  `category_id` int NOT NULL COMMENT '分类ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` char(1) COLLATE utf8mb4_general_ci DEFAULT '0' COMMENT '是否上架(1:上架，0:下架)',
  `book_url` varchar(255) COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '图书主图地址',
  `book_address` varchar(255) COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '真实地址',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='图书表';