package patterns.Creational.Factory;

public class SmsNotificationCreator {

    public Notification createNotification(){
        return new SmsNotification();
    }
}
