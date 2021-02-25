package com.hashcode2021.entity.in;

public class Street {
    private String name;
    private int start;
    private int end;
    private int length;

    public Street(String name, int start, int end, int length) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
