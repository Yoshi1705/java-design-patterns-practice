package patterns.Creational.Builder;

import java.time.LocalDate;

public class Itinerary {
    private String name;
    private String gender;
    private String emailid;
    private LocalDate traveldate;

    private HotelDetails hotelDetails;
    private CabDetails cabDetails;
    private MealPlan mealPlan;
    private FlightDetails flighDetails;

    public void setFlighDetails(FlightDetails flighDetails) {
        this.flighDetails = flighDetails;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHotelDetails(HotelDetails hotelDetails) {
        this.hotelDetails = hotelDetails;
    }

    public void setMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void setCabDetails(CabDetails cabDetails) {
        this.cabDetails = cabDetails;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setTraveldate(LocalDate traveldate) {
        this.traveldate = traveldate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
