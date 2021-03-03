package com.company;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ticket {
    public String pnr;
    public String from;
    public String to;
    public Flight flight;
    public Date departureDateTime;
    public Date arrivalDateTime;
    public Passenger passenger;
    public String seatNo;
    public float price;
    public boolean cancelled;

    public Ticket(){


    }

    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public void setArrivalDateTime(Date arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String checkStatus() {
        String status = "";
        if (this.cancelled) {
            return "Your ticket is cancelled";
        } else {
            return "Departure time of flight is: " + this.departureDateTime;
        }

    }

    public long getFlightDuration(){
        long diffInMillis = Math.abs(arrivalDateTime.getTime() - departureDateTime.getTime());
        long diff = TimeUnit.MINUTES.convert(diffInMillis, TimeUnit.MILLISECONDS);
        return diff;
    }

    public void cancel() {
        if (this.cancelled == true) {
            System.out.println("Flight is cancelled");
        } else {
            System.out.println(flight + ": No changes");
        }

    }
}
