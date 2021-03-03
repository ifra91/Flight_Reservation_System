package com.company;

public class TouristTicket extends Ticket{
    public String hotelAddress;
    public String[] selectedTouristLocation;

    public TouristTicket(String hotelAddress, String[] selectedTouristLocation) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public TouristTicket() {

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
