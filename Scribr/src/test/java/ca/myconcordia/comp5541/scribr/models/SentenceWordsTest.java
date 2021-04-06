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
public class SentenceWordsTest {
    
    public SentenceWordsTest() {
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
     * Test of getSentenceWordId method, of class SentenceWords.
     */
    @Test
    public void testGetSentenceWordId() {
        System.out.println("getSentenceWordId");
        SentenceWords instance = null;
        int expResult = 0;
        int result = instance.getSentenceWordId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSentenceWordId method, of class SentenceWords.
     */
    @Test
    public void testSetSentenceWordId() {
        System.out.println("setSentenceWordId");
        int sentenceWordId = 0;
        SentenceWords instance = null;
        instance.setSentenceWordId(sentenceWordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSentenceId method, of class SentenceWords.
     */
    @Test
    public void testGetSentenceId() {
        System.out.println("getSentenceId");
        SentenceWords instance = null;
        int expResult = 0;
        int result = instance.getSentenceId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSentenceId method, of class SentenceWords.
     */
    @Test
    public void testSetSentenceId() {
        System.out.println("setSentenceId");
        int sentenceId = 0;
        SentenceWords instance = null;
        instance.setSentenceId(sentenceId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWordId method, of class SentenceWords.
     */
    @Test
    public void testGetWordId() {
        System.out.println("getWordId");
        SentenceWords instance = null;
        int expResult = 0;
        int result = instance.getWordId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWordId method, of class SentenceWords.
     */
    @Test
    public void testSetWordId() {
        System.out.println("setWordId");
        int wordId = 0;
        SentenceWords instance = null;
        instance.setWordId(wordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
