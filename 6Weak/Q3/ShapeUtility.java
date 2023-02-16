import java.util.ArrayList;
public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        if (shapeList == null || shapeList.isEmpty()) return null;
        Octagon bigO;

        int i = 0;
        while (!(shapeList.get(i) instanceof Octagon)) {
            i++;
        }
        bigO = (Octagon) shapeList.get(i);

        for (Shape s : shapeList) {
            if (s instanceof Octagon) {
                Octagon o = (Octagon) s;
                if (o.getArea() > bigO.getArea()) {
                    bigO = o;
                }
            }
        }

        return bigO;
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {
        ArrayList<Shape> list = new ArrayList<>();
        if (shapeList == null) return list;
        for (Shape s : shapeList) {
            if (!(s instanceof Rectangle)) {
                list.add(s);
            }
        }

        return list;
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {
        ArrayList<Square> list = new ArrayList<>();
        if (shapeList == null || shapeList.isEmpty()) return list;

        for (Shape s : shapeList) {
            if (s instanceof Square && s.getArea() >= minArea) {
                list.add((Square)s);
            }
        }

        return list;
    }

    public static ArrayList<Shape> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length) {
        ArrayList<Shape> list = new ArrayList<>();
        if (shapeList == null || shapeList.isEmpty()) return list;

        for (Shape s : shapeList) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                if (r.getLength() >= length) {
                    list.add(s);
                }
            }
        }

        return list;
    }
}
