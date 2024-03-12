package org.example;

import java.sql.*;

/**
 * Class DBAccess interfaces with PostgreSQL to perform specific CRUD operations.
 *
 * @author Braeden Kloke
 * @version March 12, 2024
 */
public class DBAccess {

    String url;
    String username;
    String password;

    /**
     * Default constructor.
     */
    public DBAccess() {
        url = "jdbc:postgresql://localhost:5432/assignment-3";
        username = "braedenkloke";
        password = "";
    }

    /**
     * Retrieves and displays all records from the students table.
     */
    public void getAllStudents() {
        System.out.println("Displaying all students ...");
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM students");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                System.out.print(resultSet.getString("student_id") + "\t");
                System.out.print(resultSet.getString("first_name") + "\t");
                System.out.print(resultSet.getString("last_name") + "\t");
                System.out.print(resultSet.getString("email") + "\t");
                System.out.println(resultSet.getString("enrollment_date"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Inserts a new student record into the students table.
     *
     * @param firstName First name of student to add.
     * @param lastName Last name of student to add.
     * @param email Email of student to add. Email format: "firstlast@email.com"
     * @param enrollmentDate Enrollment date of student to add. Date format: "2024-03-12"
     */
    public void addStudent(String firstName, String lastName, String email, String enrollmentDate) {
        System.out.println("Adding student ...");
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String values = String.format("('%s', '%s', '%s', '%s')", firstName, lastName, email, enrollmentDate);
            statement.execute("INSERT INTO students (first_name, last_name, email, enrollment_date) VALUES" + values);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Updates the email address for a student.
     *
     * @param studentId ID of student whose email address is to be updated.
     * @param newEmail New email address.
     */
    public void updateStudentEmail(String studentId, String newEmail) {
        System.out.println("Updating student email ...");
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query = String.format("UPDATE students SET email = '%s' WHERE student_id = %d", newEmail, Integer.parseInt(studentId));
            statement.execute(query);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Deletes the record of a student.
     *
     * @param studentId ID of the student to be deleted.
     */
    public void deleteStudent(String studentId) {
        System.out.println("Deleting student ...");
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query = String.format("DELETE FROM students WHERE student_id = %d", Integer.parseInt(studentId));
            statement.execute(query);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
