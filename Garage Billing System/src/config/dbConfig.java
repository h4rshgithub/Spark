package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/garage";
    private static final String user = "root";
    private static final String password = "root";

    public static  Connection getConnection() throws SQLException {

        return DriverManager.getConnection(URL ,user , password );

    }


}
