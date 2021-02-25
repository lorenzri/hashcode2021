package com.hashcode2021.entity;

import java.util.Set;

public class Car {
    private int start;
    private Set<String> streets;

    public Car(int start, Set<String> streets) {
        this.start = start;
        this.streets = streets;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public Set<String> getStreets() {
        return streets;
    }

    public void setStreets(Set<String> streets) {
        this.streets = streets;
    }
}
