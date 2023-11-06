package ExerciseFruit;


public class Main {
    public static void main(String[] args) {

        Fruit Strawberry = new Fruit("Red");
        Fruit Blueberry = new Fruit("Blue");
        Fruit BlackBerry = new Fruit("Black");

        String StrawberryColor = Strawberry.getColor();
        String BlueberryColor = Blueberry.getColor();
        String BlackberryColor = BlackBerry.getColor();

        System.out.println("The Strawberry color is: " + StrawberryColor);
        System.out.println("The Blueberry color is: " + BlueberryColor);
        System.out.println("The Blackberry color is: " + BlackberryColor);


    }
}
