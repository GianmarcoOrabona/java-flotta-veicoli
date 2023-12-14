package org.lessons.java.flotta;

import java.time.LocalDate;

public class Motorcycle extends Vehicle {
    // ATTRIBUTI

    private boolean stand;

    // COSTRUTTORI

    public Motorcycle(String plateNumber, LocalDate registrationDate, boolean stand) {
        super(plateNumber, registrationDate);
        this.stand = stand;
    }
}
