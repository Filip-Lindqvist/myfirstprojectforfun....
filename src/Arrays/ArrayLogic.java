package Arrays;

import java.util.Arrays;

public class ArrayLogic {

    public void printArray(String input){
        String[] tempArray = new String[10]; // Vi måste har något sätt ange en längd på
        //vårt array när vi skapar det!
        String[] wordArray = input.split(" "); // Vi delar upp vår string i små delar
        // vid varje mellanslag och sparar varje del seperat i vårt nya array!

        //System.out.println(Arrays.toString(wordArray));
        //System.out.println(wordArray[0]);
        //System.out.println(wordArray[3]); // vi får inte skriva ut ett index som inte existerar, det ger ett error


        for (int i = 0; i < wordArray.length;i++){
            System.out.println(wordArray[i]); // För att skriv ut varje ord för sig, så kan vi
            //iterrera igenom vårt array och kolla alla indexpositioner med hjälp av "i"
        }
    }
}
