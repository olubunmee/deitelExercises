package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    private Bank gtBank;

    @BeforeEach
    public void setUp(){
        gtBank = new Bank("GtBank", 1001001);
    }

    @Test
    public void bankCanBeCreatedTest(){
        Bank gtBank = new Bank("GtBank", 1001001);
        assertNotNull(gtBank);
        assertEquals("GtBank", gtBank.getName());
        assertEquals(1001001, gtBank.getMaximumNoOfCustomers());
    }

    @Test
    public void bankCanCreateAccountTest(){
        gtBank.register("Bakre","Olubunmi", "5313");
        gtBank.register("Bakre","Olubunmi", "5313");
        gtBank.register("Bakre","Olubunmi", "5313");
        assertEquals(3, gtBank.getNoOfCustomers());
    }

    @Test
    public void createAccountCheckForFirstCustomer(){
        gtBank.register("Bakre","Olubunmi", "5313");
        assertEquals(3, gtBank.getNoOfCustomers());
        Account account = gtBank.findAccount(1);
        assertEquals("Bakre Olubunmi", account.getAccountName());
        //assertEquals(1, account.getAccountNumber());
    }


}
