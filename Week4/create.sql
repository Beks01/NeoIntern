CREATE DATABASE `begin` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `customer` (
  `CustomerID` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Surname` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `empoloyee` (
  `ID` int NOT NULL,
  `Type` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `products` (
  `ProductID` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Price` varchar(45) NOT NULL,
  PRIMARY KEY (`ProductID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `soldproducts` (
  `ID` int NOT NULL,
  `Date` date NOT NULL,
  `WorkerID` int NOT NULL,
  KEY `sold_idx` (`ID`),
  KEY `worker_idx` (`WorkerID`),
  CONSTRAINT `sold` FOREIGN KEY (`ID`) REFERENCES `products` (`ProductID`),
  CONSTRAINT `worker` FOREIGN KEY (`WorkerID`) REFERENCES `empoloyee` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
