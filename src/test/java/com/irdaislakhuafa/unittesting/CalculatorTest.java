package com.irdaislakhuafa.unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        var result = calculator.add(1, 2);
        Assertions.assertNotNull(calculator);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(result, 3);
    }
}
