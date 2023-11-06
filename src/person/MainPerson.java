package person;

public class MainPerson {
    public static void main(String[] args) {

        Person adam = new Person("Adam Thelin", 36, 191, 110);
        Person bamse = new Person("Bamse Thelin", 11, 40, 10);
        String name = adam.getName();

        //System.out.println("Persons name is: " + adam.getName());
        //System.out.println("Person is alive: " + adam.getAlive());
        //System.out.println(name + " is " + adam.getAge());

        adam.printPersonInfo();
        bamse.printPersonInfo();
        adam.sayHello();
        bamse.sayHello();

    }
}
