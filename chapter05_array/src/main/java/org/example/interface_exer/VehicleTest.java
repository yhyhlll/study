package org.example.interface_exer;

public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0]=new Bicycle("aaa","yello");
        vehicles[1]=new Bicycle("bbb","yello");
        for (int i = 0; i < vehicles.length; i++) {

            developer.takingVehicle(vehicles[i]);
        }
    }
}
