/*
 * Built using a singleton pattern
 */
package ca.myconcordia.comp5541.scribr.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sarsingh
 */
public class DatabaseConnection {
    private static Connection connection = null;
    private static final String URL = "jdbc:sqlite:data.db";
    private static final String REL_INITIALIZIE_DB_SCRIPT = "initializeDb.sql";
    static {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(DatabaseConnection.URL);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("could not establish connection to the database");
            System.exit(1);
        } catch (ClassNotFoundException ex) {
            System.out.println(DatabaseConnection.class.getName() + " " + ex.toString());
        }
        // initialize the database if it does not exist
        initialize();

    }

    public static Connection getConnection() {
        return connection;
    }

    private static void initialize() {

        StringBuilder sb = new StringBuilder();
        String s = new String();
        String[] commands = null;

        try (
            InputStream inputStream = DatabaseConnection.class.getResourceAsStream("/initializeDb.sql");
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(streamReader);) {
            
            while((s = br.readLine()) != null){
                sb.append(s);
            }
            commands = sb.toString().split(";");
            
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
         
        try (Connection conn = DriverManager.getConnection(DatabaseConnection.URL); Statement stmt = conn.createStatement();) {

            DatabaseMetaData meta = connection.getMetaData();
            System.out.println("the driver name is " + meta.getDriverName());
            System.out.println("the database file is " + meta.getURL());

            if(commands != null) {
                for(int i = 0; i < commands.length; i++){
                    // skip any empty lines found in the file
                    if(!commands[i].trim().equals("")){
                        stmt.executeUpdate(commands[i]);
                        System.out.println(">>"+commands[i]);
                    }
                }
            } else {
                System.out.println("could not parse " + DatabaseConnection.REL_INITIALIZIE_DB_SCRIPT + " file");
                System.exit(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
