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
public class SectionsTest {
    
    public SectionsTest() {
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
     * Test of getSectionId method, of class Sections.
     */
    @Test
    public void testGetSectionId() {
        System.out.println("getSectionId");
        Sections instance = null;
        int expResult = 0;
        int result = instance.getSectionId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSectionId method, of class Sections.
     */
    @Test
    public void testSetSectionId() {
        System.out.println("setSectionId");
        int sectionId = 0;
        Sections instance = null;
        instance.setSectionId(sectionId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperationId method, of class Sections.
     */
    @Test
    public void testGetOperationId() {
        System.out.println("getOperationId");
        Sections instance = null;
        int expResult = 0;
        int result = instance.getOperationId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperationId method, of class Sections.
     */
    @Test
    public void testSetOperationId() {
        System.out.println("setOperationId");
        int operationId = 0;
        Sections instance = null;
        instance.setOperationId(operationId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSectionName method, of class Sections.
     */
    @Test
    public void testGetSectionName() {
        System.out.println("getSectionName");
        Sections instance = null;
        String expResult = "";
        String result = instance.getSectionName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSectionName method, of class Sections.
     */
    @Test
    public void testSetSectionName() {
        System.out.println("setSectionName");
        String sectionName = "";
        Sections instance = null;
        instance.setSectionName(sectionName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
