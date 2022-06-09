package personalEbank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {

    @Test
    public void createAccount(){
        Account account = new Account("Bakre", "Olubunmi", "1001001", "0339");
        assertNotNull(account);
    }

    @Test
    public void createWithDetails(){
        Account account = new Account("Bakre", "Olubunmi", "1001001", "0339");
        assertEquals("1001001", account.getAccountNumber());
    }

    @Test
    public void acceptPin(){
        Account account = new Account("Bakre", "Olubunmi", "1001001", "1234");
        assertEquals("1001001", account.getAccountNumber());
        assertEquals("1234", account.getPin());
    }

    @Test
    public void depositTest(){
        Account account = new Account("Bakre", "Olubunmi", "1001001", "1234");
        assertEquals("1001001", account.getAccountNumber());
        account.deposit(10000);
        assertEquals(10000, account.getBalance());
    }

    @Test
    public void depositTwice(){
        Account account = new Account("Bakre", "Olubunmi", "1001001", "1234");
        assertEquals("1001001", account.getAccountNumber());
        account.deposit(10000);
        account.deposit(5000);
        assertEquals(15000, account.getBalance());
    }

    @Test
    public void withdrawTest(){
        Account account = new Account("Bakre", "Olubunmi", "1001001", "1234");
        assertEquals("1001001", account.getAccountNumber());
        account.deposit(10000);
        account.withdraw(5000, "1111");
    }

    @Test
    public void withdrawWithWrongPinTest(){
        Account account = new Account("Bakre", "Olubunmi", "1001001", "1234");
        assertEquals("1001001", account.getAccountNumber());
        account.deposit(10000);
        account.withdraw(5000, "1111");
        assertEquals(10000, account.getBalance());
    }
}
