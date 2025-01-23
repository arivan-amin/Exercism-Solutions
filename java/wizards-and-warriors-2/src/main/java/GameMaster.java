import java.util.HashMap;
import java.util.Map;

public class GameMaster {
    
    static Map<TravelMethod, String> travelingMap = new HashMap<>();
    
    static {
        travelingMap.put(TravelMethod.WALKING, "by walking");
        travelingMap.put(TravelMethod.HORSEBACK, "on horseback");
    }
    
    public String describe (Character character, Destination destination,
                            TravelMethod travelMethod) {
        return "%s %s %s".formatted(describe(character), describe(travelMethod),
            describe(destination));
    }
    
    public String describe (Character character) {
        return "You're a level %s %s with %d hit points.".formatted(character.getLevel(),
            character.getCharacterClass(), character.getHitPoints());
    }
    
    public String describe (TravelMethod travelMethod) {
        String travelingMethodDescription = travelingMap.get(travelMethod);
        return "You're traveling to your destination %s.".formatted(travelingMethodDescription);
    }
    
    public String describe (Destination destination) {
        return "You've arrived at %s, which has %d inhabitants.".formatted(destination.getName(),
            destination.getInhabitants());
    }
    
    public String describe (Character character, Destination destination) {
        return "%s You're traveling to your destination by walking. %s".formatted(
            describe(character), describe(destination));
    }
}
