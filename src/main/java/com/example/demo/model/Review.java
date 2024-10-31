package com.example.demo.model;

import java.util.Date;

public class Review {
    private int id;
    private Client client;
    private Date date;
    private int rating;
    private String comment;

    public Review() {
    }

    public Review(Client client, Date date, int rating, String comment) {
        this.client = client;
        this.date = date;
        this.rating = rating;
        this.comment = comment;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
