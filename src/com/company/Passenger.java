package com.company;

public class Passenger {
    private int id;
    private Address address;
    private Contact contact;
    private static int idCounter = 0;

    public Passenger(String street, String city, String state, String name, String phone, String email) {
        ++idCounter;
        this.id = idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }


    public int getPassengerCount(){
        return idCounter;
    }

    public String getName(){
        return contact.getName();

    }

    public String getEmail(){
        return contact.getEmail();

    }

    private static class Address {
        private String street;
        private String city;
        private String state;
        private Passenger passenger;


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

    private static class Contact {
        private String name;
        private String phone;
        private String email;
        private Passenger passenger;

        public Contact(String name, String phone, String email){
            this.setName(name);
            this.setPhone(phone);
            this.setEmail(email);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getContactDetails(){
            return "Name of Passenger: " + name + " Phone: " + phone + " email : " + email;

        }

        public void updateContactDetails(String name, String phone, String email){
            this.name = name;
            this.phone = phone;
            this.email = email;

        }

    }

}
