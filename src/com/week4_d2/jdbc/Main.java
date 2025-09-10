package com.week4_d2.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        //1 Database credentials
        String url = "jdbc:mysql://localhost:3306/annuvibhadb";
        String user = "root";
        String password = "Mys@#8487";


        //2 Establish connection
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();

        // 3. Create Table
        String createTable = "CREATE TABLE IF NOT EXISTS Employee (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100))";
        stmt.executeUpdate(createTable);

        // 4. Insert Data
        stmt.executeUpdate("INSERT INTO Employee (id, name) VALUES (1, 'Annuvibha')");
        stmt.executeUpdate("INSERT INTO Employee (id, name) VALUES (2, 'Kajal')");

        // 5. Select and Print
        ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
        }



    }
}
