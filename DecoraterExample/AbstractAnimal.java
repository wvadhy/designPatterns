package org.example.DecoraterExample;

public abstract class AbstractAnimal implements Animal{

    private String name;
    private String description;
    private Double weight;

    public AbstractAnimal(String name, String description, Double weight){
        this.name = name;
        this.description = description;
        this.weight = weight;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double getWeight() {
        return weight;
    }
}
