
create table a(
  num int
);

create table b(
  num int
);

create table c(
  num int
);

create table d(
  num int
);


insert into a values
  (-1), (0), (1), (2)
;
insert into b values
  (5), (6), (7), (8), (9)
;

insert into c values
  (13), (14), (15), (16), (17)
;

insert into d values
  (1), (2), (3), (4),
  (6), (7), (8), (9),
  (11), (12), (13), (14), (15)
;

-------- Selects
select a.num from a
  right join d on d.num = a.num where a.num is not null;

select a.num, b.num, c.num from d 
	full join a on a.num = d.num
	full join b on b.num = d.num
	full join c on c.num = d.num
where d.num is null;
