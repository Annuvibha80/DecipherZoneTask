package com.week4_d2.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadById {

    public static void readById(Connection conn, int id) throws SQLException {

        String sql = "SELECT * FROM Employee WHERE id = ?";


        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        ResultSet rs = pstmt.executeQuery();


        while (rs.next()) {
            int empId = rs.getInt("id");
            String name = rs.getString("name");

            System.out.println("ID: " + empId + ", Name: " + name);
        }
    }
}
