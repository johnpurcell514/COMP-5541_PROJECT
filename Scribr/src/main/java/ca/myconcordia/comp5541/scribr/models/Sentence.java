/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr.models;

import java.util.ArrayList;

public class Sentence {

    private ArrayList<Word> sentence;
    private int index;

    public Sentence(ArrayList<Word> sentence, int index) {
        this.sentence = sentence;
        this.index = index;
    }

    public void deleteAll() {
        this.sentence.clear();
    }

    public void add(Word word) {
        this.sentence.add(word);
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    
    public ArrayList<Word> getSentence(){
        return this.sentence;
    }
}
