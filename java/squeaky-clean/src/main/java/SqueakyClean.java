import java.util.stream.Collectors;

class SqueakyClean {
    
    static String clean (String identifier) {
        String result = removeWhitespaceFromText(identifier);
        result = replaceLeetSpeakCharacters(result);
        result = removeInvalidCharacters(result);
        return convertToCamelCase(result);
    }
    
    private static String removeWhitespaceFromText (String identifier) {
        return identifier.replaceAll(" ", "_").trim();
    }
    
    private static String replaceLeetSpeakCharacters (String result) {
        return result.chars()
            .mapToObj(i -> (char) i)
            .map(SqueakyClean::replaceLeetSpeakCharacter)
            .map(Object::toString)
            .collect(Collectors.joining());
    }
    
    private static String removeInvalidCharacters (String result) {
        return result.chars()
            .mapToObj(i -> (char) i)
            .filter(SqueakyClean::isCharacterValid)
            .map(Object::toString)
            .collect(Collectors.joining());
    }
    
    private static String convertToCamelCase (String result) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if (c == '-')
                continue;
            stringBuilder.append(
                i > 0 && result.charAt(i - 1) == '-' ? Character.toUpperCase(c) : c);
        }
        return stringBuilder.toString();
    }
    
    public static Character replaceLeetSpeakCharacter (Character c) {
        return switch (c) {
            case '4' -> 'a';
            case '3' -> 'e';
            case '0' -> 'o';
            case '1' -> 'l';
            case '7' -> 't';
            default -> c;
        };
    }
    
    private static boolean isCharacterValid (Character character) {
        return Character.isAlphabetic(character) || character == '_' || character == '-';
    }
}
