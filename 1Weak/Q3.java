import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String forward = sc.nextLine();

        String[] aWord = forward.split("\s+");
        String reverse = "";
        for (int i = aWord.length - 1; i >= 0; i--) {
            reverse += aWord[i] + ' ';
        }

        System.out.println(reverse.trim());
        sc.close();
    }
}