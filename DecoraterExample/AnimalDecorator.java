package org.example.DecoraterExample;

public abstract class AnimalDecorator implements Animal{

    private Animal base;

    public AnimalDecorator(Animal base){
        this.base = base;
    }

    public Animal getBase(){return base;}
    public String getName(){return base.getName();}

    public abstract String getDescription();
    public abstract Double getWeight();
}
