package org.example.StateExample;

public class LockedState extends State {

    public LockedState(StateDesignPattern phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.unlock();
        phone.setState(new ReadyState(phone));
        return null;
    }

    @Override
    public String onPower() {
        phone.lock();
        phone.setState(new OffState(phone));
        return null;
    }
}
