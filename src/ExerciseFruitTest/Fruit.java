package ExerciseFruitTest;

public class Fruit {

    private String color;
    private String name;

    public Fruit(String fruitColor,String fruitName){
        color = fruitColor;
        name = fruitName;

    }
    public void printColor(){
        System.out.println("The fruit is " + color);
    }
    public void printInfo() {
        System.out.println(name + " is " + color);
    }
}
