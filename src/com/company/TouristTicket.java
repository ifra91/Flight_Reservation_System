package com.company;

//import javax.print.attribute.standard.Destination;
import java.awt.datatransfer.StringSelection;
import java.util.*;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation = new String[5];

//    private Flight flight;

    public TouristTicket(Flight f, Passenger p, String from, String to, Date arrivalDateTime, Date departureDateTime, float price, String seatNo, String hotelAddress, String[] selectedTouristLocation) {
        super(f, p,  from, to, arrivalDateTime, departureDateTime, price, seatNo);
        this.setSelectedTouristLocation();
        this .hotelAddress = hotelAddress;
        this.addTouristLocation();
        this.removeTouristLocation();
    }





    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation() {
        String[] destination = new String[10];
        destination = new String[]{"Delhi","Bombay","Goa","Himachal","Indore","manali", "gujrat","kashmir","karnataka","kerela"};

        selectedTouristLocation = Arrays.copyOfRange(destination,5,destination.length);
        System.out.println(selectedTouristLocation);

    }


    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocation() {
        return selectedTouristLocation;
    }
    public void removeTouristLocation(){
        List<String> list = new ArrayList<String>(Arrays.asList(selectedTouristLocation));
        list.remove("Bombay");
        selectedTouristLocation = list.toArray(new String[0]);

    }
    public void addTouristLocation(){
        List<String> list = new ArrayList<String>(Arrays.asList(selectedTouristLocation));
        list.add("Bombay");
        selectedTouristLocation = list.toArray(new String[0]);

    }


}
