package exercise10TDD;

import exercise9.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class TestPasswordCheck {

    @Test

    public void testCorrectPassword() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        //act

        boolean actual = pass.check("passw$ord1");

        //assert

        assertEquals(expected, actual);


    }

    @Test

    public void testLessThan8CharactersAndNoDigits() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //act

        boolean actual = pass.check("pass");

        //assert

        assertEquals(expected, actual);
    }
    @Test

    public void testNoDigits() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //act

        boolean actual = pass.check("pass#word");

        //assert

        assertEquals(expected, actual);
    }
    @Test

    public void testLessThan8Characters() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //act

        boolean actual = pass.check("pass");

        //assert

        assertEquals(expected, actual);
    }
    @Test

    public void testNoSpecialCharacters() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //act

        boolean actual = pass.check("passw4ord");

        //assert

        assertEquals(expected, actual);
    }
}
