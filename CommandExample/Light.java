package org.example.CommandExample;

public class Light {

    private Boolean on = false;

    public void flickSwitch(){
        System.out.println("Turning " + (on ? "off":"on") + " lights!");
        on = !on;
    }

}
