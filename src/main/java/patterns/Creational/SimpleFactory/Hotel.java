package patterns.Creational.SimpleFactory;

import java.time.LocalDate;

public class Hotel {

    private String hotelName;
    private LocalDate checkin;
    private LocalDate checkout;
    private int price;

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHotelName() {
        return hotelName;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public int getPrice() {
        return price;
    }
}
