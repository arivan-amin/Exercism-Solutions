import java.util.Arrays;

class BirdWatcher {
    
    private final int[] birdsPerDay;
    
    public BirdWatcher (int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    
    public int[] getLastWeek () {
        return birdsPerDay;
    }
    
    public int getToday () {
        return birdsPerDay[birdsPerDay.length - 1];
    }
    
    public void incrementTodaysCount () {
        int todayIndex = birdsPerDay.length - 1;
        birdsPerDay[todayIndex] = ++birdsPerDay[todayIndex];
    }
    
    public boolean hasDayWithoutBirds () {
        return Arrays.stream(birdsPerDay).filter(i -> i == 0).findAny().isPresent();
    }
    
    public int getCountForFirstDays (int numberOfDays) {
        int validDaysCount = Math.min(numberOfDays, birdsPerDay.length);
        return Arrays.stream(birdsPerDay, 0, validDaysCount).sum();
    }
    
    public int getBusyDays () {
        return (int) Arrays.stream(birdsPerDay).filter(i -> i >= 5).count();
    }
}
