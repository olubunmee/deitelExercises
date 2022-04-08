package eBanking;

public class Bank {
    private final String name;
    private final Account [] accounts;
    private int numberOfCustomer;
    private int accountNumber;
    public Bank(String bankName, int numberOfCustomer) {
        name = bankName;
        accounts = new Account[numberOfCustomer];
    }

    public String getName() {
        return name;
    }

    public int getMaximumNoOfCustomers() {
        return accounts.length;
    }

    public void register(String firstName, String lastName, String password) {
        Account account = new Account("" + (numberOfCustomer + 1), firstName, lastName,password);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
    }

    public int getNoOfCustomers() {
        return numberOfCustomer;
    }

    public Account findAccount(int accountNumber) {
        int indexOfNumber = accountNumber - 1;
        Account theAccount = accounts[indexOfNumber];
        return theAccount;
    }
}
