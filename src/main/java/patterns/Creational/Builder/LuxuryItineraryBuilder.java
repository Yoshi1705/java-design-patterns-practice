package patterns.Creational.Builder;

import java.time.LocalDate;

public class LuxuryItineraryBuilder implements  ItineraryBuilder{

    Itinerary i;

    public LuxuryItineraryBuilder(){
        i = new Itinerary();
    }
    @Override
    public ItineraryBuilder setTravelerInfo(String name, String gender, String emailid, LocalDate traveldate) {
        i.setName(name);
        i.setGender(gender);
        i.setEmailid(emailid);
        i.setTraveldate(traveldate);
        return this;
    }

    public ItineraryBuilder addFlight(FlightDetails flightDetails){
        i.setFlighDetails(flightDetails);
        return this;
    }

    @Override
    public ItineraryBuilder addHotel(HotelDetails hotelDetails) {
        i.setHotelDetails(hotelDetails);
        return this;
    }

    @Override
    public ItineraryBuilder addCabTransfers(CabDetails cabdetails) {
        i.setCabDetails(cabdetails);
        return this;
    }

    public ItineraryBuilder addMealPlan(MealPlan mealPlan){
        i.setMealPlan(mealPlan);
        return this;
    }

    public Itinerary build(){
        return i;
    }
}
