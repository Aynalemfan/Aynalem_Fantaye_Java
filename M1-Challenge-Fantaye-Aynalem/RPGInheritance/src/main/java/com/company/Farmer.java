package com.company;

public class Farmer extends SuperPerson {
    private boolean isPlowing = false;
    private boolean isHarvesting = false;

    public Farmer() {
        super();
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
        this.setRunning(false);
        this.setArrested(false);

    }

    public void harvestPlants() {
        System.out.println(this.getName() + " says: I was plowing the land when the enemy came to attack me.");
    }

    public boolean isPlowing() {
        return isPlowing;
    }

    public void setPlowing(boolean plowing) {
        isPlowing = plowing;
    }

    public boolean isHarvesting() {
        return isHarvesting;
    }

    public void setHarvesting(boolean harvesting) {
        isHarvesting = harvesting;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "isPlowing=" + isPlowing +
                ", isHarvesting=" + isHarvesting +
                '}';
    }
}
