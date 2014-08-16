
create schema rsoi_Planning default character set utf8;

-- Таблица зарегистрированных пользователей
create table rsoi_Planning.user (
  USER_GUID VARCHAR(200) NOT NULL,
  USER_LOGIN VARCHAR(100) NOT NULL,
  USER_PWD VARCHAR(100) NOT NULL,
  USER_NAME VARCHAR(100),
  USER_LNAME VARCHAR(100),
  USER_MNAME VARCHAR(100), 
  LAST_UPDATE_DT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

  PRIMARY KEY(USER_GUID)
);

CREATE TABLE rsoi_Planning.org(
id INT(15) NOT NULL AUTO_INCREMENT ,
inn VARCHAR( 200 ) NOT NULL ,
caption VARCHAR( 200 ) NOT NULL ,
code VARCHAR( 200 ) NOT NULL ,
PRIMARY KEY ( id )
);

create table rsoi_Planning.documentClass (
  id INT(15) NOT NULL AUTO_INCREMENT,
  classDoc numeric(15,0) NOT NULL,
  caption  varchar(200) NOT NULL,
  
  primary key(id)
  );


CREATE TABLE rsoi_Planning.stateProgDoc (
  id INT(15) NOT NULL AUTO_INCREMENT,
  numberDoc numeric(15,0) NOT NULL,
  dateDoc DATE NOT NULL,
  dateApprove DATE, 
  dateStart DATE NOT NULL,
  dateEnd DATE NOT NULL,
  caption VARCHAR(200) NOT NULL,
  comment VARCHAR(200),
  
  org_id INT(15) NOT NULL REFERENCES org(id),
  documentClass_id INT(15) NOT NULL REFERENCES documentClass(id),
  parent INT(15) REFERENCES stateProgDoc(id),

  PRIMARY KEY(id)
);

create table rsoi_Planning.stateProgDocChildren (
  slave INT(15) NOT NULL REFERENCES stateProgDoc(id),
  master INT(15) NOT NULL REFERENCES stateProgDoc(id)
  
  );
