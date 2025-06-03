package org.example.Misc;

import java.util.ArrayList;

public class SnowSurvival extends Area{
    @Override
    Building createBuilding() {
        return new Stark("Will", 120, new ArrayList<>(1));
    }

    @Override
    Land createLand() {
        return new Snow("Iceland", 100);
    }
}
