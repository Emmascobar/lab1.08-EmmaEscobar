package com.ironhack.classes;

public class UtilityVehicle extends Car {

    private boolean fourWheelDrive = true;

    public UtilityVehicle(int vinNumber, String make, String model, double mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}