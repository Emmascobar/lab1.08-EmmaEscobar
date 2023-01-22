package com.ironhack.classes;

import java.util.Arrays;

public abstract class Video {
    private String title;
    private String date;
    private String[] starring;

    public void play() {

    }

    public void pause() {

    }

    public void searchSimilar() {

    }

    public Video(String title, String date, String[] starring) {
        this.title = title;
        this.date = date;
        this.starring = starring;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getStarring() {
        return starring;
    }

    public void setStarring(String[] starring) {
        this.starring = starring;
    }

    @Override
    public String toString() {
        return "title='" + title + "\n" +
                ", date='" + date + "\n" +
                ", starring=" + Arrays.toString(starring) +
                '}';
    }
}
