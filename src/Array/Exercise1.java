package Array;

public class Exercise1 {
    public static void main(String[] args) {
       // String[] names = {"Sven", "Kurt", "Ada", "Lena", "Tor"};

        String[] names = new String[5];

        names[0] = "Amanda";
        names[1] = "Beatrice";
        names[2] = "Ceasar";
        names[3] = "David";
        names[4] = "Elin";

        for(int i = 0; i< names.length; i++) {
            System.out.println(names[i]);
        }


        String myString = "hej på dig";

        String[] stringArray = myString.split(" ");

        for(int i = 0; i< stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

}
