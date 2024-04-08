import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private Map<String, BankAccount> accounts;
    private Map<String, TransactionHistory> histories;

    public AccountManager() {
        accounts = new HashMap<>();
        histories = new HashMap<>();
    }

    public void createAccount(String holderName, String accountId) {
        BankAccount newAccount = new BankAccount(holderName, accountId);
        TransactionHistory history = new TransactionHistory(accountId);
        accounts.put(accountId, newAccount);
        histories.put(accountId, history);
        System.out.println("Account created for " + holderName + " with ID " + accountId);
    }

    public void deposit(String accountId, double amount) {
        BankAccount account = accounts.get(accountId);
        if(account != null) {
            account.deposit(amount);
            histories.get(accountId).addTransaction("Deposit: " + amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountId, double amount) {
        BankAccount account = accounts.get(accountId);
        if(account != null && account.withdraw(amount)) {
            histories.get(accountId).addTransaction("Withdrawal: " + amount);
        } else {
            System.out.println("Transaction failed.");
        }
    }

    public void printTransactionHistory(String accountId) {
        TransactionHistory history = histories.get(accountId);
        if(history != null) {
            System.out.println("Transaction history for account " + accountId + ":");
            history.printHistory();
        } else {
            System.out.println("Account not found.");
        }
    }
}
