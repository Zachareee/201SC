import java.util.Scanner;

public class Q8BinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        int temp = decimal;

        int num = 0;
        for (int i = 0; decimal > 0; i++) {
            num += decimal % 2 * Math.pow(10, i);
            decimal /= 2;
        }

        System.out.println("Binary equivalent of " + temp + " is " + num);
        sc.close();
    }
}
