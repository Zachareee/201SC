import java.util.*;

//the program handles only positive decimals
public class Q8BinaryToText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary message: ");
        String text = sc.nextLine();

        String actual = "";
        for (int i = text.length() - 1; i >= 0; i -= 8) {
            int number = Integer.parseInt(text.substring(i - 7, i + 1), 2);
            actual = (char) number + actual;
        }

        System.out.println(actual);
        sc.close();
    }
}