class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    
    public static final int DISTANCE_DRIVEN_EACH_RUN = 10;
    
    private int distanceDriven;
    private int numberOfVictories;
    
    @Override
    public void drive () {
        distanceDriven += DISTANCE_DRIVEN_EACH_RUN;
    }
    
    @Override
    public int getDistanceTravelled () {
        return distanceDriven;
    }
    
    public int getNumberOfVictories () {
        return numberOfVictories;
    }
    
    public void setNumberOfVictories (int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    
    @Override
    public int compareTo (ProductionRemoteControlCar other) {
        return other.getNumberOfVictories() - getNumberOfVictories();
    }
}
