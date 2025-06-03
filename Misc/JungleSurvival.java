package org.example.Misc;

import java.util.ArrayList;

public class JungleSurvival extends Area{
    @Override
    Building createBuilding() {
        return new Wayne("Doran", 234, new ArrayList<>(1));
    }

    @Override
    Land createLand() {
        return new Jungle("Aicaramba", 89);
    }
}
