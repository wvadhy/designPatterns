package org.example.StateExample;

public abstract class State {

    protected StateDesignPattern phone;

    public State(StateDesignPattern phone){
        this.phone = phone;
    }

    public abstract String onHome();
    public abstract String onPower();

}
