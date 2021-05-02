package guitest;

import java.util.ArrayList;

public class Sentence {
    private static int numOfSentenceObjects = 0;
    private int uniqueSentenceID;
    private int paragraphID;
    private ArrayList<Word> sentence;

    public Sentence(ArrayList<Word> sentence, int paragraphID) {
        this.sentence = sentence;
        this.paragraphID = paragraphID;
        this.uniqueSentenceID = numOfSentenceObjects;
        numOfSentenceObjects++;
    }

    public int getUniqueSentenceID() {
        return uniqueSentenceID;
    }

    public int getParagraphID() {
        return paragraphID;
    }

    public void setParagraphID(int paragraphID) {
        this.paragraphID = paragraphID;
    }

    public ArrayList<Word> getSentence() {
        return sentence;
    }

    public void setSentence(ArrayList<Word> sentence) {
        this.sentence = sentence;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.sentence.size(); i++) {
            sb.append(sentence.get(i).toString());
            sb.append(" ");
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

        Sentence otherSentence = (Sentence) o;

        if (this.sentence.size() != otherSentence.sentence.size() || this.paragraphID != otherSentence.paragraphID) {
            return false;
        } else {
            for (int i = 0; i < this.sentence.size(); i++) {
                if (this.sentence.get(i).equals(otherSentence.sentence.get(i))) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
