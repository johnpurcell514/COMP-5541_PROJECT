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
public class Constructs {

    /**
     * @return the constructId
     */
    public int getConstructId() {
        return constructId;
    }

    /**
     * @param constructId the constructId to set
     */
    public void setConstructId(int constructId) {
        this.constructId = constructId;
    }

    /**
     * @return the constructType
     */
    public String getConstructType() {
        return constructType;
    }

    /**
     * @param constructType the constructType to set
     */
    public void setConstructType(String constructType) {
        this.constructType = constructType;
    }
    private int constructId;
    private String constructType;
    public Constructs(int constructId, String constructType){
        this.constructId = constructId;
        this.constructType = constructType;
    }
}
