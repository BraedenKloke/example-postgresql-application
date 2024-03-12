CREATE TABLE students (
	student_id SERIAL PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	email VARCHAR(255) NOT NULL UNIQUE,
	enrollment_date DATE
);

INSERT INTO students
(first_name, last_name, email, enrollment_date)
VALUES 
('Reggie', 'Moustache', 'reggiemoustache@email.com', '2000-01-01'),
('Gary', 'Lasagna', 'garylasagna@email.com', '2001-02-03');