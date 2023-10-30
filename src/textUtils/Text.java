package textUtils;
import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences;

    /**
     * Constructs a Text object from the given text.
     *
     * @param text The input text.
     */
    public Text(String text) {
        sentences = new ArrayList<>();
        String[] sentenceTokens = text.split("(?<=[.!?])\\s*");
        for (String sentenceToken : sentenceTokens) {
            sentences.add(new Sentence(sentenceToken));
        }
    }

    /**
     * Gets the sentences in the text.
     *
     * @return The list of sentences in the text.
     */
    public List<Sentence> getSentences() {
        return sentences;
    }
}