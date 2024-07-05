package com.codegym.case_study.models;

public class ShowtimeTicket {
    private int id;
    private int showtimeId;
    private int seatId;
    private boolean isFree=false;

    public ShowtimeTicket(int id, int showtime_id, int seat_id, boolean is_free) {
        this.id = id;
        this.showtimeId = showtime_id;
        this.seatId = seat_id;
        this.isFree = is_free;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(int showtimeId) {
        this.showtimeId = showtimeId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setIsFree(boolean is_free) {
        this.isFree = is_free;
    }
}
