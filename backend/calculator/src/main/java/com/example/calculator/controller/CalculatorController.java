package com.example.calculator.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.view.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CalculatorController {

    @GetMapping("/add")
    public Calculator add(@RequestParam String num1, @RequestParam String num2) {
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        return new Calculator(Integer.toString(result));
    }

    @GetMapping("/subtract")
    public Calculator subtract(@RequestParam String num1, @RequestParam String num2) {
        int result = Integer.parseInt(num1) * Integer.parseInt(num2);
        return new Calculator(Integer.toString(result));
    }

    @GetMapping("/multiply")
    public Calculator multiply(@RequestParam String num1, @RequestParam String num2) {
        int result = Integer.parseInt(num1) * Integer.parseInt(num2);
        return new Calculator(Integer.toString(result));
    }
    
}
