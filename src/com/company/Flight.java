package com.company;

public class Flight {
    public String flightNumber;
    public String airline;
    private int bookedSeats;

    Flight(String flightNumber, String airline, int bookedSeats){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.bookedSeats = bookedSeats;
    }

    public Flight() {

    }

    public String getFlightDetails() {
        return "Flight Number: " + flightNumber + " Airline: " + airline + " Seats Booked: " + bookedSeats;


    }

    public boolean checkAvailability() {
        if(bookedSeats >= 1) {

        }
        return true;
    }

    public int incrementBookingCounter() {
        bookedSeats += 1;

        return 0;
    }
}

