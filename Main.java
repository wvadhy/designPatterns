package org.example;

import org.example.AdapterExample.FancyUIServiceAdapter;
import org.example.AdapterExample.MultiRestoApp;
import org.example.CommandExample.*;
import org.example.CompositeExample.CompositeBox;
import org.example.CompositeExample.Laptop;
import org.example.CompositeExample.Phone;
import org.example.ObserverExample.EmailMsgListener;
import org.example.ObserverExample.Event;
import org.example.ObserverExample.MobileMsgListener;
import org.example.ObserverExample.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public abstract class Main {

    static void printPersons(List<?> roster, CheckPerson tester){};

    public static <T> T calculator(Operation<T> function, T x, T y){
        return function.operate(x, y);
    }

    public static <T> void process(T x, T y, BiConsumer<T, T> consumer){
        consumer.accept(x, y);
    }

    public static void main(String[] args) {
//        JungleSurvival jgl = new JungleSurvival();
//        jgl.setup();
//
//        SnowSurvival snw = new SnowSurvival();
//        snw.setup();
//
//        Animal brent = new FireBreathing(new Winged(new Hamster("Brent")));
//
//        System.out.println(String.format("I am %s the %s!", brent.getName(), brent.getDescription()));
//        List<Person> People = new ArrayList<Person>(5);
//
//        for (int i = 0; i < 5; i++) {
//            People.add(new Person(String.format("p%d", i), i % 2 != 0));
//        }
//
//        printPersons(People, new CheckPerson() {
//            @Override
//            public boolean test(Person p) {
//                return p.getIll();
//            }
//        });

        // Strategy Pattern
//        PaymentService service = new PaymentService();
//        service.setStrategy(new PaymentByPaypal());
//        service.processOrder();

        // State Pattern
//        StateDesignPattern phone = new StateDesignPattern();
//        phone.getState().onHome();
//        phone.getState().onHome();
//        phone.getState().onHome();
//        phone.getState().onPower();

        // Observer Pattern
        org.example.ObserverExample.Observer obs = new Observer();
        obs.getService().subscribe(Event.SALE, new EmailMsgListener("lol@gmail.com"));
        obs.getService().subscribe(Event.NEW_ITEM, new MobileMsgListener("clown123"));
        obs.getService().subscribe(Event.SALE, new MobileMsgListener("daveiscool7"));
        obs.Promotion(Event.SALE);

        // Adapter Pattern
        MultiRestoApp app = new MultiRestoApp();
        app.displayMenus(new XmlData());

        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter();
        adapter.displayMenus(new XmlData());

        // Command Pattern
        Room livingRoom = new LivingRoom();
        TV tv = new TV();
        livingRoom.setCommands(new ArrayList<>(Arrays.asList(new SwitchLightsCommand(new Light()), new TurnOnTVCommand(tv), new ChangeChannelTVCommand(tv))));
        livingRoom.executeCommands();
        livingRoom.executeCommand(2);

        // Composite Pattern
        CompositeBox box =
                new CompositeBox(
                        new Phone("Samsung S7", 20),
                        new Phone("Iphone 7+", 40),
                        new CompositeBox(
                                new Laptop("Asus ROG 1", 178),
                                new Phone("Red Two", 54)
                        ),
                        new CompositeBox(
                                new CompositeBox(
                                        new CompositeBox(
                                                new Phone("Huawei 8", 17),
                                                new Phone("Oppo Apache 3", 36)
                                        )
                                ),
                                new Laptop("Acer UHD 13.8", 98)
                        )
                );
        System.out.println(box.calculateCost());
        System.out.println(box.getName());

        // Records, Lambda expressions, Closures, Functional Commands
        record Person (String fn, String ln){

            @Override
            public String toString() {
                return fn + " " + ln;
            }
        }

        List<Person> people = new ArrayList<>(Arrays.asList
                       (new Person("Lucy", "Doberman"),
                        new Person("Jake", "Copperfield"),
                        new Person("Kurt", "Cobain"),
                               new Person("Darwin", "Copperfield"),
                               new Person("William", "Cobain"),
                               new Person("Elvis", "Presley")));

        var comparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.ln().compareTo(o2.ln());
            }
        };

        people.sort(comparator);
        people.sort((o1, o2) -> o1.ln().compareTo(o2.ln())); // These two are functionally equivalent

        System.out.println(people);

        interface ComparatorPlus<T> extends Comparator<T>{
            int comparePlus(T o1, T o2);
        }

        var comparatorMixed = new ComparatorPlus<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.ln().compareTo(o2.ln()) == 0 ? comparePlus(o1, o2) : 1;
            }

            @Override
            public int comparePlus(Person o1, Person o2)  {
                return o1.fn().compareTo(o2.fn());
            }
        };

        people.sort(comparatorMixed);
        System.out.println(people);

        List<String> military = new ArrayList<String>(List.of(
                "alpha", "beta", "charlie", "delta", "bravo"));

        for (String i: military)
            System.out.println(i);

        military.forEach((i) -> System.out.println(i));
        military.forEach(System.out::println); // All three are functionally equivalent

        military.forEach(i -> {
            char first = i.charAt(0);
            System.out.println(first);
        });

        // Brief Streams

        int[] tobe = new int[10];
        int[] vobe = new int[10];

        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            tobe[i] = rand.nextInt(50);
            vobe[i] = rand.nextInt(100);
        }

        record DoubleInt(int[] first, int[] second){
            @Override
            public String toString() {
                return first()[0] + " and " + second()[0];
            }
        }

        List<DoubleInt> db = Stream.of(tobe).flatMap(i -> Stream.of(vobe).map(v -> new DoubleInt(i, v))).collect(Collectors.toList());

        db.forEach(System.out::println);

        // Functional interfaces, continued...

        System.out.println(calculator((x, y) -> x + y, 10, 11));

        var coords = new ArrayList<>(Arrays.asList(
                new double[]{47.2890, -95.6423},
                new double[]{29.1586, -89.2430},
                new double[]{35.1765, -90.0659}
        ));

        coords.forEach(i -> System.out.println(Arrays.toString(i)));

        BiConsumer<Double, Double> p1 = (x, y) -> System.out.printf("[lat:%.3f lon:%.3f]%n", x, y);

        var firstPoint = coords.get(0);
        process(firstPoint[0], firstPoint[1], p1);

        coords.forEach(i -> process(i[0], i[1], p1));

        // Predicate functional interface

        military.removeIf(s -> s.equalsIgnoreCase("bravo"));
        military.forEach(System.out::println);

        List<Integer> x = new ArrayList<>();

    }

}