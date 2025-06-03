package org.example.CommandExample;

import org.example.CommandExample.Command;
import org.example.CommandExample.TV;

public class ChangeChannelTVCommand implements Command {

    private TV tv;

    public ChangeChannelTVCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
