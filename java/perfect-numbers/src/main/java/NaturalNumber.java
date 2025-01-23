import java.util.stream.IntStream;

public class NaturalNumber {
    
    private final int number;
    
    NaturalNumber (int number) {
        throwExceptionIfNumberIsNotPositive(number);
        this.number = number;
    }
    
    private static void throwExceptionIfNumberIsNotPositive (int number) {
        if (isNumberNotPositive(number)) {
            throw new IllegalArgumentException(
                "You must supply a natural number (positive integer)");
        }
    }
    
    private static boolean isNumberNotPositive (int number) {
        return number <= 0;
    }
    
    Classification getClassification () {
        int factorsSum = getFactorsSum();
        if (number == factorsSum) {
            return Classification.PERFECT;
        }
        return (factorsSum > number) ? Classification.ABUNDANT : Classification.DEFICIENT;
    }
    
    private int getFactorsSum () {
        return IntStream.range(1, number)
            .filter(i -> number % i == 0)
            .sum();
    }
}
