package com.example.calculator.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.calculator.view.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController {

    @GetMapping("/add") // Example: /add?num1=20&num2=40
    public Calculator add(@RequestParam(required = false, defaultValue = "0") String num1, 
                          @RequestParam(required = false, defaultValue = "0") String num2) {
        try {
            double result = Double.parseDouble(num1) + Double.parseDouble(num2);
            return new Calculator(Double.toString(result));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format");
        }
    }

    @GetMapping("/sub") // Example: /sub?num1=90&num2=10
    public Calculator subtract(@RequestParam(required = false, defaultValue = "0") String num1, 
                               @RequestParam(required = false, defaultValue = "0") String num2) {
        try {
            double result = Double.parseDouble(num1) - Double.parseDouble(num2);
            return new Calculator(Double.toString(result));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format");
        }
    }

    @GetMapping("/mul") // Example: /mul?num1=5&num2=40
    public Calculator multiply(@RequestParam(required = false, defaultValue = "0") String num1, 
                               @RequestParam(required = false, defaultValue = "0") String num2) {
        try {
            double result = Double.parseDouble(num1) * Double.parseDouble(num2);
            return new Calculator(Double.toString(result));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format");
        }
    }
}
