package exercise70;

public class Main {

    public static void main(String[] args) {
        //70.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är positiva.

        //Skapa en klass ArraysCreator med metoder och anropa den klassen ifrån din main metod!

        ArraysCreator arraysCreator = new ArraysCreator();
        arraysCreator.setPositives(); //<-- kollar hur många positiva tal som finns inuti
        //arrayet inuti arrayCreator
        System.out.println(arraysCreator.getCounter());


        int[] inputArray = new int[]{2, 3, 22, -2, 54, -1, 2, -99};
        ArraysCreator secondArrays = new ArraysCreator();
        secondArrays.setPositives(inputArray); //Överkurslösningen :) Vi skickar in vårt
        //nya array(inputArray) till vår metod setPositives.
        System.out.println(secondArrays.getCounter()); //<-- vi hämtar och skriver ut
        //resultatet (Hur många positiva tal finns i inputArray)
    }
}

