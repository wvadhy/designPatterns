package org.example.ObserverExample;

import org.example.ObserverExample.EventListener;

public class MobileMsgListener implements EventListener {

    private final String username;

    public MobileMsgListener(String username) {
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("Updating app data for user " + username + "!");
    }
}
