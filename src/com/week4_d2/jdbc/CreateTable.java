package com.week4_d2.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public void createTableMethod(Connection conn) throws SQLException {
        String createTable = "CREATE TABLE IF NOT EXISTS Employee (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(100))";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(createTable);
        System.out.println("Table created successfully.");
    }
}
