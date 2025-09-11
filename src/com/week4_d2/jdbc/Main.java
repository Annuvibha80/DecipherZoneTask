package com.week4_d2.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    // Database credentials
    public static final String url = "jdbc:mysql://localhost:3306/annuvibhadb";
    public static final String user = "root";
    public static final String password = "Mys@#8487";

    public static void main(String[] args) {
        try {
            DBConnection dbConn = new DBConnection();
            Connection conn = dbConn.establishConnection();

            CreateTable createTable = new CreateTable();
            createTable.createTableMethod(conn);

            InsertData insertData = new InsertData();
            insertData.insertData(conn);

            UpdateData updateData = new UpdateData();
            updateData.updateTableData(conn, 1, "Anvi");

            ReadById read = new ReadById();
            read.readById(conn, 1);

            Delete delete = new Delete();
            delete.deleteById(conn, 1);

            ReadAll printTable = new ReadAll();
            printTable.printTableData(conn);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
