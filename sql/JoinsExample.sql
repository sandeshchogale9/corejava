Exercise 1: Joins (INNER JOIN, LEFT JOIN, RIGHT JOIN)
Task:
    Create two tables: Employees and Departments.
    Insert sample data.
    Write SQL queries to:
    Fetch employee names and department names using INNER JOIN.
    Show all employees, even if they don’t have a department using LEFT JOIN.
    Show all departments, even if no employees are assigned using RIGHT JOIN.

Table Schema & Data:
CREATE TABLE Departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE Employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DECIMAL(10,2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments(department_id)
);

INSERT INTO Departments VALUES (1, 'IT'), (2, 'HR'), (3, 'Finance');

INSERT INTO Employees VALUES (101, 'Alice', 70000, 1),
                            (102, 'Bob', 60000, 2),
                            (103, 'Charlie', 75000, NULL);

Write Queries:
-- 1. Fetch employees with their department names
SELECT e.name, d.department_name
FROM Employees e
INNER JOIN Departments d ON e.department_id = d.department_id;

-- 2. Show all employees (even without departments)
SELECT e.name, d.department_name
FROM Employees e
LEFT JOIN Departments d ON e.department_id = d.department_id;

-- 3. Show all departments (even those without employees)
SELECT e.name, d.department_name
FROM Employees e
RIGHT JOIN Departments d ON e.department_id = d.department_id;

