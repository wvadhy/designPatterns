package org.example.ObserverExample;

import org.example.ObserverExample.EventListener;

public class EmailMsgListener implements EventListener {

    private final String email;

    public EmailMsgListener(String email){
        this.email = email;
    }

    public void update(){
        System.out.println("Updating mail!");
    }

}
