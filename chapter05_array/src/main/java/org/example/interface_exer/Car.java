package org.example.interface_exer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car extends Vehicle implements IPower {
    private String brand;
    private String color;
    @Override
    public void run() {
        System.out.println("汽车");
    }

    @Override
    public void power() {
        System.out.println("汽车通过内燃机提供动力");
    }
}
