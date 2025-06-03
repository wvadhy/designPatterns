package org.example.ObserverExample;

public class Observer {

    // Ensure that when one object changes state, all its dependents
    // are notified and updated automatically.

    private final NotificationService notificationService;

    public Observer(){
        notificationService = new NotificationService();
    }

    public void Promotion(Event event){
        notificationService.signal(event);
    }

    public NotificationService getService(){
        return notificationService;
    }

}
