package patterns.Creational.Builder;

import java.time.LocalDate;

public class ItineraryDirector {
    private final ItineraryBuilder b ;
    private final Itinerary i;
     public ItineraryDirector(){
         b = new LuxuryItineraryBuilder();

         FlightDetails fd = new FlightDetails();
         fd.setFlightNumber("AI-101");
         fd.setAirline("AirIndia");
         fd.setArrival("Delhi");
         fd.setDepature("hyderabad");

         HotelDetails hd = new HotelDetails();
         hd.setHotelName("Novohotel");
         hd.setCheckInDate("13/12/2025");
         hd.setCheckOutDate(LocalDate.of(2025,12,13));
         i = b.setTravelerInfo("yoshitha","female","yoshee257@gmail.com", LocalDate.of(2025,12,14)).addFlight(fd).addHotel(hd).build();

     }

    public Itinerary getI() {
        return i;
    }
}
