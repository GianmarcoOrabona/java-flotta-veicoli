package org.lessons.java.flotta;

import java.time.LocalDate;
import java.util.Random;

public abstract class Vehicle {
    // ATTRIBUTI

    private String plateNumber;

    private LocalDate registrationDate;

    // COSTRUTTORI

    public Vehicle(LocalDate registrationDate) {
        plateGenerator();
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

    public void plateGenerator() {
        Random random = new Random();
        int randomNum = random.nextInt(900) + 100;

        char firstChar = (char) ('A' + random.nextInt(26));
        char secondChar = (char) ('A' + random.nextInt(26));
        char thirdChar = (char) ('A' + random.nextInt(26));
        char fourthChar = (char) ('A' + random.nextInt(26));

        this.plateNumber = "" + firstChar + secondChar + randomNum + thirdChar + fourthChar;
    }
}
