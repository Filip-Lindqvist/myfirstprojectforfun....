package ArraysTest;

public class Main {
    public static void main(String[] args) {

        String[] myArray = new String[]{"19840213-2658"}; // <--- vi har nu skapat ett array, med enbart en position som innehåller
        //hela våran string!
       for (int i = 0; i < myArray.length;i++){
            //System.out.println(myArray[i].charAt(8)); // VI kan kontrollera vilken char som finns på indexpositionen där
            // bindestrecket bör existera.
            //System.out.println(myArray[i].charAt(myArray[i].length()-5)); // Vi kollar vad som existerar på punkten där
            // vi backat fem steg ifrån den totala längen av vår String som ligger inuti vårt array!

           if (myArray[i].charAt(myArray[i].length()-5) != '-'){ // vi kontrollerar om char på position length-5 inte är
               // lika med -
               System.out.println("no qoute found! Please try again!");

           }
        }

    }
}
