package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dta {
    private static Connection conn;

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            String url = "jdbc:mysql://localhost:3306/loginuser";
            conn = DriverManager.getConnection(url, "root", "");
        }
        return conn;
    }

    public static void closeCon() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
