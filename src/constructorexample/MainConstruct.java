package constructorexample;

public class MainConstruct {
    public static void main(String[] args) {

        // Vi skapar ett objekt av klassen Grej
        // som vo ger namnet pryl!
        Grej pryl = new Grej();
        // Om vi har en till konstruktor så väljer den
        // konstruktorn som överrensstämmer med den
        // information vi skickar in
        Grej prylTwo = new Grej("Telefon");

        // VI SKriver ut det vi får tillbaka ifrån
        // getName()
        System.out.println(pryl.getName());
        // Vi ändrar namnet med setname()
        pryl.setName("Låda");
        // Vi skriver ut det nya namnet
        System.out.println(pryl.getName());

    }
}
