import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter second  word: ");
        String s2 = sc.nextLine();

        while (s1.charAt(0) != s2.charAt(0)) {
            System.out.println("try again\n");
            System.out.print("Enter first word: ");
            s1 = sc.nextLine();
            
            System.out.print("Enter second word: ");
            s2 = sc.nextLine();
        }

        System.out.println("Bingo");
        sc.close();
    }
}