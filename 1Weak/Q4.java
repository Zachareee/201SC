import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("No positive number is entered");
            sc.close();
            return;
        }

        String history = "";
        int total = 1;

        while (num >= 0) {
            history += num + " x ";
            total *= num;

            System.out.print("Enter number: ");
            num = sc.nextInt();
        }

        System.out.println(history.replaceFirst("x\s$", "= " + total));
        sc.close();
    }
}