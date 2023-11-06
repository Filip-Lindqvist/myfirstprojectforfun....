package Exercise29;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Methods methods = new Methods();
        //Går att använda scanner för inläsning.

       /* String departureTime = "12:41";
        String elapsedTime = "03:47";

        */

        int departureTimeHours = 12;
        int departureTimeMinutes = 52;
        int travelTimeHours = 3;
        int TravelTimeMinutes = 25;

        int arrivalTimeHours = departureTimeHours + travelTimeHours;
        int arrivalTimeMinutes = departureTimeMinutes + TravelTimeMinutes;


        methods.printArrivalTime(arrivalTimeHours, arrivalTimeMinutes);


    }
}
