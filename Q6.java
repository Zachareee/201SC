import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }

        sc.close();
    }

    // This method returns true if str2 can be aligned with str1 
    // and false otherwise. If there is an alignment, this method 
    // also prints out the alignment. See the sample runs of the 
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        int length = str2.length();
        int start = -1;
        String game = "";

        for (int i = 0; i < length; i++) {
            char letter = str2.charAt(i);
            int idx = str1.indexOf(letter, start + 1);
            if (idx == -1 || idx <= start) {
                return false;
            }

            game += " ".repeat(idx - start - 1);
            game += letter;
            start = idx;
        }

        System.out.println(str1);
        System.out.println(game);
        return true;
    }
}
