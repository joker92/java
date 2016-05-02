DROP DATABASE IF EXISTS `mar31`;
CREATE DATABASE `mar31` DEFAULT CHARSET=utf8;
USE `mar31`;
CREATE TABLE `cliente`(
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY,
    `nome` VARCHAR(255) NOT NULL ,  
    `cognome` varchar(255)NOT NULL 
)ENGINE=InnoDB;

INSERT INTO `cliente` (`nome`,`cognome`)
    VALUES('beppe','trx');
INSERT INTO `cliente` (`nome`,`cognome`)
    VALUES('cico','cola');
INSERT INTO `cliente` (`nome`,`cognome`)
    VALUES('lex','lutor');
INSERT INTO `cliente` (`nome`,`cognome`)
    VALUES('super','man');

CREATE TABLE `lapide`(`id` INTEGER AUTO_INCREMENT PRIMARY KEY,
    `nome` VARCHAR(255) NOT NULL ,  
    `cognome` varchar(255)NOT NULL ,
     `data_nascita` DATE ,
      `data_morte` DATE,
      `epitaffio` VARCHAR(255) NOT NULL
      
)ENGINE=InnoDB;


INSERT INTO `lapide` (`nome`,`cognome`,data_nascita,data_morte,epitaffio)
    VALUES('dario','trx','1994-8-18','2050-6-30','i tuoi cari ti mandano a fanculo');


CREATE TABLE `funerale`(`id` INTEGER AUTO_INCREMENT PRIMARY KEY,
            `id_cliente` INTEGER,
            `id_lapide`  INTEGER ,
         CONSTRAINT FOREIGN KEY (id_cliente) REFERENCES cliente(id) ,
         CONSTRAINT FOREIGN KEY (id_lapide) REFERENCES lapide(id) , 
         `data_funerale` DATE
    )ENGINE=InnoDB;


INSERT INTO `funerale`(`id_cliente`,`id_lapide`,data_funerale)
VALUES('2','1','2015-3-6');