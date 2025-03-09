package incubation.solidprinciples;

//High-level modules should not depend on low-level modules. Both should depend on abstractions.
//Use Dependency Injection (DI) to avoid hard dependencies.
//When to Use?
//When decoupling components to make them easier to test and maintain.
//To avoid hard-coded dependencies.
public class DependencyInversionPrinciple {
    class EmailNotification {
        public void sendEmail(String message) {
            System.out.println("Sending Email: " + message);
        }
    }

    class NotificationService {
        private EmailNotification email = new EmailNotification();  // Tight coupling

        public void send(String message) {
            email.sendEmail(message);
        }
    }
    //NotificationService is tightly coupled to EmailNotification. We cannot change the
    //notification method (e.g., SMS, Push Notifications) without modifying the code.



    //After DIP (Fixed)
    //Now, we can easily swap between Email, SMS, or other notification methods without
    //modifying NotificationService.
    interface Notification {
        void send(String message);
    }

    class EmailNotificationUpdated implements Notification {
        public void send(String message) {
            System.out.println("Sending Email: " + message);
        }
    }

    class SMSNotification implements Notification {
        public void send(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    class NotificationServiceUpdated {
        private Notification notification;

        public NotificationServiceUpdated(Notification notification) {  // Dependency Injection
            this.notification = notification;
        }

        public void send(String message) {
            notification.send(message);
        }
    }

    // Usage
    public void main(String[] args) {
        NotificationServiceUpdated service = new NotificationServiceUpdated(new EmailNotificationUpdated());
        service.send("Hello World!");  // Sending Email

        service = new NotificationServiceUpdated(new SMSNotification());
        service.send("Hello World!");  // Sending SMS
    }
}
