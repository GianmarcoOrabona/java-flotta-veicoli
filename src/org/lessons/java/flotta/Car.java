package org.lessons.java.flotta;


public class Car extends Vehicle {
    // ATTRIBUTI

    private int numberOfDoors;

    // ATTRIBUTI

    public Car(String plateNumber, int registrationDate, int numberOfDoors) {
        super(plateNumber, registrationDate);
        this.numberOfDoors = numberOfDoors;
    }

    // METODI


    @Override
    public String toString() {
        return "Auto: " + '\n' + super.toString() + '\n' + "Porte: " + numberOfDoors;
    }
}
