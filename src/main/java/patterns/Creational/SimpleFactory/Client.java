package patterns.Creational.SimpleFactory;

public class Client {

    public static void main(String[] args) {
        Booking flight = BookingFactory.createProduct("Flight");
        flight.book();
    }

}
