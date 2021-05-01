/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr.models;

/**
 *
 * @author sarsingh
 */
public class Word {

    private int index;
    private int sentenceId = -1;
    private String word;

    public Word(int index, String word) {
        this.index = index;
        this.word = word;
    }

    public int getIndex() {
        return this.index;
    }

    public void setSentenceId(int sentenceId) {
        this.sentenceId = sentenceId;
    }

    public String getWord() {
        return this.word;
    }

    public int getSentenceId() {
        return this.sentenceId;
    }

    @Override
    public String toString() {
        return this.word;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + index + this.word.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Word other = (Word) obj;

        return this.word.equals(other.getWord());
    }
}
