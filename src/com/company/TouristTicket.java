package com.company;

import java.util.Date;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation;
//    private Flight flight;

    public TouristTicket(Flight f, Passenger p, String from, String to, Date arrivalDateTime, Date departureDateTime, float price, String seatNo, String hotelAddress, String[] selectedTouristLocation) {
        super(f, p,  from, to, arrivalDateTime, departureDateTime, price, seatNo);
        this.selectedTouristLocation = selectedTouristLocation;
        this .hotelAddress = hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }


    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocation() {
        return selectedTouristLocation;
    }
    public void removeTouristLocation(String location){
        this.selectedTouristLocation = selectedTouristLocation;


    }
    public void addTouristLocation(String location){
        this.selectedTouristLocation = selectedTouristLocation;

    }
}
