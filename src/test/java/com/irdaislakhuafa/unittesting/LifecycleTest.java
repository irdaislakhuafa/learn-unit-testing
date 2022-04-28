package com.irdaislakhuafa.unittesting;

import org.junit.jupiter.api.Test;

public class LifecycleTest {
    private String temp;

    @Test
    public void first() {
        temp = "ana";
        System.out.println("first : " + temp);
    }

    @Test
    public void second() {
        System.out.println("second : " + temp);
    }
}
