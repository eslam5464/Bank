/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  King Cobra
 * Created: Dec 17, 2017
 */
CREATE TABLE "tb" (
    "id" int(32) NOT NULL AUTO_INCREMENT,
    `name` varchar(50) DEFAULT NULL,
    `age` int(8) DEFAULT NULL,
    `ss` int(32) DEFAULT NULL,
    `balance_id` int(8) DEFAULT NULL,
    `balance` int(50) DEFAULT NULL
  PRIMARY KEY (`id`),
  UNIQUE KEY `product_code` (`code`)
)

INSERT INTO `tb` (`id`, `name`, `age`, `ss`, `balance_id` , `balance`) VALUES
(1, 'ahmed', 12, 1241515, 5462, 5000),
(2, 'mohamed', 13, 15125125, 8452, 3000),
(3, 'mahmoud', 14, 345346346 , 1214, 1000);

-- CREATE DATABASE IF NOT EXISTS `bank_data`
-- USE `bank_data`;
-- 
-- CREATE TABLE IF NOT EXISTS `courses` (
--     `id` varchar(50) DEFAULT NULL,
--     `name` varchar(50) DEFAULT NULL,
--     `age` varchar(50) DEFAULT NULL,
--     `ss` varchar(50) DEFAULT NULL,
--     `balance_id` varchar(50) DEFAULT NULL,
--     `balance` int(50) DEFAULT NULL
-- ) ENGINE=InnoDB DEFAULT CHARSET=latin1;


