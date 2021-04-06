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
public class Paragraphs {

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

    /**
     * @return the subSectionId
     */
    public int getSubSectionId() {
        return subSectionId;
    }

    /**
     * @param subSectionId the subSectionId to set
     */
    public void setSubSectionId(int subSectionId) {
        this.subSectionId = subSectionId;
    }
    private int paragraphId;
    private int operationId;
    private String newValue;
    private String oldValue;
    private int subSectionId;
    public Paragraphs(int paragraphId, int operationId, String newValue, String oldValue, int subSectionId){
        this.paragraphId = paragraphId;
        this.operationId = operationId;
        this.newValue = newValue;
        this.oldValue = oldValue;
        this.subSectionId = subSectionId;
    }
}