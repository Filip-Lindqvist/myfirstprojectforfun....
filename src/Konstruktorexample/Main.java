package Konstruktorexample;

public class Main {
    public static void main(String[] args) {

            Car adamsCar = new Car("Silver");
            Car hannasCar = new Car("Blue");

            String adamsCarColor = adamsCar.getColor();
            String hannasCarColor = hannasCar.getColor();

            System.out.println("Your car is " + adamsCarColor);
            System.out.println("Your car is " + hannasCarColor);

            System.out.println(adamsCar.getColor());
        }


        }


