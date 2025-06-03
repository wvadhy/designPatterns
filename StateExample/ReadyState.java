package org.example.StateExample;

import org.example.StateExample.OffState;
import org.example.StateExample.State;
import org.example.StateExample.StateDesignPattern;

public class ReadyState extends State {

    public ReadyState(StateDesignPattern phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.home();
        return null;
    }

    @Override
    public String onPower() {
        phone.lock();
        phone.setState(new OffState(phone));
        return null;
    }
}
