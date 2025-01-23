import java.util.stream.IntStream;

class Hamming {
    
    private final String leftStrand;
    private final String rightStrand;
    
    Hamming (String leftStrand, String rightStrand) {
        if (leftStrand.trim()
            .length() != rightStrand.trim()
            .length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }
    
    int getHammingDistance () {
        if (leftStrand.trim()
            .isEmpty() && rightStrand.trim()
            .isEmpty()) {
            return 0;
        }
        return ((int) IntStream.range(0, leftStrand.length())
            .filter(e -> leftStrand.charAt(e) != rightStrand.charAt(e))
            .count());
    }
}
