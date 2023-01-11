import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("" + (char) (i % 26 + 'a') + ' ');
        }

        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.print("" + i + (i + 1) + (i + 2) + ' ');
        }
        
        System.out.println();
        String total = "";
        for (int i = 1; i <= size; i++) {
            total += i;
            System.out.println(total);
        }
        sc.close();
    }
}