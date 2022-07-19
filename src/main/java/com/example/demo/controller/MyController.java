package com.example.demo.controller;

import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class MyController {

    private final MyService service;

    public MyController() {
        this.service = new MyService();
    }

    public Integer add(String a, String b){
        try {
            return service.add(Integer.parseInt(a), Integer.parseInt(b));
        } catch (Exception e) {
            throw new IllegalArgumentException("Not an integer");
        }
    }
}
