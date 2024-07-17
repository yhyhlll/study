package org.example.chapter08_oop3_static.applay;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1= new Circle();
        System.out.println(c1);
        Circle c2= new Circle();
        System.out.println(c2);
//        后++ 和 前++区别：后++是先进行赋值或其他运算，之后在对本神的结果进行+。前++正好相反
        System.out.println(++Circle.total);
        System.out.println(Circle.total);
    }
}
class Circle {
    private int id;
    private double redius;
     static int total;

    public Circle() {
        this.id = init;
        init++;
        total++;
    }

    static int init = 1001;

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", redius=" + redius +
                ",total=" + total +
                '}';
    }
}
