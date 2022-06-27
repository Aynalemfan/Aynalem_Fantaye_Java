package com.company;

public class ConverterIf implements Converter {

    /**
     * This method converts the given number into its corresponding month.
     *
     * @param monthNumber&mdash;the number you wish to convert to a month
     * @return&mdash;the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
     * for example, convertMonth(1) will return "January" convertMonth(6) will return "June"
     * convertMonth(13) will return some error message
     */
    @Override
    public String convertMonth(int monthNumber) {
        // if the number is not between 1 and 12 (inclusive), return an error message
        if (monthNumber < 1 || monthNumber > 12) {
            return "invalid month number";
        } else if (monthNumber == 1) {
            return "January";
        }
        if (monthNumber == 2) {
            return "February";
        }
        return "no month";
    }

    /**
     * This method converts the given number into its corresponding day of the week.
     *
     * @param dayNumber&mdash;number you wish to convert to a day of the week
     * @return&mdash;the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
     * The first day of the week is Sunday
     */
    @Override
    public String convertDay(int dayNumber) {
        return null;
    }
}

//public class ConverterIf implements Converter {
//    @Override
//    public String convertMonth(int monthNumber) {
//        //if the number is not between 1 and 12 (inclusive), return an error message
//        if (monthNumber < 1 || monthNumber > 12) {
//            return "invalid month number";
//        }
//        else if (monthNumber == 1) {
//            return "January";
//        }
//        else if (monthNumber == 2) {
//            return "February";
//        }
//        else if (monthNumber == 3) {
//            return "March";
//        }
//        else if (monthNumber == 4) {
//            return "March";
//        }
//        else if (monthNumber == 5) {
//            return "March";
//        }
//        else if (monthNumber == 6) {
//            return "March";
//        }
//        else if (monthNumber == 7) {
//            return "March";
//        }
//        else if (monthNumber == 8) {
//            return "March";
//        }
//        else if (monthNumber == 9) {
//            return "March";
//        }
//        else if (monthNumber == 10) {
//            return "March";
//        }
//        else if (monthNumber == 11) {
//            return "March";
//        }
//        else if (monthNumber == 12) {
//            return "March";
//        } else {
//
//            return "no month";
//        }
//    }
//}

