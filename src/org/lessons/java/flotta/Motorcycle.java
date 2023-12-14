package org.lessons.java.flotta;

import java.time.LocalDate;

public class Motorcycle extends Vehicle {
    // ATTRIBUTI

    private boolean stand;

    // COSTRUTTORI

    public Motorcycle(LocalDate registrationDate, boolean stand) {
        super(registrationDate);
        this.stand = stand;
    }
}
