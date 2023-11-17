package Aassignment;

public class Logic {
    private String[] words;



    public Logic() {

    }

    public void setWordArray(String input) {
        words = input.split(" ");
    }

    public int getArrayLength() { // vi kör en public in som tas inne från main klassen som sedan skickar tillbaka hur många rader vi har sedan.

        return words.length;
    }

    public int countEachChars(){ // Vi kör en public int, som sedan går till main klassen som sedan skickar tillbaka till här och informerar hur många chars som har skrivits.
        return words.length;
    }


    public String[] getWordArray() { return words;
    }

}






