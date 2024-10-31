package com.example.demo.model;

public class Room {
    private int id;
    private String type;
    private int number;
    private double pricePerNight;
    private String status;

    public Room() {
    }

    public Room(String type, int number, double pricePerNight, String status) {
        this.type = type;
        this.number = number;
        this.pricePerNight = pricePerNight;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
