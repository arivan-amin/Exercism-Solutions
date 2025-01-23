public class Lasagna {
    
    public int remainingMinutesInOven (int timeSpentInOven) {
        return expectedMinutesInOven() - timeSpentInOven;
    }
    
    public int expectedMinutesInOven () {
        return 40;
    }
    
    public int totalTimeInMinutes (int numberOfLayers, int timeSpentInOven) {
        return preparationTimeInMinutes(numberOfLayers) + timeSpentInOven;
    }
    
    public int preparationTimeInMinutes (int numberOfLayers) {
        return numberOfLayers * 2;
    }
}

