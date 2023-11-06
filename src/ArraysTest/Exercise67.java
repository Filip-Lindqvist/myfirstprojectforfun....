package ArraysTest;

public class Exercise67 {
    public static void main(String[] args) {
        String[] myArray = new String[]{"19840213-2658"}; //<--- Vi har nu skapat ett array, med enbart en position som innehåller
        //hela våran string!
        if (myArray[0].charAt(11) % 2 == 0){ // Vi kollar näst sista siffran och ser om den är ojämn eller inte.
            System.out.println("Kvinna!");
        } else {
            System.out.println("Man!");
        }

        if (myArray[0].charAt(myArray[0].length()-2) % 2 == 0){ // Vi kollar näst sista siffran och ser om den är ojämn eller inte.
            System.out.println("Kvinna!");
        } else {
            System.out.println("Man!");
        }
       // System.out.println(myArray[0].charAt(myArray[0].length()-2)); // VI kan kontrollera om vi fångar rätt siffa bara för att vara säkra.
    }

}

