package org.example.CompositeExample;

public class Laptop extends Product{

    public Laptop(String name, int cost){
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
