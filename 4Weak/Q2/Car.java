public class Car extends Vehicle {
    public Car(double distancePerLiter) {
        super(4, distancePerLiter);
    }

    public String toString() {
        return "Car[" + super.toString() + ']';
    }
}
