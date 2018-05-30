CREATE SCHEMA `production_db` ;

CREATE IF NOT EXISTS TABLE `production_db`.`developers` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(45) NOT NULL,
 PRIMARY KEY (`id`));

CREATE IF NOT EXISTS TABLE `production_db`.`skills` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `skill` VARCHAR(45) NOT NULL,
 PRIMARY KEY (`id`));

CREATE IF NOT EXISTS TABLE `production_db`.`developers_skills` (
 `id_developer` INT NOT NULL,
 `id_skill` INT NOT NULL,
 PRIMARY KEY (`id_developer`, `id_skill`),
 INDEX `fk_skill_idx` (`id_skill` ASC) VISIBLE,
 CONSTRAINT `fk_dev`
 FOREIGN KEY (`id_developer`)
 REFERENCES `production_db`.`developers` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
 CONSTRAINT `fk_skill`
 FOREIGN KEY (`id_skill`)
 REFERENCES `production_db`.`skills` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION);

CREATE IF NOT EXISTS TABLE `production_db`.`projects` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `project` VARCHAR(45) NOT NULL,
 PRIMARY KEY (`id`));

CREATE IF NOT EXISTS TABLE `production_db`.`projects_dev` (
 `id_project` INT NOT NULL,
 `id_dev` INT NOT NULL,
 PRIMARY KEY (`id_project`, `id_dev`),
 INDEX `fk_developer_idx` (`id_dev` ASC) VISIBLE,
 CONSTRAINT `fk_project`
 FOREIGN KEY (`id_project`)
 REFERENCES `production_db`.`projects` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
 CONSTRAINT `fk_developer`
 FOREIGN KEY (`id_dev`)
 REFERENCES `production_db`.`developers` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION);

CREATE IF NOT EXISTS TABLE `production_db`.`companies` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `company` VARCHAR(45) NOT NULL,
 PRIMARY KEY (`id`));

CREATE IF NOT EXISTS TABLE `production_db`.`company_dev` (
 `id_company` INT NOT NULL,
 `id_dev` INT NOT NULL,
 PRIMARY KEY (`id_company`, `id_dev`),
 INDEX `fk_dev_idx` (`id_dev` ASC) VISIBLE,
 CONSTRAINT `fk_company`
 FOREIGN KEY (`id_company`)
 REFERENCES `production_db`.`companies` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
 CONSTRAINT `fk_develop`
 FOREIGN KEY (`id_dev`)
 REFERENCES `production_db`.`developers` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION);

CREATE IF NOT EXISTS TABLE `production_db`.`customers` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `customer` VARCHAR(45) NOT NULL,
 PRIMARY KEY (`id`));

CREATE IF NOT EXISTS TABLE `production_db`.`customers_project` (
 `id_customer` INT NOT NULL,
 `id_project` INT NOT NULL,
 PRIMARY KEY (`id_customer`, `id_project`),
 INDEX `fk_project_idx` (`id_project` ASC) VISIBLE,
 CONSTRAINT `fk_customer`
 FOREIGN KEY (`id_customer`)
 REFERENCES `production_db`.`customers` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
 CONSTRAINT `fk_project_id`
 FOREIGN KEY (`id_project`)
 REFERENCES `production_db`.`projects` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION);

