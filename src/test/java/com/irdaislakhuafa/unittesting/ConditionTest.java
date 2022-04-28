package com.irdaislakhuafa.unittesting;

import com.irdaislakhuafa.unittesting.generator.SimpleDisplayNameGenerator;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class ConditionTest {
    @Test
    @EnabledOnOs(value = { OS.WINDOWS })
    public void testRunOnlyOnWindows() {

    }

    @Test
    @DisabledOnOs(value = { OS.WINDOWS })
    public void testDisableOnOsWindows() {

    }
}
