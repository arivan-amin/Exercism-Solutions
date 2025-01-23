import java.util.*;

class Scrabble {
    
    private static final int LOWERCASE_A_ASCII_CODE = 97;
    private static final int LOWERCASE_Z_ASCII_CODE = 122;
    private String word;
    private Map<String, Integer> scoresMap;
    
    Scrabble (String word) {
        this.word = word;
        initializeScoresMap();
    }
    
    int getScore () {
        convertTextToLowerCase();
        return calculateEachCharacterAndReturnTotalScore();
    }
    
    private int calculateEachCharacterAndReturnTotalScore () {
        return word.chars().map(this::calculateScoreForLetter).sum();
    }
    
    private int calculateScoreForLetter (int asciiCode) {
        if (isAlphabetCharacter(asciiCode)) {
            return getScoreForCharacter(asciiCode);
        }
        return 0;
    }
    
    private Integer getScoreForCharacter (int asciiCode) {
        return scoresMap.get(convertAsciCodeToCharacterString(asciiCode));
    }
    
    private boolean isAlphabetCharacter (int asciiCode) {
        return (asciiCode >= LOWERCASE_A_ASCII_CODE) && (asciiCode <= LOWERCASE_Z_ASCII_CODE);
    }
    
    private String convertAsciCodeToCharacterString (int asciiCode) {
        return String.valueOf((char) asciiCode);
    }
    
    private void convertTextToLowerCase () {
        word = word.toLowerCase(Locale.ROOT);
    }
    
    private void initializeScoresMap () {
        scoresMap = new HashMap<>();
        scoresMap.put("a", 1);
        scoresMap.put("e", 1);
        scoresMap.put("i", 1);
        scoresMap.put("o", 1);
        scoresMap.put("u", 1);
        scoresMap.put("l", 1);
        scoresMap.put("n", 1);
        scoresMap.put("r", 1);
        scoresMap.put("s", 1);
        scoresMap.put("t", 1);
        scoresMap.put("d", 2);
        scoresMap.put("g", 2);
        scoresMap.put("b", 3);
        scoresMap.put("c", 3);
        scoresMap.put("m", 3);
        scoresMap.put("p", 3);
        scoresMap.put("f", 4);
        scoresMap.put("h", 4);
        scoresMap.put("v", 4);
        scoresMap.put("w", 4);
        scoresMap.put("y", 4);
        scoresMap.put("k", 5);
        scoresMap.put("j", 8);
        scoresMap.put("x", 8);
        scoresMap.put("q", 10);
        scoresMap.put("z", 10);
    }
    
    @Override
    public String toString () {
        return "Scrabble{" + "word='" + word + '\'' + ", scoresMap=" + scoresMap + '}';
    }
}
