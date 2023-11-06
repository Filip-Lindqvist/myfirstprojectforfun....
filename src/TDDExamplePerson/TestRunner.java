package TDDExamplePerson;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    //TDD vilka test bör/kan jag utföra på en klass "Person"?
    // kanske, längd, kön, ålder, ögonfärg, vid liv, lukt, IQ
    // Vi har ingen klass som representerar en person eller våra attribut!
    // Men vi skriver test som testar klassen och skapar/genererar sedan klassen
    // för att kunna få våra test att passera.

    @Test

    public void testHeight(){
        // Hur skulle jag göra normalt här?  Jag skulle kalla på ett objekt av klassen Person för
        // att kunna testa! Klassen finns dock inte, så vi måste skapa den.

        //Om vi för in information i signaturen när vi skapar objektet, så kan vi sedan generera en konstruktor
        // med den information som vi skrivit in! Vi kan även lägga till fler variabler/attribut eftersom!

        //Arrange
        Person gigaChad = new Person(250, "Chad"); // Vi skapar en person igenom att generera den ifrån vårt test!
        int expected = 250;

        //Act
        int actual = gigaChad.getHeight();

        //Assert
        //Vi kör vår kod, testet misslyckas och vi refaktorerar vår kod tills testet kan passera!
        assertEquals(expected,actual);

    }

    @Test
    public void testSetHeight(){
        //Arrange
        Person gigaChad = new Person(250, "Chad");
        int expected = 275;
        //Act
        gigaChad.setHeight(275); // Vi kallar på en metod som inte existerar för att ändra
        //längden på personen och när testet misslyckas så genererar vi metoden vi behöver.
        int actual = gigaChad.getHeight();
        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testGetName(){
        //Arrange
        Person squidWard = new Person(50, "Squidward");
        String expected = "Squidward";
        //Act
        String actual = squidWard.getName();
        //Assert
        assertEquals(expected,actual);
    }
}
