public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        manager.createAccount("John Doe", "1234");
        manager.deposit("1234", 500.00);
        manager.withdraw("1234", 200.00);
        manager.printTransactionHistory("1234");
    }
}
