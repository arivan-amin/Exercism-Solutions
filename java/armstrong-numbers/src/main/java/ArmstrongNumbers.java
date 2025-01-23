class ArmstrongNumbers
{
    boolean isArmstrongNumber (int numberToCheck)
    {
        String numberString = String.valueOf(numberToCheck);
        int calculationResult = numberString.chars().mapToObj(e ->
        {
            return String.valueOf(((char) e));
        }).mapToInt(Integer::parseInt).map(e ->
        {
            return (int) Math.pow(e, numberString.length());
        }).sum();
        return calculationResult == numberToCheck;
    }
}