package com.company;

import org.junit.Test;
import static org.junit.Assert.*;
public class FarmerTest {

    @Test
    public void isPlowingShouldReturnTheExpectedOutput() {
        Farmer farmer1 = new Farmer();
        farmer1.isPlowing();
        boolean messageStatus = false;
        boolean expectedOutput = false;
        boolean actualOutput = farmer1.isPlowing();
        assertEquals(expectedOutput, actualOutput);
        
    }


    @Test
    public void setPlowingShouldReturnTheNewlySetExpectedOutput() {
        Farmer farmer1 = new Farmer();
        farmer1.setSpeed(20);
        int expectedOutput = 20;
        int actualOutput = farmer1.getSpeed();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void isHarvestingShouldReturnTheExpectedOutput() {
        Farmer farmer1 = new Farmer();
        farmer1.isHarvesting();
        boolean expectedOutput = false;
        boolean actualOutput = farmer1.isHarvesting();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void setHarvestingShouldReturnTheNewlySetOutput() {
        Farmer farmer1 = new Farmer();
        farmer1.setHarvesting(true);
        boolean expectedOutput = true;
        boolean actualOutput = farmer1.isHarvesting();
        assertEquals(expectedOutput, actualOutput);
    }
}