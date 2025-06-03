package org.example.DecoraterExample;

import org.example.DecoraterExample.Animal;
import org.example.DecoraterExample.AnimalDecorator;

public class Winged extends AnimalDecorator {

    public Winged(Animal animal){
        super(animal);
    }

    @Override
    public String getDescription() {
        return String.format("winged %s", getBase().getDescription());
    }

    @Override
    public Double getWeight() {
        return getBase().getWeight() * 1.1;
    }
}
