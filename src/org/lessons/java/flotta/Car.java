package org.lessons.java.flotta;

import java.time.LocalDate;

public class Car extends Vehicle {
    // ATTRIBUTI

    private int numberOfDoors;

    // ATTRIBUTI

    public Car(String plateNumber, LocalDate registrationDate, int numberOfDoors) {
        super(plateNumber, registrationDate);
        this.numberOfDoors = numberOfDoors;
    }

    // METODI

}
