package com.irdaislakhuafa.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import com.irdaislakhuafa.unittesting.generator.SimpleDisplayNameGenerator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

// @DisplayName("Test for calculator class")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    public void before() {
        System.out.println("Before each");
    }

    @AfterEach
    public void after() {
        System.out.println("After each");
    }

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

    @Test
    public void testAbortedException() {

        var result = System.getenv("PROFILE");

        if (result == null || !result.equals("DEV")) {
            throw new TestAbortedException("Test dibatalkan");
        }
    }

    @Test
    public void testUsingAssumtionsInsteadOfAbortedExceptiob() {
        assumeTrue(System.getenv("PROFILE") != null);
        System.out.println("Ini dijalankan berarti ada enviroment variable PROFILE");
        assumeTrue(System.getenv("PROFILE").equals("DEV"));
        System.out.println("Ini dijalankan berarti anda DEV");
    }
}
