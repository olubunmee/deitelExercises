package eBanking;

public class Account {
    private final String ACCOUNT_NUMBER;
    private String accountName;
    private String pin;
    private int balance;
    public Account(String accountNumber, String firstName, String lastName, String pin) {
        ACCOUNT_NUMBER = accountNumber;
        accountName = firstName + " " + lastName;
        this.pin = pin;

    }

    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPin() {
        return pin;
    }

    public void deposit(int amount) {
        balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String pin) {
        if (pin.equals(this.pin))
        balance = balance - amount;
    }
}
