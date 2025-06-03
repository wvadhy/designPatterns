package org.example.StateExample;

public class StateDesignPattern {

    private State state;

    // The State design pattern allows an object to alter its behaviour when its
    // internal state changes.

    public StateDesignPattern(){
        state = new OffState(this);
    }

    protected void lock(){ System.out.println("Locking phone and turning off the screen"); }
    protected void home(){ System.out.println("Going to home-screen"); }
    protected void unlock(){ System.out.println("Unlocking the phone to home"); }
    protected void turnOn(){ System.out.println("Turning screen on, device is still locked"); }

    protected void setState(State state) {
        this.state = state;
    }

    protected State getState(){ return this.state; }
}
