/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr.models;

import java.util.ArrayList;

/**
 *
 * @author sarsingh
 */
public class Section {
    private static int numOfSectionObjects = 0;
    private int uniqueSectionID;
    private ArrayList<Paragraph> section;

    public Section(ArrayList<Paragraph> section){
        this.section = section;
        this.uniqueSectionID = numOfSectionObjects;
        numOfSectionObjects++;
    }

    public int getUniqueSectionID() {
        return uniqueSectionID;
    }

    public ArrayList<Paragraph> getSection() {
        return section;
    }

    public void setSection(ArrayList<Paragraph> section) {
        this.section = section;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.section.size(); i++){
            sb.append(section.get(i).toString()).append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Section otherSection = (Section) o;

        if (this.section.size() != otherSection.section.size()) {
            return false;
        } else {
            for (int i = 0; i < this.section.size(); i++) {
                if (this.section.get(i).equals(otherSection.section.get(i))) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}