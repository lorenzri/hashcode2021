package com.hashcode2021.entity.out;

import java.util.List;

public class Schedule {
    private int intersection;
    private int numberOfIncomingStreets;
    private List<GreenLight> greenLights;

    public int getIntersection() {
        return intersection;
    }

    public void setIntersection(int intersection) {
        this.intersection = intersection;
    }

    public int getNumberOfIncomingStreets() {
        return numberOfIncomingStreets;
    }

    public void setNumberOfIncomingStreets(int numberOfIncomingStreets) {
        this.numberOfIncomingStreets = numberOfIncomingStreets;
    }

    public List<GreenLight> getGreenLights() {
        return greenLights;
    }

    public void setGreenLights(List<GreenLight> greenLights) {
        this.greenLights = greenLights;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(intersection);
        builder.append("\n").append(numberOfIncomingStreets);
        for(GreenLight greenLight : greenLights) {
            builder.append("\n").append(greenLight.toString());
        }
        return builder.toString();
    }
}
