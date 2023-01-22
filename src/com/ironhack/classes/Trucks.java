package com.ironhack.classes;

public class Trucks extends Car {

    private String towingCapacity;

    public Trucks(int vinNumber, String make, String model, double mileage, String towingCapacity) {
        super(vinNumber, make, model);
        this.towingCapacity = towingCapacity;
    }

    public String getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(String towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
