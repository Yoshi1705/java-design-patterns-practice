package patterns.Creational.Factory;

public class Client {

    public static void main(String[] args) {

        NotificationCreator nc = new EmailNotificationCreator();
        Notification email = nc.createNotification();
        email.send();
    }
}
