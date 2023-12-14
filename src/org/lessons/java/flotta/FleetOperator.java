package org.lessons.java.flotta;

import java.util.ArrayList;
import java.util.List;

public class FleetOperator {
    // ATTRIBUTI

    private List<Vehicle> vehicles = new ArrayList<>();

    // COSTRUTTORI

    // GETTER E SETTER


    public List<Vehicle> getVehicleList() {
        return vehicles;
    }

    public void setVehicleList(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // METODI

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public String getTotalVehicles() {
        int cars = 0;
        int motorcycles = 0;
        String separatedVehicles = "";

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                cars++;
            } else {
                motorcycles++;
            }
        }

        return separatedVehicles = "Macchine: " + cars + '\n' +
                "Moto: " + motorcycles;
    }

    public Vehicle findVehicle(String plateNumber) throws VehicleNotFoundException {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlateNumber().equals(plateNumber)) {
                return vehicle;
            }
        }
        throw new VehicleNotFoundException("Veicolo non trovato per la targa: " + plateNumber);
    }
}
