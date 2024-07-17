package org.example.interface_exer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {
    private String name;
    private int age;
    public void takingVehicle(Vehicle vehicle){
        vehicle.run();
    }
}
