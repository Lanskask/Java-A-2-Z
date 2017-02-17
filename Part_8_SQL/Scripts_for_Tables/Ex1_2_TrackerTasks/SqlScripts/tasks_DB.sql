---------
-- Создать SQL скрипт инициализирующий создание новой базы данных.
---------
CREATE DATABASE task_DB;

---------
-- Создать SQL скрипт создающий таблицы для хранения структуры системы заявок.
---------

---------
	-- Только в таблице Comments 
	-- есть ссылки и хоть какая-то связь с 
	-- таблицами tasks и users.
	-- Т.е. в таблицах tasks и users
	-- никакой информации о comments нет
---------

-- EXAMPLE: 
-- 1	r
-- 2	w
-- 3	e (execute)
CREATE TABLE role_rights (
	id serial primary key,
  right varchar(200),
);

-- EXAMPLE: 
-- 1	guest r
-- 2	user 	r w
-- 3	root 	r w e (execute)
CREATE TABLE roles (
  id serial primary key,
  role varchar(200),
  role_rights varchar(200),
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
  name varchar(200),
  role varchar(200),
  role_rights varchar(200),
  -- engine_id int REFERENCES engine(id)
);

---------
-- Заявки. 
-- Комментарии заявок. 
-- Приложенные Файлы. 
-- Состояние заявки. 
-- Категории заявки.
-- task
-- task_comments

-- task_state
-- task_category	
---------
CREATE TABLE tasks (
  id serial primary key,
  title varchar(200),
  task_state varchar(200),
  task_category varchar(200),
  files bytea,
  -- comments_table int REFERENCES engine(id)
);

------------------------
-- Заявки. 
-- Комментарии заявок. 
-- Приложенные Файлы. 
-- Состояние заявки. 
-- Категории заявки.
-- task
-- task_comments
-- files
-- task_state
-- task_category	
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
