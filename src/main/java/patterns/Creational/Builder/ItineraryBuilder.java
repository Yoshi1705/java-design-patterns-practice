package patterns.Creational.Builder;

import java.time.LocalDate;

public interface ItineraryBuilder {

    public ItineraryBuilder setTravelerInfo(String name , String gender ,String emailid, LocalDate traveldate);
    public ItineraryBuilder addFlight(FlightDetails flightDetails);
    public ItineraryBuilder addHotel(HotelDetails hotelDetails);
    public ItineraryBuilder addCabTransfers(CabDetails cabdetails);
    public ItineraryBuilder addMealPlan(MealPlan mealdetails);
    public Itinerary build();
}
