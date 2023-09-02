CREATE TABLE `projects`(
	`project_id` INT NOT NULL AUTO_INCREMENT,
	`project_name` VARCHAR(50) NOT NULL,
	`detail` TEXT NOT NULL,
	`duration_id` INT NOT NULL,
	`level_id` INT NOT NULL,
	`p_created_at` DATETIME NOT NULL,
	`p_updated_at` DATETIME NOT NULL,
	PRIMARY KEY(project_id)
);


CREATE TABLE `level_types`(
	`level_id` INT NOT NULL AUTO_INCREMENT,
	`level_type` VARCHAR(100) NOT NULL,
	PRIMARY KEY(level_id)
);

CREATE TABLE `duration_types`(
	`duration_id` INT NOT NULL AUTO_INCREMENT,
	`duration_type` VARCHAR(50) NOT NULL,
	PRIMARY KEY(duration_id)
);

CREATE TABLE `comments`(
	`comment_id` int NOT NULL AUTO_INCREMENT,
	`project_id` int NOT NULL,
	`remark` TEXT NOT NULL,
	`c_created_at` DATETIME NOT NULL,
	PRIMARY KEY(comment_id)
);

CREATE TABLE `language_types`(
  `language_id` int NOT NULL AUTO_INCREMENT,
  `language_type` VARCHAR(100) NOT NULL,
    PRIMARY KEY(language_id)
);

CREATE TABLE `database_types`(
  `database_id` int NOT NULL AUTO_INCREMENT,
  `database_type` VARCHAR(100) NOT NULL,
    PRIMARY KEY(database_id)
);

CREATE TABLE `infrastructure_types`(
  `infrastructure_id` int NOT NULL AUTO_INCREMENT,
  `infrastructure_type` VARCHAR(100) NOT NULL,
    PRIMARY KEY(infrastructure_id)
);

CREATE TABLE `framework_types`(
  `framework_id` int NOT NULL AUTO_INCREMENT,
  `framework_type` VARCHAR(100) NOT NULL,
    PRIMARY KEY(framework_id)
);

CREATE TABLE `management_types`(
  `management_id` int NOT NULL AUTO_INCREMENT,
  `management_type` VARCHAR(100) NOT NULL,
    PRIMARY KEY(management_id)
);

CREATE TABLE `communication_types`(
  `communication_id` int NOT NULL AUTO_INCREMENT,
  `communication_type` VARCHAR(100) NOT NULL,
    PRIMARY KEY(communication_id)
);

CREATE TABLE `project_languages`(
	`pl_id` int NOT NULL AUTO_INCREMENT,
	`project_id` int NOT NULL,
	`language_id` int NOT NULL,
	PRIMARY KEY(pl_id)
);

CREATE TABLE `project_databases`(
	`pd_id` int NOT NULL AUTO_INCREMENT,
	`project_id` int NOT NULL,
	`database_id` int NOT NULL,
	PRIMARY KEY(pd_id)
);