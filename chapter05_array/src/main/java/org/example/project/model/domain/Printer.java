package org.example.project.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Printer implements Equipment {
    private String name;
    private String type;

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
