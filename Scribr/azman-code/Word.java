package guitest;

public class Word {
    private static int numOfWordObjects = 0;
    private int uniqueWordID;
    private int sentenceID;
    private String word;

    public Word(String word, int sentenceID) {
        this.word = word;
        this.sentenceID = sentenceID;
        this.uniqueWordID = numOfWordObjects;
        numOfWordObjects++;
    }


    public int getUniqueWordID() {
        return uniqueWordID;
    }

    public int getSentenceID() {
        return sentenceID;
    }

    public void setSentenceID(int sentenceID) {
        this.sentenceID = sentenceID;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.word);
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Word otherWord = (Word) o;
        return ((this.word.equals(otherWord.word)) && (this.sentenceID == otherWord.sentenceID));
    }

}
