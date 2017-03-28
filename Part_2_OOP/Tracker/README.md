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
    

## TODO
### Little important TODO
- [ ] переписать что нужно с executeUpdate, executeQuery
- [ ] переписать методы SQLTracker без повтора кода 
        (с минимумов повторов)

- [ ] !!! properties file - всё ли правильно
- [ ] Одно соединение на все запросы. - Как сделать? Делать ли это?
- [x] make Tracker interface
    - [x] rename Tracker.class to TrackerCMD.class
- [ ] Add timestamp to java prog, and to sql table tasks
- [x] Sql query for delete from tasks
- [ ] check Sql query for update task

### Realy important TODO
- [ ] add prepeared statements
        Ненужно т.к. запросы в этой программе не повторяются. 
        Может только в filterByName
- [ ] 2 !!! How to add result set to ArrayList<Item> ?
- [x] CANCELED 3 !!! Realize result sets for all commands in SQLTracker
- [x] CANCELED 1 !!! Plase to each mecthod all connection process(es) 

- [x] What to do with find item by id in StartUI delete function
        - REMOVE IT
- [x] remake all methods in tracker from (Item item) to (String id)  
        DONE Even with tests  
    ```String sql_query = String.format("DELETE FROM tasks WHERE id = %s;", id);```
