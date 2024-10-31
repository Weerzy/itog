package com.example.demo.model;

public class Client {
    private int id;
    private String name;
    private String contactInfo;
    private String bookingStatus;

    public Client() {
    }

    public Client(String name, String contactInfo, String bookingStatus) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.bookingStatus = bookingStatus;
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

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
