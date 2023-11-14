package Exercise75;

public class Main {
    public static void main(String[] args) {
        //75.En array med 50 inlästa tal finns.
//Beräkna och skriv ut summan av alla positiva tal och
//summan av alla negativa tal i arrayn.

        int[] myArray = new int[]{152,232,35,4,5,526,7,8,9,5210,11,1252,13,14,1525,16,17,53218,19,25230,21,22,23,24,25,-52,-232,-35,-4,-5,-526,-7,-8,-9,-5210,-11,-1252,-123,-134,-1525,-16,-17,-518,-19,-230,-21,-22,-23,-24,-25};

        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > 0) { // Vi kontrollerar om numret i myArray är större än noll!
                positiveSum += myArray[i]; // Vi sparar i positiv summa!
            }
            if (myArray[i] < 0) {// Vi kontrollerar om numret i myArray är mindre än noll!
                negativeSum += myArray[i]; // VI sparar i negativ summa!
            }

            }
        System.out.println("Posetive sum: " + positiveSum);
        System.out.println("Negative sum: " + negativeSum);

        int myNumber = 180;
        if (myNumber > 200){
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller");
        }
        System.out.println(myNumber > 200 ? "Bigger" : "Smaller");
        // Vi kollar om myNumber är större än 200 ochvi printar sedan det som kommer efter "?"
        // Det första är vårt "True" fall och det andra är vårt "False" fall.
        String myString = "Hej";
        int anotherNumber = myString.equals("Hej") ? 10 : 20;
        // vi sätter värdet i anotherNumber beroende på om myString är = "Hej" eller inte.
        System.out.println(anotherNumber);

        }
    }

