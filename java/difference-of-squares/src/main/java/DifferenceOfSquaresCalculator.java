import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {
    
    int computeDifferenceOfSquares (int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
    
    int computeSquareOfSumTo (int input) {
        return (int) Math.pow(IntStream.rangeClosed(1, input)
            .sum(), 2);
    }
    
    int computeSumOfSquaresTo (int input) {
        return IntStream.rangeClosed(1, input)
            .map(i -> (int) Math.pow(i, 2))
            .sum();
    }
}
