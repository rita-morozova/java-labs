create table person
(
    id integer not null,
    name varchar(225) not null,
    location varchar(225),
    birth_date timestamp,
    primary key(id)
);

INSERT INTO PERSON 
   (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(100001, 'RITA', 'SEATTLE', sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(100002, 'MARK', 'SF', sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(100003, 'HELEN', 'CAPE MAY', sysdate());




