package org.example.Misc;

import java.util.List;

public abstract class Area {

    private List<Integer> Pos;

    public void setup(){
        Building one = createBuilding();
        Building two = createBuilding();
        Land main = createLand();
        one.getEnvironment();
        main.getVibe();
    }

    abstract Building createBuilding();
    abstract Land createLand();

}

