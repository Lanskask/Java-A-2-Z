# My SQL Project

SQl Queries and so on.

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
     

## Posible errors and there solvings
 
[PostgreSQL psql: could not connect to server: 
Connection refused](https://www.cyberciti.biz/faq/postgresql-remote-access-or-connection/)

[Common PostgreSQL Error Messages and Possible 
Solutions](http://www.revsys.com/writings/postgresql/errors.html)