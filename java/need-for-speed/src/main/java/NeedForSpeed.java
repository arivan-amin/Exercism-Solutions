class NeedForSpeed {
    
    public static final int NITRO_CAR_SPEED = 50;
    public static final int NITRO_BATTERY_DRAIN = 4;
    private final int speed;
    private final int batteryDrain;
    
    private int remainingBatteryCharge = 100;
    
    private int distanceDriven;
    
    NeedForSpeed (int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    
    public static NeedForSpeed nitro () {
        return new NeedForSpeed(NITRO_CAR_SPEED, NITRO_BATTERY_DRAIN);
    }
    
    public int distanceDriven () {
        return distanceDriven;
    }
    
    public void drive () {
        if (!batteryDrained()) {
            distanceDriven += speed;
            remainingBatteryCharge -= batteryDrain;
        }
    }
    
    public boolean batteryDrained () {
        return remainingBatteryCharge < batteryDrain;
    }
}

class RaceTrack {
    
    private final int distance;
    
    RaceTrack (int distance) {
        this.distance = distance;
    }
    
    public boolean canFinishRace (NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
