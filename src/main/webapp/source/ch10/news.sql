drop table news;

CREATE TABLE news (
	aid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR NOT NULL,
	img VARCHAR NOT NULL,
	date TIMESTAMP,
	content VARCHAR NOT NULL
);