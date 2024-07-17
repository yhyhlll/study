package org.example.thread;

public class ThreadRunnableTest {
    public static void main(String[] args) {
        EventNumberTest eventNumberTest=new EventNumberTest();
        new Thread(eventNumberTest).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2==0){
                        System.out.println(Thread.currentThread().getName()+"--"+i);
                    }
                }
            }
        }).start();
    }
}
class EventNumberTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"--"+i);
            }
        }
    }
}