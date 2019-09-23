SELECT * FROM movies where title like "toy story%";
select * from movies where director = "John Lasseter";
select * from movies where director != "John Lasseter";
SELECT * FROM movies where title like "WALL-%";


SELECT * FROM north_american_cities where country = 'Canada';
SELECT * FROM north_american_cities where country = 'United States' order by latitude desc;
SELECT * FROM north_american_cities where longitude < 
    (select longitude from north_american_cities where city = 'Chicago')
    order by longitude;
select * from north_american_cities where country = 'Mexico' order by population desc limit 2;
select * from north_american_cities where country = 'United States' order by population desc limit 2 offset 2;

SELECT bo.domestic_sales, bo.international_sales FROM boxoffice bo
    inner join movies m
    on m.id = bo.movie_id
    order by m.id;
SELECT title FROM boxoffice bo
    inner join movies m
    on m.id = bo.movie_id
    where bo.domestic_sales < bo.international_sales
    order by m.id;
SELECT title FROM boxoffice bo
    inner join movies m
    on m.id = bo.movie_id
    order by bo.rating desc;
		(SELECT title, rating
		FROM movies
		  JOIN boxoffice
		    ON movies.id = boxoffice.movie_id
		ORDER BY rating DESC;)


SELECT column, another_column, …
FROM mytable
INNER/LEFT/RIGHT/FULL JOIN another_table 
    ON mytable.id = another_table.matching_id
WHERE condition(s)
ORDER BY column, … ASC/DESC
LIMIT num_limit OFFSET num_offset;


SELECT * FROM employees e
    full join buildings b 
    on b.building_name = e.building;

-- SELECT DISTINCT Building_name, capacity FROM buildings;
SELECT DISTINCT Role, Building FROM Employees;
-- List all buildings and the 
-- distinct employee roles in each 
-- building (including empty buildings) 
SELECT DISTINCT building_name, role 
FROM buildings 
  LEFT JOIN employees
    ON building_name = building;

SELECT role, name FROM employees where building is null;

-- Find the names of the buildings that hold no employees ✓
SELECT distinct b.building_name, e.Name FROM buildings b 
    left join employees e
    on b.building_name = e.building
    where e.name is null;
-- ============================
SELECT title, year AS odd_year
FROM movies
  JOIN boxoffice
    ON movies.id = boxoffice.movie_id
    where year % 2 = 0;

-- Find the longest time that an employee has been at the studio ✓
SELECT max(Years_employed) FROM employees;
-- For each role, find the average number of years employed by employees in that role ✓
select Role, avg(Years_employed) from employees group by Role;
-- Find the total number of employee years worked in each building
select Building, sum(Years_employed) from employees group by Building;
----------------------
-- Find the number of Artists in the studio (without a HAVING clause) ✓
-- Find the number of Employees of each role in the studio ✓
-- Find the total number of years employed by all Engineers ✓
select role, count(*) from employees group by role;
select sum(Years_employed) from employees where role = 'Engineer';
-- Find the number of movies each director has directed ✓
SELECT director, count(*) FROM movies group by director;
-- Find the total domestic and international sales that can be attributed to each director
select director, sum(Domestic_sales) + sum(International_sales) from movies join Boxoffice on movies.id=Boxoffice.Movie_id group by director;
-- The director for A Bug's Life is incorrect, it was actually directed by John Lasseter ✓
-- The year that Toy Story 2 was released is incorrect, it was actually released in 1999 ✓
-- Both the title and directory for Toy Story 8 is incorrect! The title should be "Toy Story 3" and it was directed by Lee Unkrich
select * from movies;
update Movies set year = 1999 where title = 'Toy Story 2';
update Movies set title = 'Toy Story 3', director='Lee Unkrich' where id = 11;
	/*PRIMARY KEY	This means that the values in this column are unique, and each value can be used to identify a single row in this table.
AUTOINCREMENT	For integer values, this means that the value is automatically filled in and incremented with each row insertion. Not supported in all databases.
UNIQUE	This means that the values in this column have to be unique, so you can't insert another row with the same value in this column as another row in the table. Differs from the `PRIMARY KEY` in that it doesn't have to be a key for a row in the table.
NOT NULL	This means that the inserted value can not be `NULL`.
CHECK (expression)	This is allows you to run a more complex expression to test whether the values inserted are value. For example, you can check that values are positive, or greater than a specific size, or start with a certain prefix, etc.
FOREIGN KEY	This is a consistency check which ensures that each value in this column corresponds to another value in a column in another table.
For example, if there are two tables, one listing all Employees by ID, and another listing their payroll information, the `FOREIGN KEY` can ensure that every row in the payroll table corresponds to a valid employee in the master Employee list.*/

-- ================
create table Buildings (
	building_name varchar(50),
	capacity int		
);
insert into Buildings values	
('1e', 24), 
('1w', 32), 
('2e', 16), 
('2w', 20);

create table employees (
	Role varchar(50), 
	Name varchar(50), 
	Building varchar(5), 
	Years_employed int
);
insert into employees values 
	('Engineer', 'Becky A.', 	'1e', 	4), 
	('Engineer', 'Dan B.', 	'1e', 	2), 
	('Engineer', 'Sharon F.', 	'1e', 	6), 
	('Engineer', 'Dan M.', 	'1e', 	4), 
	('Engineer', 'Malcom S.', 	'1e', 	1), 
	('Artist', 'Tylar S.',	'2w',	2), 
	('Artist', 'Sherman D.',	'2w',	8), 
	('Artist', 'Jakob J.',	'2w',	6), 
	('Artist', 'Lillia A.',	'2w',	7), 
	('Artist', 'Brandon J.',	'2w',	7), 
	('Manager', 'Scott K.',	'1e',	9), 
	('Manager', 'Shirlee M.',	'1e',	3), 
	('Manager', 'Daria O.',	'2w',	6);

-- =============
create table emp_bonus (
	EMPNO integer, 
	RECEIVED timestamp, 
	TYPE integer 
);
insert in to emp_bonus values 
	(7369,  '14-MAR-2005', 1), 
	(7900,  '14-MAR-2005', 2), 
	(7788,  '14-MAR-2005', 3);
