package org.example.thread;

public class ThreadTest {
    public static void main(String[] args) {
        EvenNumberTest evenNumberTest = new EvenNumberTest();
        EvenNumberTest evenNumberTest1 = new EvenNumberTest();
        evenNumberTest.start();
        evenNumberTest1.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {

                System.out.println(Thread.currentThread().getName()+ "===" + i);
            }
        }

    }
}

class EvenNumberTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {

                System.out.println(Thread.currentThread().getName() + "--" + i);
            }
        }
    }
}
