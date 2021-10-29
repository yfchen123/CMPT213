public class Car extends Vehicle{
    private double octaneTank;

    /**
     * @apiNote: we only want to create a car that has
     * both an octaneTank and an engineSize, so this will
     * be the only provided constructor.
     * @param octaneTank
     * @param engineSize
     */
    public Car(double octaneTank, double engineSize) {
        this.engineSize = engineSize;
        this.octaneTank = octaneTank;
    }

    /**
     * @apiNote : Here we are assuming the car has
     * 50 kilometers / L of octane used.
     * @param kilometers
     * @return the amount of fuel left in the car 0 means there
     * is no fuel inside of the car.
     */
    @Override
    public int moveVehicle(int kilometers){
        if(kilometers / 50.0 > octaneTank ){
            System.out.println("There is not enough fuel to " +
                    "complete the trip, please refuel your tank.");
            return 0;
        }
        return (int)(octaneTank - kilometers / 50);
    }

    /**
     *
     * @return the amount of octaneLeft size
     */
    public double getOctaneTank() {
        return octaneTank;
    }

    /**
     * @apiNote This method adds more litres of fuel for the tank.
     * @param litersAdded
     */
    public double addOctane(double litersAdded) {
        if(litersAdded <= 0){
            System.out.println("Please enter in a positive value " +
                    "for the number of litres of fuel to add.");
            return octaneTank;
        }
        else if(litersAdded + octaneTank > engineSize){
            System.out.println("That is too many litres of fuel for this" +
                    " engine to use.");
            return octaneTank;
        }
        octaneTank += litersAdded;
        return octaneTank;
    }

    /**
     * @apiNote This prints the type of the object
     */
    public void getType(){
        System.out.println("The type of this object is Car.");
    }

    @Override
    public String toString(){
        String s1 = "Type: Car";
        s1 += " ,Fuel Left: " + octaneTank;
        s1 += " ,Engine Size: " + engineSize;
        return s1;
    }
}
