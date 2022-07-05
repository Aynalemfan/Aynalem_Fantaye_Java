package com.company;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //int parameters:
        int x = 0;
        int y = 0;
        calculator.add(2, 4);
        calculator.subtract(23, 52);
        calculator.multiply(34, 2);
        calculator.divide(12, 3);
        calculator.divide(12, 7);

        System.out.println(" ");

        //double parameters:

        calculator.add(3.4, 2.3);
        calculator.multiply(6.7, 4.4);
        calculator.subtract(5.5, 0.5);
        calculator.divide(10.8, 2.2);
    }

}
