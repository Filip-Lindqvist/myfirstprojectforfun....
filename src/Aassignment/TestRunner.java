package Aassignment;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    @Test
    public void testSetWordArray(){

        //Arrange
        Logic myLogic = new Logic();
        String[] expected = new String[]{"", "Filip","Adam"};
        //Act
        myLogic.setWordArray(""+ " " + "Filip" + " " + "Adam");
        String[] actual = myLogic.getWordArray();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void testGetArrayLength(){
        Logic myLogic = new Logic();
        int expected = 6;

        myLogic.setWordArray("Hej Mitt Namn Är Filip Hejdå");
        int actual = myLogic.getArrayLength();
        assertEquals(expected,actual);
    }

    @Test
    public void testCountEachChars(){
        Logic myLogic = new Logic();
        int expected = 10;

        myLogic.setWordArray("A, f, r, o, f, r, i, s, y, r");
        int actual = myLogic.countEachChars();
        assertEquals(expected,actual);
    }


}
