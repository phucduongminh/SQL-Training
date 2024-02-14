# SQL-Training
A repository for training SQL

Some theories

## SQL Command Types
### Data Definition
CREATE
ALTER
DROP
### Data Query
SELECT
### Data Manipulation
INSERT
DELETE : Delete without WHERE will delete ALL rows (Using TRUNCATE instead)
UPDATE : Update without WHERE changes the values of ALL rows
### Data Control
GRANT
REVOKE
### Transaction Control
COMMIT
ROLLBACK
SAVEPOINT

## SELECT Statement
SELECT
FROM
JOINS
WHERE
GROUP BY
HAVING
ORDER BY
LIMIT

### ORDER BY
Sorts the result in a particulart order

### WHERE
filters rows based on specified conditions

### LIKE
Ex:
Begin with M : M%
End with n : %n
Containing r : %r%
At the 3rd position: __r%

### JOIN
INNER JOIN
LEFT JOIN
RIGHT JOIN
FULL OUTER JOIN

### UNION
In the query, both must have exactly the same number of columns and in the same order DATA TYPE, remember this, DATA TYPE.
UNION ALL 
Combines the row without remove duplicates.

## Aggregate Functions
COUNT
SUM
AVG
MAX
MIN

## String Function
CONCAT
LOWER
UPPER
TRIM : remove leading and trailing spaces from a string
LENGTH
SUBSTRING

## GROUP BY, HAVING
GROUP BY : group rows based on column values
HAVING : filters the groups returned by GROUP BY

HAVING and WHERE
WHERE filters rows before any grouping take place

HAVING filters values after they have been groups
HAVING works only with GROUP BY clause

## DESCRIBE
obtain information about table and column structure

## Data Types
INT //Int Number
DECIMAL(M,N) //Exact Value M digit, N digit after decimal place
VARCHAR(1) //Text, length 1
BLOB //Binary Large Object, Stores large data
DATE //'YYYY-MM-DD'
TIMESTAMP //'YYYY-MM-DD HH:MM:SS'
