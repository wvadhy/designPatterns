package org.example.CompositeExample;

public class Phone extends Product{

    public Phone(String name, int cost){
        super(name, cost);
    }

    @Override
    public int calculateCost() {
        return cost + 10;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
