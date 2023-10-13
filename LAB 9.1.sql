create table students (
id int primary key auto_increment,
first_name varchar(150) not null);

create table papers (
student_id int,
title varchar(150),
grade int,
foreign key (student_id) 
	references students(id));
    
    
desc papers;

INSERT INTO students (first_name) VALUES 
('Caleb'), ('Samantha'), ('Raj'), ('Carlos'), ('Lisa');

INSERT INTO papers (student_id, title, grade ) VALUES
(1, 'My First Book Report', 60),
(1, 'My Second Book Report', 75),
(2, 'Russian Lit Through The Ages', 94),
(2, 'De Montaigne and The Art of The Essay', 98),
(4, 'Borges and Magical Realism', 89);

select * from papers;
select * from students;

select first_name, title, grade
from students s
left join papers p
	on s.id = p.student_id;
    
select first_name, ifnull(title, 'MISSING') AS title, ifnull(grade, 0) as grade
from students s
left join papers p
	on s.id = p.student_id;
    
    
select first_name, ifnull(avg(grade), 0) as average
from students s
left join papers p
	on s.id = p.student_id
group by first_name
order by average desc;

select first_name, ifnull(avg(grade), 0) as average, 
		-- if(avg(grade) > 50, 'PASSING', 'FAILING') as 'passing_status'
        case when avg(grade) > 50 then 'PASSING' 
			else 'FAILING'
            end passing_status
from students s
left join papers p
	on s.id = p.student_id
group by first_name
order by average desc;


