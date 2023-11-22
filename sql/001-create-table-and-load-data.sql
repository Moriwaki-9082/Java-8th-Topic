DROP TABLE IF EXISTS names;
CREATE TABLE names (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 PRIMARY KEY(id)
);
INSERT INTO names (name) VALUES ('apple');
INSERT INTO names (name) VALUES ('banana');
INSERT INTO names (name) VALUES ('grape');
INSERT INTO names (name) VALUES ('peach');
INSERT INTO names (name) VALUES ('kiwi');
