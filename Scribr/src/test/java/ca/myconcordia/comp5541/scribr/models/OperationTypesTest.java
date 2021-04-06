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
public class OperationTypesTest {
    
    public OperationTypesTest() {
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
     * Test of getOperationTypeId method, of class OperationTypes.
     */
    @Test
    public void testGetOperationTypeId() {
        System.out.println("getOperationTypeId");
        OperationTypes instance = null;
        int expResult = 0;
        int result = instance.getOperationTypeId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperationTypeId method, of class OperationTypes.
     */
    @Test
    public void testSetOperationTypeId() {
        System.out.println("setOperationTypeId");
        int operationTypeId = 0;
        OperationTypes instance = null;
        instance.setOperationTypeId(operationTypeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperationType method, of class OperationTypes.
     */
    @Test
    public void testGetOperationType() {
        System.out.println("getOperationType");
        OperationTypes instance = null;
        String expResult = "";
        String result = instance.getOperationType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperationType method, of class OperationTypes.
     */
    @Test
    public void testSetOperationType() {
        System.out.println("setOperationType");
        String operationType = "";
        OperationTypes instance = null;
        instance.setOperationType(operationType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
