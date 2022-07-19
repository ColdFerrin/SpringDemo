package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public Integer add(Integer a, Integer b){
        return a + b;
    }
}
