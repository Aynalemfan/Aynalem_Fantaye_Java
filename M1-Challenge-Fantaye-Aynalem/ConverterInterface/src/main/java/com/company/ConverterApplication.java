package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf monthConverter = new ConverterIf();
        ConverterSwitch dayConverter = new ConverterSwitch();

        monthConverter.convertMonth(1);
        System.out.println(monthConverter.convertMonth(0));
        System.out.println(monthConverter.convertMonth(1));
        System.out.println(monthConverter.convertMonth(2));
        System.out.println(monthConverter.convertMonth(3));
        System.out.println(monthConverter.convertMonth(4));
        System.out.println(monthConverter.convertMonth(5));
        System.out.println(monthConverter.convertMonth(6));
        System.out.println(monthConverter.convertMonth(7));
        System.out.println(monthConverter.convertMonth(8));
        System.out.println(monthConverter.convertMonth(9));
        System.out.println(monthConverter.convertMonth(10));
        System.out.println(monthConverter.convertMonth(11));
        System.out.println(monthConverter.convertMonth(12));
        System.out.println(monthConverter.convertMonth(13));

        System.out.println("");

        dayConverter.convertDay(1);
        System.out.println(dayConverter.convertDay(0));
        System.out.println(dayConverter.convertDay(1));
        System.out.println(dayConverter.convertDay(2));
        System.out.println(dayConverter.convertDay(3));
        System.out.println(dayConverter.convertDay(4));
        System.out.println(dayConverter.convertDay(5));
        System.out.println(dayConverter.convertDay(6));
        System.out.println(dayConverter.convertDay(7));
        System.out.println(dayConverter.convertDay(8));

    }
}
