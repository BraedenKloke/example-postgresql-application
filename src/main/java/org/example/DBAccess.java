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
}
