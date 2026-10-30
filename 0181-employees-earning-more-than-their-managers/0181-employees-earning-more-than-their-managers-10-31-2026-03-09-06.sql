# Write your MySQL query statement below
SELECT m.name AS Employee
FROM Employee AS e
INNER JOIN Employee AS m
ON e.id = m.managerId
WHERE e.salary < m.salary;