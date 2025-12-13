package patterns.Creational.Builder;

public class FlightDetails {

    private String FlightNumber;
    private String depature;

    public void setFlightNumber(String flightNumber) {
        FlightNumber = flightNumber;
    }

    private String arrival;
    private String date;

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    private String seatType;

    public void setDepature(String depature) {
        this.depature = depature;
    }

    private String airline;
}
