package com.company;

public class CustomerApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setFirsName("Jerry");
        customer1.setLastName("Bob");
        customer1.setEmail("jb@gmail.com");
        customer1.setPhoneNumber("567123456");
        System.out.println(customer1);

        System.out.println("=================");

        Address address1 = new Address();
        address1.setStreet("Creek");
        address1.setCity("Fort Worth");
        address1.setState("Texas");
        System.out.println(address1);

    }
}
