# Write your MySQL query statement below
Select email AS Email
from Person
Group by email
having count(email) > 1;