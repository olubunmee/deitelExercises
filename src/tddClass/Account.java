package tddClass;

public class Account {

    private int balance;

    public void deposit(int amount) {
        balance = amount + balance;
        if (amount < 0) {
            amount = 0;
        }
    }
    public int getBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        if (amount < balance){
            balance = balance - amount;
        }

    }
}


