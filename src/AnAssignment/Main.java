package AnAssignment;
import java.util.Scanner;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logics Logics = new Logics();


        String savedStrings = "";

        while (true) {
            System.out.println("Please write some words, one word, followed by enter");
            System.out.println("To quit, please write Stop");
            String input = scan.nextLine();
            if (!input.equalsIgnoreCase("Stop")) {

                savedStrings = savedStrings + " " + input;

            } else {

                Logics.setWordArray(savedStrings.trim());
                break;
            }

            Logics.printMyArray();
            System.out.println("The first word is: " + Logics.getFirstWord());
            System.out.println("The last word is: " + Logics.getLastWord());
            System.out.println("The array is " + Logics.getArrayLength() + " positions");
        }

    }
}

