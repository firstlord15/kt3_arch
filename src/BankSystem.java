public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        Caretaker caretaker = new Caretaker();
        System.out.println("Initial balance: " + account.getBalance());
        caretaker.saveState(account);

        account.deposit(500);
        caretaker.saveState(account);
        account.withdraw(300);

        caretaker.restoreState(account);
        caretaker.restoreState(account);
    }
}