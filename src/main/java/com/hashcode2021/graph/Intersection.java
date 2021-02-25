package com.hashcode2021.graph;

import com.hashcode2021.entity.in.Street;

import java.util.List;

public class Intersection {
    private int id;
    private List<Street> incomingStreets;
    private List<Street> outgoingStreets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Street> getIncomingStreets() {
        return incomingStreets;
    }

    public void setIncomingStreets(List<Street> incomingStreets) {
        this.incomingStreets = incomingStreets;
    }

    public List<Street> getOutgoingStreets() {
        return outgoingStreets;
    }

    public void setOutgoingStreets(List<Street> outgoingStreets) {
        this.outgoingStreets = outgoingStreets;
    }
}
