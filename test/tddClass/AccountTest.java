package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest() {
        //given
        Account freshAccount = new Account();
        //when
        freshAccount.deposit(100);
        //assert
        assertEquals(100, freshAccount.getBalance());
    }

    @Test
    public void depositThrice(){
        Account freshAccount = new Account();
        freshAccount.deposit(100);
        freshAccount.deposit(100);
        freshAccount.deposit(500);
        assertEquals(700, freshAccount.getBalance());
    }

    @Test
    public void negativeDeposit(){
        Account freshAccount = new Account();
        freshAccount.deposit(100);
        freshAccount.deposit(100);
        freshAccount.deposit(100000);
        freshAccount.deposit(-200);
        assertEquals(100000, freshAccount.getBalance());
    }

    @Test
    public void newDeposit(){
        Account freshAccount = new Account();
        freshAccount.deposit(5000);
        assertEquals(5000, freshAccount.getBalance());
    }

    @Test
    public void withdrawal(){
        Account freshAccount = new Account();
        freshAccount.deposit(5000);
        freshAccount.withdrawal(2000);
        assertEquals(3000, freshAccount.getBalance());
    }

    @Test
    public void overWithdraw(){
        Account freshAccount = new Account();
        freshAccount.deposit(5000);
        freshAccount.withdrawal(7000);
        assertEquals(5000, freshAccount.getBalance());
    }

    @Test
    public void zeroWithdrawal(){
        Account freshAccount = new Account();
        freshAccount.deposit(0);
        freshAccount.withdrawal(5000);
        assertEquals(0, freshAccount.getBalance());
    }
}
