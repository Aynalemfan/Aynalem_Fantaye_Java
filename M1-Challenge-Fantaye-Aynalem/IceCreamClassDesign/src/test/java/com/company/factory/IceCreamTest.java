package com.company.factory;

import org.junit.Test;


public class IceCreamTest {
    IceCream newIceCream;

    public IceCreamTest() {
        newIceCream = new IceCream();
    }

    @Test
    public void getFlavorShouldGetTheFlavor() {
        newIceCream.getFlavor();
        String expectedValue = newIceCream.getFlavor();
        String actualValue = newIceCream.getFlavor();
    }

    @Test
    public void setFlavorShouldSetTheFlavour() {
        newIceCream.setFlavor();
        String expectedValue = newIceCream.getFlavor();
        String actualValue = newIceCream.getFlavor();
    }

    @Test
    public void getSalePrice() {
        newIceCream.setSalePrice();
        double expectedValue = newIceCream.getSalePrice();
        double actualValue = newIceCream.getSalePrice();
        asserEquals(expectedValue,actualValue);
    }

    @Test
    public void setSalePrice() {
        newIceCream.setSalePrice();
        double expectedValue =newIceCream.getSalePrice();
        double actualValue = newIceCream.getSalePrice();

    }

    @Test
    public void getProductionCost() {
        newIceCream.getProductionCost();
        double expectedValue = newIceCream.getProductionCost();
        double actualValue = newIceCream.getProductionCost();
        asserEquals(expectedValue,actualValue);


    }

    @Test
    public void setProductionCost() {
        newIceCream.setProductionCost();
        double expectedValue = newIceCream.getProductionCost();
        double actualValue = newIceCream.getProductionCost();
        asserEquals(expectedValue,actualValue);

    }

    @Test
    public void getProductionTime() {
        newIceCream.setProductionTime();
        newIceCream.getProductionTime();
    }

    @Test
    public void setProductionTime() {
        newIceCream.setProductionTime();
        int expectedValue = newIceCream.getProductionTime();
        int actualValue = newIceCream.getProductionTime();
        asserEquals(expectedValue,actualValue);
    }

    @Test
    public void getIngredients() {
        newIceCream.getIngredients();
        String expectedValue = newIceCream.getIngredients();
        String actualValue = newIceCream.getIngredients();
    }

    private void asserEquals(double expectedValue,double actualValue) {
    }

    @Test
    public void setIngredients() {
        newIceCream.setIngredients("Firuts, Colors");
        String expectedValue = newIceCream.setIngredients("Firuts, Colors");
        String actualValue = newIceCream.getIngredients();
    }

}