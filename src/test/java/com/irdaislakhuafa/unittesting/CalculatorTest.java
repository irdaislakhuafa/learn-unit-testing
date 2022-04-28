package com.irdaislakhuafa.unittesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        var result = calculator.add(1, 2);
        assertNotNull(calculator);
        assertNotNull(result);
        assertEquals(3, result);

    }

    @Test
    public void testDivideSuccess() {
        var result = calculator.divide(40, 2);
        assertNotNull(result);
    }

    @Test
    public void testDivideFailed() {
        assertThrows(RuntimeException.class, () -> {
            var result = calculator.divide(2, 0);
        });
    }
}
