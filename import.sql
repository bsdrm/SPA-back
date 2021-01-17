CREATE DATABASE rec;

USE rec;

CREATE TABLE `employees` (
  `employee_id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
);

CREATE TABLE `projects` (
  `project_id` bigint NOT NULL AUTO_INCREMENT,
  `end_date` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`project_id`)
);

CREATE TABLE `employees_projects` (
  `project_id` bigint NOT NULL,
  `employee_id` bigint NOT NULL,
  KEY `FKbslohhow39ayel1dc6cdus5sc` (`employee_id`),
  KEY `FKc9x9r7nbtwnx24vcrfxym9cyy` (`project_id`),
  CONSTRAINT `FKbslohhow39ayel1dc6cdus5sc` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`),
  CONSTRAINT `FKc9x9r7nbtwnx24vcrfxym9cyy` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`)
);

INSERT INTO `employees` (`name`) VALUES ('Anna'), ('Marek');

INSERT INTO `projects` (`name`, `start_date`, `end_date`) VALUES ('Project 1', '2021-01-17 21:27:24.809000', '2021-01-17 21:27:24.809000'),
('Project 2', '2021-01-17 21:27:24.809000', '2021-01-17 21:27:24.809000');

INSERT INTO `employees_projects` (`employee_id`, `project_id`) VALUES (1, 1), (1, 2), (2, 1), (2, 2);
