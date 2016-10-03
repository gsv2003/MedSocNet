--создание таблицы Докторов
CREATE TABLE `medsocnet`.`doctors` (
  `doctorsID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`doctorsID`),
  UNIQUE INDEX `doctorsID_UNIQUE` (`doctorsID` ASC));