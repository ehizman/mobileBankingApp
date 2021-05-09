package africa.tutored.chaptertwoClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testCanThatAccountCanDepositOnce() {
        //given
        Account newAccount = new Account();
        //when
        newAccount.deposit(850.00);
        //confirm
        assertEquals(850.00, newAccount.getAccountBalance());
    }

    @Test
    public void testThatAccountCanDepositTwice() {
        //given
        Account newAccount = new Account();
        //when
        newAccount.deposit(200.00);
        newAccount.deposit(400.00);
        //confirm
        assertEquals(600.00, newAccount.getAccountBalance());
    }

    @Test
    public void testThatAccountCanBeWithdrawnFrom () {
        Account newAccount = new Account();
        //when
        newAccount.deposit(500.00);
        short userInput = 2894;
        newAccount.setPin(userInput);
        short accountPin = newAccount.getPin();
        newAccount.withdraw(300.00, accountPin);
        //confirm
        assertEquals(200.00, newAccount.getAccountBalance());
    }

    @Test
    public void testThatAccountSetName(){
        //given
        Account ehisAccount = new Account();
        //when
        String name = "Ehis Edemakhiota";
        ehisAccount.setName(name);
        //confirm
        assertSame("Ehis Edemakhiota", ehisAccount.getName());
    }

    @Test
    public void testThatUserCanUpdateAccountName() {
        //given
        Account newAccount = new Account();
        //when
        String name = "Micheal John";
        newAccount.setName(name);
        String accountName = newAccount.getName();
        String newInput = "Micheal Obi";
        newAccount.setName(newInput);
        //confirm
        assertSame("Micheal Obi", newAccount.getName());
    }

    @Test
    public void testThatUserCannotDepositNegativeValue() {
        //given
        Account newAccount = new Account();
        //when
        newAccount.deposit(-2000.00);
        //confirm
        assertEquals(0.0, newAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCannotWithdrawANegativeValue(){
        //given
        Account newAccount = new Account();
        newAccount.deposit(2000.00);
        float previousBalance = (float) newAccount.getAccountBalance();
        short userInput = 2894;
        newAccount.setPin(userInput);
        short accountPin = newAccount.getPin();
        //when
        newAccount.withdraw(-2000.00, accountPin);
        //confirm
        assertEquals(previousBalance, newAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCannotWithdrawMoreThanBalance() {
        //given
        Account newAccount = new Account();
        newAccount.deposit(20000.00);
        float balance = (float) newAccount.getAccountBalance();
        short userInput = 2894;
        newAccount.setPin(userInput);
        short accountPin = newAccount.getPin();
        //when
        newAccount.withdraw(25000.00, accountPin);
        //confirm
        assertEquals(balance, newAccount.getAccountBalance());
    }

    @Test
    public void testThatUserCanSetPin() {
        //given
        Account newAccount = new Account();
        //when
        short userInput = 2894;
        newAccount.setPin(userInput);
        //confirm
        assertEquals(2894, newAccount.getPin());
    }

    @Test
    public void testThatUserCanUpdatePin(){
        //given
        Account newAccount = new Account();
        //when
        short userInput = 2894;
        newAccount.setPin(userInput);
        System.out.printf("Users pin is: %d%n", newAccount.getPin());
        userInput = 2020;
        newAccount.setPin(userInput);
        //confirm
        assertEquals(2020, newAccount.getPin());
        System.out.printf("New pin is %d%n", newAccount.getPin());
    }

    @Test
    public void testThatUserCannotWithdrawWithoutCorrectPin(){
        //given
        Account ehisAccount = new Account();
        //when
        ehisAccount.deposit(50000.00);
        short accountPin = 2884;
        ehisAccount.setPin(accountPin);
        short userInput = 2883;
        double previousBalance = ehisAccount.getAccountBalance();
        ehisAccount.withdraw(20000.00, userInput);
        //confirm
        assertEquals(previousBalance, ehisAccount.getAccountBalance());
    }
}
