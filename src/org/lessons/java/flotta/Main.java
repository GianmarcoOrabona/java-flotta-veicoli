package org.lessons.java.flotta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws VehicleNotFoundException {
        Scanner scanner = new Scanner(System.in);

        FleetOperator fleet = new FleetOperator();

        Car panda = new Car("EP520BT", 2005, 5);
        fleet.addVehicle(panda);

        Car ferrari = new Car("GN456AY", 20022, 3);
        fleet.addVehicle(ferrari);

        Car jeep = new Car("FH489HG", 20022, 5);
        fleet.addVehicle(jeep);

        Motorcycle kawasaki = new Motorcycle("GH518FG", 20022, true);
        fleet.addVehicle(kawasaki);


        try{
            System.out.println(fleet.findVehicle("GH518FG"));
        } catch(VehicleNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(fleet.getTotalVehicles("Moto"));
        } catch(TotalVehiclesNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
