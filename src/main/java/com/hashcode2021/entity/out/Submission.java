package com.hashcode2021.entity.out;

import java.util.List;

public class Submission {
    private int numberOfIntersections;
    private List<Schedule> schedules;

    public int getNumberOfIntersections() {
        return numberOfIntersections;
    }

    public void setNumberOfIntersections(int numberOfIntersections) {
        this.numberOfIntersections = numberOfIntersections;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(numberOfIntersections);
        for(Schedule schedule : schedules) {
            builder.append("\n").append(schedule.toString());
        }
        return builder.toString();
    }
}
