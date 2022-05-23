 package com.win.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DivideMethodTest {
    @Test
    void testDivide() {
        Assertions.assertEquals(5, DivideMethod.division(15,3));
    }
}