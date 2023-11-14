package AnExample;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("Arne");
        Animal cat = new Animal("Merlin");
        Animal rat = new Animal("Katla");
        Animal duck = new Animal("Mr Ducksworth");
        Animal mammal = new Animal();

        System.out.println(dog.getName());
        System.out.println(cat.getName());
        System.out.println(rat.getName());
        System.out.println(duck.getName());
        mammal.setName("Whale");
        System.out.println(mammal.getName());
        Animal anoterMammal = new Animal();
        System.out.println(anoterMammal.getName());
    }
}
