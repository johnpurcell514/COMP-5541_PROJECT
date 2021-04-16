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
public class SentenceWords {

    /**
     * @return the sentenceWordId
     */
    public int getSentenceWordId() {
        return sentenceWordId;
    }

    /**
     * @param sentenceWordId the sentenceWordId to set
     */
    public void setSentenceWordId(int sentenceWordId) {
        this.sentenceWordId = sentenceWordId;
    }

    /**
     * @return the sentenceId
     */
    public int getSentenceId() {
        return sentenceId;
    }

    /**
     * @param sentenceId the sentenceId to set
     */
    public void setSentenceId(int sentenceId) {
        this.sentenceId = sentenceId;
    }

    /**
     * @return the wordId
     */
    public int getWordId() {
        return wordId;
    }

    /**
     * @param wordId the wordId to set
     */
    public void setWordId(int wordId) {
        this.wordId = wordId;
    }
    private int sentenceWordId;
    private int sentenceId;
    private int wordId;
    private Words[] words;
    public SentenceWords(int sentenceWordId, int sentenceId, int wordId, Words[] words){
        this.sentenceWordId = sentenceWordId;
        this.sentenceId = sentenceId;
        this.wordId = wordId;
        this.words = words;
    }
}
