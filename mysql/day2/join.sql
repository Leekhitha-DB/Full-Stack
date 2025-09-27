create database stduent_course_db;
use stduent_course_db;

CREATE TABLE Students_1NF (
    Student_ID INT PRIMARY KEY,
    Student_Name VARCHAR(50)
);
desc students_1nf;
INSERT INTO Students_1NF VALUES
(1, 'John Doe'),
(2, 'Jane Smith'),
(3, 'Alex Brown');

select * from Students_1NF;

CREATE TABLE Instructors_3NF (
    Instructor_ID INT PRIMARY KEY,
    Instructor_Name VARCHAR(50)
);
desc Instructors_3NF;

INSERT INTO Instructors_3NF VALUES
(1, 'Mr. Alan'),
(2, 'Mrs. Smith'),
(3, 'Dr. White');

select * from Instructors_3NF;

CREATE TABLE Courses_3NF (
    Course_ID INT PRIMARY KEY,
    Course_Name VARCHAR(50),
    Instructor_ID INT,
    FOREIGN KEY (Instructor_ID) REFERENCES Instructors_3NF(Instructor_ID)
);
desc Courses_3NF;

INSERT INTO Courses_3NF VALUES
(101, 'Math', 1),
(102, 'Physics', 2),
(103, 'Chemistry', 3);

select * from Courses_3NF;

CREATE TABLE StudentCourses_2NF (
    Student_ID INT,
    Course_ID INT,
    PRIMARY KEY (Student_ID, Course_ID),
    FOREIGN KEY (Student_ID) REFERENCES Students_1NF(Student_ID),
    FOREIGN KEY (Course_ID) REFERENCES Courses_3NF(Course_ID)
);

desc StudentCourses_2NF;

INSERT INTO StudentCourses_2NF VALUES
(1, 101),
(1, 102),
(2, 101),
(3, 102),
(3, 103);

show tables;

desc StudentCourses_2NF;
desc Students_1NF; -- student name
desc Courses_3NF;  -- course name
desc Instructors_3NF; -- instructor name

select s.Student_Name,c.Course_Name,i.Instructor_Name
from StudentCourses_2NF as sc
join Students_1NF s on sc.Student_ID=s.Student_ID
join Courses_3NF c on sc.Course_ID=c.Course_ID
join Instructors_3NF i on sc.Instruction_ID=i.Instruction_ID;