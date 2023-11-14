package justanotherarraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayFactory factory = new ArrayFactory();
        // Vi vill skapa ett array i vår Arrayfactory
        // vi får inte skapa själva arrayet inuti vår MainKlass
        // Vi stannar programmet när vi skrivit in *

        String savedStrings = ""; // vi deklarerar en tom String utanför vår
        // while loop.

        while (true) {
            System.out.println("Please write some words, one word, followed by enter");
            System.out.println("To quit, please write a *");
            String input = scan.nextLine();
            if (!input.equals("*")){ // Om vi inte skrivit * så ska programmet fortsätta
                // Vi vill även att information som vi ha skrivit in på något sätt sparas.

                savedStrings = savedStrings + " " + input; // Vi sparar saved strings innuti
                // samt ett mellanrum och sedan innehållet i vår input

            } else { // annars så bör vi avbryta programmet!

                factory.setWordArray(savedStrings.trim()); // <-- .trim tar bort whitespace!
                break; // avslutar vår loop!
                 // vi skriver även här innan vi bryter loopen effekten av våra
                // beräkningar, detta går även att göra efter vår while-loop.
            }
        }

        factory.printMyArray();
        System.out.println("The first word is: " + factory.getFirstWord());
        System.out.println("The last word is: " + factory.getLastWord());
        System.out.println("The amount of rows of words you wrote is:  " + factory.getArrayLength() + " rows");
    }
}
