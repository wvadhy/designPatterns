package org.example.CommandExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TV {

    private Boolean on = false;
    private List<String> channels = new ArrayList<>(Arrays.asList("Channel 4", "BBC", "Top Gear"));
    private ListIterator<String> iterator = channels.listIterator();
    private String currentChannel;

    public void pressRemote(){
        System.out.println("Turning " + (on ? "off":"on") + " TV!");
        on = !on;
    }

    public void changeChannel(){
        if (iterator.hasNext() && on) {
            String temp = iterator.next();
            currentChannel = temp;
            System.out.println("Switching to channel " + temp + "!");
        } else { System.out.println("TV is off..."); }
    }


}
