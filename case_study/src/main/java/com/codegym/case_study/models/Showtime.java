package com.codegym.case_study.models;

import java.sql.Date;

public class Showtime {
    private int id;
    private int movieId;
    private int roomId;
    private Date day;
    private String hour;

    public Showtime(int id, int movieId, int roomId, Date day, String hour) {
        this.id = id;
        this.movieId = movieId;
        this.roomId = roomId;
        this.day = day;
        this.hour = hour;
    }

    public Showtime(int movieId, int roomId, Date day, String hour) {
        this.movieId = movieId;
        this.roomId = roomId;
        this.day = day;
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
