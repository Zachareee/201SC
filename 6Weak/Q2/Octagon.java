public class Octagon implements Shape {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return Math.pow(side, 2) * (2 + 2 * Math.pow(2, 0.5));
    }

    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public String toString() {
        return "Octagon: side: " + side;
    }
}
