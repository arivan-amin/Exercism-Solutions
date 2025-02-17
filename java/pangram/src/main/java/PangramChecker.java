public class PangramChecker {

    public static final int NUMBER_OF_ALPHABET_CHARACTERS = 26;

    public boolean isPangram (String input) {
        return input.toLowerCase()
            .chars()
            .filter(Character::isLetter)
            .distinct()
            .count() == NUMBER_OF_ALPHABET_CHARACTERS;
    }
}
