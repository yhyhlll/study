package org.example.project.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    protected String getDetail() {
        return id + "\t" + name + "\t\t" + age + "\t" + salary;
    }

    @Override
    public String toString() {
        return getDetail();
    }
}
