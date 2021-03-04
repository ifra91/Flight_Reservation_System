package com.company;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private Date departureDateTime;
    private Date arrivalDateTime;
    private Passenger passenger;
    private String seatNo;
    private float price;
    private boolean cancelled;

    public Ticket(Flight f, Passenger p, String from, String to, Date arrivalDateTime, Date departureDateTime, float price, String seatNo) {
        this.flight = f;
        this.passenger = p;
        this.from = from;
        this.to = to;
        this.arrivalDateTime = arrivalDateTime;
        this.departureDateTime = departureDateTime;
        this.cancelled = false;
        if (checkStatusOfFLight().equals("Available")) {
            this.seatNo = seatNo;
            this.price = price;
            this.flight.incrementBookingCounter();
            this.pnr = p.getName() + p.getEmail() + p.getPassengerCount();
        }
       this.cancel();
    }

    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public void setArrivalDateTime(Date arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }


    public String checkStatusOfFLight() {
        boolean isAvailable = this.flight.checkAvailability();
        if (isAvailable) {
            return "Available";
        } else {
            return "Not Available";
        }

    }

    public String checkStatus() {
        if(cancelled == true) {
            return "Ticket for Flight:" + flight.getFlightNumber()+ " is cancelled";
        } else {
            if (this.pnr != null) {
                return "Fight confirmed for " + this.pnr;
            } else {
                return "Fight not booked";
            }
        }
    }

    public long getFlightDuration(){
        long diffInMillis = Math.abs(arrivalDateTime.getTime() - departureDateTime.getTime());
        long diff = TimeUnit.MINUTES.convert(diffInMillis, TimeUnit.MILLISECONDS);
        return diff;
    }

    public void cancel() {
        this.cancelled = true;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    public Date getArrivalDateTime() {
        return arrivalDateTime;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

}
