package patterns.Creational.Builder;

import java.time.LocalDate;

public abstract class BasicItineraryBuilder implements ItineraryBuilder{

    Itinerary i;
    BasicItineraryBuilder(){
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
    public Itinerary build(){
        return i;
    }
}
