package org.example.project.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NoteBook implements Equipment {
    private String model;
    private double price;

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
