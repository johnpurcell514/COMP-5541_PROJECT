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
public class Sentences {

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
     * @return the paragraphId
     */
    public int getParagraphId() {
        return paragraphId;
    }

    /**
     * @param paragraphId the paragraphId to set
     */
    public void setParagraphId(int paragraphId) {
        this.paragraphId = paragraphId;
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
    private int sentenceId;
    private int operationId;
    private int paragraphId;
    private String newValue;
    private String oldValue;
    public Sentences(int sentenceId, int operationId, int paragraphId, String newValue, String oldValue){
        this.sentenceId = sentenceId;
        this.operationId = operationId;
        this.paragraphId = paragraphId;
        this.newValue = newValue;
        this.oldValue = oldValue;
    }
}
