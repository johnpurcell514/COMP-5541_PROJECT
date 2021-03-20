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
public class SubSections {

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
     * @return the subSectionName
     */
    public String getSubSectionName() {
        return subSectionName;
    }

    /**
     * @param subSectionName the subSectionName to set
     */
    public void setSubSectionName(String subSectionName) {
        this.subSectionName = subSectionName;
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
     * @return the sectionId
     */
    public int getSectionId() {
        return sectionId;
    }

    /**
     * @param sectionId the sectionId to set
     */
    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }
    private int subSectionId;
    private int operationId;
    private String subSectionName;
    private String newValue;
    private String oldValue;
    private int sectionId;
    public SubSections(int subSectionId, int operationId, String subSectionName, String newValue, String oldValue){
        this.subSectionId = subSectionId;
        this.operationId = operationId;
        this.subSectionName = subSectionName;
        this.newValue = newValue;
        this.oldValue = oldValue;
        this.sectionId = sectionId;
    }
}
