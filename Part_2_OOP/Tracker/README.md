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

## TODO
### Realy important TODO
- [ ] Add 
    ```public ArrayList<Item> items = new ArrayList<Item>();```
    to Tracker Interface and realize it in SQLTracker class.

### Little important TODO
- [ ] Properties throw property file

### DONE
#### Since 03.04.2017
- Important
- [x] ~~prepeared statements всё равно сделать для безопасности.~~
- [x] ~~2 !!! How to add result set to ArrayList<Item> ?~~

- Not important
- [x] ~~Add  all close to finally~~ 
- [x] ~~Add timestamp to java prog, and to sql table tasks~~
- [x] ~~check Sql query for update task~~

#### Before 03.04.2017
- Not important
- [x] ~~*CANCELED* Change update(Item item) to  
        update(String items_id, String items_name, String items_description)  
        update(String items_id, String items_name)~~  
- [x] ~~*CANCELED* переписать методы SQLTracker без повтора кода 
        (с минимумов повторов) - Возможно ли это (это же не АОП)?~~

- [x] ~~!!! properties file - всё ли правильно~~
- [x] ~~*CANCELED* Одно соединение на все запросы. - Как сделать? Делать ли это?~~
- [x] ~~make Tracker interface~~
    - [x] ~~rename Tracker.class to TrackerCMD.class~~
- [x] ~~Sql query for delete from tasks~~

- Important
- [x] ~~*CANCELED* 3 !!! Realize result sets for all commands in SQLTracker~~
- [x] ~~*CANCELED* 1 !!! Plase to each mecthod all connection process(es)~~ 
- [x] ~~**ПРОВЕРИТЬ** (to test): переписать что нужно с executeUpdate, executeQuery~~
- [x] ~~What to do with find item by id in StartUI delete function
        - REMOVE IT~~
- [x] ~~remake all methods in tracker from (Item item) to (String id)  
        DONE Even with tests~~  
    ```String sql_query = String.format("DELETE FROM tasks WHERE id = %s;", id);```
