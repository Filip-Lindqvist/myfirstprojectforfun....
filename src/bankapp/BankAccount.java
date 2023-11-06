package bankapp;

public class BankAccount {

    private String saldo;

    public BankAccount(String bankSaldo){
        saldo = bankSaldo;

    }
    public void printSaldo(){
        System.out.println("Your saldo is: " + saldo);
    }

    }


