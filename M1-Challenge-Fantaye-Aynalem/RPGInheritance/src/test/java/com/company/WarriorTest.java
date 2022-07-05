package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    @Test
    public void getShieldStrengthShouldReturnTheExpectedIntValue() {
        Warrior warrior1 = new Warrior();
        warrior1.getShieldStrength();
        int expectedValue = 100;
        int actualValue = warrior1.getShieldStrength();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setShieldStrengthShouldReturnTheNewlySetValue() {
        Warrior warrior1 = new Warrior();
        warrior1.setShieldStrength(50);
        int expectedValue = 50;
        int actualValue = warrior1.getShieldStrength();
        assertEquals(expectedValue, actualValue);
    }

}