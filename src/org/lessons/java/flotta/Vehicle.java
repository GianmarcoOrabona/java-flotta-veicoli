package org.lessons.java.flotta;

import java.time.LocalDate;

public abstract class Vehicle {
    // ATTRIBUTI

    private String plateNumber;

    private LocalDate registrationDate;

    // COSTRUTTORI

    public Vehicle(String plateNumber, LocalDate registrationDate) {
        this.plateNumber = plateNumber;
        this.registrationDate = registrationDate;
    }

    // GETTER E SETTER

    public String getPlateNumber() {
        return plateNumber;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    // METODI
}
