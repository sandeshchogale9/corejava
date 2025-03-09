--To find the 2nd highest salary by department, you can use DENSE_RANK() or
--LIMIT with subquery in SQL.
SELECT dept, sal
FROM (
    SELECT dept, sal, DENSE_RANK() OVER (PARTITION BY dept ORDER BY sal DESC) AS rnk
    FROM EMP
) ranked
WHERE rnk = 2;

SELECT dept, sal
FROM EMP e1
WHERE sal = (
    SELECT DISTINCT sal
    FROM EMP e2
    WHERE e2.dept = e1.dept
    ORDER BY sal DESC
    LIMIT 1 OFFSET 1
);

