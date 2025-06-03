package org.example.Misc;

import java.text.MessageFormat;

public class Jungle extends Land{

    public Jungle(String n, Integer m) {
        super(n, m);
    }

    @Override
    void getVibe() {
        System.out.println(MessageFormat.format("The {0} rainforest is hungry", name));
    }
}
