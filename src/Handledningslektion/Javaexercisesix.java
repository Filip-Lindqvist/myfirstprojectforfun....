package Handledningslektion;

import java.util.Scanner;

public class Javaexercisesix {

    // 15. Skapa ett program som läser in två tal och avgör och skriver ut om det första talet är jämt
    //delbart med det andra talet.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Write a random number: ");
        int num1 = scan.nextInt();
        System.out.print("Write another random number: ");
        int num2 = scan.nextInt();
        if (num1 % num2 == 0) {
            System.out.println(num1 + " Is evenly divisible");
        } else {
            System.out.println(num1 + " Is not evenly divisible");
        }
    }
    }
