package patterns.Creational.SimpleFactory;

import java.time.LocalDate;

public class BookingFactory {

    public static Booking createProduct(String type){
        Booking b;
        if(type.equals("Flight")){
            Flight f = new Flight();
            f.setAirline("Indigo").setSeatType(" 6E Double Seat s").setFlightNumber("AB-324").setPrice(23342);
            b = new FlightBooking(f);
        }else{
            Hotel h = new Hotel();
            h.setCheckin(LocalDate.of(2025,12,3));
            h.setCheckout(LocalDate.of(2025,12,14));
            h.setHotelName("Novohotel");
            h.setPrice(5600);
            b = new HotelBooking(h);
        }
        return b;
    }
}
