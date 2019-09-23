# Using Hibernate

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
- create databese 
    ```CREATE DATABASE data_base_name```
