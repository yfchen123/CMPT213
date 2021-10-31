public abstract class Vehicle {
    private double engineSize;

    public Vehicle(double engineSize) {this.engineSize = engineSize;}
    //This method moves the vehicle
    public abstract int moveVehicle(int kilometers);
    public abstract void getType();
    public double getEngineSize(){
        return this.engineSize;
    }
}
