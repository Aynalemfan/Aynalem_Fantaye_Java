package com.company;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    @BeforeClass
    public static void beforeClass() throws Exception {
        ConverterIf monthConverter = new ConverterIf();
        return;


    }

    @Test
    public void shouldConvertTheGivenMonthNumberToTheCorrespondingMonthName() {
        ConverterIf monthConverter = new ConverterIf();
        String result = monthConverter.convertMonth(1);
        String expectedResult = "January";
        assertEquals("January", result);

    }
}