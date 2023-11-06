package example;

public class Methods {

    public void printMessage(){
        System.out.println("I stare into the void!");
    }
    public String getMessage(){
        return "The void stares back! O_o";
    }
    public int getNewNumber(int myNumber){
        myNumber = myNumber / 2;
        myNumber = myNumber * myNumber;
        return myNumber * 10;
    }
}


