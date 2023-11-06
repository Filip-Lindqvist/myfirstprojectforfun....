package Exercise7;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        //Läs in en String (scan.nextLine())
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();


        //Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen
        for (int i=0;i<text.length();i++) {
            System.out.print(text.charAt(i) + " ");

        }

        //om man skriver ordet "ägg" så skrivs mening "ägg är knasigt" ut

        if (text.equals("ägg")) {
            System.out.println("ägg är knasigt");

        }

    }
}
