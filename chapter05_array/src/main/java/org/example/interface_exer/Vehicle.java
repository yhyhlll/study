package org.example.interface_exer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Vehicle {
    private String brand;
    private String color;

    public abstract void run() ;
}
