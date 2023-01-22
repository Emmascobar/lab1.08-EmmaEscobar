package com.ironhack.classes;

public class TvSeries extends Video{

    private int temporadas;

    public TvSeries(String title, String date, String[] starring, int temporadas) {
        super(title, date, starring);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
