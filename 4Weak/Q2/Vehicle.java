public class Vehicle {
    protected int numWheels;
    protected double distancePerLiter;

    public Vehicle(int numWheels, double distancePerLiter) {
        this.numWheels = numWheels;
        this.distancePerLiter = distancePerLiter;
    }

    public String toString() {
        return "Vehicle[numWheels=" + numWheels + ", distancePerLiter=" + distancePerLiter + ']';
    }
}
