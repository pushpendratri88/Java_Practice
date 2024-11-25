package com.brainstrom.multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i< 10;i++) {
            System.out.println("World");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(new RuntimeException(e));
            }
        }

    }
}
