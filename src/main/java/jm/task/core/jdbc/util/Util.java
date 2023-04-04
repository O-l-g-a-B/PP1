package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String url = "jdbc:mysql://localhost:3306/my_db_test";
    private static String username = "root";
    private static String password = "root";

    public static Connection getConnection1() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Cоединения нет");
        }
        return null;
    }
}

