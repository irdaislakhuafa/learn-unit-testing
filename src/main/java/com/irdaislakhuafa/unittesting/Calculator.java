package com.irdaislakhuafa.unittesting;

import javax.management.RuntimeErrorException;

public class Calculator {
    public Integer add(Integer first, Integer second) {
        return first + second;
    }

    public Integer divide(Integer value, Integer divideValue) {
        if (divideValue == 0) {
            throw new RuntimeException("Cannot divide by zero");
        }
        return value / divideValue;
    }
}
