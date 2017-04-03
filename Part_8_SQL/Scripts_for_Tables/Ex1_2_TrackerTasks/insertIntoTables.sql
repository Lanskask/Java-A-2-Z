---------
-- Создать SQL скрипт заполняющий начальные данные для системы заявок.
---------
insert into role_rights(role_right) values ('r'), ('w'), ('e');

insert into roles(role, role_right) 
	values 
		('guest', 1), 
		('user', 1), 
		('user', 2), 
		('root', 1), 
		('root', 2), 
		('root', 3)
;

insert into users(name, role_id) 
	values 
		('Ungerbus', 1), 
		('Shlezvig', 1), 
		('Roland', 2), 
		('Judith', 1), 
		('Olofern', 2), 
		('Lilit', 3)
;

insert into tasks(title, task_state) 
	values
		('Fridge doesnt work', 'Havnt started yet'),
		('TV is broken', 'Started'), 
		('Roland', 'Finished')
;

insert into tasks(title, task_category) 
	values 
		('Computer Screen doest work ', 'electronics'), 
		('Sink flows', 'water'), 
		('There is a 404 page', 'internet')
;

insert into comments(comment_text, user_id, task_id) 
	values 
		('Bad comment', 2, 4), 
		('EverySink is good', 3, 5), 
		('So-so', 4, 6)
;