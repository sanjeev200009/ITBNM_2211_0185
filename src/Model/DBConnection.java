package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/loginuser";
                conn = DriverManager.getConnection(url, "root", "");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static Statement getStatementConnection() {
        Statement stmt = null;
        try {
            conn = getConnection();
            if (conn != null) {
                stmt = conn.createStatement();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }

    // Close the connection
    public static void closeCon() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}





















