package exercise70;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

        @Test
        public void testGetCounter(){
            ArraysCreator arrays = new ArraysCreator();
            int expected = 5;

            int[] inputArray = new int[]{2,3,22,-2,54,-1,2,-99};
            arrays.setPositives(inputArray); //<-- En setter gör att vi enkelt kan skicka in
            //och sätta testdata!
            int actual = arrays.getCounter(); //<-- En getter gör det mycket enkelt att
            //hämta resultatet av våra beräkningar!

            assertEquals(expected,actual);
        }
    }

