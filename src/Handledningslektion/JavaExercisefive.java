package Handledningslektion;

import java.util.Scanner;

public class JavaExercisefive {

    public static void main(String[] args) {

        // 13. SKapa ett program som läser in ett tal och skriver ut om det är jämt (använd modulus)


        Scanner scan = new Scanner(System.in);
        System.out.print("Write a random number: ");


        int number = Integer.parseInt(scan.nextLine());
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd!");
        }
    }
}
