package Exercise6;

public class Pet {

    private String name; //attribut

    public Pet(String petName) { //konstruktor
        name = petName;
    }



    //Skapa en ny metod i klaseen Pet som skriver ut attributet name
    public void printName() {
        System.out.println("The name of the pet is: " +name);
    }


    public String getName() {
        return name;
    }
}
