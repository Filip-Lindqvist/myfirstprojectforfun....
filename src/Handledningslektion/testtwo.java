package Handledningslektion;

import java.util.Scanner;

public class testtwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ange ett heltal: ");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.print("Ange ytterligare ett heltal: ");
        int num2 = Integer.parseInt(scan.nextLine());

        int svar = dubbKoll(num1,num2);

        if (svar == 1){
            System.out.println("För stort!");
        } else{
            System.out.println("Tal 1 är lagom stort :)");
        }
    }

    public static int dubbKoll(int a, int b){
        int timesTwo = b*2;
        if (a > timesTwo){
            return 1;
        } else {
            return 2;
        }
    }
    }
