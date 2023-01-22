package com.ironhack.classes;

public class Car {

    private int vinNumber;
    private String make;
    private String model;
    private double mileage;

    public Car(int vinNumber, String make, String model) {
        this.vinNumber = this.vinNumber;
        this.make = this.make;
        this.model = this.model;
        this.mileage = this.mileage;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
