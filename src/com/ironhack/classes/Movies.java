package com.ironhack.classes;

public class Movies extends Video{
    private boolean esSaga = true;


    public Movies(String title, String date, String[] starring, boolean esSaga) {
        super(title, date, starring);
        this.esSaga = true;
    }

    public boolean isEsSaga() {
        return esSaga;
    }

    public void setEsSaga(boolean esSaga) {
        this.esSaga = esSaga;
    }


}
