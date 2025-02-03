import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class PangramChecker {

    public static final int ASCII_CODE_OF_LOWERCASE_A = 97;
    public static final int NUMBER_OF_LETTERS_IN_ALPHABET = 26;

    Map<String, Boolean> lettersMap = new HashMap<>();

    public PangramChecker () {
        initializeAlphabetLettersMap();
    }

    public void initializeAlphabetLettersMap () {
        for (int i = 0; i < NUMBER_OF_LETTERS_IN_ALPHABET; i++) {
            lettersMap.put(String.valueOf((ASCII_CODE_OF_LOWERCASE_A + i)), false);
        }
    }

    public boolean isPangram (String input) {
        String lowerCaseInput = input.toLowerCase();

        IntStream.range(0, lowerCaseInput.length())
            .mapToObj(i -> String.valueOf((lowerCaseInput.charAt(i))))
            .filter(currentChar -> isLetterInAlphabet(currentChar) &&
                isLetterNotEncounteredYet(currentChar))
            .forEachOrdered(this::recordLetterPresence);

        return areAllLettersPresent();
    }

    private boolean isLetterInAlphabet (String currentChar) {
        return lettersMap.containsKey(currentChar);
    }

    private boolean isLetterNotEncounteredYet (String currentChar) {
        return !lettersMap.get(currentChar);
    }

    private void recordLetterPresence (String currentChar) {
        lettersMap.put(currentChar, true);
    }

    private boolean areAllLettersPresent () {
        return lettersMap.values()
            .stream()
            .allMatch(aBoolean -> aBoolean);
    }
}
