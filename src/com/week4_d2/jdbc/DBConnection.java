package com.week4_d2.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection establishConnection() throws SQLException {
        // Establish connection
        Connection conn = DriverManager.getConnection(Main.url, Main.user, Main.password);
        return conn;
    }
}
