package Handledningslektion;

import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många kronor har du?");

        int number = Integer.parseInt(scan.nextLine());



        System.out.println("Filip har: " + number + " Kronor");

        for (int i = 0;i<=number;i++){
            System.out.println("Filip har räknat: " + i + " Kronor");
        }

    }
}
