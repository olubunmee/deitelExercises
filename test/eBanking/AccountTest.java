package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {

    Account account;
    @BeforeEach
    public void setup(){
        account = new Account("2311", "Bakre", "Olubunmi", "0339");
    }


    @Test
    public void accountCanBeCreated(){
        Account account = new Account("4533", "Bakre", "Olubunmi", "8977");
        assertNotNull(account);
    }

    @Test
    public void accountCanBeCreatedWithAllDetails(){
        Account account = new Account("2311", "Bakre", "Olubunmi", "0339");
        assertEquals("2311", account.getACCOUNT_NUMBER());
        assertEquals("Bakre Olubunmi", account.getAccountName());
    }

    @Test
    public void accountCanAcceptPin(){
        Account account = new Account("2311", "Bakre", "Olubunmi", "0339");
        assertEquals("2311", account.getACCOUNT_NUMBER());
        assertEquals("Bakre Olubunmi", account.getAccountName());
        assertEquals("0339", account.getPin());
    }

    @Test
    public void accountCanDeposit(){
        account.deposit(20000);
        assertEquals(20000, account.getBalance());
    }

    @Test
    public void accountCanDepositTwice(){
        account.deposit(5000);
        account.deposit(4000);
        assertEquals(9000, account.getBalance());
    }

    @Test
    public void accountCanWithdraw(){
        account.deposit(5000);
        account.withdraw(3000, "0339");
    }

    @Test
    public void accountCannotWithdrawWithWrongPin(){
        account.deposit(5000);
        account.withdraw(2000, "0339");
        assertEquals(5000, account.getBalance());
    }

}
