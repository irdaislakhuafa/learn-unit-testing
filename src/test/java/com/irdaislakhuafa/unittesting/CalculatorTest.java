package com.irdaislakhuafa.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import com.irdaislakhuafa.unittesting.generator.SimpleDisplayNameGenerator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

// @DisplayName("Test for calculator class")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    // @DisplayName("add success test") // use custom generator insted of default
    // generator
    public void testAddSuccess() {
        var result = calculator.add(1, 2);
        assertNotNull(calculator);
        assertNotNull(result);
        assertEquals(3, result);

    }

    @Test
    // @DisplayName("divide success test")
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

    @Test
    @Disabled
    public void testCommingSoon() {

    }
}
