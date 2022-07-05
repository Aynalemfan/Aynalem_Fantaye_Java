package com.company;

public class Customer {
    private String firsName;
    private String lastName;
    private String email;
    private String phoneNumber;

    private Address homeAddress;
    private Address shippingAddress;
    private boolean isRewardMember;

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public boolean isRewardMember() {
        return isRewardMember;
    }

    public void setRewardMember() {
        if (isRewardMember) this.isRewardMember = true;
        else this.isRewardMember = false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", homeAddress=" + homeAddress +
                ", shippingAddress=" + shippingAddress +
                ", isRewardMember=" + isRewardMember +
                '}';
    }

}
