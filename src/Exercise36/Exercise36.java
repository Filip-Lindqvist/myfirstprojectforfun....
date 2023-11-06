package Exercise36;

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 1000;
        System.out.println("Please enter interest rate (1.xx format)");
        double interestRate = Double.parseDouble(scan.nextLine());
        //double interestRate = 1.01;

        for (int i = 0; i < 10; i++) {
            sum = sum * interestRate;
            System.out.println("Total sum after " + (i + 1) + " years is: " + sum);
        }
    }
}
