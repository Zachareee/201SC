public class CircularCounter extends Counter{
    private int limit;

    public CircularCounter(int limit) {
        super(0);
        this.limit = limit;
    }

    public void decrement() {
        super.decrement();
        int count = super.getValue();
        if (count < 0) {
            super.setValue(limit);
        }
    }

    public void increment() {
        super.increment();
        int count = super.getValue();
        if (count > limit) {
            super.setValue(0);
        }
    }
}
