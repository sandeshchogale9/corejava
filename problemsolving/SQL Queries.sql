--To get the employee name and their total salary till date,
--you can use an INNER JOIN between the Employee and Salary tables and aggregate the
--salary using SUM().

SELECT
    e.FName || ' ' || e.LName AS Employee_Name,
    SUM(s.Salary) AS Total_Salary
FROM Employee e
JOIN Salary s ON e.Id = s.EmpId
GROUP BY e.Id, e.FName, e.LName;


