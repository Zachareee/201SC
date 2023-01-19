// this is for Q8
public class CounterTest {
    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter(7);

        System.out.printf("Before increment - First Counter value: %d%n", firstCounter.getValue());
        for (int i = 0; i < 5; i++) {
            firstCounter.increment();
        }
        System.out.printf("After incrementing 5 times - First Counter value: %d%n%n", firstCounter.getValue());

        System.out.printf("Before decrement - Second Counter value: %d%n", secondCounter.getValue());
        secondCounter.decrement();
        System.out.printf("After decrement - Second Counter value: %d%n%n", secondCounter.getValue());

        secondCounter.reset();
        System.out.printf("After reset - Second Counter value: %d%n", secondCounter.getValue());
    }
}
