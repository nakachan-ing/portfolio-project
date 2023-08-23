CREATE TABLE `projects`(
	`id` INT NOT NULL AUTO_INCREMENT,
	`project_name` VARCHAR(50) NOT NULL,
	`detail` TEXT NOT NULL,
	`duration_id` INT NOT NULL,
	`level_id` INT NOT NULL,
	`created_at` DATETIME NOT NULL,
	`updated_at` DATETIME NOT NULL,
	PRIMARY KEY(id)
);


CREATE TABLE `level_types`(
	`id` INT NOT NULL AUTO_INCREMENT,
	`level_type` VARCHAR(100) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE `duration_types`(
	`id` INT NOT NULL AUTO_INCREMENT,
	`duration_type` VARCHAR(50) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE `comments`(
	`id` int NOT NULL AUTO_INCREMENT,
	`project_id` int NOT NULL,
	`remark` TEXT NOT NULL,
	PRIMARY KEY(id)
);