package ExerciseFruitTest;


public class FruitSalad {
    public static void main(String[] args) {

        Fruit banana = new Fruit("Yellow", "Banana");
        Fruit apple = new Fruit("Green", "Apple");
        Fruit rambutan = new Fruit("Brown", "Rambutan");

        banana.printColor();
        apple.printColor();
        rambutan.printColor();
        banana.printInfo();
        apple.printInfo();
        rambutan.printInfo();


    }
}
