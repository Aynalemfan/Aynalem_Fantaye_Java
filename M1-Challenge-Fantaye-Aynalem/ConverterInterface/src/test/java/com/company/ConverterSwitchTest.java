package com.company;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    @BeforeClass
    public static void beforeClass() throws Exception {
        ConverterSwitch dayConverter = new ConverterSwitch();
        String returnDay = " ";
        int dayNumber = 1;
    }

    @Test
    public void shouldConvertTheGivenDayNumberToTheCorrespondingDayName() {
        ConverterSwitch dayConverter = new ConverterSwitch();
        String returnDay = dayConverter.convertDay(1);
        String expectedValue = "Sunday";
        assertEquals("Sunday",returnDay);
        }
    }