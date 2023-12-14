package org.lessons.java.flotta;


public class Motorcycle extends Vehicle {
    // ATTRIBUTI

    private boolean stand;

    // COSTRUTTORI

    public Motorcycle(String plateNumber, int registrationDate, boolean stand) {
        super(plateNumber, registrationDate);
        this.stand = stand;
    }

    // METODI

    public boolean hasStand() {
        return stand;
    }

    public String toString() {
        String standString = stand ? "si" : "no";
        return "Moto: " + '\n' + super.toString() + '\n' + "Cavalletto: " + standString;
    }
}
