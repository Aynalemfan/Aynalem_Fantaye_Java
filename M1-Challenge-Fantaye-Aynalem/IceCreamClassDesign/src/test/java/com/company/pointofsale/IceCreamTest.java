package com.company.pointofsale;

import org.junit.Test;

public class IceCreamTest {


    @Test
    public void getCustomersOrderShouldAskCustomersNeed() {
        IceCream iceCream1 = new IceCream();
        System.out.println("Ask customers' need.");
        iceCream1.getCustomersOrder();
        return;
    }

    @Test
    public void checkQuantityOfOrderCustomersMade() {
        IceCream iceCream1 = new IceCream();
        iceCream1.checkQuantity();
        return;
    }

    @Test
    public void checkPriceForIceCream() {
        IceCream iceCream1 = new IceCream();
        iceCream1.checkPriceForIceCream();
        return;
    }

    @Test
    public void deliverIceCreamToCustomers() {
        IceCream iceCream1 = new IceCream();
        iceCream1.deliverIceCreamToCustomers();
        return;
    }

    @Test
    public void getFlavorNeedsOfCustomers() {
        IceCream iceCream1 = new IceCream();
        iceCream1.getFlavor();
        return;

    }

    @Test
    public void setFlavorNeedsOfCustomers() {
        IceCream iceCream1 = new IceCream();
        iceCream1.setFlavor();
        return;

    }

    @Test
    public void getPriceBasedOnCustomersNeeds() {
        IceCream iceCream1 = new IceCream();
        iceCream1.getPrice();
        return;
    }

    @Test
    public void setPriceBasedOnCustomersNeed() {
        IceCream iceCream1 = new IceCream();
        iceCream1.setPrice();
        return;
    }

    @Test
    public void getQuantityThatCustomersWants() {
        IceCream iceCream1 = new IceCream();
        iceCream1.getQuantity();
        return;
    }

    @Test
    public void setQuantityAsPerCustomersRequest() {
        IceCream iceCream1 = new IceCream();
        iceCream1.setQuantity();
        return;
    }
}