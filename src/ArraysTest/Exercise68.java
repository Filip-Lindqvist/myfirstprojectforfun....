package ArraysTest;

import java.util.Arrays;

public class Exercise68 {
    public static void main(String[] args) {
        String[] myArray = new String[]{"19840213-2658"}; //<--- Vi har nu skapat ett array, med enbart en position som innehåller
        //hela våran string!
        int[] longArray = new int[50]; // <--- vi skapar ett tomt array med 50 platser.

        for (int i = 0;i < longArray.length;i++){
            longArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(longArray));
        for (int i = 0; i < longArray.length; i++){ // vi går igenom arrayet
            longArray[i] = longArray[i] * 2; // vi multiplicerar alla tal med två på alla positioner inom arrayet!

        }
        System.out.println(Arrays.toString(longArray));
    }
}
