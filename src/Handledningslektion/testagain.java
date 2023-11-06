package Handledningslektion;

import java.util.Scanner;

public class testagain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean hasQuit = false;
        while (!hasQuit) {
            System.out.println("Write break to quit!");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("break")) {
                System.out.println("Breaking!");
                hasQuit = true;
            }
        }
    }
}

