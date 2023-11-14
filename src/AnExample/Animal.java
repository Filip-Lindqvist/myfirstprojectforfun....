package AnExample;

public class Animal {
    private String name;
    private int age;
    private String breed;
    private String[] toys;

    public Animal(){
        name = "Krokofant";
        breed = "Tasty";
        age = 1;
        toys = new String[]{"Strössel","Skum"};
    }
    public Animal(String myName){
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

