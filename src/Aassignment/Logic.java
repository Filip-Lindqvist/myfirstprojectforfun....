package Aassignment;

public class Logic {
    private String[] words;



    public Logic() {

    }

    public void setWordArray(String input) {
        words = input.split(" ");
    }

    public int getArrayLength() {

        return words.length;
    }

    public int countEachChars(){
        return words.length;
    }


    public String[] getWordArray() { return words;
    }

}






