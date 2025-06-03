package org.example.DecoraterExample;

import org.example.DecoraterExample.Animal;
import org.example.DecoraterExample.AnimalDecorator;

public class FireBreathing extends AnimalDecorator {

    public FireBreathing(Animal animal){
        super(animal);
    }

    @Override
    public String getDescription() {
        return String.format("fire breathing %s", getBase().getDescription());
    }

    @Override
    public Double getWeight() {
        return getBase().getWeight() * 1.5;
    }
}
