package com.irdaislakhuafa.unittesting.generator;

import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayNameGenerator;

public class SimpleDisplayNameGenerator implements DisplayNameGenerator {

    @Override
    public String generateDisplayNameForClass(Class<?> arg0) {
        return "Test for class " + arg0.getSimpleName();
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> arg0, Method arg1) {
        return "Test method " + arg1.getName();
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> arg0) {
        return null;
    }
}