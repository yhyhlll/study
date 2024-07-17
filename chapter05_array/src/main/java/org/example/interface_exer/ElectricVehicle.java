package org.example.interface_exer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricVehicle extends Vehicle implements IPower{
    private String brand;
    private String color;
    @Override
    public void run() {
        System.out.println("电车");
    }

    @Override
    public void power() {
        System.out.println("电动车使用电力提供动力");
    }
}
