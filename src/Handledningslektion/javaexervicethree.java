package Handledningslektion;

import java.util.Scanner;

public class javaexervicethree {
    public static void main(String[] args) {
        // 3. Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
        //blir omvandlat till minuter resp sekunder.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a random number for the amount of hours: ");
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = (hours*60);
        int seconds = (minutes*60);
        System.out.println("This is the amount hours in minutes: " + minutes);
        System.out.println("This is the amount hours in seconds:" + seconds);
    }
}
