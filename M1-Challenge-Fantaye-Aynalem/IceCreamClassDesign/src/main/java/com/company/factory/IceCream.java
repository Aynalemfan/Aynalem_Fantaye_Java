package com.company.factory;

import java.util.Objects;

public class IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String ingredients;

    public IceCream(){

    }

    public IceCream(String flavor,double salePrice,double productionCost,int productionTime,String ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public void getInput(){

    }

    public void prepareIceCream(String mixing_and_cooling) {

    }

    public void deliverIceCreamToIceCreamShops() {

    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor() {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice() {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost() {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public String setProductionTime() {
        this.productionTime = productionTime;
        return null;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String setIngredients(String s) {
        this.ingredients = ingredients;
        return s;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salePrice,salePrice) == 0 && Double.compare(iceCream.productionCost,productionCost) == 0 && productionTime == iceCream.productionTime && flavor.equals(iceCream.flavor) && ingredients.equals(iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor,salePrice,productionCost,productionTime,ingredients);
    }
}
