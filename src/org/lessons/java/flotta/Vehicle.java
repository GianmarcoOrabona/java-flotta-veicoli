package org.lessons.java.flotta;



public abstract class Vehicle {
    // ATTRIBUTI

    private String plateNumber;

    private int registrationDate;

    // COSTRUTTORI

    public Vehicle(String plateNumber, int registrationDate) {
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

    public int getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(int registrationDate) {
        this.registrationDate = registrationDate;
    }


    // METODI


    @Override
    public String toString() {
        return "Targa: " + plateNumber + '\n' +
                "Anno immatricolazione: " + registrationDate;
    }
}
