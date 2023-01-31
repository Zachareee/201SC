
// This class is for Q9
public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 500;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance < amount)
            return false;
        balance -= amount;
        return true;
    }

    public void transfer(double amount, BankAccount another) {
        if (withdraw(amount))
            another.deposit(amount);
    }
}
