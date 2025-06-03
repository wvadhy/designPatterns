package org.example.StateExample;

public class OffState extends State {

    public OffState(StateDesignPattern phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.turnOn();
        phone.setState(new LockedState(phone));
        return null;
    }

    @Override
    public String onPower() {
        phone.turnOn();
        phone.setState(new LockedState(phone));
        return null;
    }
}
