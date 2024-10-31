package com.example.demo.model;

import java.util.Date;

public class Invoice {
    private int id;
    private Client client;
    private Booking booking;
    private double amount;
    private Date issueDate;
    private String paymentMethod;

    public Invoice() {
    }

    public Invoice(Client client, Booking booking, double amount, Date issueDate, String paymentMethod) {
        this.client = client;
        this.booking = booking;
        this.amount = amount;
        this.issueDate = issueDate;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
