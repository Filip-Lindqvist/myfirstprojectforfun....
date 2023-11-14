package Aassignment;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic testKlass = new Logic();
        Logic testKlassTwo = new Logic();
        String savedStrings = "";
        String removeWhiteSpace = "";



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
