package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightApp {
    public static void main(String[] args) throws RouteNotFoundException{
        Flight warBer = new Flight("Warsaw", "Berlin");
        Flight warGda = new Flight("Warsaw", "Gdańsk");
        Map<String, Boolean> airportsList = new HashMap<>();
        airportsList.put("Berlin", true);
        airportsList.put("Gdańsk", false);
        FlightLogic flightLogic = new FlightLogic(airportsList);
        try {
            flightLogic.findFlight(warGda);
            System.out.println("Airport exist");
        }
        catch (RouteNotFoundException e){
            System.out.println(e);
        }
    }
}
