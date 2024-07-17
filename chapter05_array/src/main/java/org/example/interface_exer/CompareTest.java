package org.example.interface_exer;

public class CompareTest{

    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle();
        ComparableCircle comparableCircle2 = new ComparableCircle();
        comparableCircle1.setRedius(2.2);
        comparableCircle2.setRedius(2.3);
        System.out.println(comparableCircle1.compareTo(comparableCircle2));
    }
}
