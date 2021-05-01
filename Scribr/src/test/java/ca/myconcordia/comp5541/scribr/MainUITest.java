/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author sarsingh
 */
public class MainUITest {
    
    private static DocumentListener documentListener;
    
    public MainUITest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        MainUITest.documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent event) {
                
            }

            @Override
            public void removeUpdate(DocumentEvent event) {
                
            }

            @Override
            public void changedUpdate(DocumentEvent event) {

            }
        };
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
     * Test of main method, of class MainUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainUI.main(args);
    }
    /* TO DO - implement unit test for Event Listeners */
}
