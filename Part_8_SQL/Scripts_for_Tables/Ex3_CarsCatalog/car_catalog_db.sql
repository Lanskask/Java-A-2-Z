--------
-- Создать структур данных в базе. Таблицы. Трансмиссия. Двигатель, Коробка передач.
-- Вместо Коробка передач - car_body
--------

--------------------- CONTENT: 
--  car 
--   id |     name     | transmissions_id | car_body_id | engine_id
-- engines
--   id |      type  
-- transmissions
--   id |      type  
-- car_bodies
--   id |      type  
--------------------


create table transmissions (
  id serial primary key,
  type varchar(200)
);

create table car_bodies (
  id serial primary key,
  type varchar(200)
);

create table engines (
  id serial primary key,
  type varchar(200)
);

-----------
-- Создать структуру Машина. Машина не может существовать без данных из первого задания.
------------
CREATE TABLE car (
  id serial primary key,
  name varchar(200),
  transmissions_id int REFERENCES transmissions(id), 
  car_body_id int REFERENCES car_bodies(id), 
  engine_id int REFERENCES engine(id)
);

CREATE TABLE car (
  id serial primary key,
  name varchar(200),
  transmissions_id int REFERENCES transmissions(id),
  car_body_id int REFERENCES car_bodies(id),
  engine_id int REFERENCES engine(id)
);

-----------
-- Вставка данных
-----------
insert into engines(type) values
  ('Diesel engine'), 
  ('Petrol engine'), 
  ('Gas engine'), 
  ('Electric engine')
;

insert into car_bodies(type) values
  ('Multi-purpose vehicles (MPV)'), 
  ('Convertible'), 
  ('Estate'), 
  ('Coupe'), 
  ('Hatchback')
;

insert into transmissions(type) values
  ('Manual transmission'), 
  ('Automatic transmission'), 
  ('Continuously variable transmission (CVT)'), 
  ('Semi-automatic and dual-clutch transmissions')
;

insert into car(name, transmition_id, car_body_id, engine_id) values
  ('Chevy Cruze', 1, 2, 7), 
  ('Ford Fusion', 4, 1, 7), 
  ('Chevy Malibu', 2, 3, 9), 
  ('Ford Taurus', 2, 3, 9)
;

-----------
-- Вывести все машины.
-----------
select * from car;

-- All cars and there detales
select c.id, c.name, e.type, t.type, b.type from cars c, engines e, transmissions t, car_bodies b
where e.id = c.engine_id and
      t.id = c.transmissions_id and
      b.id = c.car_body_id
;

-----------
-- Вывести все неиспользуемые детали.
-----------
select e.type, t.type, b.type from cars c
full join engines e on e.id = c.engine_id
full join transmissions t on t.id = c.transmissions_id
full join car_bodies b on b.id = c.car_body_id
  where c.engine_id is null and
   c.transmissions_id is null and
   c.car_body_id is null;

-- Why this works uncorrect
select e.type, t.type, b.type from cars c
right join engines e on e.id = c.engine_id
right join transmissions t on t.id = c.transmissions_id
right join car_bodies b on b.id = c.car_body_id
  where c.engine_id is null and
   c.transmissions_id is null and
   c.car_body_id is null;

