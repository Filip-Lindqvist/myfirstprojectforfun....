package Handledningslektion;

public class Fibuaccinummer {

    public static void main(String[] args) {

        int antalNummer = 10;
        int numberOne = 0;
        int numberTwo = 1;

        for (int i = 3; i<= antalNummer; i++) {
            int nextNumber = numberOne + numberTwo;
            System.out.print(" " + nextNumber);
            numberOne = numberTwo;
            numberTwo = nextNumber;
        }
    }
}
