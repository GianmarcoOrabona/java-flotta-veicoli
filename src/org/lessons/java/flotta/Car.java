package org.lessons.java.flotta;

import java.time.LocalDate;

public class Car extends Vehicle {
    // ATTRIBUTI

    private int numberOfDoors;

    // ATTRIBUTI


    public Car(LocalDate registrationDate, int numberOfDoors) {
        super(registrationDate);
        this.numberOfDoors = numberOfDoors;
    }

}
