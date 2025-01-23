public class CarsAssemble {

    public static final int CARS_PRODUCED_PER_HOUR = 221;
    
    public double productionRatePerHour (int speed) {
        return speed * CARS_PRODUCED_PER_HOUR * calculateSuccessRate(speed);
    }
    
    public double calculateSuccessRate (int speed) {
        return switch (speed) {
            case 1, 2, 3, 4 -> 1;
            case 5, 6, 7, 8 -> .9;
            case 9 -> .8;
            case 10 -> .77;
            default -> 0;
        };
    }
    
    public int workingItemsPerMinute (int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
