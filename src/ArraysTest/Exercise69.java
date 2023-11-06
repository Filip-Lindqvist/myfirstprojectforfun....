package ArraysTest;

import java.util.Arrays;

public class Exercise69 {
    public static void main(String[] args) {
        String[] myArray = new String[]{"19840213-2658"}; //<--- Vi har nu skapat ett array, med enbart en position som innehåller
        //hela våran string!
        int[] longArray = new int[50]; // <--- vi skapar ett tomt array med 50 platser.

        for (int i = 0;i < longArray.length;i++){
            longArray[i] = i + 1;

        }
       // System.out.println(Arrays.toString(longArray));

        String tempString = "Hej på dig!";
//char[] tempCharArray = tempString.toCharArray(); //<--- Vi tar en String ifrån vårt stringarray och "hackar" upp det i chars som vi sedan sparar
//Fungerar även rakt av på en string!
        char[] tempCharArray = myArray[0].toCharArray(); //<--- Vi tar en String ifrån vårt stringarray och "hackar" upp det i chars som vi sedan sparar
//i ett array av chars!
//System.out.println(tempCharArray[1]);

        for (int i = 0; i<tempCharArray.length;i++){
            System.out.print(tempCharArray[i] + ","); //<-- varje position i vårt nya array är en bokstav (char)
        }




        /* //uppgift 69:
        for (int i = 0; i < longArray.length;i+=2){
            longArray[i] += 2;
            System.out.println("Index:" + i + " Value:" + longArray[i]);
        }
        //System.out.println(Arrays.toString(longArray));

         */
    }
}
