---------
-- Создать SQL скрипт инициализирующий создание новой базы данных.
---------
CREATE DATABASE task_db;
\c task_db;

---------
-- Создать SQL скрипт создающий таблицы для хранения структуры системы заявок.
---------

-- CONTENT:
	-- role_rights
	-- roles
	-- users
	-- tasks 
	-- comments

---------
	-- Только в таблице Comments 
	-- есть ссылки и хоть какая-то связь с 
	-- таблицами tasks и users.
	-- Т.е. в таблицах tasks и users
	-- никакой информации о comments нет
---------

CREATE TABLE role_rights (
	id serial primary key,
  role_right varchar(10)
);

CREATE TABLE roles (
  id serial primary key,
  role varchar(10) unique,
  role_right int REFERENCES role_rights(id)
);


---------
-- Создать UML диаграмму классов системы заявок. 
-- id
-- name
-- role
-- role_rights
---------
CREATE TABLE  users (
  id serial primary key,
  name varchar(50),
  -- role varchar(200),
  -- role varchar(10) REFERENCES roles(role)
  role_id int REFERENCES roles(id)
);

-- alter table users rename column role to role_id;

---------
-- Заявки. 
	-- Комментарии заявок. 
	-- Приложенные Файлы. 
	-- Состояние заявки. 
	-- Категории заявки.
---------
CREATE TABLE tasks (
  id serial primary key,
  title varchar(200),
  task_state varchar(200),
  task_category varchar(200),
  files bytea
);

------------------------
-- Заявки. 
	-- Комментарии заявок. 
	-- Приложенные Файлы. 
	-- Состояние заявки. 
	-- Категории заявки.
------------------------
CREATE TABLE comments (
  id serial primary key,
  title varchar(200),
  comment_text text,
  user_id int REFERENCES users(id),
  task_id int REFERENCES tasks(id)
);

---------
-- Создать SQL скрипт заполняющий начальные данные для системы заявок.
---------
insert into role_rights(role_right) values ('r'), ('w'), ('e');

insert into roles(role, role_right) 
	values 
		('guest', 1), 
		('user', 1), 
		('user', 2), 
		('root', 1), 
		('root', 2), 
		('root', 3)
;

insert into users(name, role_id) 
	values 
		('Ungerbus', 1), 
		('Shlezvig', 1), 
		('Roland', 2), 
		('Judith', 1), 
		('Olofern', 2), 
		('Lilit', 3)
;

insert into tasks(title, task_state) 
	values
		('Fridge doesnt work', 'Havnt started yet')
		('TV is broken', 'Started'), 
		('Roland', 'Finished')
;

insert into tasks(title, task_category) 
	values 
		('Computer Screen doest work ', 'electronics'), 
		('Sink flows', 'water'), 
		('There is a 404 page', 'internet')
;

insert into comments(comment_text, user_id, task_id) 
	values 
		('Bad comment', 2, 4), 
		('EverySink is good', 3, 5), 
		('So-so', 4, 6)
;