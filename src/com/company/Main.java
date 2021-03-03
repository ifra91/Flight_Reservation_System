package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Address address = new Address("str", "blp", "mp");
        System.out.println(address.getCity());
        System.out.println(address.getState());
        System.out.println(address.getStreet());
        System.out.println(address.getAddressDetails());
        address.updateAddressDetails("kpr road", "amd", "guj");
        System.out.println(address.getAddressDetails());

       Contact contact = new Contact("Ifra","9876543321", "ifra.khan.1991@gmail.com" );
        System.out.println(contact.getContactDetails());
        contact.updateContactDetails("Anas", "898776552", "anashk@gmail.com");
        System.out.println(contact.getContactDetails());

     Passenger passenger = new Passenger(12, "", "");
      System.out.println(passenger.getAddress());
        System.out.println(passenger.getContact());
        System.out.println(passenger.getId());

       Ticket ticket = new Ticket();
       System.out.println(ticket.getFlightDuration());
        System.out.println(ticket.checkStatus());

        Flight flight = new Flight();
        System.out.println(flight.checkAvailability());
        System.out.println(flight.getFlightDetails());
        System.out.println(flight.incrementBookingCounter());

       TouristTicket touristTicket = new TouristTicket();
        System.out.println(ticket.checkStatus());
        System.out.println(ticket.getFlightDuration());



       RegularTicket regularTicket = new RegularTicket();
       regularTicket.getSpecialServices();
    }
}
