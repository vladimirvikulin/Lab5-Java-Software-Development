package textUtils;
import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;
    private String sentenceText;

    /**
     * Constructs a Sentence object from the given sentence text.
     *
     * @param sentenceText The sentence text.
     */
    public Sentence(String sentenceText) {
        this.sentenceText = sentenceText;
        words = new ArrayList<>();
        String[] wordTokens = sentenceText.split("[\\s-]+");
        for (String wordToken : wordTokens) {
            words.add(new Word(wordToken));
        }
    }

    /**
     * Gets the words in the sentence.
     *
     * @return The list of words in the sentence.
     */
    public List<Word> getWords() {
        return words;
    }

    /**
     * Gets the original sentence text.
     *
     * @return The original sentence text.
     */
    public String getSentenceText() {
        return sentenceText;
    }
}