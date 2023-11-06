package constructorexample;

public class Grej {

    // Vi skapar 3 variabler som representerar attribut i "Grej".
    private String name;
    private String shape;
    private String color;

    // Vi skapar en konstruktor som har samma namn som vår klass!
    // Notera att konstruktorn måste ha precis sama namn som vår
    // klass!
    Grej() {
        name = "Plånbok";
        shape = "Fyrkanting";
        color = "Svart";
    }

    //Vi kan ha flera konstruktorer, så länge de har olika
    //Inputs i konstruktorns signatur, Dvs mellan () )
    Grej(String myName){
        name = myName;
        shape = "Fyrkanting";
        color = "Svart";
    }
    // Vi skapar en metod för att hämta namnet!
    public String getName() {
        // Vi skickar tillbaka namnet med return!
        return name;
    }

    // Vi ändrar innehållet i name
    public void setName(String newName){
        name = newName;
    }

}
