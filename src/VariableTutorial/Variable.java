package VariableTutorial;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        //Hur gör man för att kunna återanvända en variabel trots att den ligger i en while loop .tex

        Scanner scan = new Scanner(System.in);
        int magicNumber = 0;
        String myWord = " ";
        boolean isOn = false;

        while (!isOn) {
           magicNumber = 5; // vi kan ändra magicNumber värde inuti vår while-loop om vi
            // initialiserat magicNumber utanför vår whileloop/whileloopens scope!
            myWord = scan.nextLine();
            break;
        }
        System.out.println(magicNumber); // <-- Vi kan inte skriva ut magic number om den har skapats inuti
        // vår while-loop
        System.out.println(myWord);
    }
}
