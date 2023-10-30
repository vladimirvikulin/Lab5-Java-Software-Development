import textUtils.*;
import java.util.List;
import java.util.Scanner;

public class TextProcessor {
    /**
     * Processes the input text by sorting sentences based on the number of words.
     *
     * @param inputText The input text to process.
     */
    public void processText(String inputText) {
        try {
            if (inputText.isEmpty()) {
                System.out.println("No text was entered");
                return;
            }

            Text text = new Text(inputText);
            List<Sentence> sentences = text.getSentences();
            sentences.sort((s1, s2) -> s1.getWords().size() - s2.getWords().size());

            System.out.println("\nSentences in order of increasing number of words:");
            for (Sentence sentence : sentences) {
                System.out.println(sentence.getSentenceText());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "cp866")) {
            System.out.println("Enter text:");
            String inputText = scanner.nextLine();
            TextProcessor textProcessor = new TextProcessor();
            textProcessor.processText(inputText);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

