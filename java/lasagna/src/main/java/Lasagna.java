public class Lasagna {
    
    public int expectedMinutesInOven () {
        return 40;
    }
    
    public int remainingMinutesInOven (int timeSpentInOven) {
        return expectedMinutesInOven() - timeSpentInOven;
    }
    
    public int preparationTimeInMinutes (int numberOfLayers) {
        return numberOfLayers * 2;
    }
    
    public int totalTimeInMinutes (int numberOfLayers, int timeSpentInOven) {
        return preparationTimeInMinutes(numberOfLayers) + timeSpentInOven;
    }
}

