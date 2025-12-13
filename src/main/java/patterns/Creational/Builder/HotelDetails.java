package patterns.Creational.Builder;

import java.time.LocalDate;

public class HotelDetails {
   private String hotelName;
   private String checkInDate;
   private LocalDate checkOutDate;
   private String roomType;

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
