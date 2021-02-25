package com.hashcode2021.entity.in;

import com.hashcode2021.graph.Intersection;

import java.util.List;
import java.util.Map;

public class Simulation {

    private int duration;
    private int intersections;
    private int streets;
    private int cars;
    private int points;
    private List<Street> streetList;
    private List<Car> carList;
    private Map<String, Integer> streetUsage;

    private Map<Integer, Intersection> intersectionMap;

    public Simulation() {

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

    public List<Street> getStreetList() {
        return streetList;
    }

    public void setStreetList(List<Street> streetList) {
        this.streetList = streetList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Map<Integer, Intersection> getIntersectionMap() {
        return intersectionMap;
    }

    public void setIntersectionMap(Map<Integer, Intersection> intersectionMap) {
        this.intersectionMap = intersectionMap;
    }

    public Map<String, Integer> getStreetUsage() {
        return streetUsage;
    }

    public void setStreetUsage(Map<String, Integer> streetUsage) {
        this.streetUsage = streetUsage;
    }
}
