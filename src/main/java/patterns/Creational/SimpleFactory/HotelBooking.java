package patterns.Creational.SimpleFactory;

public class HotelBooking implements Booking{

    Hotel h;
    public HotelBooking(Hotel h){
        this.h = h;
    }
    @Override
    public void book() {
        System.out.println(
                "Hoel has been booked with these details"+"\n"+h.getHotelName()+"\n"+h.getCheckin()+"\n"+h.getCheckout()+"\n"+h.getPrice()
        );
    }
}
