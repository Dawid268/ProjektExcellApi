CREATE TABLE `game` (
  `Id` int(10) UNSIGNED NOT NULL,
  `Name` varchar(150) DEFAULT NULL,
  `Platform` varchar(5) DEFAULT NULL,
  `Year_Of_Release` year(4) DEFAULT NULL,
  `Genre` varchar(15) DEFAULT NULL,
  `Publisher` varchar(40) DEFAULT NULL,
  `NA_Sales` decimal(6,2) DEFAULT NULL,
  `EU_Sales` decimal(6,2) DEFAULT NULL,
  `JP_Sales` decimal(6,2) DEFAULT NULL,
  `Other_Sales` decimal(6,2) DEFAULT NULL,
  `Global_Sales` decimal(6,2) DEFAULT NULL,
  `Critic_Score` smallint(6) DEFAULT NULL,
  `Critic_Count` int(11) DEFAULT NULL,
  `User_Score` decimal(2,1) DEFAULT NULL,
  `User_Count` int(11) DEFAULT NULL,
  `Developer` varchar(80) DEFAULT NULL,
  `Rating` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE `game`
  ADD PRIMARY KEY (`Id`);
