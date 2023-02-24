import java.util.*;
import java.io.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner reader = getScanner();

        while (reader.hasNext()) {
            ArrayList<String> intArr = new ArrayList<>();
            String line = reader.nextLine();
            String[] arr = line.split(",");

            for (String s : arr) {
                intArr.add(0,s);
            }

            System.out.println(String.join(",", intArr));
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
