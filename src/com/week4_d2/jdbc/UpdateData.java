package com.week4_d2.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

    public void updateTableData(Connection conn, int id, String newName) throws SQLException {

        String sql = "UPDATE Employee SET name = ? WHERE id = ?";

        // Use PreparedStatement for safety
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "Anvi");  // replace first ? with newName
        pstmt.setInt(2, 1);          // replace second ? with id

        int rows = pstmt.executeUpdate();  // execute query
        System.out.println(rows + "  updated!");
    }
}
