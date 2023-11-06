package ArraysTest;

public class ArrayChar {
    public static void main(String[] args) {

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

        char aLetter = 'a'; // när vi använder en char så använder vi single quotes
        char bLetter = 'b';
        System.out.println(aLetter + bLetter); // Skriver ut nummer istället för bokstäver som man kanske skulle förvänta sig!
        System.out.println(String.valueOf(aLetter) + String.valueOf(bLetter)); // Vi kan tvinga Java att skriva ut själva char istället som en string med String.valueof.

    }
}
