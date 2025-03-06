package com.example.calculator.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.view.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CalculatorController {
    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return new Calculator(a - b).result();
    }

    @GetMapping("/multiply/{a}/{b}")
    public Calculator multiply(@PathVariable int a, @PathVariable int b) {
        return new Calculator(a * b);
    }
    
}
