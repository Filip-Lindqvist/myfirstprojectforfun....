package Array;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = new String[5];

        //Skapa ett program som läser in fem namn ifrån teminalen och sparar dem i en array
       for (int i=0;i< names.length;i++) {
           names[i] = scan.nextLine();
       }
        //skriv ut det första och sista namnet

        System.out.println(names[0]);
        System.out.println(names[4]);
    }
}
