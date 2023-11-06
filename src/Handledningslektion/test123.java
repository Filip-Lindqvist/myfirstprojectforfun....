package Handledningslektion;

import java.util.Scanner;

public class test123 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String myName = scan.nextLine();
            String myAge = "25";
            String myPlace = "Asmundtorp";
            String myBand = "Bbno$";

            System.out.println(myName + " is " + myAge + " years old and comes from " + myPlace +
                    " and likes the artist: " + myBand );

        }
    }


