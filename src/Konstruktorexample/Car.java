package Konstruktorexample;

public class Car {

    private String color;

    public Car(String myColor){
        color = myColor;


    }

    public String getColor(){
        return color;
    }

    public void printColor(){
        System.out.println("The car is: " + color);
    }

}
