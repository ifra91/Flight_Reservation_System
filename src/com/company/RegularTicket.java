package com.company;

public class RegularTicket extends Ticket{
    public String specialServices;

    public RegularTicket(String specialServices) {
        this.specialServices = specialServices;
    }

    public RegularTicket() {

    }

    public String getSpecialServices(){
        return specialServices;

    }

    public void updateSpecialServices(String specialServices){
        this. specialServices = specialServices;

    }
}
