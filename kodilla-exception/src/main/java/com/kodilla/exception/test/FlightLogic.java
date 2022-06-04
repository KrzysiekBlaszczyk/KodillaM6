package com.kodilla.exception.test;

import java.util.Map;
import java.util.Objects;

public class FlightLogic {
    private Map<String, Boolean> airportsList;

    public FlightLogic(Map<String, Boolean> airportsList) {
        this.airportsList = airportsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightLogic that = (FlightLogic) o;
        return Objects.equals(airportsList, that.airportsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportsList);
    }
    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        Boolean result = airportsList.get(flight.getArrivalAirport());
        if (result==false) {
            throw new RouteNotFoundException("Airport don't exist");
        }else {
            return result;
        }
    }
}
