package org.example.CompositeExample;

public abstract class Product implements Box{
    String name;
    int cost;

    public Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
}
