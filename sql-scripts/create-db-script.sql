-- -----------------------------------------------------
-- Schema sat-quiz-db
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sat-quiz-db`;

CREATE SCHEMA `sat-quiz-db`;
USE `sat-quiz-db` ;


# To create the User table:


-- NOTE: The passwords are encrypted using BCrypt
--
-- A generation tool is available at: https://www.bcryptcalculator.com/encode
--
-- Default password used was: fun123
--





-- -----------------------------------------------------
-- Table `sat-quiz-db`.`user`
-- -----------------------------------------------------
# To create the User table:

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `user_creation_date` date,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 




-- -----------------------------------------------------
-- Table `sat-quiz-db`.`sat-words`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sat-quiz-db`.`sat-words` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sat_word` varchar(255) NULL DEFAULT NULL,
  `sat_word_definition` varchar(255) NULL DEFAULT NULL,
  `sentence_containing_sat_word` varchar(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `sat-quiz-db`.`score`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `full-stack-ecommerce`.`product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `number_questions` int NOT NULL,
  `number_correct` int NOT NULL,
  `quiz_date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_category` (`category_id`),
  CONSTRAINT `fk_category` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) 
ENGINE=InnoDB
AUTO_INCREMENT = 1;

