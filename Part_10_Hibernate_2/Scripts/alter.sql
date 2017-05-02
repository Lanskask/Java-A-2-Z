
-- int id;
-- String login;
-- String password;
-- Timestamp created;
create table users (
  id serial primary key,
  login varchar(50),
  password varchar(50),
  created timestamp without time zone
);

-- int id;
-- String text;
create table comments (
  id serial primary key,
  text varchar(200)
);

-- int id;
-- String desc;
-- User author;
-- List<Comment> comments;
-- Timestamp created;
create table items (
  id serial NOT NULL,
  description TEXT,
  author_id int not null references users(id),
  comments_id int references comments(id),
  created TIMESTAMP WITHOUT TIME ZONE DEFAULT now(),
  CONSTRAINT items_pkey PRIMARY KEY (id)
);
--   ,
--   CONSTRAINT items_author_id_fkey FOREIGN KEY (author_id)
--     REFERENCES users (id) MATCH SIMPLE
--     ON UPDATE NO ACTION ON DELETE NO ACTION

-- ----------------------
delete from comments;
delete from items;

alter table items
    add COLUMN
      author_id int not null
        REFERENCES users(id);