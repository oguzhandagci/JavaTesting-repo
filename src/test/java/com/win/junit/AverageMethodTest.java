package com.win.junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AverageMethodTest {    

    @Test 
    void testTotal () {
        assertEquals(4, AverageMethod.total(3,1,0));
    }

    @Test
    void testAverage(){
        assertEquals(5, AverageMethod.average(5, 5, 5));
    }

}