/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr.models;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sarsingh
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getOperationId method, of class Operations.
     */
    @Test
    public void testGetOperationId() {
        System.out.println("getOperationId");
        Operations instance = null;
        int expResult = 0;
        int result = instance.getOperationId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperationId method, of class Operations.
     */
    @Test
    public void testSetOperationId() {
        System.out.println("setOperationId");
        int operationId = 0;
        Operations instance = null;
        instance.setOperationId(operationId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperatingTypeId method, of class Operations.
     */
    @Test
    public void testGetOperatingTypeId() {
        System.out.println("getOperatingTypeId");
        Operations instance = null;
        int expResult = 0;
        int result = instance.getOperatingTypeId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperatingTypeId method, of class Operations.
     */
    @Test
    public void testSetOperatingTypeId() {
        System.out.println("setOperatingTypeId");
        int operatingTypeId = 0;
        Operations instance = null;
        instance.setOperatingTypeId(operatingTypeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConstructId method, of class Operations.
     */
    @Test
    public void testGetConstructId() {
        System.out.println("getConstructId");
        Operations instance = null;
        int expResult = 0;
        int result = instance.getConstructId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConstructId method, of class Operations.
     */
    @Test
    public void testSetConstructId() {
        System.out.println("setConstructId");
        int constructId = 0;
        Operations instance = null;
        instance.setConstructId(constructId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreatedAt method, of class Operations.
     */
    @Test
    public void testGetCreatedAt() {
        System.out.println("getCreatedAt");
        Operations instance = null;
        Date expResult = null;
        Date result = instance.getCreatedAt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreatedAt method, of class Operations.
     */
    @Test
    public void testSetCreatedAt() {
        System.out.println("setCreatedAt");
        Date createdAt = null;
        Operations instance = null;
        instance.setCreatedAt(createdAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
