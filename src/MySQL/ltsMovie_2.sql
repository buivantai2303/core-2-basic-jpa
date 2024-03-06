CREATE TABLE `Banner` (
  `Id` integer PRIMARY KEY,
  `ImageUrl` varchar(255),
  `Title` varchar(255)
);

CREATE TABLE `Bill` (
  `Id` integer PRIMARY KEY,
  `TotalMoney` double,
  `TradingCode` varchar(255),
  `CreateTime` datetime,
  `CustomerId` integer,
  `Name` varchar(255),
  `UpdateTime` datetime,
  `PromotionId` integer,
  `BillStatusId` integer,
  `IsActive` bit
);

CREATE TABLE `BillFood` (
  `Id` integer PRIMARY KEY,
  `Quantity` integer,
  `BillId` integer,
  `FoodId` integer
);

CREATE TABLE `BillStatus` (
  `Id` integer PRIMARY KEY,
  `Name` varchar(255)
);

CREATE TABLE `BillTicket` (
  `Id` integer PRIMARY KEY,
  `Quantity` integer,
  `BillId` integer,
  `TicketId` integer
);

CREATE TABLE `Cinema` (
  `Id` integer PRIMARY KEY,
  `Address` varchar(255),
  `Description` varchar(255),
  `Code` varchar(255),
  `NameOfCinema` varchar(255),
  `IsActive` bit
);

CREATE TABLE `ConfirmEmail` (
  `Id` integer PRIMARY KEY,
  `UserId` integer,
  `RequiredTime` datetime,
  `ExpiredTime` datetime,
  `ConfirmCode` varchar(255),
  `IsConfirm` bit
);

CREATE TABLE `Food` (
  `Id` integer PRIMARY KEY,
  `Price` double,
  `Description` varchar(255),
  `Image` varchar(255),
  `NameOfFood` varchar(255),
  `IsActive` bit
);

CREATE TABLE `GeneralSetting` (
  `Id` integer PRIMARY KEY,
  `BreakTime` datetime,
  `BusinessHours` integer,
  `CloseTime` datetime,
  `FixedTicketPrice` double,
  `PercentDay` integer,
  `PercentWeekend` integer,
  `TimeBeginToChange` datetime
);

CREATE TABLE `Movie` (
  `Id` integer PRIMARY KEY,
  `MovieDuration` integer,
  `EndTime` datetime,
  `PremiereDate` datetime,
  `Description` varchar(255),
  `Director` varchar(255),
  `Image` varchar(255),
  `HeroImage` varchar(255),
  `Language` varchar(255),
  `MovieTypeId` integer,
  `Name` varchar(255),
  `RateId` integer,
  `Trailer` varchar(255),
  `IsActive` bit
);

CREATE TABLE `MovieType` (
  `Id` integer PRIMARY KEY,
  `MovieTypeName` varchar(255),
  `IsActive` bit
);

CREATE TABLE `Promotion` (
  `Id` integer PRIMARY KEY,
  `Percent` integer,
  `Quantity` integer,
  `Type` varchar(255),
  `StartTime` datetime,
  `EndTime` datetime,
  `Description` varchar(255),
  `Name` varchar(255),
  `IsActive` bit,
  `RankCustomerId` integer
);

CREATE TABLE `RankCustomer` (
  `Id` integer PRIMARY KEY,
  `Point` integer,
  `Description` varchar(255),
  `Name` varchar(255),
  `IsActive` bit
);

CREATE TABLE `Rate` (
  `Id` integer PRIMARY KEY,
  `Description` varchar(255),
  `Code` varchar(255)
);

CREATE TABLE `RefreshToken` (
  `Id` integer PRIMARY KEY,
  `Token` varchar(255),
  `ExpiredTime` datetime,
  `UserId` integer
);

CREATE TABLE `Role` (
  `Id` integer PRIMARY KEY,
  `Code` varchar(255),
  `RoleName` varchar(255)
);

CREATE TABLE `Room` (
  `Id` integer PRIMARY KEY,
  `Capacity` integer,
  `Type` integer,
  `Description` varchar(255),
  `CinemaId` integer,
  `Code` varchar(255),
  `Name` varchar(255),
  `IsActive` bit
);

CREATE TABLE `Schedule` (
  `Id` integer PRIMARY KEY,
  `Price` double,
  `StartAt` datetime,
  `EndAt` datetime,
  `Code` varchar(255),
  `MovieId` integer,
  `Name` varchar(255),
  `RoomId` integer,
  `IsActive` bit
);

CREATE TABLE `Seat` (
  `Id` integer PRIMARY KEY,
  `Number` integer,
  `SeatStatusId` integer,
  `Line` varchar(255),
  `RoomId` integer,
  `IsActive` bit,
  `SeatTypeId` integer
);

CREATE TABLE `SeatStatus` (
  `Id` integer PRIMARY KEY,
  `Code` varchar(255),
  `NameStatus` varchar(255)
);

CREATE TABLE `SeatType` (
  `Id` integer PRIMARY KEY,
  `NameType` varchar(255)
);

CREATE TABLE `Ticket` (
  `Id` integer PRIMARY KEY,
  `Code` varchar(255),
  `ScheduleId` integer,
  `SeatId` integer,
  `PriceTicket` double,
  `IsActive` bit
);

CREATE TABLE `User` (
  `Id` integer PRIMARY KEY,
  `Point` integer,
  `Username` varchar(255),
  `Email` varchar(255),
  `Name` varchar(255),
  `PhoneNumber` varchar(255),
  `Password` varchar(255),
  `RankCustomerId` integer,
  `UserStatusId` integer,
  `IsActive` bit,
  `RoleId` integer
);

CREATE TABLE `UserStatus` (
  `Id` integer PRIMARY KEY,
  `Code` varchar(255),
  `Name` varchar(255)
);

ALTER TABLE `Bill` ADD FOREIGN KEY (`BillStatusId`) REFERENCES `BillStatus` (`Id`);

ALTER TABLE `Bill` ADD FOREIGN KEY (`CustomerId`) REFERENCES `User` (`Id`);

ALTER TABLE `Bill` ADD FOREIGN KEY (`PromotionId`) REFERENCES `Promotion` (`Id`);

ALTER TABLE `BillFood` ADD FOREIGN KEY (`BillId`) REFERENCES `Bill` (`Id`);

ALTER TABLE `BillFood` ADD FOREIGN KEY (`FoodId`) REFERENCES `Food` (`Id`);

ALTER TABLE `BillTicket` ADD FOREIGN KEY (`BillId`) REFERENCES `Bill` (`Id`);

ALTER TABLE `BillTicket` ADD FOREIGN KEY (`TicketId`) REFERENCES `Ticket` (`Id`);

ALTER TABLE `ConfirmEmail` ADD FOREIGN KEY (`UserId`) REFERENCES `User` (`Id`);

ALTER TABLE `Movie` ADD FOREIGN KEY (`MovieTypeId`) REFERENCES `MovieType` (`Id`);

ALTER TABLE `Movie` ADD FOREIGN KEY (`RateId`) REFERENCES `Rate` (`Id`);

ALTER TABLE `Promotion` ADD FOREIGN KEY (`RankCustomerId`) REFERENCES `RankCustomer` (`Id`);

ALTER TABLE `RefreshToken` ADD FOREIGN KEY (`UserId`) REFERENCES `User` (`Id`);

ALTER TABLE `Room` ADD FOREIGN KEY (`CinemaId`) REFERENCES `Cinema` (`Id`);

ALTER TABLE `Schedule` ADD FOREIGN KEY (`MovieId`) REFERENCES `Movie` (`Id`);

ALTER TABLE `Schedule` ADD FOREIGN KEY (`RoomId`) REFERENCES `Room` (`Id`);

ALTER TABLE `Seat` ADD FOREIGN KEY (`RoomId`) REFERENCES `Room` (`Id`);

ALTER TABLE `Seat` ADD FOREIGN KEY (`SeatStatusId`) REFERENCES `SeatStatus` (`Id`);

ALTER TABLE `Seat` ADD FOREIGN KEY (`SeatTypeId`) REFERENCES `SeatType` (`Id`);

ALTER TABLE `Ticket` ADD FOREIGN KEY (`ScheduleId`) REFERENCES `Schedule` (`Id`);

ALTER TABLE `Ticket` ADD FOREIGN KEY (`SeatId`) REFERENCES `Seat` (`Id`);

ALTER TABLE `User` ADD FOREIGN KEY (`RankCustomerId`) REFERENCES `RankCustomer` (`Id`);

ALTER TABLE `User` ADD FOREIGN KEY (`RoleId`) REFERENCES `Role` (`Id`);

ALTER TABLE `User` ADD FOREIGN KEY (`UserStatusId`) REFERENCES `UserStatus` (`Id`);
