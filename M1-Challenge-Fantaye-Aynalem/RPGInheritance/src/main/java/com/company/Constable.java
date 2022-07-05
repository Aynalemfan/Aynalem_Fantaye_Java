package com.company;

public class Constable extends SuperPerson {
    private boolean isJurisdiction = true;

    public Constable() {
        super();
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.setRunning(false);
        this.setArrested(false);


    }

    public void arrestAnotherPerson(){
        System.out.println(this.getName() + " I have caught and arrested the criminal person!");

    }

    public boolean isJurisdiction() {
        return isJurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        isJurisdiction = jurisdiction;
    }


    @Override
    public String toString() {
        return "Constable{" +
                "isJurisdiction=" + isJurisdiction +
                '}';
    }

    public void Jurisdiction() {
    }
}
