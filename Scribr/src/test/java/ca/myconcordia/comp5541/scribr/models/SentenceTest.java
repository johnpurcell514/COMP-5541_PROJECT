/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr.models;

import java.util.ArrayList;
import java.util.Arrays;
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
public class SentenceTest {
    
    private final int SENTENCE_INDEX = 0;
    private final ArrayList<Word> words = new ArrayList<Word>(
            Arrays.asList(new Word(0, "a"), new Word(1, "b"), new Word(2, "c")));
    private final Sentence sentence = new Sentence(words, 0);
    
    public SentenceTest() {
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
     * Test of add method, of class Sentence.
     */
    @Test
    @Order(1)
    public void testAdd() {
        System.out.println("add");
        Word word = new Word(4, "add me");
        sentence.add(word);
        assertEquals(true, sentence.getSentence().contains(word));
    }

    /**
     * Test of getIndex method, of class Sentence.
     */
    @Test
    @Order(2)
    public void testGetIndex() {
        System.out.println("getIndex");
        sentence.setIndex(SENTENCE_INDEX);
        assertEquals(SENTENCE_INDEX, sentence.getIndex());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSentence method, of class Sentence.
     */
    @Test
    @Order(3)
    public void testGetSentence() {
        System.out.println("getSentence");
        ArrayList<Word> words = new ArrayList<Word>();
        assertEquals(words.getClass(), sentence.getSentence().getClass());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of deleteAll method, of class Sentence.
     */
    @Test
    @Order(4)
    public void testDeleteAll() {
        System.out.println("deleteAll");
        sentence.deleteAll();
        assertEquals(true, sentence.getSentence().isEmpty());
        // TODO review the generated test code and remove the default call to fail.
    }
}
