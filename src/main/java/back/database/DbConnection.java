package back.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static Connection connection;

    public static Connection connection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://cruefigzqwituh:fe1ca572eb8c4d9257c9f91b7947bba08e4a9c54c98b8743c3a6c6a76fc51fe7@ec2-107-20-230-70.compute-1.amazonaws.com:5432/d6j5oj1hetk9bf"
                    , "cruefigzqwituh"
                    , "fe1ca572eb8c4d9257c9f91b7947bba08e4a9c54c98b8743c3a6c6a76fc51fe7");
        }
        return connection;
    }
}