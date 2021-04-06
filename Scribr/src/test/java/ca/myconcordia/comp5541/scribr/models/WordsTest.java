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
public class WordsTest {
    
    public WordsTest() {
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
     * Test of getWordId method, of class Words.
     */
    @Test
    public void testGetWordId() {
        System.out.println("getWordId");
        Words instance = null;
        int expResult = 0;
        int result = instance.getWordId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWordId method, of class Words.
     */
    @Test
    public void testSetWordId() {
        System.out.println("setWordId");
        int wordId = 0;
        Words instance = null;
        instance.setWordId(wordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperationId method, of class Words.
     */
    @Test
    public void testGetOperationId() {
        System.out.println("getOperationId");
        Words instance = null;
        int expResult = 0;
        int result = instance.getOperationId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperationId method, of class Words.
     */
    @Test
    public void testSetOperationId() {
        System.out.println("setOperationId");
        int operationId = 0;
        Words instance = null;
        instance.setOperationId(operationId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewValue method, of class Words.
     */
    @Test
    public void testGetNewValue() {
        System.out.println("getNewValue");
        Words instance = null;
        String expResult = "";
        String result = instance.getNewValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewValue method, of class Words.
     */
    @Test
    public void testSetNewValue() {
        System.out.println("setNewValue");
        String newValue = "";
        Words instance = null;
        instance.setNewValue(newValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOldValue method, of class Words.
     */
    @Test
    public void testGetOldValue() {
        System.out.println("getOldValue");
        Words instance = null;
        String expResult = "";
        String result = instance.getOldValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOldValue method, of class Words.
     */
    @Test
    public void testSetOldValue() {
        System.out.println("setOldValue");
        String oldValue = "";
        Words instance = null;
        instance.setOldValue(oldValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
