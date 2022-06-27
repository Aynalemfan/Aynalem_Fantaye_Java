package com.company;


public class ConverterSwitch implements Converter {
    /**
     * This method converts the given number into its corresponding month.
     *
     * @param monthNumber&mdash;the number you wish to convert to a month
     * @return&mdash;the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
     */
    public String convertMonth(int monthNumber) {
        return "no month";
    }

    /**
     * This method converts the given number into its corresponding day of the week.
     *
     * @param dayNumber&mdash;number you wish to convert to a day of the week
     * @return&mdash;the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
     * The first day of the week is Sunday
     */
    public String convertDay(int dayNumber) {
        String returnVal = "no day";
        switch(dayNumber) {
            case 1:
                returnVal =  "Sunday";
                break;
            case 2:
                return "Monday";
        }
        return returnVal;
    }
}

//public class ConverterSwitch implements Converter {
//
//    public String convrtMonth(int monthNumber) {
//        return "no month";
//    }
//
//    public String convertDay(int dayNumber) {
//        String returnVal = "no day";
//        switch (dayNumber) {
//            case 1:
//                returnVal = "Sunday";
//                break;
//            case 2:
//                returnVal = "Monday";
//                break;
//            case 3:
//                returnVal = "Tuesday";
//                break;
//            case 4:
//                returnVal = "Wedensday";
//                break;
//            case 5:
//                returnVal = "Wedensday";
//                break;
//            case 6:
//                returnVal = "Wedensday";
//                break;
//            case 7:
//                returnVal = "Wedensday";
//                break;
//            default:
//                returnVal
//
//
//        }
//
//    }
//}