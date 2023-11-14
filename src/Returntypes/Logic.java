package Returntypes;

import java.util.Arrays;

public class Logic {

    private int myNumber;
    private String myName;
    private int[] myNumbers;
    private boolean myBool;
    private char myLetter = 'a';

    public Logic() {
        myNumber = 256;
        myName = "Adam";
        myNumbers = new int[]{2, 3, 5, 28};

    }

    public Logic(int myNumber){ // <-- Signatur
        this.myNumber = myNumber; // <-- Vi sätter den "lokala" variablen till
        // this till värdet av variabeln som tas in i konstruktorns signatur!

}
    public int getMyNumber(){
        return 256;
    }
    public String getMyName(){
        return myName;
    }
    public int[] getMyNumbers(){
        return myNumbers;
    }
    public boolean getMyBool(){
        return myBool;
    }
    public char getMyLetter(){
        return myLetter;
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Logic{" +
                "myNumber=" + myNumber +
                ", myName='" + myName + '\'' +
                ", myNumbers=" + Arrays.toString(myNumbers) +
                ", myBool=" + myBool +
                ", myLetter=" + myLetter +
                '}';
    }
}
