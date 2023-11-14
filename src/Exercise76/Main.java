package Exercise76;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //76.En array med 10 inlästa tal finns. Lägg över dessa tal i en annan array så att talen
        //kommer i omvänd ordning.
        //int j = newArray.length - 1;
        //j--;

        int[] numbers = new int[]{11,22,33,44,55,66,77,88,99,100};
        int[] newArray = new int[10];
        for (int i = 0, j =9; i < numbers.length; i++,j--){ // Vi kan skapa flera variabler för vår loop och sedan iterera en positivt och en negativt
            newArray[i] = numbers[j]; // den här fungerar på samma sätt som när vi har en counter eller dylikt utanför loopen, bara det att vi lagt in det i sjävla for-loopen
            //Deklarering
        }

        System.out.println(Arrays.toString(newArray));

    }
}


