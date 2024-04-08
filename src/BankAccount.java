public class BankAccount {
    private String accountHolder;
    private String accountId;
    private double balance;

    public BankAccount(String accountHolder, String accountId) {
        this.accountHolder = accountHolder;
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public boolean withdraw(double amount) {
        if(amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
        balance -= amount;
        System.out.println(amount + " withdrawn. Current balance: " + balance);
        return true;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
