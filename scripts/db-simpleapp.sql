SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema schoolDB
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `schoolDB` ;

-- -----------------------------------------------------
-- Schema schoolDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `schoolDB` DEFAULT CHARACTER SET utf8 ;
USE `schoolDB` ;

-- -----------------------------------------------------
-- Table `schoolDB`.`student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolDB`.`students` ;

CREATE TABLE `students` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `grade` int(11) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;