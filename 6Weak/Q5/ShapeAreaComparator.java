import java.util.Comparator;

public class ShapeAreaComparator implements Comparator<Shape>{
    public int compare(Shape s1, Shape s2) {
        return (int)(s1.getArea() - s2.getArea());
    }
}
