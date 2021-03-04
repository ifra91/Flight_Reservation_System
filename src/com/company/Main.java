package com.company;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Flight flight = new Flight("flight-no-1766", "air-arabia", 500);
        System.out.println(flight.getAirline());
        System.out.println(flight.getFlightNumber());
        System.out.println(flight.getFlightDetails());
        System.out.println(flight.incrementBookingCounter());

        System.out.println(flight.checkAvailability());

        Passenger passenger = new Passenger("link road", "kanpur", "up" , "anas","998876552", "jfnej@gmail.com");
        Date d1 = new Date(2021, 03, 21);
        Date d2 = new Date(2021, 03, 22);

        System.out.println(passenger.getPassengerCount());
        System.out.println(passenger.getEmail());
        System.out.println(passenger.getName());



        RegularTicket r = new RegularTicket(flight, passenger, "bhopal", "kanpur", d2, d1, 2000, "seat1", false);
        System.out.println("Opted for Special Services: "+ r.getSpecialServices());
        String[] location = {"a", "b"};
        TouristTicket t = new TouristTicket(flight, passenger, "bhopal", "kanpur", d2, d1, 2000, "seat2", "taj", location);
        printTicketDetails(r);
        printTicketDetails(t);



        System.out.println(t.checkStatusOfFLight());
        System.out.println(t.checkStatus());




    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());

    }
}
