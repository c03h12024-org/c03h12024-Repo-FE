package com.codegym.case_study.models;

public class Ticket {
    private int id;
    private int orderId;
    private int seat;

    public Ticket(int id, int orderId, int seat) {
        this.id = id;
        this.orderId = orderId;
        this.seat = seat;
    }

    public Ticket(int orderId, int seat) {
        this.orderId = orderId;
        this.seat = seat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
