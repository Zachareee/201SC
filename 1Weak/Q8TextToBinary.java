import java.util.*;

public class Q8TextToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text message: ");
        String text = sc.nextLine();

        String result = "";
        int length = text.length();
        for (int i = 0; i < length ; i++) {
            String binary = Integer.toBinaryString(text.charAt(i));
            result += "0".repeat(8 - binary.length() % 8) + binary;
        }

        System.out.println(result);
        sc.close();
    }
}