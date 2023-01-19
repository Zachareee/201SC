// this is for Q8
public class Counter {
    private int value;

    public Counter() {
    }

    public Counter(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        value = newValue;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void reset() {
        value = 0;
    }
}
