package textUtils;
import java.util.ArrayList;
import java.util.List;

public class Word {
    private List<Object> elements;

    /**
     * Constructs a Word object from the given word string.
     *
     * @param word The word as a string.
     */
    public Word(String word) {
        elements = new ArrayList<>();
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                elements.add(new Letter(c));
            } else {
                elements.add(new Punctuation(c));
            }
        }
    }

    /**
     * Gets the elements (letters and punctuation) in the word.
     *
     * @return The list of elements in the word.
     */
    public List<Object> getElements() {
        return elements;
    }
}
