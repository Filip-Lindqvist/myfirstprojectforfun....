package ExerciseCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //6.Skapa en class kallad Calculator som läser in två tal
        // i konstruktorn och sparar dem som attribut
        //7.Skapa en metod som skriver ut addition för dessa
        // två tal. Skapa ett objekt och anropa denna metod ifrån
        // en annan klass som har en main-metod
        //8.Uppdatera din main-metod så att den läser in de två
        // talen med Scanner
        //9.Uppdatera Calculator så att den har liknande metoder
        // för minus/delat med/gånger
       Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number: ");
        double firstNumber = Double.parseDouble(scan.nextLine());
        System.out.println("Please write another number");
        double secondNumber = Double.parseDouble(scan.nextLine());


        Calculator calc = new Calculator(firstNumber,secondNumber);
        calc.add();
        calc.minus();
        calc.divide();
        calc.multiply();
        calc.modulus();




    }
}
