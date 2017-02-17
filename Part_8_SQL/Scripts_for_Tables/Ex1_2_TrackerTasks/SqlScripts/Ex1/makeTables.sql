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
