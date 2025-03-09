Exercise 2: Group By & Having
Task:
    Find the number of employees in each department.
    Filter departments that have more than one employee.
Query:
    SELECT d.department_name, COUNT(e.id) AS employee_count
    FROM Employees e
    JOIN Departments d ON e.department_id = d.department_id
    GROUP BY d.department_name
    HAVING COUNT(e.id) > 1;

