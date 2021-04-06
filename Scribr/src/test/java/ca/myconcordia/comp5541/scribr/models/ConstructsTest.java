/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr.models;

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
public class ConstructsTest {
    
    public ConstructsTest() {
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
     * Test of getConstructId method, of class Constructs.
     */
    @Test
    public void testGetConstructId() {
        System.out.println("getConstructId");
        Constructs instance = null;
        int expResult = 0;
        int result = instance.getConstructId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConstructId method, of class Constructs.
     */
    @Test
    public void testSetConstructId() {
        System.out.println("setConstructId");
        int constructId = 0;
        Constructs instance = null;
        instance.setConstructId(constructId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConstructType method, of class Constructs.
     */
    @Test
    public void testGetConstructType() {
        System.out.println("getConstructType");
        Constructs instance = null;
        String expResult = "";
        String result = instance.getConstructType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConstructType method, of class Constructs.
     */
    @Test
    public void testSetConstructType() {
        System.out.println("setConstructType");
        String constructType = "";
        Constructs instance = null;
        instance.setConstructType(constructType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
