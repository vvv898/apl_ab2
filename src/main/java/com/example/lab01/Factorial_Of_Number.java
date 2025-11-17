package com.example.lab01;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class Factorial_Of_Number {
    public Scanner sc = new Scanner(System.in);
    int a;
    long factorial_a;

    public void inputAndCalculate() {
        System.out.print("\nВведіть значення:");
        int buff_a = sc.nextInt();
        setA(buff_a);

        factorial_a = calculateFactorial(a);
    }

    private long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
            return -1;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int getA() {
        return a;
    }

    public long getFactorialA() {
        return factorial_a;
    }

    public void setA(int a) {
        this.a = a;
    }
}