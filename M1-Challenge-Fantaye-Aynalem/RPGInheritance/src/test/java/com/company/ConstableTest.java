package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    @Test
    public void isJurisdictionShouldReturnTheExpectedValue() {
        Constable constable1 = new Constable();
        constable1.isJurisdiction();
        boolean expectedOutput = true;
        boolean actualOutput = constable1.isJurisdiction();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void setJurisdictionShouldReturnTheNewValue() {
        Constable constable1 = new Constable();
        constable1.setJurisdiction(false);
        boolean expectedOutput = false;
        boolean actualOutput = constable1.isJurisdiction();
        assertEquals(expectedOutput, actualOutput);
    }

}