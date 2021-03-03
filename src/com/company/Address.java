package com.company;

public class Address {
    public String street;
    public String city;
    public String state;

    public Address(String street, String city, String state) {
        this.setCity(city);
        this.setState(state);
        this.setStreet(street);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddressDetails(){
        return getStreet() + " " + getCity()+ " " + getState();

    }
    public void updateAddressDetails(String street, String city, String state){
        this.setStreet(street);
        this.setState(state);
        this.setCity(city);
   }
    }

