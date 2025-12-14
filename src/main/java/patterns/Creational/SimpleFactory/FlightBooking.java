package patterns.Creational.SimpleFactory;

public class FlightBooking implements Booking{

    Flight f;
    public FlightBooking(Flight f){
        this.f = f;
    }
    @Override
    public void book( ) {
        System.out.println("flight has been booked with the details"+f.getFlightNumber()+"\n"+f.getAirline()+"\n"+f.getSeatType()+"\n"+f.getPrice());
    }
}
