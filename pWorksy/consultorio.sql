-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-05-2022 a las 01:04:40
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `consultorio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultorio`
--

CREATE TABLE `consultorio` (
  `nombre completo` varchar(50) NOT NULL,
  `edad` varchar(10) NOT NULL,
  `documento` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `especialización` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `consultorio`
--

INSERT INTO `consultorio` (`nombre completo`, `edad`, `documento`, `telefono`, `especialización`) VALUES
('Aureliano Popeye', '56 años', '1019230430', '3106098714', 'Odontólogo'),
('Juan Andrés Naranjo', '32 años', '1030430412', '3128165745', 'Endodoncista'),
('Santiago Grajales', '45 años', '1032720690', '3128165709', 'Ortodoncista'),
('Jonier Pérez Córdobas', '47 años', '1043560784', '3206153943', 'Odontólogo'),
('Nando Enrique Peréz', '39 años', '71734213', '3050567514', 'Diseñador de sonrisa\r\n');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `consultorio`
--
ALTER TABLE `consultorio`
  ADD PRIMARY KEY (`documento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
