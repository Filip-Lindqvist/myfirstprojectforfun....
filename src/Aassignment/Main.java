package Aassignment;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Standard Scanner
        Logic testKlass = new Logic(); // Klass 1 som innehåller nedan som tar in användarens input längre ned och skriver ut det till användaren
        Logic testKlassTwo = new Logic(); // Klass 2 som räknar på vad användaren har skrivit i klass 1 och informerar
        String savedStrings = ""; //Sparar en String som tom, som vi skriver nedan mer om,
        // så när vi skriver in våra ord senare i kontroll panelen så blir det korrekt.
        String removeWhiteSpace = ""; // Sparar en String som tom, som vi skriver nedan om senare utan " ",
        // så att whitespaces inte räknas som en char.



        while (true) {
            System.out.println("Please Write some words, one word, followed by enter.");
            System.out.println("To quit, please write the word Stop");
            String input = scan.nextLine();
            if (!input.equalsIgnoreCase("Stop")){
                savedStrings = savedStrings + " " + input;
                removeWhiteSpace = removeWhiteSpace + input;
            } else {
                testKlass.setWordArray(savedStrings.trim());
                testKlassTwo.setWordArray(Arrays.toString(removeWhiteSpace.chars().toArray()).trim());
                break;
            }
        }
        System.out.println("The amount of rows of words you wrote is: " + testKlass.getArrayLength() + " rows");
        System.out.println("The amount of chars in what you have written is: " + testKlassTwo.countEachChars() + " chars");
    }
}
