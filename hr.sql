/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.5.15 : Database - d_hr
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`d_hr` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `d_hr`;

/*Table structure for table `t_bmxxb` */

DROP TABLE IF EXISTS `t_bmxxb`;

CREATE TABLE `t_bmxxb` (
  `bmh` int(11) NOT NULL AUTO_INCREMENT,
  `mc` varchar(50) DEFAULT NULL,
  `bz` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`bmh`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_bmxxb` */

insert  into `t_bmxxb`(`bmh`,`mc`,`bz`) values (1,'办公司','日常工作'),(2,'人事部','人事招聘'),(3,NULL,NULL);

/*Table structure for table `t_jbgzb` */

DROP TABLE IF EXISTS `t_jbgzb`;

CREATE TABLE `t_jbgzb` (
  `ygh` int(10) DEFAULT NULL,
  `jbgz` decimal(8,2) DEFAULT NULL,
  `bz` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `t_jbgzb` */

/*Table structure for table `t_jcxxb` */

DROP TABLE IF EXISTS `t_jcxxb`;

CREATE TABLE `t_jcxxb` (
  `ygh` int(10) NOT NULL AUTO_INCREMENT,
  `xm` varchar(20) DEFAULT NULL,
  `jclb` varchar(50) DEFAULT NULL,
  `fjgz` decimal(8,2) DEFAULT NULL,
  `jcrq` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`ygh`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_jcxxb` */

insert  into `t_jcxxb`(`ygh`,`xm`,`jclb`,`fjgz`,`jcrq`) values (1,'aqi','大功','500.00','20140401'),(2,'xm','小功','300.00','20140401'),(3,'张三','小过','-300.00','20140401'),(4,'李四','大过','-500.00','20140401'),(5,'王五','大功','0.00',''),(8,'admin','大功','0.00',''),(9,'aaa',NULL,NULL,NULL);

/*Table structure for table `t_rzb` */

DROP TABLE IF EXISTS `t_rzb`;

CREATE TABLE `t_rzb` (
  `rzh` int(10) NOT NULL AUTO_INCREMENT,
  `ygh` int(10) NOT NULL,
  `rzlb` varchar(50) NOT NULL DEFAULT '',
  `czsj` datetime DEFAULT NULL,
  PRIMARY KEY (`rzh`)
) ENGINE=MyISAM AUTO_INCREMENT=878 DEFAULT CHARSET=utf8;

/*Data for the table `t_rzb` */

insert  into `t_rzb`(`rzh`,`ygh`,`rzlb`,`czsj`) values (605,1,'J_L_登录成功','2014-06-01 22:59:35'),(606,1,'JSP_人事管理','2014-06-01 22:59:49'),(607,1,'JSP_人事管理','2014-06-01 22:59:49'),(608,1,'J_L_登录成功','2014-06-01 22:59:59'),(609,1,'J_L_登录成功','2014-05-06 23:01:00'),(610,1,'J_L_登录成功','2014-05-06 23:01:03'),(611,1,'J_L_登录成功','2014-05-06 23:01:06'),(612,1,'J_L_登录成功','2014-05-06 23:01:08'),(613,1,'J_L_登录成功','2014-05-06 23:01:11'),(614,1,'J_L_登录成功','2014-05-06 23:01:14'),(615,1,'J_L_登录成功','2014-05-06 23:01:16'),(616,1,'J_L_登录成功','2014-06-01 23:11:28'),(617,1,'JSP_奖惩管理','2014-06-01 23:11:31'),(618,1,'JSP_奖惩管理','2014-06-01 23:11:33'),(619,1,'JSP_工资管理','2014-06-01 23:11:36'),(620,1,'JSP_工资管理','2014-06-01 23:11:39'),(621,1,'J_L_登录成功','2014-06-01 23:11:53'),(622,1,'J_L_登录成功','2014-06-01 23:19:55'),(623,1,'JSP_人事管理','2014-06-01 23:20:44'),(624,1,'JSP_人事管理','2014-06-01 23:20:44'),(625,1,'JSP_人事管理','2014-06-01 23:20:49'),(626,1,'JSP_人事管理','2014-06-01 23:20:51'),(627,1,'JSP_人事管理','2014-06-01 23:21:19'),(628,1,'JSP_奖惩管理','2014-06-01 23:21:23'),(629,1,'JSP_奖惩管理','2014-06-01 23:21:24'),(630,1,'JSP_工资管理','2014-06-01 23:22:10'),(631,1,'JSP_工资管理','2014-06-01 23:22:11'),(632,1,'JSP_工资管理','2014-06-01 23:22:13'),(633,1,'JSP_工资管理','2014-06-01 23:24:11'),(634,1,'JSP_工资管理','2014-06-01 23:46:58'),(635,1,'J_L_登录成功','2014-06-01 23:47:06'),(636,1,'JSP_工资管理','2014-06-01 23:47:10'),(637,1,'JSP_工资管理','2014-06-01 23:47:12'),(638,1,'JSP_人事管理','2014-06-01 23:47:27'),(639,1,'JSP_人事管理','2014-06-01 23:47:27'),(640,1,'JSP_工资管理','2014-06-01 23:47:29'),(641,1,'JSP_奖惩管理','2014-06-01 23:48:06'),(642,1,'JSP_奖惩管理','2014-06-01 23:48:09'),(643,1,'JSP_奖惩管理','2014-06-01 23:48:48'),(644,1,'JSP_奖惩管理','2014-06-01 23:48:50'),(645,1,'JSP_人事管理','2014-06-01 23:52:08'),(646,1,'JSP_人事管理','2014-06-01 23:52:12'),(647,1,'JSP_人事管理','2014-06-01 23:52:23'),(648,1,'JSP_奖惩管理','2014-06-01 23:52:30'),(649,1,'JSP_奖惩管理','2014-06-01 23:52:32'),(650,1,'JSP_奖惩管理','2014-06-01 23:52:46'),(651,1,'JSP_人事管理','2014-06-01 23:53:02'),(652,1,'JSP_工资管理','2014-04-01 23:55:14'),(653,1,'JSP_工资管理','2014-04-01 23:55:16'),(654,1,'JSP_工资管理','2014-04-01 23:55:17'),(655,1,'J_L_登录成功','2014-04-01 23:55:20'),(656,2,'J_L_登录成功','2014-04-01 23:55:29'),(657,2,'JSP_工资管理','2014-04-01 23:55:35'),(658,2,'JSP_奖惩管理','2014-04-01 23:55:42'),(659,2,'JSP_人事管理','2014-04-01 23:55:45'),(660,2,'JSP_工资管理','2014-04-01 23:55:47'),(661,2,'JSP_工资管理','2014-04-01 23:55:48'),(662,2,'JSP_人事管理','2014-04-01 23:55:54'),(663,1,'J_L_登录成功','2014-04-01 23:56:04'),(664,1,'J_L_登录成功','2014-04-01 23:56:08'),(665,1,'J_L_登录成功','2014-04-01 23:56:11'),(666,1,'J_L_登录成功','2014-04-01 23:56:13'),(667,1,'J_L_登录成功','2014-03-01 23:56:29'),(668,1,'J_L_登录成功','2014-03-01 23:56:32'),(669,1,'J_L_登录成功','2014-03-01 23:56:35'),(670,1,'J_L_登录成功','2014-03-01 23:56:39'),(671,1,'J_L_登录成功','2014-06-01 23:57:25'),(672,1,'JSP_奖惩管理','2014-06-01 23:59:37'),(673,1,'JSP_奖惩管理','2014-06-02 00:00:43'),(674,1,'JSP_奖惩管理','2014-06-02 00:00:44'),(675,1,'JSP_奖惩管理','2014-06-02 00:00:51'),(676,1,'JSP_奖惩管理','2014-06-02 00:00:52'),(677,1,'J_L_登录成功','2014-06-02 16:36:37'),(678,1,'JSP_工资管理','2014-06-02 16:36:41'),(679,1,'J_L_登录成功','2014-06-03 08:08:17'),(680,1,'JSP_人事管理','2014-06-03 08:08:53'),(681,1,'JSP_人事管理','2014-06-03 08:15:10'),(682,1,'JSP_人事管理','2014-06-03 08:15:16'),(683,1,'JSP_人事管理','2014-06-03 08:15:20'),(684,1,'JSP_人事管理','2014-06-03 08:15:25'),(685,1,'JSP_人事管理','2014-06-03 08:15:31'),(686,1,'JSP_人事管理','2014-06-03 08:15:31'),(687,1,'JSP_人事管理','2014-06-03 08:15:34'),(688,1,'JSP_人事管理','2014-06-03 08:15:44'),(689,1,'JSP_人事管理','2014-06-03 08:17:03'),(690,1,'JSP_人事管理','2014-06-03 08:17:05'),(691,1,'JSP_人事管理','2014-06-03 08:18:41'),(692,1,'JSP_人事管理','2014-06-03 08:18:41'),(693,1,'JSP_人事管理','2014-06-03 08:18:44'),(694,1,'JSP_奖惩管理','2014-06-03 08:19:01'),(695,1,'JSP_工资管理','2014-06-03 08:19:28'),(696,1,'JSP_工资管理','2014-06-03 08:19:31'),(697,1,'JSP_工资管理','2014-06-03 08:19:33'),(698,1,'JSP_人事管理','2014-06-03 08:19:37'),(699,1,'JSP_人事管理','2014-06-03 08:19:47'),(700,1,'JSP_人事管理','2014-06-03 08:19:48'),(701,1,'JSP_人事管理','2014-06-03 08:21:56'),(702,1,'JSP_人事管理','2014-06-03 08:22:52'),(703,1,'JSP_人事管理','2014-06-03 08:24:16'),(704,1,'J_L_登录成功','2014-06-03 08:26:12'),(705,1,'JSP_人事管理','2014-06-03 08:26:15'),(706,1,'JSP_人事管理','2014-06-03 08:26:17'),(707,1,'JSP_人事管理','2014-06-03 08:26:22'),(708,1,'JSP_人事管理','2014-06-03 08:27:31'),(709,1,'JSP_人事管理','2014-06-03 08:27:31'),(710,1,'JSP_人事管理','2014-06-03 08:27:34'),(711,1,'JSP_人事管理','2014-06-03 08:27:43'),(712,1,'JSP_人事管理','2014-06-03 08:28:56'),(713,1,'JSP_人事管理','2014-06-03 08:28:58'),(714,1,'JSP_人事管理','2014-06-03 08:29:06'),(715,1,'JSP_人事管理','2014-06-03 08:29:06'),(716,1,'JSP_人事管理','2014-06-03 08:29:08'),(717,1,'JSP_人事管理','2014-06-03 08:29:16'),(718,1,'JSP_人事管理','2014-06-03 08:29:18'),(719,1,'JSP_人事管理','2014-06-03 08:29:25'),(720,1,'JSP_人事管理','2014-06-03 08:29:27'),(721,1,'JSP_人事管理','2014-06-03 08:32:46'),(722,1,'JSP_人事管理','2014-06-03 08:32:46'),(723,1,'JSP_人事管理','2014-06-03 08:32:52'),(724,1,'JSP_人事管理','2014-06-03 08:33:08'),(725,1,'JSP_人事管理','2014-06-03 08:33:11'),(726,1,'JSP_人事管理','2014-06-03 08:33:11'),(727,1,'JSP_工资管理','2014-06-03 08:33:25'),(728,1,'JSP_工资管理','2014-06-03 08:34:35'),(729,1,'J_L_登录成功','2014-06-03 08:37:45'),(730,1,'JSP_人事管理','2014-06-03 08:37:53'),(731,1,'JSP_人事管理','2014-06-03 08:37:53'),(732,1,'JSP_人事管理','2014-06-03 08:38:34'),(733,1,'JSP_人事管理','2014-06-03 08:38:37'),(734,1,'JSP_人事管理','2014-06-03 08:38:37'),(735,1,'JSP_工资管理','2014-06-03 08:38:39'),(736,1,'JSP_人事管理','2014-06-03 09:03:16'),(737,1,'JSP_人事管理','2014-06-03 09:03:18'),(738,1,'JSP_人事管理','2014-06-03 09:04:51'),(739,1,'JSP_人事管理','2014-06-03 09:04:58'),(740,1,'JSP_人事管理','2014-06-03 09:05:02'),(741,1,'J_L_登录成功','2014-06-03 14:00:25'),(742,1,'JSP_人事管理','2014-06-03 14:00:28'),(743,1,'JSP_人事管理','2014-06-03 14:00:56'),(744,1,'JSP_人事管理','2014-06-03 14:01:01'),(745,1,'JSP_人事管理','2014-06-03 14:05:53'),(746,1,'JSP_人事管理','2014-06-03 14:05:53'),(747,1,'JSP_人事管理','2014-06-03 14:05:57'),(748,1,'JSP_人事管理','2014-06-03 14:06:05'),(749,8,'J_L_登录成功','2014-06-03 14:06:22'),(750,1,'J_L_登录成功','2014-06-03 14:06:31'),(751,1,'JSP_人事管理','2014-06-03 14:23:30'),(752,1,'JSP_人事管理','2014-06-03 14:23:35'),(753,1,'JSP_奖惩管理','2014-06-03 14:32:02'),(754,1,'JSP_奖惩管理','2014-06-03 14:32:15'),(755,1,'JSP_奖惩管理','2014-06-03 14:32:17'),(756,1,'JSP_奖惩管理','2014-06-03 14:32:19'),(757,1,'JSP_人事管理','2014-06-03 14:32:33'),(758,1,'JSP_人事管理','2014-06-03 14:32:36'),(759,1,'JSP_人事管理','2014-06-03 14:32:45'),(760,1,'JSP_奖惩管理','2014-06-03 14:32:52'),(761,1,'JSP_奖惩管理','2014-06-03 14:32:59'),(762,1,'JSP_人事管理','2014-06-03 14:33:05'),(763,1,'JSP_奖惩管理','2014-06-03 14:33:14'),(764,1,'JSP_奖惩管理','2014-06-03 14:33:16'),(765,1,'JSP_奖惩管理','2014-06-03 14:33:16'),(766,1,'JSP_人事管理','2014-06-03 14:33:21'),(767,1,'JSP_人事管理','2014-06-03 14:33:24'),(768,1,'JSP_人事管理','2014-06-03 14:33:36'),(769,1,'JSP_人事管理','2014-06-03 14:33:37'),(770,1,'JSP_人事管理','2014-06-03 14:33:42'),(771,1,'JSP_奖惩管理','2014-06-03 14:33:46'),(772,1,'JSP_奖惩管理','2014-06-03 14:33:49'),(773,1,'JSP_奖惩管理','2014-06-03 14:34:00'),(774,1,'JSP_工资管理','2014-06-03 14:35:01'),(775,1,'JSP_工资管理','2014-06-03 14:35:04'),(776,1,'JSP_工资管理','2014-06-03 14:35:05'),(777,1,'JSP_工资管理','2014-06-03 14:36:47'),(778,8,'J_L_登录成功','2014-06-03 14:37:05'),(779,2,'J_L_登录成功','2014-06-03 14:37:18'),(780,2,'JSP_人事管理','2014-06-03 14:37:34'),(781,1,'J_L_登录成功','2014-06-03 14:38:20'),(782,1,'JSP_人事管理','2014-06-03 14:38:31'),(783,1,'JSP_人事管理','2014-06-03 14:41:03'),(784,1,'JSP_人事管理','2014-06-03 14:41:54'),(785,1,'JSP_奖惩管理','2014-06-03 14:47:02'),(786,1,'JSP_人事管理','2014-06-03 14:47:08'),(787,1,'JSP_人事管理','2014-06-03 14:49:33'),(788,1,'JSP_人事管理','2014-06-03 14:49:35'),(789,1,'JSP_人事管理','2014-06-03 14:49:40'),(790,1,'JSP_奖惩管理','2014-06-03 14:49:42'),(791,1,'JSP_工资管理','2014-06-03 14:49:51'),(792,1,'JSP_工资管理','2014-06-03 14:49:53'),(793,1,'J_L_登录成功','2014-06-03 14:59:00'),(794,1,'J_L_登录成功','2014-06-03 14:59:05'),(795,1,'J_L_登录成功','2014-06-03 14:59:26'),(796,1,'J_L_登录成功','2014-06-03 14:59:32'),(797,1,'J_L_登录成功','2014-06-03 15:01:41'),(798,1,'J_L_登录成功','2014-06-03 15:03:16'),(799,1,'J_L_登录成功','2014-06-03 15:04:02'),(800,1,'JSP_人事管理','2014-06-03 15:04:16'),(801,8,'J_L_登录成功','2014-06-03 15:04:37'),(802,8,'JSP_人事管理','2014-06-03 15:04:58'),(803,8,'JSP_人事管理','2014-06-03 15:05:12'),(804,8,'JSP_奖惩管理','2014-06-03 15:06:38'),(805,8,'JSP_奖惩管理','2014-06-03 15:06:53'),(806,1,'J_L_登录成功','2014-06-03 16:31:46'),(807,1,'J_L_登录成功','2014-06-03 16:32:34'),(808,1,'J_L_登录成功','2014-06-03 16:36:03'),(809,1,'J_L_登录成功','2014-06-03 16:47:08'),(810,2,'J_L_登录成功','2014-06-03 16:47:33'),(811,1,'J_L_登录成功','2014-06-03 16:47:46'),(812,1,'JSP_人事管理','2014-06-03 16:47:53'),(813,1,'JSP_人事管理','2014-06-03 16:48:01'),(814,1,'JSP_人事管理','2014-06-03 16:48:11'),(815,1,'JSP_人事管理','2014-06-03 16:48:16'),(816,1,'JSP_人事管理','2014-06-03 16:49:02'),(817,1,'JSP_人事管理','2014-06-03 16:49:02'),(818,1,'JSP_人事管理','2014-06-03 16:49:10'),(819,1,'JSP_人事管理','2014-06-03 16:49:13'),(820,1,'JSP_人事管理','2014-06-03 16:49:16'),(821,1,'JSP_人事管理','2014-06-03 16:49:42'),(822,1,'JSP_奖惩管理','2014-06-03 17:12:37'),(823,1,'JSP_奖惩管理','2014-06-03 17:12:41'),(824,1,'JSP_工资管理','2014-06-03 17:12:52'),(825,1,'J_L_登录成功','2014-06-03 18:16:09'),(826,1,'JSP_奖惩管理','2014-06-03 18:42:26'),(827,1,'JSP_奖惩管理','2014-06-03 18:42:39'),(828,1,'JSP_奖惩管理','2014-06-03 18:43:05'),(829,1,'JSP_奖惩管理','2014-06-03 18:43:05'),(830,1,'JSP_奖惩管理','2014-06-03 18:43:10'),(831,1,'JSP_奖惩管理','2014-06-03 18:43:12'),(832,1,'JSP_奖惩管理','2014-06-03 18:43:19'),(833,1,'JSP_奖惩管理','2014-06-03 18:43:19'),(834,1,'J_L_登录成功','2014-06-03 18:43:29'),(835,1,'J_L_登录成功','2014-06-03 18:49:38'),(836,1,'J_L_登录成功','2014-06-03 18:50:42'),(837,1,'J_L_登录成功','2014-06-03 19:03:08'),(838,1,'JSP_人事管理','2014-06-03 19:03:12'),(839,1,'JSP_人事管理','2014-06-03 19:03:25'),(840,1,'JSP_人事管理','2014-06-03 19:03:28'),(841,1,'JSP_人事管理','2014-06-03 19:03:33'),(842,1,'JSP_人事管理','2014-06-03 19:03:39'),(843,1,'JSP_人事管理','2014-06-03 19:03:41'),(844,1,'JSP_人事管理','2014-06-03 19:04:10'),(845,1,'JSP_人事管理','2014-06-03 19:04:10'),(846,1,'JSP_人事管理','2014-06-03 19:04:16'),(847,1,'JSP_人事管理','2014-06-03 19:04:19'),(848,1,'JSP_人事管理','2014-06-03 19:04:42'),(849,1,'JSP_人事管理','2014-06-03 19:04:42'),(850,1,'JSP_人事管理','2014-06-03 19:04:49'),(851,1,'JSP_人事管理','2014-06-03 19:04:51'),(852,1,'JSP_人事管理','2014-06-03 19:05:12'),(853,1,'JSP_人事管理','2014-06-03 19:05:12'),(854,1,'JSP_人事管理','2014-06-03 19:05:17'),(855,1,'JSP_人事管理','2014-06-03 19:05:19'),(856,1,'J_L_登录成功','2014-06-03 20:52:17'),(857,1,'JSP_人事管理','2014-06-03 21:01:00'),(858,1,'JSP_人事管理','2014-06-03 21:01:04'),(859,1,'JSP_人事管理','2014-06-03 21:06:23'),(860,1,'J_L_登录成功','2014-06-04 10:52:07'),(861,1,'J_L_登录成功','2014-06-04 10:58:48'),(862,1,'JSP_人事管理','2014-06-04 11:01:15'),(863,1,'JSP_人事管理','2014-06-04 11:01:18'),(864,1,'JSP_人事管理','2014-06-04 11:01:33'),(865,1,'JSP_人事管理','2014-06-04 11:01:40'),(866,1,'JSP_人事管理','2014-06-04 11:02:11'),(867,1,'JSP_人事管理','2014-06-04 11:02:11'),(868,1,'JSP_人事管理','2014-06-04 11:02:17'),(869,1,'JSP_人事管理','2014-06-04 11:02:22'),(870,1,'JSP_人事管理','2014-06-04 11:03:07'),(871,1,'JSP_人事管理','2014-06-04 11:03:07'),(872,1,'JSP_奖惩管理','2014-06-04 11:03:22'),(873,1,'JSP_奖惩管理','2014-06-04 11:03:28'),(874,1,'J_L_登录成功','2014-06-04 11:28:30'),(875,1,'J_L_登录成功','2014-06-04 11:36:12'),(876,1,'JSP_奖惩管理','2014-06-04 11:36:16'),(877,1,'JSP_奖惩管理','2014-06-04 11:36:20');

/*Table structure for table `t_sjgzb` */

DROP TABLE IF EXISTS `t_sjgzb`;

CREATE TABLE `t_sjgzb` (
  `ygh` int(10) NOT NULL AUTO_INCREMENT,
  `xm` varchar(50) DEFAULT NULL,
  `sjgz` decimal(8,2) DEFAULT NULL,
  `ffrq` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`ygh`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_sjgzb` */

insert  into `t_sjgzb`(`ygh`,`xm`,`sjgz`,`ffrq`) values (1,'aqi','8000.00','20140401'),(2,'xm','2000.00','20140401'),(3,'张三','3000.00','20140401'),(4,'李四',NULL,NULL),(5,'王五',NULL,NULL),(8,'admin',NULL,NULL),(9,'aaa',NULL,NULL);

/*Table structure for table `t_sjgzcxb` */

DROP TABLE IF EXISTS `t_sjgzcxb`;

CREATE TABLE `t_sjgzcxb` (
  `ygh` int(10) DEFAULT NULL,
  `xm` varchar(20) DEFAULT NULL,
  `sfgz` decimal(8,2) DEFAULT NULL,
  `ffrq` varchar(8) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `t_sjgzcxb` */

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `ygh` int(10) NOT NULL AUTO_INCREMENT,
  `xm` varchar(10) NOT NULL,
  `mm` varchar(10) NOT NULL,
  `qx` char(1) DEFAULT NULL,
  PRIMARY KEY (`ygh`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`ygh`,`xm`,`mm`,`qx`) values (1,'aqi','aqi','1'),(2,'xm','mm','2'),(3,'张三','123456','2'),(4,'李四','123456','2'),(5,'王五','123456','2'),(9,'aaa','123456','2'),(8,'admin','admin','1');

/*Table structure for table `t_ygddxxb` */

DROP TABLE IF EXISTS `t_ygddxxb`;

CREATE TABLE `t_ygddxxb` (
  `ygh` int(10) NOT NULL AUTO_INCREMENT,
  `xm` varchar(50) DEFAULT NULL,
  `YSBM` int(10) DEFAULT NULL,
  `YZWMC` varchar(50) DEFAULT NULL,
  `YGZ` decimal(8,2) DEFAULT NULL,
  `XBMH` int(10) DEFAULT NULL,
  `XZWMC` varchar(50) DEFAULT NULL,
  `XGZ` decimal(8,2) DEFAULT NULL,
  `DDSJ` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`ygh`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_ygddxxb` */

insert  into `t_ygddxxb`(`ygh`,`xm`,`YSBM`,`YZWMC`,`YGZ`,`XBMH`,`XZWMC`,`XGZ`,`DDSJ`) values (1,'aqi',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'xm',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'张三',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'李四',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'王五',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'admin',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'aaa',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `t_ygkqxxb` */

DROP TABLE IF EXISTS `t_ygkqxxb`;

CREATE TABLE `t_ygkqxxb` (
  `ygh` int(10) NOT NULL AUTO_INCREMENT,
  `xm` varchar(20) DEFAULT NULL,
  `cd` int(10) DEFAULT NULL,
  `zt` int(10) DEFAULT NULL,
  `kg` int(10) DEFAULT NULL,
  `qj` int(10) DEFAULT NULL,
  `jbsj` varchar(8) DEFAULT NULL,
  `kqsj` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`ygh`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_ygkqxxb` */

insert  into `t_ygkqxxb`(`ygh`,`xm`,`cd`,`zt`,`kg`,`qj`,`jbsj`,`kqsj`) values (1,'aqi',0,0,0,0,'10','20140401'),(2,'xm',NULL,NULL,NULL,NULL,NULL,NULL),(3,'张三',NULL,NULL,NULL,NULL,NULL,NULL),(4,'李四',NULL,NULL,NULL,NULL,NULL,NULL),(5,'王五',NULL,NULL,NULL,NULL,NULL,NULL),(8,'admin',NULL,NULL,NULL,NULL,NULL,NULL),(9,'aaa',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `t_ygxxb` */

DROP TABLE IF EXISTS `t_ygxxb`;

CREATE TABLE `t_ygxxb` (
  `ygh` int(11) NOT NULL AUTO_INCREMENT,
  `sfzh` varchar(18) DEFAULT NULL,
  `xm` varchar(20) DEFAULT NULL,
  `xb` varchar(2) DEFAULT NULL,
  `csrq` varchar(8) DEFAULT NULL,
  `jg` varchar(50) DEFAULT NULL,
  `zz` varchar(50) DEFAULT NULL,
  `yx` varchar(50) DEFAULT NULL,
  `xl` varchar(10) DEFAULT NULL,
  `zy` varchar(50) DEFAULT NULL,
  `bysj` varchar(8) DEFAULT NULL,
  `byyx` varchar(50) DEFAULT NULL,
  `jzsj` varchar(8) DEFAULT NULL,
  `lxfs` varchar(11) DEFAULT NULL,
  `zp` varchar(50) DEFAULT NULL,
  `bmh` int(10) DEFAULT NULL,
  `zt` varchar(10) DEFAULT NULL,
  `bz` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`ygh`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_ygxxb` */

insert  into `t_ygxxb`(`ygh`,`sfzh`,`xm`,`xb`,`csrq`,`jg`,`zz`,`yx`,`xl`,`zy`,`bysj`,`byyx`,`jzsj`,`lxfs`,`zp`,`bmh`,`zt`,`bz`) values (1,'35088119999999992x','aqi','男','19890727','漳平','三明学院','929228888@qq.com','本科','计算机软件','20140701','三明学院','20140318','18065851274','22',1,'在职',''),(2,'350881199002231199','xm','女','19990707','厦门','','','研究生','','','','','','22',0,'',''),(3,'350881199002231199','张三',NULL,'','龙岩','','','研究生','','','','','','22',0,'',''),(4,'350881199002231199','李四',NULL,'','福州','','','研究生','','','','','','22',0,'',''),(5,'','王五','男','','','','','','','','','','','22',0,'',''),(8,'350881199002231199','admin','男','19990707','三明','三明学院','222220@qq.com','本科','计算机软件','20140701','三明学院','20140318','18000000000','22',2,'在职','管理员'),(9,'350881199002231199','aaa','男','19900223','厦门','三明学院','222220@qq.com','本科','计算机软件','20140701','三明学院','20140318','18000000000','22',1,'在职','管理员');

/*Table structure for table `t_ygzwxxb` */

DROP TABLE IF EXISTS `t_ygzwxxb`;

CREATE TABLE `t_ygzwxxb` (
  `ygh` int(10) NOT NULL AUTO_INCREMENT,
  `zwmc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ygh`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_ygzwxxb` */

insert  into `t_ygzwxxb`(`ygh`,`zwmc`) values (1,'高级'),(2,''),(3,''),(4,''),(5,''),(8,''),(9,'');

/*Table structure for table `t_zwxxb` */

DROP TABLE IF EXISTS `t_zwxxb`;

CREATE TABLE `t_zwxxb` (
  `zwmc` varchar(50) DEFAULT NULL,
  `bmh` int(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `t_zwxxb` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
