package Handledningslektion;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

        /*int number = 1;
        int age = 0;
        while(number == 1) {
            age++;
            System.out.println("Adam är nu: " + age);
            if (age > 15000){
                number = 2;
            }
        }
        */
/*Scanner scan = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {

            System.out.println("1.Första valet");
            System.out.println("2.Andra valet");
            System.out.println("0.För att avsluta");
            choice = Integer.parseInt(scan.nextLine());
            if (choice == 1){
                System.out.println("Första valet");
            }
            if (choice ==2) {
                System.out.println("Andra valet");
            }

        }
*/
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
            if (i == 5) {
                System.out.println("Fem?");
                break; // Bryter vår loop oberoende vart vi är!

            }
        }


    }
}
