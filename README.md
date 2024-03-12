# Example PostgresSQL Application
* Course: COMP 3005 - Database Management Systems
* Assignment: 3
* Author: Braeden Kloke
* Date: March 12, 2024

# Summary
Example application that connects to a PostgreSQL database to perform specific 
CRUD (Create, Read, Update, Delete) operations.

Application functions include:
* `getAllStudents()`: Retrieves and displays all records from the students table.
* `addStudent(firstName, lastName, email, enrollmentDate)`: Inserts a new student record into the students table.
* `updateStudentEmail(studentId, newEmail)`: Updates the email address for a student with the specified studentId.
* `deleteStudent(studentId)`: Deletes the record of the student with the specified studentId.

# Table of Contents
1. [Build](#build)
2. [Run](#run)
3. [Improvements](#improvements)

<a id="build"></a>
# Build

## Initialize Database
Run file `resources/sql/initialize-db.sql` through your PostgreSQL interface of choice to create 
and populate the table `students` in the database you will be connecting to.

## Build Artifacts
Run: 

```
mvn compile
mvn package
```

<a id="run"></a>
# Run
In IntelliJ, simply run the `main` method.


<a id="improvements"></a>
# Improvements
* Create helper methods to construct SQL queries. 
For example, in method addStudents, the function arguments are Strings but each arg needs to
be wrapped in single quotes to make it a valid SQL value.
For example, string `"Bob"` would need to be transformed into string `"'Bob'"`