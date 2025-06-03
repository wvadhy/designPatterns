package org.example.CompositeExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box {

    List<Box> boxes = new ArrayList<>();

    public CompositeBox(Box... boxes){
        this.boxes.addAll(Arrays.stream(boxes).toList());
    }


    @Override
    public int calculateCost() {
        return boxes.stream()
                .mapToInt(Box::calculateCost)
                .sum();
    }

    @Override
    public String getName() {
        return boxes.stream().map(Box::getName).toList().toString();
    }
}
