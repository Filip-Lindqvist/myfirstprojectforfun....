package exercise2;

public class exercise {

    public static void main(String[] args) {

        /* Jämför två tal. Om det första är större än
        det andra skriv ut "första talet är störst",
        samt "Andra talet är ströst" om det är tvärt om
         */

        int first = 21;
        int second = 7;

        if(first > second) {
            System.out.println("Första talet är störst");
        } else if(first < second) {
            System.out.println("Andra talet är störst");
        }

/*
Jämför två tal. Om det första är jämt delbart
 med det andra skriv ut "jämt delbart", annars skriv ut "inte jämt delbart"
         */

        if(first % second == 0) {
            System.out.println("Jämt delbart");
        } else {
            System.out.println("inte jämt delbart");
        }

    }
}
