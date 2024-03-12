package org.example;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String url = "jdbc:postgresql://localhost:5432/assignment-3";

        try {
            Connection connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}