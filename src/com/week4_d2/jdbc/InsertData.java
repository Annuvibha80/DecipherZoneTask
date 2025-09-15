package com.week4_d2.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public void insertData(Connection conn) throws SQLException {
        String insertQuery = "INSERT INTO Employee (name) VALUES ('Annuvibha'), ('Kajal')";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(insertQuery);
        System.out.println("Data inserted successfully.");
    }
}
