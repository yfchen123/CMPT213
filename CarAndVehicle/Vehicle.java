public abstract class Vehicle {
    protected double engineSize;
    //This method moves the vehicle
    public abstract int moveVehicle(int kilometers);
    //This is the getType method
    public abstract void getType();
    //This gets the engine size
    public double getEngineSize(){
        return engineSize;
    }

}
