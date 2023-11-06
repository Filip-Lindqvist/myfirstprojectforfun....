package person;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;
    private boolean isAdult;
    private boolean isAlive;

    Person(String myName,int myAge, int myHeight, int myWeight){
        isAlive = true;
        name = myName;
        age = myAge;
        height = myHeight;
        weight = myWeight;
        if (myAge >= 18) {
            isAdult = true;
        }
    }
    public String getName(){
        return name;
    }
    public boolean getAlive(){
        return isAlive;
    }
    public int getAge(){
        return age;
    }
    public void printPersonInfo(){
        System.out.println(name + " är " + age + " gammal, och är " + height + " cm lång. \n"
                + "Personen väger: " + weight + "kg");
        System.out.println("Är personen vid liv: " + isAlive);
        System.out.println("Är personen vuxen:" + isAdult);
    }

    public void sayHello(){
        System.out.println(name + " says hello!");

    }
}
