CREATE DATABASE lfgPrueba;

USE lfgPrueba;

CREATE TABLE users(
id int auto_increment,
username VARCHAR(255) not null,
user_password VARCHAR(255) not null,
steam_name VARCHAR(255),
discord_name VARCHAR(255),
PRIMARY KEY (id)
);

INSERT INTO users (username, user_password) VALUES ('user1', 'contraseña123');
INSERT INTO users (username, user_password) VALUES ('user2', 'contraseña123');

CREATE TABLE parties(
id int auto_increment,
name_party VARCHAR(255),
videogame VARCHAR(255),
PRIMARY KEY (id)
);

INSERT INTO parties (name_party, videogame) VALUES ('Party A', 'Call of Duty');
INSERT INTO parties (name_party, videogame) VALUES ('Party B', 'Fortnite');


CREATE TABLE user_party(
id int auto_increment,
user_id int,
party_id int,
PRIMARY KEY (id),
FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (party_id) REFERENCES parties (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO user_party (user_id, party_id) VALUES(1, 2);

CREATE TABLE messages(
id int auto_increment,
user_id int,
party_id int,
msg varchar(255),
PRIMARY KEY(id),
FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (party_id) REFERENCES parties (id) ON DELETE CASCADE ON UPDATE CASCADE
);