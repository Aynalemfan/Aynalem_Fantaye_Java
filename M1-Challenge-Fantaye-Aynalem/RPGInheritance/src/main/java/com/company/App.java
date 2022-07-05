package com.company;

public class App {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        farmer1.setName("John the farmer");
        farmer1.getStrength();
        farmer1.getHealth();
        farmer1.getStamina();
        farmer1.getSpeed();
        farmer1.getAttackPower();
        farmer1.isRunning();
        farmer1.isArrested();
        farmer1.isPlowing();
        farmer1.harvestPlants();
        farmer1.getAttackPower();

        System.out.println("John's the farmer attack power is: " + farmer1.getAttackPower());
        farmer1.setAttackPower(20);
        System.out.println("Farmer1 attack power should raise to: " + farmer1.getAttackPower());
        System.out.println(farmer1.isHarvesting());
        System.out.println(farmer1.isRunning());
        System.out.println(farmer1.isPlowing());
        System.out.println("=====================");


        Constable constable1 = new Constable();
        constable1.setName("PoliceOfficer: ");
        constable1.getStrength();
        constable1.getHealth();
        constable1.getStamina();
        constable1.getSpeed();
        constable1.getAttackPower();
        constable1.isRunning();
        constable1.isArrested();
        constable1.isJurisdiction();
        constable1.arrestAnotherPerson();

        constable1.getAttackPower();
        System.out.println("Constable1 attack power is: " + constable1.getAttackPower());
        constable1.setAttackPower(20);
        System.out.println("Constable1 attack power should raise to: " + constable1.getAttackPower());
        System.out.println("=====================");

        Warrior warrior1 = new Warrior();
        warrior1.setName("CriminalWarrior: ");
        warrior1.getStrength();
        warrior1.getHealth();
        warrior1.getStamina();
        warrior1.getSpeed();
        warrior1.getAttackPower();
        warrior1.isRunning();
        warrior1.isArrested();
        warrior1.getAttackPower();
        warrior1.attackedAnotherPerson();
        System.out.println("Warrior1 attack power is: " + warrior1.getAttackPower());
        warrior1.setAttackPower(5);
        System.out.println("Warrior1 attack power should cut down to: " + warrior1.getAttackPower());

    }

}
