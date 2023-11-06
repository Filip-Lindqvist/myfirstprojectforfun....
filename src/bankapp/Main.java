package bankapp;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //10.   Skapa ett program BankAccount som kan hålla
// koll på hur stort saldo man har (pengar på sittkonto)
//
//11.  Utöka programmet så att man kan skriva ut saldot
//
//12.  Utöka programmet så att man kan bestämma
// ett nytt värde för saldo
//
//13.  Utöka programmet så att man kan lägga till
// och ta bort en viss summa ifrån saldot
//14.  Utöka programmet så att man aldrig kan få ett
// saldo som är mindre än 0 kronor


        BankAccount saldo = new BankAccount("13000 kr");

        saldo.printSaldo();

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your Saldo: ");
        int currency = Integer.parseInt(scan.nextLine());
        System.out.println("You have confirmed your saldo is: " + currency + " kr");

        System.out.println("Write your new Saldo: ");
        int newCurrency = Integer.parseInt(scan.nextLine());
        System.out.println("Your new Saldo is: " + newCurrency + " kr");

        System.out.println("how much do you want Add or Remove of Saldo?");
        int addCurrency = Integer.parseInt(scan.nextLine());
        int minusCurrency = Integer.parseInt(scan.nextLine());
        int totalAddCurrency = newCurrency + addCurrency;
        int totalMinusCurrency = newCurrency - minusCurrency;
        System.out.println("Your added currency is now: " + totalAddCurrency + " or minus currency is: " + totalMinusCurrency);


    }

}
