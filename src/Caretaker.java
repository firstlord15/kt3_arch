import java.util.Stack;

public class Caretaker {
    private Stack<BankAccount.Memento> mementos = new Stack<>();

    public void saveState(BankAccount bankAccount) {
        mementos.push(bankAccount.save());
    }

    public void restoreState(BankAccount bankAccount) {
        if (!mementos.isEmpty()) {
            bankAccount.restore(mementos.pop());
        } else {
            System.out.println("No states to restore.");
        }
    }
}