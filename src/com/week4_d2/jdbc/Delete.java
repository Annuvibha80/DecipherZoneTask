package com.week4_d2.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

    public static void deleteById(Connection conn, int id) throws SQLException {

        String sql = "DELETE FROM Employee WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, 2);

        int rows = pstmt.executeUpdate();
        System.out.println(rows + " row(s) deleted!");
    }
}
