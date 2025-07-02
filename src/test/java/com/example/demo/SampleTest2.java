package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest2 {

    @Test
    void AddCase() {
        int a = 100;
        int b = 200;
        int expected = 300;
        Assertions.assertEquals(expected, a+b);
    }
}
