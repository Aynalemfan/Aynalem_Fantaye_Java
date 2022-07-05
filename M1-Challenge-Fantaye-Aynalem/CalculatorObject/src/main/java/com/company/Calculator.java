package com.company;

public class Calculator {
    //integer parameters:
    public int add(int x, int y) {
        int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
        return sum;
    }

    public int subtract(int x, int y) {
        int subtraction = x - y;
        System.out.println(x + " - " + y + " = " + subtraction);
        return subtraction;
    }

    public int multiply(int x, int y) {
        int product = x * y;
        System.out.println(x + " * " + y + " = " + product);
        return product;
    }

    public int divide(int x, int y) {
        int division = x / y;
        System.out.println(x + " / " + y + " = " + division);
        return division;
    }

    //double parameters:
    public double add(double x, double y) {
        double sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
        return sum;
    }

    public double subtract(double x, double y) {
        double subtraction = x - y;
        System.out.println(x + " - " + y + " = " + subtraction);
        return subtraction;
    }

    public double multiply(double x, double y) {
        double product = x * y;
        System.out.println(x + " * " + y + " = " + product);
        return product;
    }

    public double divide(double x, double y) {
        double division = x / y;
        System.out.println(x + " / " + y + " = " + division);
        return division;


    }
}

