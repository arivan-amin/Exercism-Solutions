public class ExperimentalRemoteControlCar implements RemoteControlCar {
    
    public static final int DISTANCE_DRIVEN_EACH_RUN = 20;
    
    private int distanceDriven;
    
    public void drive () {
        distanceDriven += DISTANCE_DRIVEN_EACH_RUN;
    }
    
    public int getDistanceTravelled () {
        return distanceDriven;
    }
}
