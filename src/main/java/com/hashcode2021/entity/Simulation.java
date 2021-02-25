package com.hashcode2021.entity;

public class Simulation {

    private int duration;
    private int intersections;
    private int streets;
    private int cars;
    private int points;

    public Simulation(int duration, int intersections, int streets, int cars, int points) {
        this.duration = duration;
        this.intersections = intersections;
        this.streets = streets;
        this.cars = cars;
        this.points = points;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getIntersections() {
        return intersections;
    }

    public void setIntersections(int intersections) {
        this.intersections = intersections;
    }

    public int getStreets() {
        return streets;
    }

    public void setStreets(int streets) {
        this.streets = streets;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
