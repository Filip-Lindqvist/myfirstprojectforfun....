package justanotherarraypractice;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    @Test
    public void testSetWordArray(){
        //Arrange
        ArrayFactory myFactory = new ArrayFactory();
        String[] expected = new String[]{"","Gudrun","Toblerone"};

        //Act
        myFactory.setWordArray("" + " " + "Gudrun" + " " + "Toblerone");
        String[] actual = myFactory.getWordArray();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getFirstWord(){
        ArrayFactory myFactory = new ArrayFactory();
        String expected = "Vader";

        myFactory.setWordArray("Vader Stefan Olof Pekka");
        String actual = myFactory.getFirstWord();

        assertEquals(expected,actual);

    }
    @Test
    public void testGetLastWord(){
        ArrayFactory myFactory = new ArrayFactory();
        String expected = "Loket";
        myFactory.setWordArray("Gw Göran Evert Yngeman Loket");
        String actual = myFactory.getLastWord();

        assertEquals(expected,actual);

    }
    @Test
    public void testGetArrayLength(){
        ArrayFactory myFactory = new ArrayFactory();
        int expected = 4;

        myFactory.setWordArray("Brunsås Chokladglass Däck Gris");
        int actual = myFactory.getArrayLength();
        assertEquals(expected,actual);
    }
}
