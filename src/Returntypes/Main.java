package Returntypes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        Logic logic2 = new Logic(20);
        Scanner scan = new Scanner(System.in);


       // double[] myArray = new double[5];
        String[] myArray = new String[5];
        System.out.println("Write doubles plx!");
        for (int i = 0; i < myArray.length; i++){
            System.out.print("Write something funny: ");
            myArray[i] = scan.nextLine(); // Vi sparar resultatet av vår scan på index positionen
            // som vi passerar i vår loop. index bestäms av "i"
           // myArray[i] = Double.parseDouble(scan.nextLine());
        }

        System.out.println(Arrays.toString(myArray));

        /*

        String name = logic.getMyName();
        System.out.println(logic.getMyNumber());
        System.out.println(name);
        System.out.println(Arrays.toString(logic.getMyNumbers()));

        System.out.println("_ _ _ _");
       int[] tempArray = logic.getMyNumbers();
        System.out.println(Arrays.toString(logic.getMyNumbers()));
        logic.sayHello();

        for (int i = 0; i < tempArray.length; i++){
            System.out.println(tempArray[i]);
        }
        //System.out.println(logic);

         */
    }
}
