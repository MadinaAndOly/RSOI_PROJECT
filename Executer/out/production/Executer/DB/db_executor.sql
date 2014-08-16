
create schema rsoi_Executor default character set utf8;

-- Таблица зарегистрированных пользователей
create table rsoi_Executor.user (
  USER_GUID VARCHAR(200) NOT NULL,
  USER_LOGIN VARCHAR(100) NOT NULL,
  USER_PWD VARCHAR(100) NOT NULL,
  USER_NAME VARCHAR(100),
  USER_LNAME VARCHAR(100),
  USER_MNAME VARCHAR(100), 
  LAST_UPDATE_DT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

  PRIMARY KEY(USER_GUID)
);


CREATE TABLE rsoi_Executor.programms (
  id INT(15) NOT NULL AUTO_INCREMENT,
  numberDoc numeric(15,0) NOT NULL,
  dateDoc DATE NOT NULL,
  dateApprove DATE, 
  dateStart DATE NOT NULL,
  dateEnd DATE NOT NULL,
  caption VARCHAR(200) NOT NULL,
  comment VARCHAR(200),
  documentClass INT(15) NOT NULL,
  parent INT(15) REFERENCES programms(id),

  PRIMARY KEY(id)
);

create table rsoi_Executor.programmsChildren (
  slave INT(15) NOT NULL REFERENCES stateProgDoc(id),
  master INT(15) NOT NULL REFERENCES stateProgDoc(id)
  
  )
