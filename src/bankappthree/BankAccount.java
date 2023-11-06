package bankappthree;

public class BankAccount {
    //Vi skapar en variabel kallad balance som
    //Representerar mängden vi har på kontot!
    //Den innehåller för tillfället inget värde!
    private int balance;
    private String name;

    //Vi skapar en konstruktor för att ta in en summa
    // som vi sedan sätter balance, lika med.
    //Vi gör sedan samma sak med myName/name
    public BankAccount(int myBalance, String myName){
        if (myBalance < 0){
            balance = 0;
        } else {
            balance = myBalance;
        }
        name = myName;


    }
    //Vi skapar en metod som inte returnerar något (Void)
    //Dess enda uppgift är att skriva ut nuvarande saldo
    public void printBalance(){
        System.out.println("Your balance is: " + balance);
    }
    //Precis som i konstruktorn så sätter vi ett värde
    //Vi kan ta in vilket int värde som helst!
    public void setBalance(int newBalance){
        balance = newBalance;
    }
    public void deposit(int deposit){
        //Vi tar in deposit och sätter sedan
        //Balance till balance + deposit!
        //balance = balance + deposit;
        balance += deposit;
    }
    public void withdraw(int withdrawal){
        //Vi agerar på samma sätt som i deposit!
        //Vi kontrollerar att vi inte kan få minus på
        //Vårt konto igenom att kolla så att balance - withdrawal
        //inte är mindre än 0!
        if ((balance - withdrawal) < 0){
            System.out.println("You don't have enough money!");
        } else {
            balance -= withdrawal;
        }
    }
    public int getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }

    public void setName(String myName){
        name = myName;
    }
}


