package Handledningslektion;

import java.util.Scanner;

public class javaexercisetwo {
    public static void main(String[] args) {

        //2. En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
        //Försäljningssumman ska läsas in

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how much you have sold for: ");
        int number = 8000;
        int number1 = Integer.parseInt(scan.nextLine());
        int sales = (number1*9/100);
        int result = number + sales;
        System.out.println("This is how much you have earned from sales: " + result);


    }
}
