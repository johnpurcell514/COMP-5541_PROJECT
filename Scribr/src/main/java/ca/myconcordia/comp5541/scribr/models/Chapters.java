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
public class Chapters {

    /**
     * @return the chapterId
     */
    public int getChapterId() {
        return chapterId;
    }

    /**
     * @param chapterId the chapterId to set
     */
    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
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
     * @return the chapterName
     */
    public String getChapterName() {
        return chapterName;
    }

    /**
     * @param chapterName the chapterName to set
     */
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
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
    private int chapterId;
    private int operationId;
    private String chapterName;
    private String oldValue;
    private String newValue;
    public Chapters(int chapterId, int operationId, String chapterName, String oldValue, String newValue){
        this.chapterId = chapterId;
        this.operationId = operationId;
        this.chapterName = chapterName;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }
}
