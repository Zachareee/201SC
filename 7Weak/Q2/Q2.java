import java.util.Scanner;
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner reader = getScanner();
        while (reader.hasNext()) {
            sum += reader.nextInt();
        }

        System.out.println("The sum is " + sum);
    }

    public static Scanner getScanner() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter filename> ");
            String filename = sc.nextLine();
            try {
                return new Scanner(new File(filename));
            } catch (FileNotFoundException e) {
                System.out.println(filename + " is invalid");
            }
        }
    }
}
