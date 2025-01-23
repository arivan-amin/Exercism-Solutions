import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class GottaSnatchEmAll {
    
    static Set<String> newCollection (List<String> cards) {
        return new HashSet<>(cards);
    }
    
    static boolean addCard (String card, Set<String> collection) {
        return !collection.contains(card) && collection.add(card);
    }
    
    static boolean canTrade (Set<String> myCollection, Set<String> theirCollection) {
        boolean doesPlayerHaveCardsToTrade = myCollection.stream()
            .anyMatch(s -> !theirCollection.contains(s));
        boolean doesFriendHaveCardsToTrade = theirCollection.stream()
            .anyMatch(s -> !myCollection.contains(s));
        return doesPlayerHaveCardsToTrade && doesFriendHaveCardsToTrade;
    }
    
    static Set<String> commonCards (List<Set<String>> collections) {
        List<String> allElements = mergeAllSetsIntoSingleList(collections);
        Set<String> commonElements = new HashSet<>();
        IntStream.range(0, allElements.size())
            .forEachOrdered(i -> {
                if (isElementIsCommon(collections, i, allElements)) {
                    commonElements.add(allElements.get(i));
                }
            });
        return commonElements;
    }
    
    private static List<String> mergeAllSetsIntoSingleList (List<Set<String>> collections) {
        return collections.stream()
            .flatMap(Collection::stream)
            .toList();
    }
    
    private static boolean isElementIsCommon (List<Set<String>> collections, int i,
                                              List<String> allElements) {
        return collections.stream()
            .allMatch(set -> set.contains(allElements.get(i)));
    }
    
    static Set<String> allCards (List<Set<String>> collections) {
        return collections.stream()
            .flatMap(Collection::stream)
            .collect(Collectors.toSet());
    }
}
