import java.util.*;
public class ListTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.forEach(System.out::println);
    }
}
