import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private String accountId;
    private List<String> transactions;

    public TransactionHistory(String accountId) {
        this.accountId = accountId;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(String transaction) {
        transactions.add(transaction);
    }

    public void printHistory() {
        if(transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        for(String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
