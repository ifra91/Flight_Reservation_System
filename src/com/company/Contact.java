package com.company;

public class Contact {
    public String name;
    public String phone;
    public String email;

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
