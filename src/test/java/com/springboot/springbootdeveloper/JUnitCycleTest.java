package com.springboot.springbootdeveloper;

import org.junit.jupiter.api.*;

public class JUnitCycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
    }

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }
}
