-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-03-2020 a las 21:34:15
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cursojava`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cliente` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cliente`, `nombre`) VALUES
(1086, 'RENE ERICK SOTO REYES'),
(8095, 'MIGUEL ANGEL CASTILLO VEGA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inversion`
--

CREATE TABLE `inversion` (
  `cuenta` varchar(16) NOT NULL,
  `tipocuenta` varchar(50) NOT NULL,
  `saldo` double NOT NULL,
  `cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `inversion`
--

INSERT INTO `inversion` (`cuenta`, `tipocuenta`, `saldo`, `cliente`) VALUES
('4567', 'INVERSION PERSONAL', 12350.98, 1086),
('9876', 'INVERSION A PLAZO', 1234567.09, 8095),
('874328', 'INVERSION PERSONAL', 8760.78, 8095),
('65789', 'INVERSION BOLSA', 1234567.9, 1086);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjetacredito`
--

CREATE TABLE `tarjetacredito` (
  `cuenta` varchar(16) NOT NULL,
  `tipocuenta` varchar(50) NOT NULL,
  `saldo` double NOT NULL,
  `cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tarjetacredito`
--

INSERT INTO `tarjetacredito` (`cuenta`, `tipocuenta`, `saldo`, `cliente`) VALUES
('34578', 'BSMART', 45678.89, 1086),
('09876', 'ORO', 98676.56, 8095);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjetadebito`
--

CREATE TABLE `tarjetadebito` (
  `cuenta` varchar(16) NOT NULL,
  `tipocuenta` varchar(50) NOT NULL,
  `saldo` double NOT NULL,
  `cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tarjetadebito`
--

INSERT INTO `tarjetadebito` (`cuenta`, `tipocuenta`, `saldo`, `cliente`) VALUES
('5579099011815694', 'PERFILES', 560, 1086),
('5579114156943195', 'PERFILES EMPRESARIAL', 50000.5, 8095),
('5579802176509875', 'PERFILES', 10050.8, 8095);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(15) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `password` text NOT NULL,
  `fechaAlta` datetime NOT NULL DEFAULT current_timestamp(),
  `edad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `nombre`, `correo`, `password`, `fechaAlta`, `edad`) VALUES
('admin', 'Juan Marquez', 'juanito@thincode.com', '12345', '2020-03-17 10:32:15', 24),
('conti', 'Aldo Turijan', 'aldo.turijan@thincode.com', '12345', '2020-03-17 10:40:44', 27),
('jacko', 'Miguel Castillo', 'miguel.castillo@thincode.com', '12345', '2020-03-17 13:16:22', 32),
('juanito', 'Juan Marquez', 'juanito@thincode.com', 'cualquiera', '2020-03-17 09:59:46', 24),
('lonchi', 'Raúl Mariscal', 'raul.mariscal@thincode.com', '12345', '2020-03-17 10:40:16', 24),
('resotor', 'René Erick', 'resotor@outlook.com', '1234', '2020-03-17 09:57:00', 26);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
