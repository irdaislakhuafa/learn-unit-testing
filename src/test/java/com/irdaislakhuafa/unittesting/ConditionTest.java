package com.irdaislakhuafa.unittesting;

import java.util.function.Consumer;

import com.irdaislakhuafa.unittesting.generator.SimpleDisplayNameGenerator;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class ConditionTest {
    @Test
    public void testSystemProperties() {
        System.out.println("\033\143");
        System.getProperties().forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    @Test
    @EnabledOnOs(value = { OS.WINDOWS })
    public void testRunOnlyOnWindows() {

    }

    @Test
    @DisabledOnOs(value = { OS.WINDOWS })
    public void testDisableOnOsWindows() {

    }

    @Test
    @EnabledOnJre(value = { JRE.JAVA_11 })
    public void enableOnJre11() {

    }

    @Test
    @DisabledOnJre(value = { JRE.JAVA_11 })
    public void disabledOnJre11() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_16)
    public void enabledOnJava11To16() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_16)
    public void disabledOnJava11To16() {

    }

    @Test
    @EnabledIfSystemProperties(value = {
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Microsoft")
    })
    public void enableIfJavaVendorIsMicrosoft() {

    }

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Microsoft")
    public void disabledIfJavaVendorIsMicrosoft() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void testEnableOnEnviromentVariableDev() {

    }

    @Test
    @DisabledIfEnvironmentVariables(value = {
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void testDisableOnEnviromentVariableDev() {

    }
}
