package guitest;

import java.util.ArrayList;

public class Paragraph {
    private static int numOfParagraphObjects = 0;
    private int uniqueParagraphID;
    private int sectionID;
    private ArrayList<Sentence> paragraph;

    public Paragraph(ArrayList<Sentence> paragraph, int sectionID){
        this.paragraph = paragraph;
        this.sectionID = sectionID;
        this.uniqueParagraphID = numOfParagraphObjects;
        numOfParagraphObjects++;
    }

    public int getUniqueParagraphID() {
        return uniqueParagraphID;
    }

    public int getSectionID() {
        return sectionID;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    public ArrayList<Sentence> getParagraph() {
        return paragraph;
    }

    public void setParagraph(ArrayList<Sentence> paragraph) {
        this.paragraph = paragraph;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("<p/>");
        for (int i= 0; i < this.paragraph.size(); i++){
            sb.append(paragraph.get(i).toString());
        }
        if (sb.length() > 0){
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("</p>");
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Paragraph otherParagraph = (Paragraph) o;

        if (this.paragraph.size() != otherParagraph.paragraph.size() || this.sectionID != otherParagraph.sectionID) {
            return false;
        } else {
            for (int i = 0; i < this.paragraph.size(); i++) {
                if (this.paragraph.get(i).equals(otherParagraph.paragraph.get(i))) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
