package patterns.Creational.SimpleFactory;

public class Flight {

    private String flightNumber;
    private String seatType;
    private int price;
    private String airline;

    public Flight setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    public Flight setSeatType(String seatType) {
        this.seatType = seatType;
        return this;
    }

    public Flight setPrice(int price) {
        this.price = price;
        return this;
    }

    public Flight setAirline(String airline) {
        this.airline = airline;
        return this;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public int getPrice() {
        return price;
    }

    public String getAirline() {
        return airline;
    }
}
