package TDDövning;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    @Test
    public void userGetName(){
        //Arrange
        User person1 = new User("Filip", "Password");
        String expected = "Filip";
        //Act
        String actual = User.getName();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void userGetPass(){
        //Arrange
        User person1 = new User("Filip", "Password");
        String expected = "Password";
        //Act
        String actual = User.getPass();
        //Assert
        assertEquals(expected,actual);
    }

    // Skriv ett test som ändrar username
    @Test
    public void testSetUserName(){
        User person1 = new User("Filip", "Password");
        String expected = "Arthur Dent";
        User.setName("Arthur Dent");
        String actual = User.getName();

        assertEquals(expected,actual);

    }

}
