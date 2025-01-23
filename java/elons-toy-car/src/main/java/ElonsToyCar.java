public class ElonsToyCar {
    
    public static final int DISTANCE_DRIVEN_EACH_TIME = 20;
    
    private int distance;
    private int battery = 100;
    
    public static ElonsToyCar buy () {
        return new ElonsToyCar();
    }
    
    public String distanceDisplay () {
        return "Driven %s meters".formatted(distance);
    }
    
    public void drive () {
        if (battery > 0) {
            driveCar();
        }
    }
    
    private void driveCar () {
        distance += DISTANCE_DRIVEN_EACH_TIME;
        battery -= 1;
    }
    
    public String batteryDisplay () {
        return battery > 0 ? "Battery at %s%%".formatted(battery) : "Battery empty";
    }
}
