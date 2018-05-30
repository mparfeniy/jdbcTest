INSERT INTO `production_db`.`companies` (`company`) VALUES ('Microsoft');
INSERT INTO `production_db`.`companies` (`company`) VALUES ('SoftGroup');
INSERT INTO `production_db`.`companies` (`company`) VALUES ('Ubisoft');
INSERT INTO `production_db`.`companies` (`company`) VALUES ('Andersen');
INSERT INTO `production_db`.`companies` (`company`) VALUES ('Acropolium');
INSERT INTO `production_db`.`companies` (`company`) VALUES ('NGSoft');
INSERT INTO `production_db`.`companies` (`company`) VALUES ('Astound Commerce');

INSERT INTO `production_db`.`customers` (`customer`) VALUES ('Saul');
INSERT INTO `production_db`.`customers` (`customer`) VALUES ('Eugene');
INSERT INTO `production_db`.`customers` (`customer`) VALUES ('Vitalii');
INSERT INTO `production_db`.`customers` (`customer`) VALUES ('Charles');
INSERT INTO `production_db`.`customers` (`customer`) VALUES ('Donald');
INSERT INTO `production_db`.`customers` (`customer`) VALUES ('John');
INSERT INTO `production_db`.`customers` (`customer`) VALUES ('Jane');

INSERT INTO `production_db`.`developers` (`name`) VALUES ('Yaroslav');
INSERT INTO `production_db`.`developers` (`name`) VALUES ('Andrew');
INSERT INTO `production_db`.`developers` (`name`) VALUES ('Stanislav');
INSERT INTO `production_db`.`developers` (`name`) VALUES ('Max');
INSERT INTO `production_db`.`developers` (`name`) VALUES ('Denis');
INSERT INTO `production_db`.`developers` (`name`) VALUES ('Eugene');
INSERT INTO `production_db`.`developers` (`name`) VALUES ('Dmitrii');

INSERT INTO `production_db`.`projects` (`project`) VALUES ('Chemistry Supply');
INSERT INTO `production_db`.`projects` (`project`) VALUES ('Game Engine');
INSERT INTO `production_db`.`projects` (`project`) VALUES ('Cashbox');
INSERT INTO `production_db`.`projects` (`project`) VALUES ('Smart House');
INSERT INTO `production_db`.`projects` (`project`) VALUES ('TV Software');
INSERT INTO `production_db`.`projects` (`project`) VALUES ('Graphics Editor');

INSERT INTO `production_db`.`skills` (`skill`) VALUES ('Java');
INSERT INTO `production_db`.`skills` (`skill`) VALUES ('C++');
INSERT INTO `production_db`.`skills` (`skill`) VALUES ('C#');
INSERT INTO `production_db`.`skills` (`skill`) VALUES ('C');
INSERT INTO `production_db`.`skills` (`skill`) VALUES ('PHP');

INSERT INTO `production_db`.`company_dev` (`id_company`, `id_dev`) VALUES ('1', '6');
INSERT INTO `production_db`.`company_dev` (`id_company`, `id_dev`) VALUES ('1', '3');
INSERT INTO `production_db`.`company_dev` (`id_company`, `id_dev`) VALUES ('2', '5');
INSERT INTO `production_db`.`company_dev` (`id_company`, `id_dev`) VALUES ('2', '2');
INSERT INTO `production_db`.`company_dev` (`id_company`, `id_dev`) VALUES ('3', '1');
INSERT INTO `production_db`.`company_dev` (`id_company`, `id_dev`) VALUES ('4', '4');
INSERT INTO `production_db`.`company_dev` (`id_company`, `id_dev`) VALUES ('4', '7');

INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('1', '3');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('1', '6');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('2', '4');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('2', '2');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('3', '1');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('4', '5');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('4', '2');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('5', '3');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('6', '2');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('7', '1');
INSERT INTO `production_db`.`customers_project` (`id_customer`, `id_project`) VALUES ('7', '4');

INSERT INTO `production_db`.`projects_dev` (`id_project`, `id_dev`) VALUES ('1', '3');
INSERT INTO `production_db`.`projects_dev` (`id_project`, `id_dev`) VALUES ('1', '4');
INSERT INTO `production_db`.`projects_dev` (`id_project`, `id_dev`) VALUES ('1', '5');
INSERT INTO `production_db`.`projects_dev` (`id_project`, `id_dev`) VALUES ('2', '7');
INSERT INTO `production_db`.`projects_dev` (`id_project`, `id_dev`) VALUES ('3', '7');
INSERT INTO `production_db`.`projects_dev` (`id_project`, `id_dev`) VALUES ('4', '6');
INSERT INTO `production_db`.`projects_dev` (`id_project`, `id_dev`) VALUES ('5', '2');
INSERT INTO `production_db`.`projects_dev` (`id_project`, `id_dev`) VALUES ('6', '1');

INSERT INTO `production_db`.`developers_skills` (`id_developer`, `id_skill`) VALUES ('1', '1');
INSERT INTO `production_db`.`developers_skills` (`id_developer`, `id_skill`) VALUES ('1', '2');
INSERT INTO `production_db`.`developers_skills` (`id_developer`, `id_skill`) VALUES ('2', '3');
INSERT INTO `production_db`.`developers_skills` (`id_developer`, `id_skill`) VALUES ('2', '5');
INSERT INTO `production_db`.`developers_skills` (`id_developer`, `id_skill`) VALUES ('3', '1');
INSERT INTO `production_db`.`developers_skills` (`id_developer`, `id_skill`) VALUES ('4', '4');
INSERT INTO `production_db`.`developers_skills` (`id_developer`, `id_skill`) VALUES ('5', '5');
INSERT INTO `production_db`.`developers_skills` (`id_developer`, `id_skill`) VALUES ('6', '2');
INSERT INTO `production_db`.`developers_skills` (`id_developer`, `id_skill`) VALUES ('7', '3');
