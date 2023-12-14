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

    public int getTotalVehicles(String vehicleType) throws TotalVehiclesNotFoundException {
        int count = 0;

        if ("Auto".equalsIgnoreCase(vehicleType)) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle instanceof Car) {
                    count++;
                }
            }
        } else if ("Moto".equalsIgnoreCase(vehicleType)) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle instanceof Motorcycle) {
                    count++;
                }
            }
        }

        if (count > 0) {
            return count;
        } else {
            throw new TotalVehiclesNotFoundException("Nessun veicolo del tipo specificato");
        }
    }

    public Vehicle findVehicle(String plateNumber) throws VehicleNotFoundException {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlateNumber().equals(plateNumber)) {
                return vehicle;
            }
        }
        throw new VehicleNotFoundException("Veicolo con targa " + plateNumber + " non trovato");
    }
}
