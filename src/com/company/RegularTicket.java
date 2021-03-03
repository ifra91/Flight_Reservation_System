package com.company;

import java.util.Date;

public class RegularTicket extends Ticket{
    private String specialServices;
//    private Flight flight;

    public RegularTicket(Flight f, Passenger p, String from, String to, Date arrivalDateTime, Date departureDateTime, float price, String seatNo) {
        super(f, p,  from, to, arrivalDateTime, departureDateTime, price, seatNo);
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }


    public String getSpecialServices(){
        return specialServices;

    }

    public void updateSpecialServices(String specialServices){
        this. specialServices = specialServices;

    }
}
