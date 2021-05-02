package guitest;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUIBuilder extends JFrame {
    private JTextArea textArea;
    private JButton doneChangesButton;
    private Section previousDocument;
    private Section currentDocument;

    private ArrayList<Word> undoWordStack;
    private ArrayList<Sentence> undoSentenceStack;
    private ArrayList<Paragraph> undoParagraphStack;



    public GUIBuilder() {
        textArea = new JTextArea(20, 30);
        textArea.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.PAGE_START);

        doneChangesButton = new JButton("Done with Changes");
        add(doneChangesButton);
        doneChangesButton.addActionListener(a -> {
            previousDocument = currentDocument;
            currentDocument = convertStringToSection(textArea.getText());
            textArea.setText(currentDocument.toString());
            System.out.println(currentDocument);
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private Section convertStringToSection(String section) {
        ArrayList<Paragraph> tempSection = new ArrayList<Paragraph>();
        int paragraphPositionWithinText = 0;

        for (int i = 0; i < section.length(); i++) {
            int startIndexOfParagraph = i;
            int endIndexOfParagraph = i;
            for (int j = i; j < section.length(); j++) {
                if (section.charAt(j) == '<' && section.charAt(j + 1) == 'p' && section.charAt(j + 2) == '/' && section.charAt(j + 3) == '>') {
                    startIndexOfParagraph = j + 4;
                    j += 3;
                }

                if (section.charAt(j) == '<' && section.charAt(j + 1) == '/' && section.charAt(j + 2) == 'p' && section.charAt(j + 3) == '>') {
                    endIndexOfParagraph = j;
                    String tempString = section.substring(startIndexOfParagraph, endIndexOfParagraph);
                    tempString += " "; //To handle a weird thingy in the next method call.
                    Paragraph tempParagraph = convertStringToParagraph(tempString, paragraphPositionWithinText);
                    tempSection.add(tempParagraph);
                    paragraphPositionWithinText++;
                    i = j + 3;
                    break;
                }

            }
        }

        return new Section(tempSection);
    }


    private Paragraph convertStringToParagraph(String paragraph, int paragraphPosWithinSection) {
        ArrayList<Sentence> tempParagraph = new ArrayList<Sentence>(); //Contain all the sentences with a give paragraph
        int sentencePosWithinParagraph = -1;
        for (int i = 0; i < paragraph.length(); i++) {
            ArrayList<Word> tempSentence = new ArrayList<Word>();
            int wordPosWithinSentence = -1;
            for (int j = i; j < paragraph.length(); j++) {
                int wordStartIndex = j;
                int wordEndIndex = j;
                for (int k = j; k < paragraph.length(); k++) {
                    if (paragraph.charAt(k) == ' ') {
                        wordEndIndex = k;
                        wordPosWithinSentence++;
                        j = k;
                        break;
                    }
                }
                String tempWord = paragraph.substring(wordStartIndex, wordEndIndex);
                tempSentence.add(new Word(tempWord, wordPosWithinSentence));


                if (tempWord.charAt(tempWord.length() - 1) == '.' || tempWord.charAt(tempWord.length() - 1) == '?') {
                    i = j;
                    sentencePosWithinParagraph++;
                    tempParagraph.add(new Sentence(tempSentence, sentencePosWithinParagraph));
                    break;
                }
            }
        }

        return new Paragraph(tempParagraph, paragraphPosWithinSection);

    }

    private boolean areTagsAppropriate(String aString){ // need to finish implementing this shit here.
        int openTags = 0;
        int closeTags = 0;
        return false;
    }

}
