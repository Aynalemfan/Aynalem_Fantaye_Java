package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {


    @Test
    public void getFirsNameShouldReturnFirstName() {
        Customer customer = new Customer();
        customer.setFirsName("Alex");
        String expectedResult = "Alex";
        String actualResult = customer.getFirsName();
        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void setFirsNameShouldSetFirstName() {
        Customer customer = new Customer();
        customer.setFirsName("Alex");
        String expectedResult = "Alex";
        String actualResult = customer.getFirsName();
        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void getLastNameShouldReturnLastName() {
        Customer customer = new Customer();
        customer.setLastName("Alan");
        String expectedResult = "Alan";
        String actualResult = customer.getLastName();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void setLastNameShouldSetLastName() {
        Customer customer = new Customer();
        customer.setLastName("Alan");
        String expectedResult = "Alan";
        String actualResult = customer.getLastName();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getEmailShouldReturnEmail() {
        Customer customer = new Customer();
        customer.setEmail("a@gmail.com");
        String expectedResult = "a@gmail.com";
        String actualResult = customer.getEmail();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void setEmailShouldSetEmail() {
        Customer customer = new Customer();
        customer.setEmail("a@gmail.com");
        String expectedResult = "a@gmail.com";
        String actualResult = customer.getEmail();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getPhoneNumberShouldReturnPhoneNumber() {
        Customer customer = new Customer();
        customer.setPhoneNumber("1234567890");
        String expectedResult = "1234567890";
        String actualResult = customer.getPhoneNumber();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void setPhoneNumberShouldSetPhoneNumber() {
        Customer customer = new Customer();
        customer.setPhoneNumber("1234567890");
        String expectedResult = "1234567890";
        String actualResult = customer.getPhoneNumber();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void isRewardMemberShouldCheckIfCustomerIsRewardMember() {
        Customer customer = new Customer();
        customer.isRewardMember() ;
        boolean isRewardMember;

    }

    @Test
    public void setIsRewardMemberShouldSetIsRewardMember() {
        Customer customer = new Customer();
        customer.setRewardMember();
    }
}