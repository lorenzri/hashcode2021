package com.hashcode2021.entity.out;

public class GreenLight {
    private int duration;
    private String street;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(street).append(" ").append(duration);
        return builder.toString();
    }
}
