package com.company;


public class ConverterSwitch implements Converter {

    @Override
    public String convertMonth(int monthNumber) {
        return null;
    }

    @Override
    public String convertDay(int dayNumber) {
        String returnDay = "Not valid day! ";
        switch (dayNumber) {
            case 1:
                returnDay = "Sunday";
                break;
            case 2:
                returnDay = "Monday";
                break;
            case 3:
                returnDay = "Tuesday";
                break;
            case 4:
                returnDay = "Wednesday";
                break;
            case 5:
                returnDay = "Thursday";
                break;
            case 6:
                returnDay = "Friday";
                break;
            case 7:
                returnDay = "Saturday";
        }
        return returnDay;
    }
}

