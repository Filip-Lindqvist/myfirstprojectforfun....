package bankappthree;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //Vi har skapat ett objekt av klassen BankAccount
            //Som vi döper till adamAcc och vi skickar in 1000 till myBalance
            BankAccount adamAcc = new BankAccount(1000, "Adam");
            BankAccount staffanAcc = new BankAccount(-200, "Staffan");

            Scanner scan = new Scanner(System.in);

            while (true) {
                int amount;
                System.out.println("Welcome to imaginary bank, " + adamAcc.getName());
                System.out.println("1.Check balance");
                System.out.println("2.Set balance");
                System.out.println("3.Deposit");
                System.out.println("4.Withdraw");
                System.out.println("5.Quit");
                int input = Integer.parseInt(scan.nextLine());
                if (input == 1) {
                    System.out.println("Current balance: " + adamAcc.getBalance());
                } else if (input == 2) {
                    System.out.print("Skriv summa för kontot:");
                    amount = Integer.parseInt(scan.nextLine());
                    adamAcc.setBalance(amount);
                } else if (input == 3) {
                    System.out.print("Skriv summa att sätta in:");
                    amount = Integer.parseInt(scan.nextLine());
                    adamAcc.deposit(amount);
                } else if (input == 4) {
                    System.out.print("Skriv summa att ta ut:");
                    amount = Integer.parseInt(scan.nextLine());
                    adamAcc.withdraw(amount);
                } else if (input == 5) {
                    System.out.println("Quitting...");
                    break;
                }
            }


        }
    }

