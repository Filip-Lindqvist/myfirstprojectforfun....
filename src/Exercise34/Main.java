package Exercise34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = "";
        while (!input.equals("*")) {
            System.out.print("Var vänlig skriv ett tecken: ");
            input = scan.nextLine();
            if (input.length() > 1 || input.length() <= 0) {
                System.out.println("fel mängd tecken!");
            } else {
                System.out.println(input);
            }
            if (input.equals("*")) {
                break;
            }


           /* System.out.println("Skriv avSLUTA");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("avSLUTA")) {
                System.out.println("Avslutar!");
                break;
            } else {
                System.out.println("Feeel! Avslutar ej!");
            }
        } */
        }
    }
}
