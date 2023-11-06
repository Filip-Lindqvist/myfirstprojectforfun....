package Handledningslektion;

import java.util.Scanner;

public class JavaExercise1 {

    // 1. Skapa ett program som skriver ut kvadraten på ett tal som läses in. Kvadrat är talet
    // som multiplicerat med sig själv.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        int number = Integer.parseInt(scan.nextLine());
        int result = number * number;
        System.out.println("Your result is: " + result);
        System.out.println("Well done you have completed this task.");


    }
}
