
create table users (
  id serial primary key,
  user_name varchar(30),
  user_login varchar(30),
  email varchar(50),
  createDate TIMESTAMP
);

INSERT INTO users(user_name, user_login, email, createDate) VALUES
  ('Dalida', 'Dal28', 'dal@mail.df', CURRENT_TIMESTAMP),
  ('Delon', 'Delon', 'delon@dmail.df', CURRENT_TIMESTAMP - INTERVAL '100 days'),
  ('Serge', 'Sergio', 'serg@mail.rg', CURRENT_TIMESTAMP - INTERVAL '50 days'),
  ('Michael', 'Micha', 'mich@mail.jh', CURRENT_TIMESTAMP + INTERVAL '100 days');