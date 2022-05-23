package com.win.junit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationsTest {

    @Test
    void addition() {
        assertEquals(10, Calculations.addition(5, 5));
    }

    @Test
    void subtraction() {
        assertEquals(5 , Calculations.subtraction(8, 3));
    }

    @Test
    void division() {
        assertEquals(3 , Calculations.division(21, 7));
    }

    @Test
    void multiplication() {
        assertEquals(144 , Calculations.multiplication(12, 12));
    }
    @Test
    void modulus (){
        assertEquals(2, Calculations.modulus(17,5));
    }
}