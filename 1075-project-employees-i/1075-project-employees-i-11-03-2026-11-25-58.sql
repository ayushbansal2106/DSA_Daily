# Write your MySQL query statement below
SELECT p.project_id, Round(AVG(experience_years),2) AS average_years
FROM Employee AS e
JOIN Project AS p
ON e.employee_id = p.employee_id
GROUP BY p.project_id;