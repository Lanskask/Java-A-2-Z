# Tracker program
Program to track items

Now using Postgres.

## Task has
- id
- name
- description
- creation date (Date type)
- Comments List (String array)

## Functions to operate
- Add new task
- Edit task
- Delete task
- Show all tasks
- Show filtered list

## SQL Tracker functions:
- add
- update
- delete
- findAll
- findByName

## SQL Methods to make queries
- executeUpdate for:
    - INSERT
    - UPDATE
    - DELETE
    - для команд определения данных:
        - CREATE TABLE
        - DROP TABLE
- executeQuery for
    - SELECT
- execute
    - для интерактивного создания запросов


### Pattern Заместитель
Я хочу сделать так:
```private Tracker tracker;```
вместо
```private CMDTracker tracker;```
в классе StartUI. Но в в этом классе используется далее
```public ArrayList<Item> items = new ArrayList<Item>();```
Т.е. это надо добавить в интерфейс Tracker. 
Получится ли это использовать? 
Или, точнее сказать, это и так надо использовать?
Да, как я понимаю это и так надо использовать.