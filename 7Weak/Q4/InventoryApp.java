import java.util.Scanner;
import java.io.*;

public class InventoryApp {
    public static void main(String[] args) {
        stockTaking("product.csv");
    }

    public static void stockTaking(String filename) {
        int count = 0;
        float price = 0;
        try (Scanner reader = new Scanner(new File(filename))) {
            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] arr = line.split(",");

                int icount = Integer.parseInt(arr[0]);
                float iprice = Float.parseFloat(arr[2]);
                System.out.printf("There are %s %s, each cost $%.2f%n", arr[0], arr[1], iprice);
                count += icount;
                price += icount * iprice;
            }

            System.out.printf("There are %d products with a total value of $%.2f to be sold.%n", count, price);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
