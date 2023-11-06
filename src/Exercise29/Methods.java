package Exercise29;

public class Methods {

    public void printArrivalTime(int arrivalTimeHours, int arrivalTimeMinutes){

        /*
        String departureTime, String travelTime
        //Vi hittar indexpositionen av ":" i departureTime
        int index = departureTime.indexOf(":");

        // Vi delar upp departureTime och departure minutes i två seperata int's
        // Den här delen av lösningen är överkurs!
        int hoursDeparture = Integer.parseInt(departureTime.substring(0,index));
        int minutesDeparture = Integer.parseInt(departureTime.substring(index + 1));

        int hoursTravel = Integer.parseInt(travelTime.substring(0,index));
        int minutesTravel = Integer.parseInt(travelTime.substring(index + 1));

        // Vi lägger ihop timmar och minuter!
        int arrivalTimeHours = hoursDeparture + hoursTravel;
        int arrivalTimeMinutes = minutesDeparture + minutesTravel;

        // Vi måste arrangera om datan så att vi använder 24 timmar och 60 minuter!
        // Vi måste alltså skapa gränser
         */

        if (arrivalTimeMinutes >= 60) {
            arrivalTimeHours++;
            arrivalTimeMinutes = arrivalTimeMinutes - 60;
        }
        if (arrivalTimeHours >= 24) {
            arrivalTimeHours = arrivalTimeHours - 24;
            System.out.println("Vi ankommer till stationen " + arrivalTimeHours + ":" + arrivalTimeMinutes + " Nästa dag!");
        }
        else {
            System.out.println("Vi ankommer till stationen " + arrivalTimeHours + ":" + arrivalTimeMinutes + " ");
        }

    }
}
