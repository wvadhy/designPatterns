package org.example.Misc;

import java.text.MessageFormat;
import java.util.List;

public class Wayne extends Building{

    public Wayne(String n, Integer s, List<String> t) {
        super(n, s, t);
    }

    @Override
    void getEnvironment() {
        System.out.println(MessageFormat.format("Batman leers at {0} in his {1}m sized mansion", name, size));
    }
}
