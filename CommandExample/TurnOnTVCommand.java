package org.example.CommandExample;

public class TurnOnTVCommand implements Command{

    private TV tv;

    public TurnOnTVCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.pressRemote();
    }
}
