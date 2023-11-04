package textUtils;
import java.util.ArrayList;
import java.util.List;

public class Word {
    private List<Letter> letters;

    /**
     * Constructs a Word object from the given word string.
     *
     * @param word The word as a string.
     */
    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    /**
     * Gets the letters in the word.
     *
     * @return The list of letters in the word.
     */
    public List<Letter> getLetters() {
        return letters;
    }
}

