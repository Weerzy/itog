package com.example.demo.model;

public class Employee {
    private int id;
    private String name;
    private String position;
    private String shift;

    public Employee() {
    }

    public Employee(String name, String position, String shift) {
        this.name = name;
        this.position = position;
        this.shift = shift;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
