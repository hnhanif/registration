package registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDatabase {

    private static final String URL = "jdbc:mysql://localhost:3306/registration"; // Corrected port number
    private static final String USERNAME = "root";
    private static final String PASSWORD = ""; // Enter your MySQL password here
    public static Connection connection; // Corrected variable name

    public static boolean db_connect() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
