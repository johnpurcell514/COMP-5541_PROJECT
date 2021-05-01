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
import org.junit.jupiter.api.Order;

/**
 *
 * @author sarsingh
 */
public class WordTest {
    
    private final String WORD = "I LOVE UNIT TESTS";
    private final int WORD_INDEX = 0;
    private final Word word = new Word(WORD_INDEX, WORD);
    
    public WordTest() {
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
     * Test of getIndex method, of class Word.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex");
        int expResult = WORD_INDEX;
        int result = word.getIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSentenceId method, of class Word.
     */
    @Test
    @Order(1)
    public void testSetSentenceId() {
        System.out.println("setSentenceId");
        int sentenceId = 0;
        word.setSentenceId(sentenceId);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(sentenceId, word.getSentenceId());
    }
     /**
     * Test of getSentenceId method, of class Word.
     */
    @Test
    @Order(2)
    public void testGetSentenceId() {
        System.out.println("getSentenceId");
        assertEquals(WORD_INDEX, word.getSentenceId());
        assertNotEquals(-1, word.getSentenceId());
    }

    /**
     * Test of getWord method, of class Word.
     */
    @Test
    public void testGetWord() {
        System.out.println("getWord");
        assertEquals(WORD, word.getWord());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Word.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(WORD, word.toString());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hashCode method, of class Word.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Word instance = new Word(WORD_INDEX, WORD);
        int result = instance.hashCode();
        assertEquals(word.hashCode(), result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of equals method, of class Word.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Word instance = new Word(WORD_INDEX, WORD);
        boolean expResult = true;
        boolean result = instance.equals(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
