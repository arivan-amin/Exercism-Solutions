public class Blackjack {
    
    public static final int BLACKJACK_VALUE = 21;
    
    public int parseCard (String card) {
        return switch (card) {
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            case "ten", "king", "queen", "jack" -> 10;
            case "ace" -> 11;
            default -> 0;
        };
    }
    
    public boolean isBlackjack (String card1, String card2) {
        int card1Value = parseCard(card1);
        int card2Value = parseCard(card2);
        return isHandBlackjack(card1Value, card2Value);
    }
    
    private static boolean isHandBlackjack (int card1Value, int card2Value) {
        return getSumOfBothCardsValues(card1Value, card2Value) ==
            BLACKJACK_VALUE;
    }
    
    private static int getSumOfBothCardsValues (int card1Value, int card2Value) {
        return card1Value + card2Value;
    }
    
    public String largeHand (boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            return doesDealerHaveLessThan10(dealerScore) ? getValueForAutomaticWin() :
                getValueForStand();
        }
        return getValueForSplit();
    }
    
    private static boolean doesDealerHaveLessThan10 (int dealerScore) {
        return dealerScore < 10;
    }
    
    public String smallHand (int handScore, int dealerScore) {
        if (isHandScoreLargerThan17(handScore)) {
            return getValueForStand();
        }
        else {
            return isHandScoreSmallerThan6(handScore) ? getValueForHit() :
                decideWhenValueIfBetween12And16(dealerScore);
        }
    }
    
    private static String decideWhenValueIfBetween12And16 (int dealerScore) {
        return dealerScore <= 6 ? getValueForStand() : getValueForHit();
    }
    
    private static boolean isHandScoreSmallerThan6 (int handScore) {
        return handScore <= 11;
    }
    
    private static boolean isHandScoreLargerThan17 (int handScore) {
        return handScore >= 17;
    }
    
    private static String getValueForSplit () {
        return "P";
    }
    
    private static String getValueForAutomaticWin () {
        return "W";
    }
    
    private static String getValueForHit () {
        return "H";
    }
    
    private static String getValueForStand () {
        return "S";
    }
    
    // FirstTurn returns the semi-optimal decision for the first turn, given 
    // the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. 
    // It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn (String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        
        return handScore > 20 ?
            largeHand(isBlackjack(card1, card2), dealerScore) :
            smallHand(handScore, dealerScore);
    }
}
