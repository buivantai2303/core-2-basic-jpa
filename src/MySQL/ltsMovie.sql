-- Tạo cơ sở dữ liệu
CREATE DATABASE IF NOT EXISTS ltsMovie;

-- Sử dụng cơ sở dữ liệu
USE ltsMovie;

-- Tạo bảng Banner
CREATE TABLE IF NOT EXISTS Banner (
  Id INT PRIMARY KEY,
  ImageUrl VARCHAR(255),
  Title VARCHAR(255)
);

-- Tạo bảng BillStatus
CREATE TABLE IF NOT EXISTS BillStatus (
  Id INT PRIMARY KEY,
  Name VARCHAR(255)
);

-- Tạo bảng Bill
CREATE TABLE IF NOT EXISTS Bill (
  Id INT PRIMARY KEY,
  TotalMoney DOUBLE,
  TradingCode VARCHAR(255),
  CreateTime DATETIME,
  CustomerId INT,
  Name VARCHAR(255),
  UpdateTime DATETIME,
  PromotionId INT,
  BillStatusId INT,
  IsActive BIT,
  FOREIGN KEY (BillStatusId) REFERENCES BillStatus(Id),
  FOREIGN KEY (CustomerId) REFERENCES User(Id),
  FOREIGN KEY (PromotionId) REFERENCES Promotion(Id)
);

-- Tạo bảng BillFood
CREATE TABLE IF NOT EXISTS BillFood (
  Id INT PRIMARY KEY,
  Quantity INT,
  BillId INT,
  FoodId INT,
  FOREIGN KEY (BillId) REFERENCES Bill(Id),
  FOREIGN KEY (FoodId) REFERENCES Food(Id)
);

-- Tạo bảng BillTicket
CREATE TABLE IF NOT EXISTS BillTicket (
  Id INT PRIMARY KEY,
  Quantity INT,
  BillId INT,
  TicketId INT,
  FOREIGN KEY (BillId) REFERENCES Bill(Id),
  FOREIGN KEY (TicketId) REFERENCES Ticket(Id)
);

-- Tạo bảng Cinema
CREATE TABLE IF NOT EXISTS Cinema (
  Id INT PRIMARY KEY,
  Address VARCHAR(255),
  Description VARCHAR(255),
  Code VARCHAR(255),
  NameOfCinema VARCHAR(255),
  IsActive BIT
);

-- Tạo bảng ConfirmEmail
CREATE TABLE IF NOT EXISTS ConfirmEmail (
  Id INT PRIMARY KEY,
  UserId INT,
  RequiredTime DATETIME,
  ExpiredTime DATETIME,
  ConfirmCode VARCHAR(255),
  IsConfirm BIT,
  FOREIGN KEY (UserId) REFERENCES User(Id)
);

-- Tạo bảng Food
CREATE TABLE IF NOT EXISTS Food (
  Id INT PRIMARY KEY,
  Price DOUBLE,
  Description VARCHAR(255),
  Image VARCHAR(255),
  NameOfFood VARCHAR(255),
  IsActive BIT
);

-- Tạo bảng GeneralSetting
CREATE TABLE IF NOT EXISTS GeneralSetting (
  Id INT PRIMARY KEY,
  BreakTime DATETIME,
  BusinessHours INT,
  CloseTime DATETIME,
  FixedTicketPrice DOUBLE,
  PercentDay INT,
  PercentWeekend INT,
  TimeBeginToChange DATETIME
);

-- Tạo bảng Movie
CREATE TABLE IF NOT EXISTS Movie (
  Id INT PRIMARY KEY,
  MovieDuration INT,
  EndTime DATETIME,
  PremiereDate DATETIME,
  Description VARCHAR(255),
  Director VARCHAR(255),
  Image VARCHAR(255),
  HeroImage VARCHAR(255),
  Language VARCHAR(255),
  MovieTypeId INT,
  Name VARCHAR(255),
  RateId INT,
  Trailer VARCHAR(255),
  IsActive BIT,
  FOREIGN KEY (MovieTypeId) REFERENCES MovieType(Id),
  FOREIGN KEY (RateId) REFERENCES Rate(Id)
);

-- Tạo bảng MovieType
CREATE TABLE IF NOT EXISTS MovieType (
  Id INT PRIMARY KEY,
  MovieTypeName VARCHAR(255),
  IsActive BIT
);

-- Tạo bảng Promotion
CREATE TABLE IF NOT EXISTS Promotion (
  Id INT PRIMARY KEY,
  Percent INT,
  Quantity INT,
  Type VARCHAR(255),
  StartTime DATETIME,
  EndTime DATETIME,
  Description VARCHAR(255),
  Name VARCHAR(255),
  IsActive BIT,
  RankCustomerId INT,
  FOREIGN KEY (RankCustomerId) REFERENCES RankCustomer(Id)
);

-- Tạo bảng RankCustomer
CREATE TABLE IF NOT EXISTS RankCustomer (
  Id INT PRIMARY KEY,
  Point INT,
  Description VARCHAR(255),
  Name VARCHAR(255),
  IsActive BIT
);

-- Tạo bảng Rate
CREATE TABLE IF NOT EXISTS Rate (
  Id INT PRIMARY KEY,
  Description VARCHAR(255),
  Code VARCHAR(255)
);

-- Tạo bảng RefreshToken
CREATE TABLE IF NOT EXISTS RefreshToken (
  Id INT PRIMARY KEY,
  Token VARCHAR(255),
  ExpiredTime DATETIME,
  UserId INT,
  FOREIGN KEY (UserId) REFERENCES User(Id)
);

-- Tạo bảng Role
CREATE TABLE IF NOT EXISTS Role (
  Id INT PRIMARY KEY,
  Code VARCHAR(255),
  RoleName VARCHAR(255)
);

-- Tạo bảng Room
CREATE TABLE IF NOT EXISTS Room (
  Id INT PRIMARY KEY,
  Capacity INT,
  Type INT,
  Description VARCHAR(255),
  CinemaId INT,
  Code VARCHAR(255),
  Name VARCHAR(255),
  IsActive BIT,
  FOREIGN KEY (CinemaId) REFERENCES Cinema(Id)
);

-- Tạo bảng Schedule
CREATE TABLE IF NOT EXISTS Schedule (
  Id INT PRIMARY KEY,
  Price DOUBLE,
  StartAt DATETIME,
  EndAt DATETIME,
  Code VARCHAR(255),
  MovieId INT,
  Name VARCHAR(255),
  RoomId INT,
  IsActive BIT,
  FOREIGN KEY (MovieId) REFERENCES Movie(Id),
  FOREIGN KEY (RoomId) REFERENCES Room(Id)
);

-- Tạo bảng Seat
CREATE TABLE IF NOT EXISTS Seat (
  Id INT PRIMARY KEY,
  Number INT,
  SeatStatusId INT,
  Line VARCHAR(255),
  RoomId INT,
  IsActive BIT,
  SeatTypeId INT,
  FOREIGN KEY (RoomId) REFERENCES Room(Id),
  FOREIGN KEY (SeatStatusId) REFERENCES SeatStatus(Id),
  FOREIGN KEY (SeatTypeId) REFERENCES SeatType(Id)
);

-- Tạo bảng SeatStatus
CREATE TABLE IF NOT EXISTS SeatStatus (
  Id INT PRIMARY KEY,
  Code VARCHAR(255),
  NameStatus VARCHAR(255)
);

-- Tạo bảng SeatType
CREATE TABLE IF NOT EXISTS SeatType (
  Id INT PRIMARY KEY,
  NameType VARCHAR(255)
);

-- Tạo bảng Ticket
CREATE TABLE IF NOT EXISTS Ticket (
  Id INT PRIMARY KEY,
  Code VARCHAR(255),
  ScheduleId INT,
  SeatId INT,
  PriceTicket DOUBLE,
  IsActive BIT,
  FOREIGN KEY (ScheduleId) REFERENCES Schedule(Id),
  FOREIGN KEY (SeatId) REFERENCES Seat(Id)
);

-- Tạo bảng UserStatus
CREATE TABLE IF NOT EXISTS UserStatus (
  Id INT PRIMARY KEY,
  Code VARCHAR(255),
  Name VARCHAR(255)
);

-- Tạo bảng User
CREATE TABLE IF NOT EXISTS User (
  Id INT PRIMARY KEY,
  Point INT,
  Username VARCHAR(255),
  Email VARCHAR(255),
  Name VARCHAR(255),
  PhoneNumber VARCHAR(255),
  Password VARCHAR(255),
  RankCustomerId INT,
  UserStatusId INT,
  IsActive BIT,
  RoleId INT,
  FOREIGN KEY (RankCustomerId) REFERENCES RankCustomer(Id),
  FOREIGN KEY (UserStatusId) REFERENCES UserStatus(Id),
  FOREIGN KEY (RoleId) REFERENCES Role(Id)
);
