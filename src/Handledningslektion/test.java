package Handledningslektion;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hur mycket har du sålt för den här månaden (i hela kronor)? ");

        int sales = Integer.parseInt(input.nextLine());
        int wages = 8000 + sales/100*9;

        System.out.println("Din lön den här månaden är " + wages + " kr");

    }
}
