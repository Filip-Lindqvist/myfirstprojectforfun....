package TDDövningssvar;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testGetUserName(){
        //Arrange
        User user = new User("userName", "password");
        String expected = "userName";
        //Act
        String actual = user.getName();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void testGetPassword(){
        //Arrange
        // Vi skapar en ny klass igenom att refera till en klass som ännu inte
        // existerar och vi skapar den sedan igenom att hovra över den röda texten
        //och vi klickar för att generera en klass med vår valda namn!
        // vi kan sedan också generera en konstruktor ifrån samma linje om vi
        // skriver in någon information i signaturen!
        User user = new User("userName", "password");
        // Vi skriver in vårt förväntande lösenord i expected!
        String expected = "password";
        //Act
        // Vi hämtar vårt förväntande lösenord ifrån en metod som ännu inte
        // existerar, vi implementerar sedan metoden och refaktorerar så att
        // den kan returnera rätt lösenord!
        String actual = user.getPassword();
        //Assert
        //Vi jämför resultaten och ser att dem är korrekta!
        assertEquals(expected,actual);


    }
    @Test

    public void testSetUserName(){
        User user = new User("userName", "password");
        String expected = "Arthur Dent";
        user.setName("Arthur Dent");
        String actual = user.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetShortUserName(){
        User user = new User("Adam", "Password");
        String expected = "Adam";

        user.setName("Jim"); //<-- vi behöver en kontroll om vårt användarnamn är för kort!
        String actual = user.getName();

        assertEquals(expected, actual);

    }

    // Skriv fler test som testar denna nya funktion
    @Test
    public void testSetFourCharacterUserName(){
        User user = new User("Adam", "Password");
        String expected = "Mats";
        user.setName("Mats");
        String actual = user.getName();
        assertEquals(expected, actual);

    }
    @Test
    public void testSetZeroCharactersUserName(){
        User user = new User("Adam", "Password");
        String expected = "Adam";

        user.setName(""); // VI testar med en tom sträng för att testa vad som händer
        String acutal = user.getName();

        assertEquals(expected, acutal);

    }
    //Skriv test som gör det möjligt att uppdatera lösenordet.
    //Ett lösenord måste ha minst 7 tecken och får vara högst 20 tecken långt

    @Test
    public void testshortPassword(){
        User user = new User("Adam", "korvstoppning");
        String expected = "korvstoppning";
        user.setPassword("golv");
        String actual = user.getPassword();
        assertEquals(expected, actual);

    }
    @Test
    public void testLongPassword(){
        User user = new User("Jamtaro", "password");
        String expected = "password";
        user.setPassword("looooonglloooooooooongpassswoooord");
        String actual = user.getPassword();
        assertEquals(expected, actual);

    }


    //En användare börjar alltid typeOfUser som en ”normal” user.
    // Skriv test som hämtar detta attribut
    //Det går att ändra typeOfUser genom en metod
    //De enda korrekta värden för typeOfUser är ”normal”, ”admin” och ”super”
    //Lösenordet måste innehålla minst en av dessa tecken: !$#&
    // (Tips: det finns fler metoder i String)
   @Test
    public void testGetTypeofUser(){
        User user = new User("Gintaro", "password");
        String expected = "normal";

        String actual = user.getTypeOfUser();
        assertEquals(expected,actual);
   }
   @Test
    public void testSetTypeOfUser(){
        User user = new User("James Bond", "DryMartini");
        String expected = "super";
        user.setTypeOfUser("super");
        String actual = user.getTypeOfUser();
   }

   @Test
    public void testSetWrongTypeOfUser(){
        User user = new User("Sigvard Marjasin", "Pannkaka");
        String expected = "normal"; // Vi vill kontrollera att vi inte kan sätta några
       // andra sorters user än just normal, admin och super.
       user.setTypeOfUser("SuperMegaAdminUserDeluxe"); // vi försöker sätta type of user
       // till något som ej skall fungera!
       String actual = user.getTypeOfUser();
       assertEquals(expected,actual);

   }

   @Test
    public void testContainsNoSpecialsCharacters(){
        User user = new User("Elvis Presley", "Boogie52");
        String expected = "Boogie52";

        user.setPassword("popcornägg");
        String actual = user.getPassword();
        assertEquals(expected,actual);
   }
    }


