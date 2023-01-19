
// This class is for Q9
public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (balance < amount)
            return false;
        balance -= amount;
        return true;
    }

    public void transfer(int amount, BankAccount another) {
        if (withdraw(amount))
            another.deposit(amount);
    }
}
