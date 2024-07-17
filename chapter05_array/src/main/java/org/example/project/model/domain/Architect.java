package org.example.project.model.domain;

import lombok.Data;
import org.example.project.model.service.Status;

@Data
public class Architect extends Designer {
    private int stock;

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public Architect() {
    }

    @Override
    public String toString() {
        return getDetail() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }
}
