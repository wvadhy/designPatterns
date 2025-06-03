package org.example.Misc;

import java.text.MessageFormat;

public class Snow extends Land{

    public Snow(String n, Integer m) {
        super(n, m);
    }

    @Override
    void getVibe() {
        System.out.println(MessageFormat.format("The freezing {0} plains watches you closely", name));
    }
}
