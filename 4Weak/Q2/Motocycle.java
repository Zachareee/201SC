public class Motocycle extends Vehicle {
    public Motocycle(double distancePerLiter) {
        super(4, distancePerLiter);
    }

    public String toString() {
        return "Motocycle[" + super.toString() + ']';
    }
}
