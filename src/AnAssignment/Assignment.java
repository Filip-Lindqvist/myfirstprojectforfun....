package AnAssignment;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("Skriv så många rader ord som du vill: ");
        Scanner scan = new Scanner(System.in);
        Assignment klass = new Assignment();

        String savedStrings = "";


        while (true) {
            System.out.println("Please write some words, one word, followed by enter");
            System.out.println("To quit, please write a *");
            String input = scan.nextLine();
            if (!input.equals("*")) { // Om vi inte skrivit * så ska programmet fortsätta
                // Vi vill även att information som vi ha skrivit in på något sätt sparas.

                savedStrings = savedStrings + " " + input; // Vi sparar saved strings innuti
                // samt ett mellanrum och sedan innehållet i vår input

            } else { // annars så bör vi avbryta programmet!


            }
        }
    }
}


