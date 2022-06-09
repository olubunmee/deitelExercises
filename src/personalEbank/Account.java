package personalEbank;

public class Account {

    private final String ACCOUNT_NUMBER;
    private String pin;
    private int balance;

    public Account(String lastName, String firstName, String accountNumber, String pin) {
        this.ACCOUNT_NUMBER = accountNumber;
        this.pin = pin;

    }

    public String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }


    public String getPin() {
        return pin;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String pin) {
        if (pin.equals(this.pin))
            balance = balance - amount;
    }

}
