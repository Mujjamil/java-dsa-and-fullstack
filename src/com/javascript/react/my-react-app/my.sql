SELECT MAX(salary) as second_highest_salary
FROM employee
WHERE salary < (
    SELECT MAX(salary)
    FROM employee
);