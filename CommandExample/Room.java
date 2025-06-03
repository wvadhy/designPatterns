package org.example.CommandExample;

import org.example.CommandExample.Command;

import java.util.ArrayList;
import java.util.List;

public class Room {

    List<Command> commands;

    public Room(){ commands = new ArrayList<>(); };

    public void setCommands(List<Command> commands){
        this.commands.addAll(commands);
    }

    public void executeCommands(){
        for (Command c: commands) {
            c.execute();
        }
    }

    public void executeCommand(Integer index){
        commands.get(index).execute();
    }

}
