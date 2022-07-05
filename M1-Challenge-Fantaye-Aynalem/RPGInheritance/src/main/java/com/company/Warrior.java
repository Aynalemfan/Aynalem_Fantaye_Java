package com.company;

public class Warrior extends SuperPerson {
    private int shieldStrength = 100;

    public Warrior() {
        super();
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.setShieldStrength(100);
        this.setRunning(false);
        this.setArrested(false);

    }

    public void attackedAnotherPerson() {
        System.out.println(this.getName() + "I escaped from a big fight by attacking my enemy.");
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                '}';
    }
}
