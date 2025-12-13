package patterns.Creational.Builder;

import java.time.LocalTime;

public class CabDetails {
    private LocalTime pickuptime;
    private String droplocation;
    private String cabtype;

    public void setPickuptime(LocalTime pickuptime) {
        this.pickuptime = pickuptime;
    }

    public void setCabtype(String cabtype) {
        this.cabtype = cabtype;
    }

    public void setDroplocation(String droplocation) {
        this.droplocation = droplocation;
    }
}
