public class Box {
    private int length, breadth, height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Object clone() {
        return new Box(length, breadth, height);
    }

    public boolean equals(Object another) {
        if (!(another instanceof Box)) {
            return false;
        }
        Box aBox = (Box) another;
        return aBox.height == height && aBox.breadth == breadth && aBox.height == height;
    }

    public String toString() {
        return "height: " + height + ", breadth: " + breadth + ", length: " + length;
    }
}
