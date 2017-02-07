CREATE DATABASE projet;
USE projet;


#------------------------------------------------------------
# Table: User
#------------------------------------------------------------

CREATE TABLE User IF NOT EXISTS(
        idUser    int (11) Auto_increment  NOT NULL ,
        nom       Varchar (25) ,
        prenom    Varchar (25) ,
        motDePass Varchar (25) ,
        PRIMARY KEY (idUser )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: droit
#------------------------------------------------------------

CREATE TABLE droit IF NOT EXISTS(
        idDroits int (11) Auto_increment  NOT NULL ,
        niveau   Int ,
        severite Int ,
        nom      Varchar (25) ,
        societe  Varchar (25) ,
        PRIMARY KEY (idDroits )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: possède
#------------------------------------------------------------

CREATE TABLE possede IF NOT EXISTS(
        idUser   Int NOT NULL ,
        idDroits Int NOT NULL ,
        PRIMARY KEY (idUser ,idDroits )
)ENGINE=InnoDB;

ALTER TABLE possede ADD CONSTRAINT FK_possede_idUser FOREIGN KEY (idUser) REFERENCES User(idUser);
ALTER TABLE possede ADD CONSTRAINT FK_possede_idDroits FOREIGN KEY (idDroits) REFERENCES droit(idDroits);