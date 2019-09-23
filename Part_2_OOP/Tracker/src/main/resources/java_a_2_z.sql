---------
-- Заявки.
	-- Комментарии заявок.
	-- Приложенные Файлы.
	-- Состояние заявки.
	-- Категории заявки.
---------
CREATE TABLE tasks (
  id SERIAL PRIMARY KEY,
  title VARCHAR(200),
  description VARCHAR(200),
  creationDate TIMESTAMPTZ
);

-- ALTER TABLE tasks ALTER COLUMN creationDate TYPE TIMESTAMP WITH TIME ZONE USING creationDate AT TIME ZONE 'UTC';

insert into tasks(title, description, creationDate)
values
  ('Fridge doesnt work', ' Is your ' ||
                         'refrigerator not working? If ' ||
                         'it’s time to do some refrigerator ' ||
                         'they can break down, and, when they ' ||
                         'do, food can spoil in a hurry. ', LOCALTIMESTAMP);

insert into tasks(title, description, creationDate)
values
  ('TV is broken', 'If you''ve bought a TV that develops a fault, ' ||
                   'you should be able to claim for a repair or ... ' ||
                   'Or got a broken television that is out of ' ||
                   'warranty and on its last legs,', LOCALTIMESTAMP);

insert into tasks(title, description, creationDate)
values
  ('Microwave is broken', 'If any repair procedure ' ||
                          'ever seems too involved for you, ' ||
                          'any potentially dangerous ' ||
                          'repair on your own.', LOCALTIMESTAMP);

-- UPDATE tasks SET id = 1 WHERE title = 'Fridge doesnt work';