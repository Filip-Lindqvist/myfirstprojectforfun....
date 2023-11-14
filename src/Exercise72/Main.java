package Exercise72;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int[] myArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,33,-11,2,5,4,2,1,99,2,256,1,2,255,21,-21,20,11};

        for (int i = myArray.length -1; i > 0; i--){ // vi kör en for loop som vandrar bakifrån sjävla arrayets längds-
            // vi får ta bort ett ifrån myarray's längd eftersom index och length är olika och vi inte vill gå "out of bounds".
            if (myArray[i] < 0) {
                System.out.println("Sista negativa numret:" + myArray[i]);
                System.out.println("Sista negativa numrets index: " + i);
                break; // vi bryter loopen när vi har hittat det första negativa talet

            }
        }

    }

}
