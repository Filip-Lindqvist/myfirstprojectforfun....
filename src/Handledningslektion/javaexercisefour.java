package Handledningslektion;

import java.util.Scanner;

public class javaexercisefour {

    public static void main(String[] args) {
        //4. Skapa ett program som läser in tre tal och beräknar och skriver ut summan samt medelvärdet
        //av de tre talen.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a random number: ");
        int number1 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter a random number: ");
        int number2 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter a random number: ");
        int number3 = Integer.parseInt(scan.nextLine());
        int result = number1 + number2 + number3;
        System.out.println("This is your result: " + result);
        int medel = (result/3);
        System.out.println("This is your medelvärde: " + medel);
    }
}
