-- -----------------------------------------------------
-- Table `todos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `todos` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) DEFAULT NULL,
  `detail` TEXT,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB;