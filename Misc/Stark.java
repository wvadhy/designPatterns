package org.example.Misc;

import java.text.MessageFormat;
import java.util.List;

public class Stark extends Building{

    public Stark(String n, Integer s, List<String> t) {
        super(n, s, t);
    }

    @Override
    void getEnvironment() {
        System.out.println(MessageFormat.format("Tony stares down {0} atop his {1}m sized tower", name, size));
    }
}
