package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        Converter converter1 = new ConverterIf();
        ConverterIf coverter4 = new ConverterIf();
        ConverterIf converter3 = new ConverterIf();
        Converter converter2 = new ConverterSwitch();


        converter1.convertMonth(1);
        converter1.convertMonth(1);
        System.out.println(converter1.convertMonth(1));
        System.out.println(converter1.convertDay(1));
        // call convertDay

//        convert = converter2;
        System.out.println(converter2.convertMonth(1));
        System.out.println(converter2.convertDay(1));

    }
}
