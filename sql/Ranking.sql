Exercise 3: Ranking (RANK, DENSE_RANK, ROW_NUMBER)
Task:
    Assign rank to employees based on salary (highest first).
    Handle duplicate salaries using RANK(), DENSE_RANK(), and ROW_NUMBER().
Query:
    SELECT name, salary,
           RANK() OVER (ORDER BY salary DESC) AS salary_rank,
           DENSE_RANK() OVER (ORDER BY salary DESC) AS dense_rank,
           ROW_NUMBER() OVER (ORDER BY salary DESC) AS row_num
    FROM Employees;

