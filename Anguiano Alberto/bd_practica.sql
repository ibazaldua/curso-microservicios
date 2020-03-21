-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.5.1-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para bd_practica
CREATE DATABASE IF NOT EXISTS `bd_practica` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bd_practica`;

-- Volcando estructura para tabla bd_practica.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `Usuario` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(200) NOT NULL,
  `Created` date DEFAULT NULL,
  PRIMARY KEY (`Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=310 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bd_practica.usuarios: ~309 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`Usuario`, `Name`, `Email`, `Password`, `Created`) VALUES
	(1, 'Alberto Anguiano', 'alberto.anguiano@thincode.com', '12345', '2020-03-10'),
	(2, 'Alfredo Renteria', 'alfredo.renteria@thincode.com', '11111', '2020-01-11'),
	(3, 'Mario Vazquez', 'mario.vazquez@thincode.com', '55555', '2020-02-21'),
	(4, 'Maria Jose Guzman', 'maria.guzman@thincode.com', '54321', '2020-01-10'),
	(5, 'a', 'b', '1234', '2000-10-10'),
	(6, 'a', 'b', '1234', '2020-03-13'),
	(7, 's', 'd', '1234', '2020-03-13'),
	(8, 's', 'd', '1234', '2020-03-13'),
	(9, 'h', 'v', '1234', '2020-03-13'),
	(10, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(11, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(12, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(13, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(14, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(15, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(16, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(17, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(18, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(19, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(20, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(21, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(22, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(23, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(24, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(25, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(26, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(27, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(28, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(29, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(30, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(31, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(32, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(33, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(34, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(35, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(36, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(37, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(38, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(39, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(40, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(41, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(42, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(43, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(44, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(45, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(46, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(47, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(48, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(49, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(50, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(51, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(52, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(53, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(54, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(55, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(56, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(57, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(58, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(59, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(60, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(61, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(62, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(63, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(64, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(65, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(66, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(67, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(68, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(69, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(70, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(71, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(72, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(73, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(74, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(75, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(76, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(77, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(78, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(79, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(80, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(81, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(82, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(83, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(84, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(85, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(86, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(87, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(88, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(89, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(90, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(91, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(92, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(93, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(94, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(95, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(96, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(97, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(98, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(99, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(100, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(101, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(102, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(103, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(104, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(105, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(106, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(107, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(108, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(109, 'anguiano', 'thinconde', '1234', '2020-03-13'),
	(110, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(111, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(112, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(113, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(114, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(115, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(116, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(117, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(118, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(119, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(120, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(121, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(122, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(123, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(124, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(125, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(126, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(127, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(128, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(129, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(130, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(131, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(132, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(133, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(134, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(135, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(136, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(137, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(138, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(139, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(140, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(141, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(142, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(143, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(144, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(145, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(146, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(147, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(148, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(149, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(150, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(151, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(152, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(153, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(154, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(155, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(156, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(157, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(158, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(159, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(160, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(161, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(162, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(163, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(164, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(165, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(166, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(167, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(168, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(169, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(170, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(171, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(172, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(173, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(174, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(175, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(176, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(177, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(178, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(179, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(180, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(181, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(182, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(183, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(184, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(185, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(186, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(187, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(188, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(189, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(190, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(191, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(192, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(193, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(194, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(195, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(196, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(197, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(198, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(199, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(200, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(201, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(202, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(203, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(204, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(205, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(206, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(207, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(208, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(209, 'felipe', 'felipe@thincode.com', '1234', '2020-03-13'),
	(210, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(211, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(212, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(213, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(214, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(215, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(216, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(217, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(218, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(219, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(220, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(221, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(222, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(223, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(224, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(225, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(226, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(227, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(228, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(229, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(230, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(231, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(232, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(233, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(234, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(235, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(236, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(237, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(238, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(239, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(240, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(241, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(242, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(243, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(244, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(245, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(246, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(247, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(248, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(249, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(250, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(251, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(252, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(253, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(254, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(255, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(256, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(257, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(258, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(259, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(260, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(261, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(262, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(263, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(264, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(265, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(266, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(267, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(268, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(269, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(270, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(271, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(272, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(273, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(274, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(275, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(276, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(277, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(278, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(279, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(280, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(281, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(282, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(283, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(284, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(285, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(286, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(287, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(288, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(289, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(290, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(291, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(292, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(293, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(294, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(295, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(296, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(297, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(298, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(299, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(300, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(301, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(302, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(303, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(304, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(305, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(306, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(307, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(308, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19'),
	(309, 'alberto ang', 'albert.anguiano@hotmail.com', '1234', '2020-03-19');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;