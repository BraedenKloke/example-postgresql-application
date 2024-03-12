# Example PostgresSQL Application
* Course: COMP 3005 - Database Management Systems
* Assignment: 3
* Author: Braeden Kloke
* Date: March 11, 2024

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

<a id="build"></a>
# Build

## Create Database
Use file `resources/sql/create-table-students.sql` to create the table `students` with PostgreSQL 
in the database you will be connecting to.

## Build Artifacts
Run: 

```
mvn compile
mvn package
```

<a id="run"></a>
# Run
In IntelliJ, simply run the `main` method.