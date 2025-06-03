package org.example.SingletonExample;

public class Single {

    public static final Single INSTANCE = new Single();

    private int spoons;

    public int instances = 0;

    private Single(int s){
        this.spoons = s;
        this.instances++;
    };

    private Single(){
        this(10);
    };

    public void exist(){
        System.out.println("Singleton exists");
    };

    public int grabSpoons(){
        return this.spoons;
    };

}

