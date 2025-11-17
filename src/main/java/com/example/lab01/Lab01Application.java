package com.example.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab01Application implements CommandLineRunner {

    @Autowired
    private Factorial_Of_Number factorialOfNumber;

    public static void main(String[] args) {
        SpringApplication.run(Lab01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        factorialOfNumber.inputAndCalculate();

        if (factorialOfNumber.getA() >= 0) {
            System.out.printf("%d! = %d \n" , factorialOfNumber.getA(), factorialOfNumber.getFactorialA());
        }
    }
}