package org.example.chapter08_oop3.abstracta;

public abstract class Person {
    private String name;
    private  int age;
    public abstract void printInfo();


}
class PersonTest{
    public static void main(String[] args) {
        Student student = new Student();
        student.printInfo();
    }
}
