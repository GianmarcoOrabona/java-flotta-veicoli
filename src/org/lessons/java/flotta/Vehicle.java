package org.lessons.java.flotta;

import java.time.LocalDate;
import java.util.Random;

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

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }


    // METODI


    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNumber='" + plateNumber + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
