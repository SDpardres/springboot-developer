package com.springboot.springbootdeveloper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1+2 = 3")     //테스트 이름
    @Test                       //테스트 메서드
    public void test1(){
        int a = 1;
        int b = 2;
        int c = 3;

        Assertions.assertEquals(a + b , c);
    }

    @DisplayName("1+2 = 4")     //테스트 이름
    @Test                       //테스트 메서드
    public void test2(){
        int a = 1;
        int b = 2;
        int c = 4;

        Assertions.assertEquals(a + b , c);
    }

}
