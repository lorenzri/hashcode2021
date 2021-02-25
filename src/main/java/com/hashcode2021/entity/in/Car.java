package com.hashcode2021.entity.in;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Car {
    private int start;
    private List<String> streets = new ArrayList<>();

    public Car() {

    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public List<String> getStreets() {
        return streets;
    }

    public void setStreets(List<String> streets) {
        this.streets = streets;
    }
}
