public class MinMaxCounter extends Counter{
    private int min;
    private int max;

    public MinMaxCounter(int min, int max) {
        super(min);
        this.min = min;
        this.max = max;
    }

    public void decrement() {
        int count = super.getValue();
        if (count - 1 < min) return;
        super.decrement();
    }

    public void increment() {
        int count = super.getValue();
        if (count + 1 > max) return;
        super.increment();
    }
}
