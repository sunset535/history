create table muser(
id varchar(36) primary key,
name varchar(36),
age number(8),
address varchar(36)
);

DROP TABLE IF EXISTS `HistoryTag`;
CREATE TABLE `HistoryTag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `lastupdatetime` datetime NOT NULL,
  PRIMARY KEY (`id`,`lastupdatetime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

