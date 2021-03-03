package com.company;

public class Flight {
    private String flightNumber;
    private String airline;
    private int bookedSeats;
    private int capacity;

    public Flight(String flightNumber, String airline, int capacity) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.bookedSeats = 0;
        this.capacity = capacity;
    }

    public Flight() {

    }

    public String getFlightDetails() {
        return "Flight Number: " + flightNumber + " Airline: " + airline + " Seats Booked: " + bookedSeats;


    }

    public boolean checkAvailability() {
        if(bookedSeats == capacity) {
            return false;
        } else {
            return true;
        }

    }

    public int incrementBookingCounter() {
        bookedSeats += 1;

        return bookedSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}

