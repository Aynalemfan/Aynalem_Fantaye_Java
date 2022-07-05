package com.company;

import com.company.factory.IceCream;

public class App {
    private static com.company.factory.IceCream IceCream;

    public static void main(String[] args) {
        com.company.pointofsale.IceCream iceCream1 = new com.company.pointofsale.IceCream();
        iceCream1.setFlavor();
        iceCream1.setPrice();
        iceCream1.getPrice();
        iceCream1.getFlavor();
        iceCream1.setQuantity();
        iceCream1.getQuantity();

        iceCream1.getCustomersOrder();
        iceCream1.checkQuantity();
        iceCream1.checkPriceForIceCream();
        System.out.println();
        System.out.println("This is " +  iceCream1.getFlavor() + " IceCream and the price per cone is " + iceCream1.getPrice());
        System.out.println("The total daily sale of this " +  iceCream1.getFlavor() + " IceCream is " + iceCream1.getQuantity() + " cones.");
        System.out.println("The total daily income from this " +  iceCream1.getFlavor() + " IceCream is " +
                iceCream1.getQuantity() * iceCream1.getPrice() + ".");

        IceCream newIceCream = new IceCream();

        newIceCream.setIngredients("Firuts, Colors");
        newIceCream.getInput();
        newIceCream.getIngredients();
        newIceCream.prepareIceCream("Mixing and cooling");
        newIceCream.setProductionTime();
        newIceCream.getProductionTime();
        newIceCream.deliverIceCreamToIceCreamShops();

        System.out.println(newIceCream.getIngredients());
        System.out.println(newIceCream.getProductionTime());
    }
}
