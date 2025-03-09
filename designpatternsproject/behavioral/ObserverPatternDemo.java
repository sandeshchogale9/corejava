package incubation.designpatternsproject.behavioral;

import java.util.*;

// Observer Interface
interface Observer {
    void update(String message);
}

// Concrete Observers
class EmailNotification implements Observer {
    public void update(String message) {
        System.out.println("Email Notification: " + message);
    }
}

class SMSNotification implements Observer {
    public void update(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

// Subject
class OrderNotification {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// Test Observer Pattern
public class ObserverPatternDemo {
    public static void main(String[] args) {
        OrderNotification notification = new OrderNotification();

        Observer email = new EmailNotification();
        Observer sms = new SMSNotification();

        notification.addObserver(email);
        notification.addObserver(sms);

        notification.notifyObservers("Your order has been shipped!");
    }
}

