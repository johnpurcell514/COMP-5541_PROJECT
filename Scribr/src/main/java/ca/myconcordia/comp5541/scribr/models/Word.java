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

    /**
     * @return the operationId
     */
    public int getOperationId() {
        return operationId;
    }

    /**
     * @param operationId the operationId to set
     */
    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    /**
     * @return the newValue
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * @param newValue the newValue to set
     */
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    /**
     * @return the oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * @param oldValue the oldValue to set
     */
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }
    private int wordId;
    private int operationId;
    private String newValue;
    private String oldValue;
    public Word(int wordId, int operationId, String newValue, String oldValue){
        this.wordId = wordId;
        this.operationId = operationId;
        this.newValue = newValue;
        this.oldValue = oldValue;
    }
}
