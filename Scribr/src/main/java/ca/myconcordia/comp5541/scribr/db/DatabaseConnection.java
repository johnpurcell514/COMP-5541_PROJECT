/*
 * Built using a singleton pattern
 */
package ca.myconcordia.comp5541.scribr.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sarsingh
 */
public class DatabaseConnection {
    private static Connection connection = null;
    static{
        String url = "jdbc:sqlite:data.db";
        try{
            Class.forName("org.sqlite");
            connection = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public static Connection getConnection() {
        return connection;
    }
}
