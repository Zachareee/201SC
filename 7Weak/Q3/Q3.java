import java.util.Scanner;
import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner reader = getScanner();
        while (reader.hasNext()) {
            String line = reader.nextLine();
            String[] arr = line.split(",");

            int sum = 0;
            for (String s : arr) {
                sum += Integer.parseInt(s,10);
            }

            System.out.println(sum);
        }
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
