package org.example.ObserverExample;

import java.util.*;

public class NotificationService {

    private final Map<Event, List<EventListener>> customers;

    public NotificationService(){
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event ->
                customers.put(event, new ArrayList<>()));
    }

    public void subscribe(Event event, EventListener e){
        customers.get(event).add(e);
    }

    public void unsubscribe(Event event, EventListener e){
        customers.get(event).remove(e);
    }

    public void signal(Event event){
        customers.get(event).forEach(EventListener::update);
    }

}
