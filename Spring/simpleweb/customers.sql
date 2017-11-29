
-- create database
-- create database frombook with owner = user1 encoding = 'UTF8';
-- \c frombook

-- making sequence
drop SEQUENCE if EXISTS int_sequence;
create sequence int_sequence
  increment 1
  start 1
  maxvalue 2147483647
  cache 1;
alter sequence int_sequence owner to user1;

-- create tables
drop table if EXISTS customers CASCADE;
drop table if EXISTS orders CASCADE;
drop table if EXISTS order_lines CASCADE;
drop table if EXISTS products CASCADE;
drop table if EXISTS comments CASCADE;

CREATE table customers (
  id integer unique not null default nextval('int_sequence') PRIMARY KEY,
  name varchar(100),
  customer_since TIMESTAMP
);

create table products (
  id integer unique not null default nextval('int_sequence') primary key,
  name varchar(100),
  price decimal,
  in_stock BOOLEAN
);

create table comments (
  id integer unique not null default nextval('int_sequence') primary key,
  text text,
  product_id integer REFERENCES products(id)
);

create table order_lines (
  id integer unique not null default nextval('int_sequence') primary key,
  amount integer,
  purchase_price DECIMAL,
  product_id integer REFERENCES products(id)
);

create table orders (
  id integer unique not null default nextval('int_sequence') primary key,
  date timestamp,
  customer_id integer references customers(id),
  order_lines_id integer REFERENCES order_lines(id)
);
