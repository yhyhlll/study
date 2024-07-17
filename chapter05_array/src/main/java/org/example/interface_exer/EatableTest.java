package org.example.interface_exer;

public class EatableTest {
    public static void main(String[] args) {
//        声明的是接口的类型，并非是对象数组。类比String
        Eatable[] eatables = new Eatable[3];
        eatables[0] = new American();
        eatables[1] = new Chinese();
        eatables[2] = new Indian();

        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}