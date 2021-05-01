/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;

/**
 *
 * @author sarsingh
 */
public class DatabaseConnectionTest {

    // reference to DB
    private final Connection connection = DatabaseConnection.getConnection();

    public DatabaseConnectionTest() {

    }

    @BeforeAll
    public void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass(){
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {

    }

    /**
     * Test of getConnection method, of class DatabaseConnection.
     */
    @Test
    @Order(1)
    public void testGetConnection() {
        System.out.println("getConnection");
        assertNotNull(connection);
    }

    @Test
    @Order(2)
    public void testTableCreation() {
        System.out.println("testTableCreation");
        String query = "CREATE TABLE IF NOT EXISTS contacts ("
                + "contact_id INTEGER PRIMARY KEY,"
                + "first_name TEXT NOT NULL,"
                + "last_name TEXT NOT NULL,"
                + "email TEXT NOT NULL,"
                + "phone TEXT NOT NULL);";
        try ( Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    @Order(3)
    public void testInsertRow() {
        System.out.println("testInsertRow");
        String query = "INSERT INTO contacts ("
                + "first_name, last_name, email, phone) "
                + "VALUES ('Sarabraj', "
                + "'Singh', "
                + "'singh.sarabraj@gmail.com', "
                + "'29473858');";
        try ( Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(query);
            fail();
        }
    }
    
    @Test
    @Order(4)
    public void testRetrieveRow() {
        System.out.println("testRetrieveRow");
        ResultSet rs = null;
        String query = "SELECT * FROM contacts";
        try ( Statement stmt = connection.createStatement();) {
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(query);
            fail();
        }
        assertNotNull(rs);
    }
    
    @Test
    @Order(5)
    public void testCleanUp() {
        System.out.println("testCleanUp");
        String query = "DROP TABLE contacts;";
        try ( Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(query);
            fail();
        }  
    }
}
