CREATE DATABASE batch65;
SHOW DATABASES;
SHOW TABLES;

USE batch65;
DROP TABLE IF EXISTS Persons;
CREATE TABLE Persons (
	personId INTEGER,
    personName VARCHAR(10),
    salary FLOAT);
    
INSERT INTO Persons 
	(personId, personName, salary)
    VALUES
    (001, "Mary", 1.11);
    
INSERT INTO Persons 
	(personId, personName, salary)
    VALUES
    (002, "John", 1.21);
    
INSERT INTO Persons 
	(personId, personName, salary)
    VALUES
    (003, "Lisa", 1.31);
    
INSERT INTO Persons 
	(personId, personName, salary)
	VALUES
	(004, "Jisoo", 1.31);
    
INSERT INTO Persons 
	(personId, personName, salary)
	VALUES
	(005, "Zhao", 1.31);
    
INSERT INTO Persons 
	(personId, personName, salary)
	VALUES
	(006, "Qian", 1.31);
    
    
INSERT INTO Persons 
	(personId, personName, salary)
	VALUES
	(007, "Sun", 1.31);
    
INSERT INTO Persons 
	(personId, personName, salary)
	VALUES
	(008, "Li", 1.31);
    
SELECT * FROM Persons;

SELECT * FROM Persons
WHERE salary > 1.21;

SELECT * FROM Persons
ORDER BY personId  DESC;

SELECT personId, personName 
FROM Persons
WHERE salary > 3;

UPDATE Persons
SET salary = salary + Persons.personId
WHERE personId > 5;
 
SELECT * FROM Persons;

SELECT version();
















