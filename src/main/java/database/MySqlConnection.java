package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    private final static String URL = "jdbc:mysql://localhost:3306/mysql";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "1111";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}