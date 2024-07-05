package com.codegym.case_study.model;

public class Movie {
    private int id;
    private String title;
    private String description;
    private float star;
    private int duration;
    private String image;
    private String trailer;
    private String age_limit;
    private String quality;

    public Movie() {
    }

    public Movie(int id, String title,String description, float star, int duration, String image, String trailer, String age_limit, String quality) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.star = star;
        this.duration = duration;
        this.image = image;
        this.trailer = trailer;
        this.age_limit = age_limit;
        this.quality = quality;
    }

    public Movie(int id, String title, String description, float star, int duration, String image, String age_limit, String quality) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.star = star;
        this.duration = duration;
        this.image = image;
        this.age_limit = age_limit;
        this.quality = quality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getAge_limit() {
        return age_limit;
    }

    public void setAge_limit(String age_limit) {
        this.age_limit = age_limit;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
