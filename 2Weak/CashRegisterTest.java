import java.util.Scanner;

public class CashRegisterTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CashRegister regi = new CashRegister();
        System.out.print("Enter the price of the first item: $");
        regi.registerPurchase(sc.nextDouble());
        sc.nextLine();

        System.out.print("Enter the price of the second item: $");
        regi.registerPurchase(sc.nextDouble());
        sc.nextLine();

        System.out.print("\nEnter dollars received from customer: ");
        int dollars = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter cents received from customer: ");
        int cents = sc.nextInt();

        regi.makePayment(dollars, cents);
        System.out.printf("\nTotal cost of purchase: $%.2f%n", regi.getPurchaseAmt());
        System.out.printf("Change due: $%.2f%n", regi.giveChange());
    }
}
