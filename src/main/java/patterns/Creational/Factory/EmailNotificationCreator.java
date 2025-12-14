package patterns.Creational.Factory;

public class EmailNotificationCreator implements NotificationCreator{

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
