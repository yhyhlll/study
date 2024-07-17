package org.example.interface_exer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Bicycle extends Vehicle {
    private String brand;
    private String color;
    @Override
    public void run() {
        System.out.println("自行车");
    }
}
