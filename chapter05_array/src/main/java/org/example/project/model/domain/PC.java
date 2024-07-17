package org.example.project.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PC implements Equipment {
    private String model;
    private String display;

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
