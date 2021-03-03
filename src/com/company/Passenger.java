package com.company;

public class Passenger {
    public int id;
    public Address address;
    public Contact contact;

    public Passenger(int id, Address address, Contact contact){
        this.setId(id);
        this.getAddress();
        this.getContact();

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public Contact getContact(){
        return contact;

    }

    public Address getAddress(){
        return address;

    }


}
