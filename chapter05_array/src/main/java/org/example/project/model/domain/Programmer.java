package org.example.project.model.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.project.model.service.Status;

@Data
@NoArgsConstructor
public class Programmer extends Employee {
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;


    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetail() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }


}
