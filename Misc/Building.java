package org.example.Misc;

import java.util.List;

public class Building {

    protected String name;
    protected Integer size;
    protected List<String> tenants;

    public Building(String n, Integer s, List<String> t){name = n; size = s; tenants = t;}

    void getEnvironment(){}

}
