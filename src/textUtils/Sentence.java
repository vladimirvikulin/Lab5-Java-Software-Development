package textUtils;
import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Object> sentenceElements;
    private String sentenceText;

    /**
     * Constructs a Sentence object from the given sentence text.
     *
     * @param sentenceText The sentence text.
     */
    public Sentence(String sentenceText) {
        this.sentenceText = sentenceText;
        sentenceElements = new ArrayList<>();
        String[] elements = sentenceText.split("(?<=\\s)|(?=\\s)|(?<=[-:;.,!?])|(?=[-:;.,!?])");
        for (String element : elements) {
            if (element.matches("\\s")) {
                continue;
            } else if (element.matches("[-:;.,!?]")) {
                sentenceElements.add(new Punctuation(element.charAt(0)));
            } else {
                sentenceElements.add(new Word(element));
            }
        }
    }
    
    /**
     * Gets the words in the sentence.
     *
     * @return The list of elements in the sentence.
     */
    public List<Object> getSentenceElements() {
        return sentenceElements;
    }

    /**
     * Gets the original sentence text.
     *
     * @return The original sentence text.
     */
    public String getSentenceText() {
        return sentenceText;
    }

    /**
     * Counts the number of words in the sentence without considering punctuation.
     *
     * @return The number of words in the sentence.
     */
    public int countWords() {
        int wordCount = 0;
        for (Object element : sentenceElements) {
            if (element instanceof Word) {
                wordCount++;
            }
        }
        return wordCount;
    }
}