package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class MyControllerTest {
    @InjectMocks
    public MyController myController;

    @Test
    public void addTest(){
        Integer a = myController.add("1","2");
        assert (a == 3);
    }

    @Test
    public void badArgumentTest(){
        try {
            myController.add("a","1");
        } catch (Exception e) {
            assert (e.getMessage().equals("Not an integer"));
            assert (e.getClass() == IllegalArgumentException.class);
        }
    }
}
