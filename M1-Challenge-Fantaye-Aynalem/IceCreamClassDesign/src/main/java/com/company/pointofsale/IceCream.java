package com.company.pointofsale;

import java.util.Objects;

public class IceCream {
    private String flavor;
    private double price;
    private int quantity;

    public IceCream() {

    }

    public IceCream(String flavor,double price,int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public void getCustomersOrder() {
        System.out.println("Ask customers' need.");
        return;
    }
    public void checkQuantity() {
        System.out.println("How many cones of IceCream would you like to buy?");
        return;
    }

    public double checkPriceForIceCream() {
        System.out.println("The cost is " + getPrice() + " per cone");
        return price;
    }

    public void deliverIceCreamToCustomers() {
        System.out.println("IceCream is ready!");

    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor() {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price,price) == 0 && quantity == iceCream.quantity && flavor.equals(iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor,price,quantity);
    }
}
