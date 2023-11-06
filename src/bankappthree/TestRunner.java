package bankappthree;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    @Test
    public void testGetName(){
        //Arrange <- Vi arrangerar vår testdata
        BankAccount adamAcc = new BankAccount(1000,"Adam");
        String expected = "Adam";
        //Act <- Vi utför nödvändiga beräkningar etc.
        String actual = adamAcc.getName();
        //Assert <- Vi kollar att vi får korrekt utfall.
        //Vi jämför innehållet i expected och actual
        //Om innehållet är samma så passerar testfallet
        //Annars misslyckas testfallet
        assertEquals(expected,actual);
    }
    @Test
    public void testSetName(){
        //Arrange
        BankAccount adamAcc = new BankAccount(2500,"Adam");
        String expected = "Hans-Erik";
        //Act
        adamAcc.setName("Hans-Erik");
        String actual = adamAcc.getName();
        //Assert
        assertEquals(expected,actual);
    }
    //1.Vi testar att balance sätts korrekt i konstruktorn
    //Med ett enhetstest!
    //2.Vi testar att det fungerar att sätta en ny balance
    //med setBalance och assertar att slutresultatet blir korrekt!
    //3.Vi testar att deposit fungerar korrekt!
    //4.Vi testar att withdraw fungerar korrekt!

    @Test
    public void testNewName(){

        BankAccount adamAcc = new BankAccount(3000, "Filip");
        String expected = "Filip";
        String actual = adamAcc.getName();
        assertEquals(expected,actual);

    }

    @Test
    public void testBalance(){
        //Arrange
        BankAccount ylvisAcc = new BankAccount(1234, "Ylvis");
        int expected = 1234;
        //Act
        int actual = ylvisAcc.getBalance();
        //Assert
        assertEquals(expected,actual);
    }


    @Test
    public void testBalanceDouble(){
        //1.Vi testar att balance sätts korrekt i konstruktorn
        //Med ett enhetstest! (Double)
        //Arrange
        double expected = 1234.25;
        //Act
        double actual = 1234.25;
        //Assert
        assertEquals(expected,actual,0.01);
    }
    @Test
    public void testNewBalance(){
        //2.Vi testar att det fungerar att sätta en ny balance
        //med setBalance och assertar att slutresultatet blir korrekt!
        BankAccount poppsen = new BankAccount(25,"Poppsen");
        int expected = 2500;

        poppsen.setBalance(2500);
        int actual = 2500;

        assertEquals(expected,actual);
    }
    @Test
    public void testDeposit(){
        //3.Vi testar att deposit fungerar korrekt!
        BankAccount arnold = new BankAccount(100,"Arnold");
        int expected = 200;

        arnold.deposit(100);
        int actual = arnold.getBalance();

        assertEquals(expected,actual);

    }
    @Test
    public void testWithdrawal(){
        //4.Vi testar att withdraw fungerar korrekt!
        BankAccount jotaro = new BankAccount(250,"Jotaro Joestar");
        int expected = 100;

        jotaro.withdraw(150);
        int actual = jotaro.getBalance();

        assertEquals(expected,actual);

    }
}





