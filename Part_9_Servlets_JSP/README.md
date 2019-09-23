# Servlets + JSP

## DataBase Service and HTTP Requests

1. Add new task. - doPost
2. Edit some Task. - doPut
3. Delete some Task. - doDelete
4. Show All Tasks. - doGet  
5. Show Filtered List. - doGet 

С помощью - GET - навигация - переход между страницами
Для редактирования, создания - POST 

## How to use PostgreSQL

- start posgresql server  
    ```sudo /etc/init.d/postgresql start```
- Enter to psql command line  
    ```sudo -u postgres psql```
- Список таблиц  
    ```select * from information_schema.tables where table_schema = 'public';```
- Список баз данных  
    ```SELECT datname FROM pg_database WHERE datistemplate = false;```
- Connect to database  
    ```\c databasename```
- list of all tables in current databese  
    ```\l```