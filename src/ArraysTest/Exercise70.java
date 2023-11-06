package ArraysTest;

import java.util.Arrays;

public class Exercise70 {
    public static void main(String[] args) {


        // 70 En array med 50 inlästa tal finns. ta reda på och skriv ut hur många tal som är positiva.
        String[] myArray = new String[]{"19840213-2658"}; //<--- Vi har nu skapat ett array, med enbart en position som innehåller
        //hela våran string!
        int[] longArray = new int[50]; // <--- vi skapar ett tomt array med 50 platser.

        for (int i = 0;i < longArray.length;i++){
            longArray[i] = i + 1;
            if (longArray[i] % 3 == 0){
                longArray[i] = -22;

            }
            if (longArray[i] % 4 == 0){
                longArray[i] = -15;
            }

        }
        //System.out.println(Arrays.toString(longArray));
        int counter = 0;
        for (int i= 0; i <longArray.length; i++) {
            if (longArray[i] > 0){
                counter++;
            }

        }
        System.out.println("Amount of positive numbers: " + counter);

        }


    }

