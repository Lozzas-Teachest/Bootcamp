package org.example;

public class Calculator {

    public double addition(double a, double b) {
        return a+b;
    }

    public double division(double a, double b) {
        if(b == 0.0) {
            return 0.0;
        } else {
            return a/b;
        }
    }
}
