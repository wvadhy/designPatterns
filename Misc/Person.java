package org.example.Misc;

public class Person {

    private String name;
    private Boolean ill;

    Person(String name, Boolean ill){
        this.name = name;
        this.ill = ill;
    }

    public String getName() {
        return name;
    }

    public Boolean getIll() {
        System.out.println(String.format("%s is " + (ill ? "ill":"not ill"), name));
        return ill;
    }
}
