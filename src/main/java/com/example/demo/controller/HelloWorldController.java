package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class HelloWorldController{
    @GetMapping("/helloworld")
    String helloWord(){
        return "Hello World!!!";
    }

    @GetMapping("/sort")
    List<Integer> sort(@RequestParam List<Integer> inputs){
        Collections.sort(inputs);
        Collections.reverse(inputs);
        return inputs;
    }
}
