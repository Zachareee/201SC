import java.util.*;
import java.io.*;

public class ProductTest {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("apple", 3, 1.2));
        products.add(new Product("apple", 3, 1.2));
        products.add(new Product("apple", 3, 1.2));

        save(products,"data\\product.csv");
    }

    public static void save(ArrayList<Product> productList, String pathAndFileName){
        try (PrintStream ps = new PrintStream(new FileOutputStream(pathAndFileName, false))) {
            for (Product p : productList) {
                String s = p.getName() + ',' + p.getQuantity() + ',' + p.getPrice();
                ps.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
