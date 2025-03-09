Exercise 4: Query Optimization

Task:
    Optimize this inefficient query:
    SELECT * FROM Employees WHERE salary > 60000;
    Optimized Query:
    -- Create an index on salary for faster filtering
    CREATE INDEX idx_salary ON Employees(salary);

    -- Query will now execute faster
    SELECT name, salary FROM Employees WHERE salary > 60000;

Challenge1:
    Optimize Complex Queries using EXPLAIN ANALYZE
Task:
    Identify inefficient queries and optimize them.

    Step 1:
        Run EXPLAIN ANALYZE on an Unoptimized Query
        EXPLAIN ANALYZE
        SELECT * FROM Employees WHERE salary > 60000;
    Problem:
        If there's no index on salary, this query performs a full table scan, which is slow for large datasets.

    Step 2: Optimize Using Indexing
        CREATE INDEX idx_salary ON Employees(salary);

    Optimized Query Execution:
        EXPLAIN ANALYZE
        SELECT name, salary FROM Employees WHERE salary > 60000;

Now, the query uses the index (idx_salary) instead of scanning all rows.
Performance Improvement: Reduced query execution time significantly.


Challenge 2: Find the Highest-Paid Employee in Each Department
Task:
    Fetch the employee(s) with the maximum salary in each department.

    Using JOIN and MAX() Subquery:
        SELECT e.name, e.salary, d.department_name
        FROM Employees e
        JOIN Departments d ON e.department_id = d.department_id
        WHERE e.salary = (SELECT MAX(salary)
                          FROM Employees e2
                          WHERE e2.department_id = e.department_id);

    Problem with this Approach? If multiple employees have the same highest salary,
    it still works but is less efficient for large datasets.

    Better Approach:
        Using RANK() with PARTITION BY

        SELECT name, salary, department_name
        FROM (
            SELECT e.name, e.salary, d.department_name,
                   RANK() OVER (PARTITION BY e.department_id ORDER BY e.salary DESC) AS salary_rank
            FROM Employees e
            JOIN Departments d ON e.department_id = d.department_id
        ) ranked
        WHERE salary_rank = 1;

Why RANK()? It returns multiple employees if there’s a tie in salary.
Why PARTITION BY? It groups results by department, ranking salaries within each department.

Challenge 3: Advanced PARTITION BY Window Function

Task:
    Assign a salary ranking to employees within each department without skipping ranks (use DENSE_RANK()).

Solution:
    SELECT name, salary, department_name,
           DENSE_RANK() OVER (PARTITION BY department_id ORDER BY salary DESC) AS salary_rank
    FROM Employees;

    What This Does:
        Groups employees by department (PARTITION BY department_id).
        Ranks them based on salary (ORDER BY salary DESC).
        Uses DENSE_RANK() to avoid skipped numbers if multiple employees have the same salary.
